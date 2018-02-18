import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rnd =new Random();
        Scanner sc=new Scanner(System.in);

        int compNo=0;
        int userNo=0;
        int suma=100;

        while(suma>0){

            System.out.println("Podaj liczbę od 1-10");
            userNo=sc.nextInt();

            if(userNo>0 && userNo<11)
            {
                suma-=userNo;
                if (suma>11) {
                compNo=rnd.nextInt(11);
                suma-=compNo;}
                else
                    System.out.println("User won! His/Her score is " + suma);
                System.out.println(suma);
            }



        }

            }
}
