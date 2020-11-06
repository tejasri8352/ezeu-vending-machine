import java.util.Scanner;

public class action 
{
    public static void choice2()
         {
            System.out.println("enter your action:");
            System.out.println("1\t\tdisplay items");
            System.out.println("2\t\tadd item");
            System.out.println(("3\t\tdelete item"));
            System.out.println("4\t\tback to home");
             Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    add_item i = new add_item();
                    i.display_item();
                    action a = new action();
                    a.choice2();
                    break;
                case 2:
                    add_item j = new add_item();
                    j.additem();
                    break;
                case 3:
                     add_item k = new add_item();
                     k.delete_item();
                    break;
                case 4:
                     home y = new home();
                     y.choice();
         }
    }
}
