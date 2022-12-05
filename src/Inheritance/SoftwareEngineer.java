package Inheritance;
public class SoftwareEngineer extends Worker
{
    private String diller;
    // Calisan classını extends ettiğimiz için üst sınıfın const çağırmamız gerekir yoksa hatayla karşılaşırız.
    public SoftwareEngineer(String name, String surName, int id , String diller) {
        super(name, surName, id);
        this.diller = diller;
    }
    public void formatAt(String isletim_sistemi)
    {
        System.out.println(getName() + " " + isletim_sistemi + " yüklüyor..");
    }

    @Override
    public void showInfo() {
        //Üst classın bilgileri göster metodunu çağırmak için super anahtar kelimesini kullandık.
        super.showInfo();
        System.out.println("Yazılımcının Bildiği Diller : " + diller);

    }
}
