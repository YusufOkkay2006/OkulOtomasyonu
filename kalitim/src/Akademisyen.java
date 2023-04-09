public class Akademisyen extends Personel {
    public Akademisyen(String ad, String soyad, int dogumyılı, int tcno) {
        super(ad, soyad, dogumyılı, tcno);
        this.bolum =bolum;
        this.sgkno = sgkno;
        this.maas = maas;
        akademisyenSayısı++;
    }
    public Akademisyen(){
        super("Yusuf" ,  "Okkay", 2006, 11111111);

    }

    private int sgkno;
    private int maas;
    private String bolum;
    private static int akademisyenSayısı =0;
}
