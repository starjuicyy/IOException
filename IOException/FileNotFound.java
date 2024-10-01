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

public class FileNotFound {
    public static void main(String[] args) {
        try { //Blok Try, mengandung kode yang mungkin akan di-throw exception
            File file = new File ("C://file.txt"); //Membuat file baru dengan path yang spesifik
            FileReader fr = new FileReader(file); //Membuat filereader untuk membaca file yang dipilih
        } catch (Exception e) { //Blok Catch, untuk menangkap throw dari exception
            System.out.println("Ada kesalahan"); //Menampilkan pesan error jika ada exception
        }
    }
}