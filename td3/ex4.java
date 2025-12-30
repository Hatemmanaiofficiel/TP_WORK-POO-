class Complexe {
    private double re;
    private double im;
    
    Complexe(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    String info() {
        return ("<re:" + re + ",im:" + im + ">");
    }
    
    Complexe produit(Complexe z1) {
        Complexe z = new Complexe(0, 0);
        z.re = re * z1.re - im * z1.im;
        z.im = re * z1.im + im * z1.re;
        return z;
    }
    
    static Complexe produit(Complexe z1, Complexe z2) {
        Complexe z = new Complexe(0, 0);
        z.re = z1.re * z2.re - z1.im * z2.im;
        z.im = z1.re * z2.im + z1.im * z2.re;
        return z;
    }
}

class TestComplexe {
    public static void main(String[] args) {
        Complexe z1 = new Complexe(1.0, 2.0);
        System.out.println("z1=" + z1.info());
        Complexe z2 = new Complexe(2.0, 1.0);
        System.out.println("z2=" + z2.info());
        Complexe z3 = z1.produit(z2);
        System.out.println("z1 x z2 =" + z3.info());
        Complexe z4 = Complexe.produit(z2, z1);
        System.out.println("z2 x z1 =" + z4.info());
    }
}