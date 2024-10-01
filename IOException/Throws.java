/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
public class Throws {
    public static void main(String[] args) {
        // membuat variabel
        int a = 3;
        // membuat variabel
        int b = 0;
        try {
            // memanggil method divide dan menampilkan hasilnya
            System.out.println("Result: " + divide(a, b));
            // membuat eksepsi
        } catch (Exception e) {
            // menampilkan pesan
            System.out.println("Exception: " + e);
        }
    }

    // membuat method divide dengan 2 parameter a dan b
    private static int divide(int a, int b) throws Exception {
        // mengecek apakah b bernilai 0
        if (b == 0) {
            // membuat eksepsi jika b bernilai 0
            throw new Exception("Second argument cannot be zero");
        }
        // mengembalikan a/b
        return a / b;
    }
}