public class Gorevli extends Personel{

    public Gorevli(String ad, String soyad, int dogumyılı, int tcno) {
        super(ad, soyad, dogumyılı, tcno);
        this.maas = maas;
        this.sgkno = sgkno;
        gorevlısayısı++;
    }
    public Gorevli(){
        super("Yusuf", "Okkay", 2006, 1111111);
    }
    private int sgkno;
    private int maas;
    private static int gorevlısayısı =0;

}
