public class Ogrenci extends İnsan {
    private int OgrenciNumarası;
    private int notOrtalaması;
    private static int ogrencisayısı =0;
    public Ogrenci(String ad, String soyad, int dogumyılı, int tcno) {
        super(ad, soyad, dogumyılı, tcno);
        this.OgrenciNumarası = OgrenciNumarası;
        this.notOrtalaması = notOrtalaması;
        ogrencisayısı++;
    }
    public Ogrenci(){
        super("Yusuf", "Okkay", 2006, 1111111);
    }
}

