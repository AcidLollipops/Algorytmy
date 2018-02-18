package WSB;

public class ExeSix {

    public static void main(String[] args) {
        //8.Ile liczb kolejnych liczb należy dodać, żeby ich suma przekroczyła
        //1000

        int counter=0;
        int suma=0;
        while(suma <=1000){
            suma+=counter;
            counter++;
        }

        System.out.println("Trzeba bylo dodać " + counter +" kolejnych liczb, "
                + "aby suma przekroczyla 1000. Suma tych liczb daje wynik: "
                + suma);
    }
}
