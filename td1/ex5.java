public class Ex5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Ex5 <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println("La factorielle de " + n + " est " + factorielle);
    }
}