package Strategia.Kaczki;

import Strategia.Kaczki.SposobyLatania.LatanieInterface;
import Strategia.Kaczki.SposobyKwakania.KwakanieInterface;

public abstract class Kaczka {

    protected LatanieInterface latanieIntefejs;
    protected KwakanieInterface kwakanieIntefejs;
    public void wykonajkwacz(){
        kwakanieIntefejs.kwacz();
    }

    public void plywaj(){
        System.out.println("Pływu Pływu");
    }

    public void wyswietl(){
        System.out.println("Wyświetlam kaczke");
    }

    public void wykonajlec(){
        latanieIntefejs.lec();
    }

    public void setLatanieIntefejs(LatanieInterface latanieIntefejs){
        this.latanieIntefejs=latanieIntefejs;
    }
}
