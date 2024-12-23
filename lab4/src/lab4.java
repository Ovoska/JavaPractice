class Task15 {

    public static int countMultiplesOfFive(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 5 == 0) {
                count++;
            }
        }
        return count;
    }
}

class Task45 {

    public static int countPositiveAtDivisibleIndices(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 4 == 0 && array[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
class Task61 {

    public static int[] formArrayC(int[] A, int[] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("Масиви повинні мати однакову довжину");
        }

        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && B[i] > 0) {
                // сума
                C[i] = A[i] + B[i];
            } else if (A[i] < 0 && B[i] < 0) {
                // множення
                C[i] = A[i] * B[i];
            } else {
                // нуль
                C[i] = 0;
            }
        }
        return C;
    }
}
public class lab4 {
    public static void main(String[] args) {
        // Task 15
        int[] testArray1 = {5, 10, 15, 20, 3, 7, 25, 30, 40, 50, 55, 60};

        System.out.println("Кількість елементів кратних 5: " + Task15.countMultiplesOfFive(testArray1));

        // Task 45
        int[] array1 = {1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("Кількість додатних елементів з індексами кратними 4: " + Task45.countPositiveAtDivisibleIndices(array1));

        // Task 61
        int[] A = {10, -2, 5, -7, 8, -3, 6, 0, 12, -8, 15, 20};
        int[] B = {3, -6, 2, -4, 1, 5, 3, 7, -3, 6, 8, -5};

        System.out.println("Результуючий масив C: ");
        for (int num : Task61.formArrayC(A, B)) {
            System.out.print(num + " ");
        }
    }
}
