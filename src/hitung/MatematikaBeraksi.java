package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Matematika taufiq = new Matematika(9,2);
        
        System.out.println("Hasil Penjumlahan: " + taufiq.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + taufiq.setPengurangan());
        System.out.println("Hasil Perkalian: " + taufiq.setPerkalian());
        System.out.println("Hasil Pembagian: " + taufiq.setPembagian());
    }
}
