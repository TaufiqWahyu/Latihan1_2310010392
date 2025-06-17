package hitung;

public class Matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //membuat method set penjumlahan
    double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    //membuat method set pengurangan
    double setPengurangan(){
        return bil1 - bil2;
    }
    
    //membuat method set perkalian
    double setPerkalian(){
        return bil1 * bil2;
    }
    
    //membuat method set pembagian
    double setPembagian(){
        return bil1 / bil2;
    }
}
