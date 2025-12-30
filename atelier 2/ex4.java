import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la première valeur : ");
        int valeur1 = clavier.nextInt();
        System.out.print("Entrez la deuxième valeur : ");
        int valeur2 = clavier.nextInt();
        int max = Math.max(valeur1, valeur2);
        System.out.println("Le maximum est : " + max);
        clavier.close();
    }
}