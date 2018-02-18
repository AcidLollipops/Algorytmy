package WSB;

public class ExeEight {
    public static void main(String[] args) {
        //10.Wyświetlić liczby od 0 do 100 po 4 w każdym wierszu

        System.out.println("Po 4 cyfry w każdym wierszu: ");

        for(int i =0; i<11; i++){
            if(i%4!=0 || i==0)
                System.out.print(i);
            else
                System.out.print("\n"+i);
        }
        System.out.println("\n");
    }
}
