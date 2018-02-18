package Lynda;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
         int p=Integer.parseInt(args[0]);
         int q=Integer.parseInt(args[1]);
         int d=gcd(p,q);
         int d2=gcd2(p,q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d);
        System.out.println("gcd2(" + p + ", " + q + ") = " + d2);
    }
    //non-recursive method
    public static int gcd(int p, int q){

        while(q!=0){
            int temp=q; //keep divider in temp variable
            q=p%q; // asign modulo to q
            p=temp;
        }

        return p;
    }
    //recursive method
    public static int gcd2(int p, int q){
        if(q==0) return p;
        return gcd2(q,p%q);
    }
}
