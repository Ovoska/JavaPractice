public class lab6 {
    public static String intToOctString(int i) {
        return Integer.toOctalString(i);
    }
    public static String processString(String str) {
        str = str.toLowerCase();
        return str;
    }

    public static void main(String[] args) {
        // 1 завдання
        int number = 282;
        System.out.println("Завдання 1");
        System.out.println("Число в десятичнiй системi: " + number);
        String octalString = intToOctString(number);
        System.out.println("Число в восьмирiчнiй системi: " + octalString);
        System.out.println();

        // 2 завдання
        String inputString = "THE USER IS OFFLINE RIGHT NOW, TEXT HIM AND HE'LL SEE THE NOTIFICATION";
        System.out.println("Завдання 2");
        System.out.println("аргумент:");
        System.out.println(inputString);

        String resultString = processString(inputString);
        System.out.println("результат:");
        System.out.println(resultString);
    }
}
