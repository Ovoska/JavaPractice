public class Test2 {
    public static void main(String[] args) {
        int[] array = {1,213,4,56};
        int sum = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {
             result = sum + array[i];
        }

        double sqrt = Math.sqrt(result);
        System.out.println(sqrt);

    }



}
