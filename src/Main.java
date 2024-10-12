public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Mustafa Fıstıkçı" , "java" , 5000);

        atm.calistir(hesap);
        System.out.println("Sistemden çıkılıyor.");
    }
}
