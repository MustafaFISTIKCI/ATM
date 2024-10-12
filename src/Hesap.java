public class Hesap {

    private String kullaniciAdi;
    private String sifre;
    private int bakiye;

    public Hesap(String kullaniciAdi , String sifre , int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.bakiye = bakiye;
        this.sifre = sifre;
    }
    public void setKullaniciAdi(String kullaniciAdi){
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciAdi(){
        return kullaniciAdi;
    }

    public void setBakiye(int bakiye){
        this.bakiye = bakiye;
    }

    public int getBakiye(){
        return bakiye;
    }

    public void setSifre(String sifre){
        this.sifre = sifre;
    }

    public String getSifre(){
        return sifre;
    }

    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    public void paraCek(int tutar){
        if(bakiye - tutar < 0){
            System.out.println("Bakiyeniz yetersiz! \n Mevcut bakiyeniz: " + bakiye);
        }
        else {
            bakiye -= tutar;
            System.out.println("Tutarlı işleminiz başarılı. \n Mevcut bakiyeniz: " + bakiye);
        }
    }
}
