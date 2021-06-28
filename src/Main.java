public class Main {

    public static void main(String[] args) {

        invertArr(); // Задание 1
        fillArr(); // Задание 2
        changeArr(); // Задание 3
        fillDiagonalArr(); // Задание 4
        minAndMaxIndex(); // Задание 5

}

/* Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0 */

    public static void invertArr() {
        int[] arr = {1, 0, 1, 0, 0, 1};  // Задаем массив
        for (int i = 0; i < arr.length; i++) { // Создаем цикл for
            if (arr[i] == 0) {  // Если ячейка == 0
                arr[i] = 1; // Меняем ее на 1
            }
            else if (arr[i] == 1) { // Если ячейка == 1
                arr[i] = 0; // Меняем ее на 0
            }
            System.out.print(arr[i] + "\t");
    }
        System.out.println();
}

/* Задание 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */

    public static void fillArr() {
        int[] arr = new int[8];   // Задаем массив на 8 ячеек
            for (int i = 0; i < arr.length; i++) { // Создаем цикл for
                arr[i] = i*3; // Умножаем значение каждой ячейки на 3
            System.out.print(arr[i] + "\t");

            }
        System.out.println();
}

/* Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 */

    public static void changeArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Задаем массив
        for (int i = 0; i < arr.length; i++) { // Создаем цикл for
            if (arr[i] <6) {  // Если значение ячейки меньше 6
                arr[i] *=2; // Умножаем ее на 2
            }
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    /* Задание 4. Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами */

    public static void fillDiagonalArr() {
        int[][] arr = new int[5][5];  // Задаем 2d массив
        for (int i = 0; i < arr.length ; i++) { // Создаем цикл for
            for (int j = 0, x = arr.length -1; j < arr.length; j++, x--) { // Добавляем еще один цикл и переменную x которая пойдет в обратном направлении
                if (i == j || i == x) { // Задаем условие - при пересечении i-j и i-x
                    arr[i][j] = 1; // записываем 1
                }
                else {  // в остальных случаях
                    arr[i][j] = 0; // оставляем 0
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Задание 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static void minAndMaxIndex() {
        int [] arr = {10, 8, 16, 23, 13, 6};   // задаем массив
        int min = arr[0];  // первый элемент принимам за минимум
        int max = arr[0]; // и его же за максимум
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) { // если текущая ячейка меньше минимального
                min = arr[i]; // то перезаписываем
            } else if (arr[i] > max) { // если текущая ячейка больше текущего значения
                max = arr[i]; // то перезаписываем
            }
        }
        System.out.println("Минимальный = " + min + " Максимальный = " + max);
    }
}