package lesson6;
    import java.util.HashSet;
    import java.util.LinkedHashSet;
    import java.util.TreeSet;

    public class Lesson_6 {

        public static void main(String[] args) {

            String[][] arr = {
                    {"1", "2", "3", "4"},
                    {"4", "3", "2", "1"},
                    {"1", "2", "3", "4"},
                    {"3", "4", "6", "1"}
            };

            String[][] arr1 = {
                    {"9", "8", "7", "6"},
                    {"5", "5", "4", "3"},
                    {"8", "9", "1", "2"}
            };

            String[][] arr2 = {
                    {"8", "6", "6", "1"},
                    {"2", "Х", "5", "1"},
                    {"8", "7", "1", "Y"},
                    {"Z", "2", "7", "6"}
            };

            try {
                System.out.println("Sum = " + sumStringArray(arr));
            } catch (MyArrayDataException | MyArraySizeException e) {
                e.printStackTrace();
            }

            try {
                System.out.println("Sum = " + sumStringArray(arr1));
            } catch (MyArrayDataException | MyArraySizeException e) {
                e.printStackTrace();
            }

            try {
                System.out.println("Sum = " + sumStringArray(arr2));
            } catch (MyArrayDataException | MyArraySizeException e) {
                e.printStackTrace();
            }
        }

        private static int sumStringArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {

            int result = 0;
            StringBuilder errorMsg = new StringBuilder("Error in cells: ");
            boolean dataError = false;

            if (arr.length != 4 || arr[0].length != 4) {
                throw new MyArraySizeException("Не верный размер массива");
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        result += Integer.parseInt(arr[i][j]);
                    } catch (Exception e) {
                        errorMsg.append(String.format("(%d, %d)", i, j));
                        dataError = true;
                    }
                }
            }

            if (dataError) {
                throw new MyArrayDataException(errorMsg.toString());
            }

            return result;
        }
    }
}
