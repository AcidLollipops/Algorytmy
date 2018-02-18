import java.math.BigDecimal;

public class ExeciseOne {

    public static void main(String[] args) {
        double doubleValue=156.5d;
        Double doubleObj=new Double(doubleValue);
        byte byteValue=doubleObj.byteValue();
        int intValue=doubleObj.intValue();
        float floatValue=doubleObj.floatValue();
        System.out.println(byteValue);
        System.out.println(intValue);
        System.out.println(floatValue);
        String stringValue=doubleObj.toString();
        System.out.println(stringValue);


        double value=.012;
        double pSum=value+value+value;
        System.out.println("Sum of primitives: " +pSum);
        String strValue=Double.toString(value);
        System.out.println("strValue: " + strValue);
        BigDecimal bigValue=new BigDecimal(strValue);
        BigDecimal bSum=bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());

    }
}
