package WSB;

import java.util.Scanner;

public class FibonacciSequenceR {

    public static void main(String[] args) {

        System.out.println("Provide a digit from 0-9");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FibR(n);
        System.out.println(n);
    }

    static int FibR(int n){

        if(n<2 && n>=0){
            return n;}
        else{
            return (FibR(n-1)+FibR(n-2));}

        }
    }


