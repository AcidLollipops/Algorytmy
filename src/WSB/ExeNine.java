package WSB;
import javax.swing.*;
public class ExeNine {
    public static void main(String[] args) {
               /*1/Napisz aplikację, która dla wczytanych danych (liczba wierszy,
        liczba kolum, numer wiersza) dla wiersza o wczytanym numerze oblicza
        sumę elementów w tablicy. Na lepszą ocenę: Wykorzystaj
        JOptionPane.showInputDialog oraz JoptionPane.showMessageDialog.
        */

        int tab[][]=new int[4][4];
        int x=1;
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                tab[i][j]=x;
                System.out.println("tab id [" + i + ","+ j+"]" + " value= "+ tab[i][j]);
                x++;
            }
        }

        int suma=0;
        String odp;
        int k=0;
        odp = JOptionPane.showInputDialog("Podaj dowolną liczbę całkowitą "
                + "z przedziału od 0-3");

        while(true){


            try{
                k = Integer.parseInt (odp);
                if(k<=tab.length-1){
                    for(int i=0;i<tab[k].length;i++){
                        suma+=tab[k][i];
                    }
                    //System.out.println("Dla danego wiersza suma wyniosła= " + suma);
                    JOptionPane.showMessageDialog(null, "Dla danego wiersza suma wyniosła= " + suma, "Suma wiersza" + k, JOptionPane.INFORMATION_MESSAGE);
                    break;}
                else{ odp = JOptionPane.showInputDialog(odp + " jest za duża. Wprowadź liczbę z przedziału 0-3");
                    continue;}
            }catch(NumberFormatException ex){
                if(odp==null)
                    break;
                else{
                    odp = JOptionPane.showInputDialog(odp + " nie jest liczbą. Wprowadź liczbę z przedziału 0-3");
                    continue;}

            }}
    }
}
