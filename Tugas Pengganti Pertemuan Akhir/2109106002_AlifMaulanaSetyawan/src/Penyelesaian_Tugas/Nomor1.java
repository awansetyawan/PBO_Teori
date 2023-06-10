package Penyelesaian_Tugas;

public class Nomor1 {
    
    public static void Show(String StringAwal) {
        
        String Kalimat1 = StringAwal.substring(0, 36);
        String Kalimat2 = Kalimat1.toLowerCase();
        String Kalimat3 = Kalimat1.toUpperCase();
        String Kalimat4 = StringAwal.substring(25, 36);
        String Kalimat5 = StringAwal.substring(37);

        System.out.println("\n+-----------------------------------------------------+");
        System.out.println("| String Awal | JavaScript adalah bahasa pemrograman  |");
        System.out.println("|             | tingkat tinggi dan dinamis            |");             
        System.out.println("+-----------------------------------------------------+");
        System.out.println("|      1.     | " + Kalimat1 + "  |");
        System.out.println("|      2.     | " + Kalimat2 + "  |");
        System.out.println("|      3.     | " + Kalimat3 + "  |");
        System.out.println("|      4.     | " + Kalimat4 + "                           |");
        System.out.println("|      5.     | " + Kalimat5 + "            |");
        System.out.println("+-----------------------------------------------------+\n");
    }
}