public class Ex3 {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        System.out.println("Somme du tableau : " + somme);
        int[] tableauInverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        System.out.print("Tableau inversé : ");
        for (int val : tableauInverse) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}