package Strategia.Kaczki;

import Strategia.Kaczki.SposobyKwakania.Kwacz;
import Strategia.Kaczki.SposobyLatania.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka {



    public PlaskonosKaczka(){
        latanieIntefejs=new LatamBoMamSkrzydla();
        kwakanieIntefejs=new Kwacz();

    }
    @Override
    public void wyswietl(){
        System.out.println("Wyświetlam płaskonosa");
    }
}
