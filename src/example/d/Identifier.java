package example.d;

public class Identifier {
    String nama = "";
    String Nama;
    String $nama$lengkap;
    int a;
    int nilaiuts;
    String _al4mat;
    String deskripsi;
    
    //contoh comment -> dokumentasi
    /**
     * 
     * @param comment Deskripsi dari komentar anda
     */
    public void contohComment(String comment){
        
    }
    
    public Identifier(){
        nama = "Bagus";
        Nama = "Elly";
        deskripsi = "Bagus awalnya biasa saja, lama-lama"
                + "  dia semakin semangat berangkat kuliah, "
                + "karena dia suka Elly";
        System.out.println(nama);
        System.out.println(Nama);
        contohComment(nama); 
    }
    
    public static void main(String[] args) {
        Identifier id = new Identifier();        
    }
}
