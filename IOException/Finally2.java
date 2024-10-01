/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
public class Finally2 {
    public static void main(String[] args) {
        // membuat array berukuran 2
        int a[] = new int[2];
        try {
            // mengakses elemen array index 3
            System.out.println("Acces element three " + a[3]);
            // membuat eksepsi untuk index melebihi batas
        } catch (ArithmeticException e) {
            // menampilkan pesan
            System.out.println("Exception Thrown " + e);
            // membuat finally statement
        } finally {
            // mengakses elemen array index 0
            a[0] = 6;
            // menangkap pesan dan index ke 0
            System.out.println("First Element Value: " + a[0]);
            // menampilkan pesan
            System.out.println("The Finally statement is executed");
        }
    }
}