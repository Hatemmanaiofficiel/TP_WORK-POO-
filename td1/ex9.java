public class Ex9 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Ex9 <X> <n>");
            return;
        }
        int X = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= X;
        }
        System.out.println(X + "^" + n + " = " + result);
    }
}