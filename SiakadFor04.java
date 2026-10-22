import java.util.Scanner;
public class SiakadFor04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
             if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        
            
            
        }
        System.out.println(" HASIL NILAI MAHASISWA ");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        input.close();
    }
}