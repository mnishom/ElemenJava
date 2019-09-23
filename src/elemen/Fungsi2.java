package elemen;

/**
 *
 * @author nishom
 */

public class Fungsi2 {
    
    public static String luas_segitiga(double alas, double tinggi){
        double luas =  0.5 * alas * tinggi;   
        if(luas%1 == 0){
            return ""+(int) luas;
        }else{
            return ""+luas;
        }
    }
    
    public static String keliling_segitiga(double alas){  
        double keliling = alas + alas + alas;
        if(keliling%1 == 0){
            return ""+(int) keliling;
        }else{
            return ""+keliling;
        }
    }
    
}
