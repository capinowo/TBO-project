// Nama     : Alya Safina
// NIM      : 24060122140123
// Judul    : Program Ekspresi Reguler Pencarian URL Menggunakan Bahasa Java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pencarianURL {
    public static void main(String[] args) {
        // Teks contoh yang mengandung URL
        String text = "Cek tips mendapatkan nilai A pada mata kuliah Teori Bahasa dan Otomata di http://akucintatbo.com for more info!";
        
        // Pola regex untuk mendeteksi URL
        String urlPattern = "(https?://[\\w-]+(\\.[\\w-]+)+[/\\w-]*)";
        
        // Membuat objek Pattern dan Matcher
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(text);
        
        // Menemukan dan mencetak semua URL yang ditemukan
        if (matcher.find()) {
            System.out.println("URL ditemukan: " + matcher.group());
        }
    }
}
