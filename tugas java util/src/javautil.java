import java.util.Scanner;

    public class javautil {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nama kmu: ");
            String nama = scanner.next();

            System.out.print("Masukkan nama pacar kpopmu baby: ");
            String namapacar = scanner.next();

            String hasil = nama + " pacar " + namapacar;

            System.out.println("Sebuah fakta: " + hasil);

            scanner.close();
        }
    }