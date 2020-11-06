import java.util.ArrayList;
import java.util.Scanner;

public class add_item 
{
    
    static ArrayList<item_details>item_list = new ArrayList<item_details>();
    static String name;
    static int price, quantity;
    private static Scanner sc;
     public static void additem() 
     {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the item u have to add:");
            name = sc.nextLine();
            System.out.println("enter price for that:");
            price =sc.nextInt();
            System.out.println("quantity fo that:");
            quantity=sc.nextInt();
            item_details id = new item_details(name, price, quantity);
            item_list.add(id);
            System.out.println(("item added scucessfully"));
            action a = new action();
            a.choice2();
    
    }
    public static void display_item()
       {
         System.out.println("totals items");
         System.out.println("name\t\tprice\t\tquantity");
         for (item_details i : item_list)
          {  
             System.out.print(i);
             System.out.println("\t\t");
          }
    }
    public static void delete_item () {
      System.out.println("enter the index  u want to delete");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      item_list.remove(num);
      System.out.println("item deleted successfully");
      action a = new action();
      a.choice2();
  }
}
