import java.util.Scanner;

public class Main{
    public static void main(String[] ars){

        StringBuilder sb = new StringBuilder("The string you entered is: ");

        System.out.println("Enter here: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine() + " ";
        sb.append(input);

        // dynamically add to the string object during run time
        for (int i = 0; i < 3; i++){
            input = sc.nextLine() + " ";
            sb.append(input);
        }
        System.out.println(sb);

    }
}
