import java.util.Scanner;

public class StringBuliding {
    public static void main(String[] args) {

        String str1="Hello";
        String str2="World";
        String str3=str1 + ", " + str2 + "!";
        //Three objects were created to get final version of string
        //Instead of 3 obj var there can be used String Builder

        StringBuilder sb=new StringBuilder("Hello")
            .append(", ")
            .append("World")
            .append("!");
        System.out.println(sb);

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter value: ");
        String input=scanner.nextLine();
        System.out.println(input);
        sb.delete(0,sb.length());
        for (int i = 0; i <3 ; i++) {
            input=scanner.nextLine();
            sb.append(input + "\n");
        }
        //System.out.println(sb.toString()); = System.out.println(sb)
        System.out.println(sb);
    }
}
