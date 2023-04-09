public class İnsan {
    private String ad;
    private String soyad;
    private int dogumyılı;
    private int tcno;

    private static  int kisiSayısı =0;

    public İnsan(String ad, String soyad, int dogumyılı, int tcno) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumyılı = dogumyılı;
        this.tcno = tcno;
        kisiSayısı++;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getDogumyılı() {
        return dogumyılı;
    }

    public void setDogumyılı(int dogumyılı) {
        this.dogumyılı = dogumyılı;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }
}

