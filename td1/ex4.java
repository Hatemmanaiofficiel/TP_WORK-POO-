public class Ex4 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Ex4 <string> <n>");
            return;
        }
        String str = args[0];
        int n = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}