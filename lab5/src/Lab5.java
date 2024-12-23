public class Lab5 {

    // метод бульбашкою
    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // метод вставкою
    public void insertionSort(double[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            double key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        double[] array = {5.3, 2.1, 8.4, 3.5, 1.9, 7.6, 4.2};
        System.out.println("Масив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("Масив після сортування методом Bubble Sort:");
        printArray(array);

        double[] array2 = {5.3, 2.1, 8.4, 3.5, 1.9, 7.6, 4.2};

        insertionSort(array2);
        System.out.println("Масив після сортування методом Insertion Sort:");
        printArray(array2);
    }
}
