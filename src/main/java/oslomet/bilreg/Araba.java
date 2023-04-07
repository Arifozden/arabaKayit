package oslomet.bilreg;

public class Araba {
    private String tc;
    private String ad;
    private String soyad;
    private String adres;
    private String telefon;
    private String mail;
    private String plaka;
    private String marka;
    private String model;
    private String yil;

    public Araba(String tc, String ad, String soyad, String adres, String telefon, String mail, String plaka, String marka, String model, String yil) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
        this.mail = mail;
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    public Araba(){}

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYil() {
        return yil;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }
}
