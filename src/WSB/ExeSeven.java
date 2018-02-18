package WSB;

public class ExeSeven {
    public static void main(String[] args) {
         /*9.Ile liczb parzystych/nieparzystych należy dodać, żeby ich suma
        przekroczyła 1000
        */

        int sum=0;
        int i=0;
        int counterEven=0;
        int counterOdd=0;
        while(sum<=1000){
            if(i%2==0){
                counterEven+=1;
                sum+=i;
            }else{
                counterOdd+=1;
                sum+=i;
            }
            i++;
        }
        System.out.printf("Potrzeba było %d kolejnych liczb "
                + "parzystych (w tym zero) i %d "
                + " liczb nieparzystych aby ich suma przekroczyła 1000. Obecna"
                + " suma wynosi %d.\n", counterEven,counterOdd,sum);
    }
}
