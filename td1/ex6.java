public class Ex6 {
    public static void main(String[] args) {
        if (args.length < 6) {
            System.out.println("Usage: java Ex6 <n1> <n2> <n3> <n4> <n5> <n6>");
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Le maximum est = " + max);
    }
}