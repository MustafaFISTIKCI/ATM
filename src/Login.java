import java.util.Scanner;

public class Login {
        public boolean login(Hesap hesap){
            Scanner scanner = new Scanner(System.in);
            String kullaniciAdi;
            String sifre;

        System.out.print("Kullanıcı adı: ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Şifre: ");
        sifre = scanner.nextLine();

        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getSifre().equals(sifre))
            return true;
        else
            return false;

        }
}
