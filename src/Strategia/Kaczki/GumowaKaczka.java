package Strategia.Kaczki;

import Strategia.Kaczki.SposobyLatania.NieLatamBoJestemNielotem;
import Strategia.Kaczki.SposobyKwakania.Piszcz;

public class GumowaKaczka extends Kaczka {


    public GumowaKaczka(){
        kwakanieIntefejs=new Piszcz();
        latanieIntefejs=new NieLatamBoJestemNielotem();
    }

    @Override
    public void wyswietl(){
        System.out.println("Wyświetlam gumową kaczkę");
    }


}
