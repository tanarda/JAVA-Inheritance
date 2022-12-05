package Inheritance;
public class Director extends Worker
{
    private int sorumlu_kisi_sayisi;

    public Director(String name, String surName, int id, int sorumlu_kisi_sayisi) {
        super(name, surName, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayisi);
    }
    public void increaseSalary(int increase)
    {
        System.out.println(getName() + "Çalışanlara %" + increase + " kadar zam yapıyor...");
    }
}