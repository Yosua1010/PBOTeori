import java.util.Scanner;

public class GradeSiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai dari pengguna
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS);

        // Tentukan grade
        String grade = tentukanGrade(nilaiAkhir);

        // Tampilkan nilai akhir dan grade
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
    }

    // Fungsi untuk menghitung nilai akhir
    public static double hitungNilaiAkhir(double nilaiTugas, 
            double nilaiUTS, double nilaiUAS) {
        double nilaiAkhir = (0.20 * nilaiTugas) 
                + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);
        return nilaiAkhir;
    }

    // Fungsi untuk menentukan grade berdasarkan nilai akhir
    public static String tentukanGrade(double nilaiAkhir) {
        if (nilaiAkhir > 85) {
            return "A";
        } else if (nilaiAkhir >= 75 && nilaiAkhir <= 84) {
            return "B";
        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
            return "C";
        } else if (nilaiAkhir >= 49 && nilaiAkhir <= 64) {
            return "D";
        } else {
            return "E";
        }
    }
}
