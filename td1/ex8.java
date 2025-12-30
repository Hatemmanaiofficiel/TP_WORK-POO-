public class Ex8 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Ex8 <size>");
            return;
        }
        int size = Integer.parseInt(args[0]);
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}