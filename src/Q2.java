public class Q2 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Provide two numbers as argument");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum = " + (a + b));
    }
}