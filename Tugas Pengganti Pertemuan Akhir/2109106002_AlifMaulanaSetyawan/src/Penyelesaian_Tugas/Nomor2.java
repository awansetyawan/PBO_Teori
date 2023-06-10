package Penyelesaian_Tugas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Nomor2 {
    
    static BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        
    public static double NilaiAkhir(int Kehadiran, int UTS, int UAS) {
        
        double NilaiKehadiran = 0.0;
        
        if (Kehadiran < 3) {
            NilaiKehadiran = 0.0;
        } else if (Kehadiran >= 3 && Kehadiran <= 4) {
            NilaiKehadiran = 60.0;
        } else if (Kehadiran >= 5 && Kehadiran <= 6) {
            NilaiKehadiran = 80.0;
        } else if (Kehadiran > 7) {
            NilaiKehadiran = 100.0;
        }
        
        double NilaiAkhir = (NilaiKehadiran * 0.2) + (UTS * 0.3) + (UAS * 0.5);
        return NilaiAkhir;
    }
    
    public static String KonversiGrade(double NilaiAkhir) {
        
        String Grade;
        
        if (NilaiAkhir >= 85 && NilaiAkhir <= 100) {
            Grade = "A";
        } else if (NilaiAkhir >= 70 && NilaiAkhir <= 84) {
            Grade = "B";
        } else if (NilaiAkhir >= 60 && NilaiAkhir <= 69) {
            Grade = "C";
        } else if (NilaiAkhir >= 50 && NilaiAkhir <= 59) {
            Grade = "D";
        } else {
            Grade = "E";
        }
        
        return Grade;
    }
    
    public static void Inputan() throws IOException {
        
        System.out.print("\nMataKuliah        : ");
        String MataKuliah = Input.readLine();
        System.out.print("Jumlah Kehadiran  : ");
        int NilaiKehadiran = Integer.parseInt(Input.readLine());
        System.out.print("Nilai UTS         : ");
        int NilaiUTS = Integer.parseInt(Input.readLine());
        System.out.print("Nilai UAS         : ");
        int NilaiUAS = Integer.parseInt(Input.readLine());
        
        System.out.println("\n+-----------------------------------------------------+");
        System.out.println("|                     NILAI AKHIR                     |");
        System.out.println("+-----------------------------------------------------+");

        // Menghitung Nilai Akhir
        double NilaiAkhir = NilaiAkhir(NilaiKehadiran, NilaiUTS, NilaiUAS);
        
        // Menampilkan Matakuliah & Nilai Akhir
        System.out.println("Mata Kuliah : " + MataKuliah);
        System.out.println("Nilai Akhir : " + NilaiAkhir);
        
        // Menampilkan Konversi Grade
        String NilaiGrade = KonversiGrade(NilaiAkhir);
        System.out.println("Grade       : " + NilaiGrade);
        System.out.println();
    }
}