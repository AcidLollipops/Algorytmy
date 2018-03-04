package Strategia.Kaczki;

import Strategia.Kaczki.SposobyLatania.LatamBoMamSkrzydla;
import Strategia.Kaczki.SposobyKwakania.Kwacz;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        kwakanieIntefejs=new Kwacz();
        latanieIntefejs=new LatamBoMamSkrzydla();
    }


    @Override
    public void wyswietl(){
       // super.wyswietl();//wywyłujemy klasę nadrzędna
        System.out.println("Wyświetlam dziką kaczkę");
    }
}
