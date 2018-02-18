import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumericValusAsStrings {
    public static void main(String[] args) {
        Locale locale=new Locale("da","DK");
        double doubleValue=1_234_567.89;

        NumberFormat numF=NumberFormat.getNumberInstance(locale);
        System.out.println(numF.format(doubleValue));

        NumberFormat curF=NumberFormat.getCurrencyInstance(locale);
        System.out.println(curF.format(doubleValue));

        NumberFormat intF=NumberFormat.getIntegerInstance();
        System.out.println(intF.format(doubleValue));
    }
}
