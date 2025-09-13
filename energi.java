
import java.util.Scanner;

class energi {
    public static void main (String[]args){

        Scanner data = new Scanner (System.in);

        System.out.println ("Selamat datang di program penghitung energi potensial, energi kinetik, dan energi mekanik!");

        System.out.print("Masukkan massa benda (kg) : ");
        double massa = data.nextDouble();

        System.out.print("Masukkan kecepatan benda (m/s) : ");
        double kecepatan = data.nextDouble();

        System.out.print("Masukkan ketinggian benda (m) : ");
        double ketinggian = data.nextDouble();

        double potensial = massa*10*ketinggian;
        double kinetik = 0.5*massa*kecepatan*kecepatan;
        double mekanik = potensial + kinetik;

        System.out.println("Dengan asumsi percepatan gravitasi bernilai 10 m/s" + "\u00B2"+", maka nilai perhitungannya adalah sebagai berikut :");
        System.out.println("Energi Potensial : " + potensial + " Joule");
        System.out.println("Energi Kinetik : " + kinetik + " Joule");
        System.out.println("Energi mekanik : " + mekanik + " Joule");

        data.close();
    }
}