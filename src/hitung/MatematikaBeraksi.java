package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika mtk = new Matematika();
        
        int a = 20;
        int b = 4;
        
        System.out.println("Penjumlahan: "+ mtk.tambah(a, b));
        System.out.println("Pengurangan: "+ mtk.kurang(a, b));
        System.out.println("Perkalian: "+ mtk.kali(a, b));
        System.out.println("Pembagian: "+ mtk.bagi(a, b));
    }
}
