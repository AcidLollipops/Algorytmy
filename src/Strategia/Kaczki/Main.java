package Strategia.Kaczki;

import Strategia.Kaczki.SposobyLatania.LotZNapędemRakietowym;

public class Main {
    public static void main(String[] args) {

        KaczkaModel km=new KaczkaModel();
        km.wykonajlec();
        km.setLatanieIntefejs(new LotZNapędemRakietowym());
        km.wykonajlec();
    }
}
