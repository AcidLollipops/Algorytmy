public class BooleanValues {
    static boolean bDef;
    public static void main(String[] args) {


        boolean b1=true;
        boolean b2=false;
        System.out.println("The value of b1 is: "+ b1);
        System.out.println("The value of b2 is: " + b2);
        System.out.println("The value of bDef is: " + bDef);
        //Negation
        boolean b3=!b1;
        System.out.println("The value of b3 is: "+ b3);

        // Comparing ints
        int i1=0;
        boolean b4=(i1 !=0);
        System.out.println("The value of b4 is:" + b4);

        //Parsing Boolean
        String sBoolean="true";
        boolean parsed=Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed: " + parsed);
    }
}