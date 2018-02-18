package WSB;

public class ExeEleven {

    public static void main(String[] args) {
        /*Użyj pętli for do zapisania w 10-elementowej tablicy 10 kolejnych
          liczb całkowitych. Następnie odczytaj Zawartość i wyświetl ją
          na ekranie.
        */

        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){

            arr[i]=i;
            System.out.println("arr id: " + i + " value: " + arr[i]);
        }
    }
}
