/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
public class Unchecked {
    public static void main(String[] args) {
        try { //Blok Try, mengandung kode yang mungkin throw sebuah exception
            int num [] = {1, 2, 3, 4}; //mendeklarasi integer menggunakan array
            System.out.println(num[4]); //mencoba mengakses elemen ke-5 (out of bounds)
        } catch (ArrayIndexOutOfBoundsException e){ //Blok Catch untuk Exception ArrayIndexOutOfBounds
            System.out.println("Array melebihi batas: " +e); //Mencetak hasil dari catch
        }
    }
}