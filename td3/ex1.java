class Temps {
    private int heure, minute, seconde;
    
    Temps(int heure) {
        this.heure = heure;
    }
    
    Temps(int heure, int minute) {
        this(heure);
        this.minute = minute;
    }
    
    Temps(int heure, int minute, int seconde) {
        this(heure, minute);
        this.seconde = seconde;
    }
    
    void affiche() {
        System.out.println("Il est : " + heure + " heures " + minute + " minutes " + seconde + " secondes");
    }
    
    public static void main(String[] args) {
        Temps t = new Temps(10);
        t.affiche();
        t = new Temps(10, 12);
        t.affiche();
        t = new Temps(10, 12, 45);
        t.affiche();
    }
}