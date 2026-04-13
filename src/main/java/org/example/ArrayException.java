class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}
public class ArrayException {
       public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
       if (array == null) {
            throw new MyArraySizeException("Массив не может быть null");
        }

        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен иметь 4 строки, получено: " + array.length);
        }

        for (int i = 0; i < 4; i++) {
            if (array[i] == null) {
                throw new MyArraySizeException("Строка " + i + " массива равна null");
            }
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Каждая строка должна содержать 4 элемента. Ошибка в строке " + i +
                                ": получено " + array[i].length + " элементов");
            }
        }

        int sum = 0;

            for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String element = array[i][j];
                if (element == null) {
                    throw new MyArrayDataException("Элемент в ячейке [" + i + "][" + j + "] равен null");
                }
                try {
                    sum += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Некорректные данные в ячейке [" + i + "][" + j + "]: '" + element + "' не может быть преобразовано в число");
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
       String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

       String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "abc", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

       String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

       String[][] nullElementArray = {
                {"1", "2", "3", "4"},
                {"5", null, "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
           int result = sumArray(validArray);
            System.out.println("Сумма элементов корректного массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = sumArray(invalidDataArray);
            System.out.println("Сумма элементов массива с некорректными данными: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = sumArray(invalidSizeArray);
            System.out.println("Сумма элементов массива неправильного размера: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = sumArray(nullElementArray);
            System.out.println("Сумма элементов массива с null-элементом: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}