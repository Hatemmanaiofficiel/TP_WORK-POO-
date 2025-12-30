public class Ex7 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Ex7 <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        boolean premier = true;
        if (n <= 1) {
            premier = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    premier = false;
                    break;
                }
            }
        }
        if (premier) {
            System.out.println(n + " est un nombre premier");
        } else {
            System.out.println(n + " n'est pas un nombre premier");
        }
    }
}