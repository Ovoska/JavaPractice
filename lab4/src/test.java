public class test {
    public static void main(String[] args) {
        int[] arr = {2, 4, -5, -3, 3,-8, -5, -5};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("отрицательные " + count);
    }
}
