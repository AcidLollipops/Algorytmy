package WSB;

public class ExeTwelve {
    public static void main(String[] args) {
         /*
        Użyj pętli for do wypełnienia tablicy kolejnymi liczbami od 20 do 1.
        Gotową zawartość tablicy wyświetl na ekranie.
        Następnie wykonaj to samo zadanie używając pętli while.
        */
        int arr[]=new int[20];
        int liczba=20;
        for(int i=0; i<arr.length;i++){
            arr[i]=liczba;
            System.out.println("arr id- " + i + " val: " +  arr[i]);
            liczba--;
        }
        int arr2[]=new int[20];
        int i =0;
        System.out.println("");
        int liczba2=20;
        while(i<=arr2.length-1){
            arr2[i]=liczba2;

            System.out.printf("arr2 id- %d, val: %d\n", i, arr2[i]);
            i++;
            liczba2--;

        }
    }
}
