package WSB;

public class ExeOne {
    public static void main(String[] args) {
        //1.Wyświetlić liczby od 0 do 20
        //2.Wyświetlić liczby od 0 do 20 z napisem „ liczba nr”

        //sposób z souf
        for (int i = 0; i < 21; i++) {
            System.out.printf("Liczba nr: %d\n",i);
        }
        //3.Wyświetlić liczby od 20 do 0
        System.out.println("\nExercise no 3:\n");

        //sposób z sout
        for(int i=20;i>=0;i--)
            System.out.println("Liczba nr: " + i);

    }

}
