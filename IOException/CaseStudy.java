/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOException;

/**
 *
 * @author Bintang
 */
public class CaseStudy {
    public static void main(String[] args) {
        try{ //Blok try, berisi kode yang mungkin throw exception
        int a[] = new int[5];
        a[5] = 100;
        } catch (Exception e){ // blok catch
            System.out.println("Exception: " +e);
        }
    }
    private static int oob (int a) throws Exception { //Method out of bounds, throw exception jika a lebih dari 5
        if (a > 5){
            throw new Exception("int a can't be greater than 5."); //throw exception jika a lebih dari 5
        }
        return a; //mengembalikan nilai jika a kurang dari 5
    }
}
