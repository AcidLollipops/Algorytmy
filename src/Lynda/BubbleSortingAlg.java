package Lynda;


import java.util.Random;

public class BubbleSortingAlg {

    public static void main(String[] args) {
        int []arr={12,7,6,1,3};
        int temp=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
