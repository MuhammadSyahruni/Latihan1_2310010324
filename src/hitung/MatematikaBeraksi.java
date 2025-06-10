
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Matematika runi = new Matematika (2,3);
        
        System.out.println("Hasil penjumlahan: "+runi.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+runi.setPengurangan());
        System.out.println("Hasil perkalian: "+runi.setPerkalian());
        System.out.println("Hasil pembagian: "+runi.setPembagian());
    }
            
}
