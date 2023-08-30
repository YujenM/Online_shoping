import java.util.Scanner;
public class OnlineShopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Additems list=new Additems();
        Item item1=new Item(1 ," T-Shirt");
        Item item2=new Item(2 ," Jeans");
        Item item3=new Item(3 , " Sneakers");
        Item item4= new  Item(4 , " Backpack");
        Item item5= new  Item(5 , " Hat");
        list.Additems(item1);
        list.Additems(item2);
        list.Additems(item3);
        list.Additems(item4);
        list.Additems(item5);
        System.out.println("Welcome To Online Shopping!");
        list.displayItems();
        list.selectitems();
        list.selectitems();
        list.selectitems();
        list.selectitems();
        list.selectitems();
        System.out.println("Would you like to view your cart? (yes/no): ");

        String userdecisioniput=scanner.nextLine().toLowerCase();
        if(userdecisioniput.equals("yes")){
            list.displaycart();
        } else if (userdecisioniput.equals("no")) {
            System.out.println("Thankyou for Shopping! Have a nice day.");
        }else {
            System.out.println("Enter yes/no");
        }


    }
}
