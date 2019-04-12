
public class Calisan {
    
    private int id;
    private String ad;
    private String soyad;
    private String departman;
    private String maas;

    
    
    public Calisan(int id,String ad, String soyad, String depertman, String maas) {
        this.id = id;
        this.ad = ad;
        this.soyad=soyad;
        this.departman = depertman;
        this.maas = maas;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String depertman) {
        this.departman = depertman;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }
    
    
    
    
    
}
