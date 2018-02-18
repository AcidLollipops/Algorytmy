package WSB;

public class ExeFive {

    public static void main(String[] args) {
        //7.Zsumować tylko liczby parzyste od 0 do 20 i nieparzyste.
        //Wyświetlić większy wynik
        int sumEven=0;
        int sumOdd=0;

        for(int i=0; i<21;i++){
            if(i%2==0){
                sumEven+=i;
            }else
                sumOdd+=i;
        }

        if (sumEven>sumOdd){
            System.out.println("Większy wynik należy do liczb parzystych: "
                    + sumEven);
        } else
            System.out.println("Większy wynik należy do liczb nieparzystych: "
                    + sumOdd);
    }
}
