public class Ex2 {
    public static void main(String[] args) {
        int x = 5, y = 3, z;
        z = x++ + y;
        int compteur = 12;
        if (compteur > 10) {
            System.out.println("compteur est plus grand que 10");
        }
        int total = 20;
        total -= --x;
        int q = 10, diviseur = 3;
        q %= diviseur;
        q = q % diviseur;
        int somme = 0;
        int varX = 1;
        while (varX <= 10) {
            somme += varX;
            varX++;
        }
        System.out.println("la somme vaut : " + somme);
    }
}