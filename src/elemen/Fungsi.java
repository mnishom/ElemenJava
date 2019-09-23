package elemen;

/**
 *
 * @author nishom
 */
public class Fungsi {
    
    int _catch;
    
    
    //nilai pi π
    //public static double PI = 3.14159265358979323846;
    public static double PI = Math.PI;
    
   
    /**
     * 
     * @param alas merupakan nilai alas dari bangun segitiga
     * @param tinggi merupakan nilai tinngi dari bangun segitiga
     * @return nilai luas segitiga yang dihasilkan
     */   
    public static double luas_segitiga(double alas, double tinggi){        
       
        return 0.5 * alas * tinggi;
        
    }
    
    /**
     * 
     * @param alas merupakan nilai alas dari bangun segitiga
     * @return nilai keliling bangun segitiga
     */
    public static double keliling_segitiga(double alas){        
        return (alas + alas + alas);
    }
}
