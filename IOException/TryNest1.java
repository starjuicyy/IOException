/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
public class TryNest1 {
    public static void main(String args[]){
        try { // Blok try utama, berisi kode yang mungkin melempar exception
            int a[] = new int[2]; // Membuat array integer dengan ukuran 2
            try { // Blok try kedua, berisi kode yang mungkin melempar exception
                int b = 0; 
                int c = 1/b; 
            } catch (Exception e) { // Blok catch kedua, catch exception ArithmeticException
                System.out.println("Exception thrown: " + e); // menampilkan pesan error jika ada exception
            }
            System.out.println("Access element three: " + a[3]); // Mencoba mengakses elemen ke-4 dari array a, yang akan throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){ // Blok catch utama, catch exception ArrayIndexOutOfBoundsException
            System.out.println("Exception thrown: " + e); // menampilkan pesan error jika exception terjadi
        }
        System.out.println("Out of the block"); // menampilkan pesan jika kode telah selesai dijalankan
    }
}