public class Main{
    public static void main(String[] args){

        String str1 = "Hello";
        String str2 = "Hello";

        // Strings should not be compared using the double equals operator
        if (str1 == str2){
            System.out.println("They match!");
        }
        else {
            System.out.println("They don't match!");
        }

        String p1 = "Hello ";
        String p2 = "World!";
        String str3 = p1 + p2;
        System.out.println(str3);

        String str4 = "Hello World!"; // exact same as str3
        System.out.println(str4);

        System.out.println(str3 == str4); // 1 if they match; 0 if they don't
    }
}