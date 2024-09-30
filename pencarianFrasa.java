// Nama     : Alya Safina
// NIM      : 24060122140123
// Judul    : Program Ekspresi Reguler Pencarian Frasa Menggunakan Bahasa Java

import java.util.regex.*;

public class pencarianFrasa {
    public static void main(String[] args) {
        String text = "Aku cinta mata kuliah Teori Bahasa dan Otomata";
        String pattern = "\\b(cinta)\\b"; // Regex untuk mencari kata 'cinta'
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        if (m.find()) {
            System.out.println("Kata ditemukan: " + m.group());
        } else {
            System.out.println("Kata tidak ditemukan.");
        }
    }
}
