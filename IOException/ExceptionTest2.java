/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[2]; //Mendeklarasi integer array maksimal elemen = 2
            int b = 0;
            int c = 1/b;
            System.out.println("Access element three: " +a[3]); //Mencoba untuk mengakses elemen ke-3
        } catch (ArrayIndexOutOfBoundsException e){ 
            System.out.println("ArrayIndexOutOfBounds thrown: " +e); //Blok catch ini akan meng-catch si ArrayIndexOutOfBoundsException
        } catch (Exception e){
            System.out.println("Exception thrown: " +e); //Blok catch ini akan meng-catch exception lainnya. Termasuk ArithmeticException
        }
        System.out.println("Out of the block"); //Bagian ini akan ditampilkan saat semuanya sudah jalan.
    }
}