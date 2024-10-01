/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try { // Blok try, berisi kode yang mungkin melempar exception
            File file = new File("d://Test//TestFile1.txt"); // Membuat objek File baru dengan path yang ditentukan
    
            if (file.createNewFile()){ // Membuat file baru jika belum ada
                System.out.println("File telah dibuat!"); // Menampilkan pesan jika file berhasil dibuat
            } else {
                System.out.println("File sudah ada!"); // Menampilkan pesan apabila file sudah ada
            }
    
            FileWriter writer = new FileWriter(file); // Membuat objek FileWriter untuk menulis ke file
            writer.write("Test Data"); // Menulis data ke file
            writer.close(); // Menutup objek FileWriter
    
            FileReader reader = new FileReader(file); // Membuat objek FileReader untuk membaca file
    
            int c;
            while ((c = reader.read()) != -1) { // Membaca isi file karakter per karakter
                char ch = (char) c;
                System.out.print(ch); // Mencetak isi file ke console
            }
        } catch (IOException e){ // Blok catch, menangkap exception IOException
            System.out.println("Exception"); // Mencetak pesan error jika terjadi exception
        }
    }
}