public class CompareStrings {

    public static void main(String[] args) {

        //1 - They match for str1 and str2 are the same objects. When str2 was created java
        // found in memory existing the same string and referenced it to the same place in
        // address memory
        String str1="Hello";
        String str2="Hello";

        if(str1==str2){
            System.out.println("They match!");
        }else{
            System.out.println("No match!");
        }
        // this kind of comparision is never case sensitive.
        String str3="hello";
        if(str1==str3){
            System.out.println("They match!");
        }else{
            System.out.println("No match");
        }

        String part1="Hello ";
        String part2="World";
        String str4=part1+part2;
        String str5="Hello World";

        if(str4.equals(str5)){
            System.out.println("They match!");
        }else{
            System.out.println("No match");
        }

    }
}
