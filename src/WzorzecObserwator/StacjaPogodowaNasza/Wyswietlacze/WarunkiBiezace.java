package WzorzecObserwator.StacjaPogodowaNasza.Wyswietlacze;

import WzorzecObserwator.StacjaPogodowaNasza.Obserwator;
import WzorzecObserwator.StacjaPogodowaNasza.Podmiot;
import WzorzecObserwator.StacjaPogodowaNasza.WyswietlElement;

public class WarunkiBiezace implements Obserwator, WyswietlElement {
    private Podmiot danePogodowe;
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public WarunkiBiezace(Podmiot danePogodowe){
        this.danePogodowe = danePogodowe;
        this.danePogodowe.dodajNaListeSubskrybentow(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.cisnienie = cisnienie;
        this.wilgotnosc = wilgotnosc;
    }

    @Override
    public void wyswietlElement() {
        System.out.printf("Temp: %f :: Ciśnienie: %f :: Wilgotność: %f\n",
                temp, cisnienie, wilgotnosc);


    }
}
