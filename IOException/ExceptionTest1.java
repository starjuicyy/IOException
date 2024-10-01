/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try { // Blok try, berisi kode yang mungkin melempar exception
            int a[] = new int[2]; //Mendeklarasi integer array maksimal elemen = 2
            System.out.println("Access element three: " +a[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " +e); //Blok catch ini akan meng-catch si ArrayIndexOutOfBoundsException
        }
        System.out.println("Out of the block");
    }
}
