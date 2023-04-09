public class Personel extends İnsan {
    private int sgkno;
    private int maas;
    private static int personelSAYISI=0;
    public Personel(String ad, String soyad, int dogumyılı, int tcno) {

        super(ad, soyad, dogumyılı, tcno);
        this.maas = maas;
        this.sgkno = sgkno;
        personelSAYISI++;
    }
public Personel(){
    super("Yusuf", "OĞkkay", 2006, 111111);
}

}

