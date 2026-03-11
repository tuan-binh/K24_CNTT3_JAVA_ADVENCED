public class Calculate570 {
    public static int plus(int a,int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a,int b) {
        return a * b;
    }

    public static double devide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Cannot devide by zero");
        }
        return (double) a / b;
    }


}
