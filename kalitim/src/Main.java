import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personel personel = new Personel();
        Gorevli gorevli = new Gorevli();
        Akademisyen akademisyen = new Akademisyen();
        Ogrenci ogrenci = new Ogrenci();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz :");
            System.out.println("1-Öğrenci Oluştur.");
            System.out.println("2-Akademisyen Oluştur.");
            System.out.println("3-Görevli Oluştur.");
            System.out.println("0-Çıkış Yap.");
            int secim = -1;
            if (secim == 1) {
                int secim2 = scanner.nextInt();
                System.out.println("Manuel oluşturmak için 1'e basınız.");
                System.out.println("Otomatik Oluşturmak için 2'ye basınız.");
                if (secim2 == 2) {
                    System.out.println("Adınızı Giriniz :");
                    String ad = scanner.nextLine();
                    System.out.println("Soyadınızı Giriniz :");
                    String soyad = scanner.nextLine();
                    System.out.println("Tc Kimlik Numaranızı Giriniz :");
                    String tC = scanner.nextLine();
                    System.out.println("Doğum Yılınızı Giriniz: ");
                    int dogumYılı = scanner.nextInt();
                    System.out.println("Öğrenci Numaranızı Giriniz :");
                    int ogrenciNo = scanner.nextInt();
                    System.out.println("Not Ortalamanızı Giriniz :");
                    double ortalama = scanner.nextDouble();
                } else if (secim2 == 2) {
                    new Ogrenci();
                }
                int secim3 = scanner.nextInt();
                System.out.println("Manuel oluşturmak için 3'e basınız.");
                System.out.println("Otomatik Oluşturmak için 4'ye basınız.");
                int secim4 = scanner.nextInt();
                if (secim3==3){
                    if (secim4==4){
                        System.out.println("Adınızı Giriniz :");
                        String ad = scanner.nextLine();
                        System.out.println("Soyadınızı Giriniz :");
                        String soyad = scanner.nextLine();
                        System.out.println("Tc Kimlik Numaranızı Giriniz :");
                        String tC = scanner.nextLine();
                        System.out.println("Doğum Yılınızı Giriniz: ");
                        int dogumYılı = scanner.nextInt();
                        System.out.println("Sgk Numaranızı Giriniz :");
                        int sgkno = scanner.nextInt();
                        System.out.println("Maasınızı  Giriniz :");
                        int maas = scanner.nextInt();
                        System.out.println("Bölümünüzü Giriniz :");
                        String bolum =scanner.nextLine();
                    } else if (secim4==4) {
                        new Akademisyen();
                    }
                }
                int secim5=scanner.nextInt();
                int secim6=scanner.nextInt();
                if (secim5 ==5){
                    if (secim6==6){
                        System.out.println("Adınızı Giriniz :");
                        String ad = scanner.nextLine();
                        System.out.println("Soyadınızı Giriniz :");
                        String soyad = scanner.nextLine();
                        System.out.println("Tc Kimlik Numaranızı Giriniz :");
                        String tC = scanner.nextLine();
                        System.out.println("Doğum Yılınızı Giriniz: ");
                        int dogumYılı = scanner.nextInt();
                        System.out.println("Sgk Numaranızı Giriniz :");
                        int sgkno = scanner.nextInt();
                        System.out.println("Maasınızı  Giriniz :");
                        int maas = scanner.nextInt();
                        System.out.println("Bölümünüzü Giriniz :");
                        String bolum =scanner.nextLine();
                    }

                } else if (secim6==6) {
                    new Gorevli();
                }
                else {
                    System.out.println("Görüşürüz");
                    break;
                }
            }
        }
    }
}



