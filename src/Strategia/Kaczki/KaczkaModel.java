package Strategia.Kaczki;

import Strategia.Kaczki.SposobyLatania.LatamBoMamSkrzydla;
import Strategia.Kaczki.SposobyKwakania.NieKwacz;

public class KaczkaModel extends Kaczka {

    public KaczkaModel(){
        latanieIntefejs=new LatamBoMamSkrzydla();
        kwakanieIntefejs=new NieKwacz();
    }

    @Override
    public void wyswietl(){
        System.out.println("Wyświetlam kaczkę Model");
    }
}
