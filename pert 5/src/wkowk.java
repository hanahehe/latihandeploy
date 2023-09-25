abstract class Bentuk {
    public abstract double hitungluas();

    public void tampilkanInfo() {
        System.out.println("Ini adalah sebuah bentuk");
    }
}

class Lingkaran extends Bentuk {
    public double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungluas() {
        return Math.PI * jarijari * jarijari;
    }
}

class Persegi extends Bentuk {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungluas() {
        return sisi * sisi;
    }
}

public class wkowk {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(5.0);
        Persegi persegi = new Persegi(12.2);

        lingkaran.tampilkanInfo();
        System.out.println("Luas Lingkaran : " + lingkaran.hitungluas());

        persegi.tampilkanInfo();
        System.out.println("Luas Persegi : " + persegi.hitungluas());
    }
}