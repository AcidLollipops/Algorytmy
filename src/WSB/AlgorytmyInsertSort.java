package WSB;

import java.util.Random;

public class AlgorytmyInsertSort {

    public static void main(String[] args) {

        Random rnd=new Random();
        int []tab = new int[5];
        int temp;
        tab[0]=rnd.nextInt(20);

        for(int i=1;i<tab.length; i++){

            tab[i]=rnd.nextInt(20);
            for(int j=i;j>0;j--){

                if (tab[j]<tab[j-1]) {
                    temp=tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j]=temp;
                }else{break;}
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab " + i + ": " + tab[i]);
        }
    }

}
