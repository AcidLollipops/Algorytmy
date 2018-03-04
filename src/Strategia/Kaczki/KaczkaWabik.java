package Strategia.Kaczki;

import Strategia.Kaczki.SposobyKwakania.NieKwacz;
import Strategia.Kaczki.SposobyLatania.NieLatamBoJestemNielotem;

public class KaczkaWabik extends Kaczka {

   public KaczkaWabik(){
       latanieIntefejs=new NieLatamBoJestemNielotem();
       kwakanieIntefejs=new NieKwacz();
   }


    @Override
    public void wyswietl(){
        System.out.println("Wyświetlam kaczkę wabik");
    }


}
