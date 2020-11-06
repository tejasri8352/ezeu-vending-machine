import java.util.ArrayList;
import java.util.Scanner;

public class owner
 {
     
    static ArrayList<item_details>item_list = new ArrayList<item_details>();
    static String name;
    static int price, quantity;
    public static void login() 
    {
        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        username = sc.nextLine();
        System.out.print("Enter password:");
        password = sc.nextLine();
        if (username.equals("teju") && password.equals("teju"))
         {
            System.out.println("login Successful");
            action a = new action();
            a.choice2();
         }
         else
         {
             System.out.println("invalid");
         }
    }
}
