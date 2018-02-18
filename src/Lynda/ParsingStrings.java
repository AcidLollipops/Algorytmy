public class ParsingStrings {
    public static void main(String[] args) {
        String sl="Welcome to California";
        System.out.println("Length of string: " + sl.length());

        int position=sl.indexOf("California");
        System.out.println("Positon of substring: " + position);

        String sub=sl. substring(11);
        System.out.println(sub);

        String s2="Welcome          ";
        int len1=s2.length();
        System.out.println(len1);
        String s3=s2.trim();
        System.out.println(s3.length());

    }
}
