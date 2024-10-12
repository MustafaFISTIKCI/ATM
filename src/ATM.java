import java.util.Scanner;

public class ATM {
    public void calistir(Hesap hesap){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz.");
        System.out.println("---------------------- \n " +
                            "Kullanıcı Girişi \n" +
                            "----------------------");
        int girisHakki = 3;

        while (true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı.");
                break;
            }
            else {
                System.out.println("Giriş Başarısız...");
                girisHakki -= 1;
                System.out.println("Kalan giriş hakkınız: " + girisHakki);
            }

            if (girisHakki == 0) {
                System.out.println("Giriş hakkınız bitti.");
                return;
            }
        }


        System.out.println("----------------------");
        String islemler = "1- Bakiye Görüntüle\n" +
                "2- Para Yatırma\n" +
                "3- Para Çekme\n" +
                "4- Çıkış için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("----------------------");

        while(true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q"))
                break;

            else if (islem.equals("1"))
                System.out.print("Bakiyeniz: " + hesap.getBakiye());

            else if (islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }

            else if(islem.equals("3")){
                System.out.print("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else
                System.out.print("Geçersiz işlem.");
        }

    }
}
