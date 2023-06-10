package Main;

import Penyelesaian_Tugas.Nomor1;
import Penyelesaian_Tugas.Nomor2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    static BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        
    public static void main(String[] args) throws IOException{
        
        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> TUGAS <<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println(">>>>>>>>>>>>>>>>>>> PERTEMUAN AKHIR <<<<<<<<<<<<<<<<<<<");
            System.out.println("-------------------------------------------------------");
            System.out.println("1. Nomor 1");
            System.out.println("2. Nomor 2");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan  : ");
            int Pilihan = Integer.parseInt(Input.readLine());

            switch (Pilihan){
                case 1:
                    String Kalimat = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
                    Nomor1.Show(Kalimat);
                    break;
                case 2:
                    Nomor2.Inputan();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n>> Pilihan Tidak Ada \n");
                    break;
            }
        }
    }
    
}
