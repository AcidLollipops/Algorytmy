public class ConvertingNumericValues {
    public static void main(String[] args) {
        int intValue=56;
        int intValue2=intValue;
        System.out.println("The 2nd value is " + intValue2);
        long longValue1=intValue; //
        System.out.println("The long value is " + longValue1);
        short shortValue=(short)intValue; //narrowing the value to new type -CASTING
        System.out.println("The SHORT value is " + shortValue);

        int intValue3=1024;
        byte byteValue= (byte) intValue3; //CASTING
        System.out.println("The BYTE value is " + byteValue);

        double doubleValue=3.9999999d;
        int intValue4= (int) doubleValue;
        System.out.println("Double to int: "+ intValue4);
    }
}
