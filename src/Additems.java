import java.util.HashMap;
import java.util.Iterator;
import  java.util.HashSet;
import java.util.Scanner;
public class Additems {
    private HashMap <Integer,Item> items;
    private Scanner scanner;
    private HashSet<String>cart;

    public Additems(){
        items=new HashMap<>();
        scanner=new Scanner(System.in);
        cart=new HashSet<>();

    }
    public void Additems(Item item){
        items.put(item.No,item);
//        System.out.println("Items Added");
//        System.out.println(item.No+"."+item.items);
    }
    public void displayItems(){
        Iterator display_no=items.keySet().iterator();
        Iterator display_items=items.values().iterator();
        System.out.println("Available Items");
        while (display_no.hasNext()){
            System.out.println(display_no.next()+". "+ display_items.next());
        }

    }
    public void selectitems(){

        System.out.println("Select an item to add to your cart (enter item number):");
        try {
            int userinput=scanner.nextInt();
            if(items.containsKey(userinput)){
                Item selectedItem=items.get(userinput);
                if(cart.contains(selectedItem.toString())){
                    System.out.println("Item"+selectedItem+" is already on the cart");
                }else {
                    cart.add(selectedItem.toString());
                    System.out.println("Item"+ selectedItem +" has been added");
                }
            }else {
                System.out.println("There is no such item in inventory");
            }
        }catch (java.util.InputMismatchException e){
            System.out.println("Enter number you want to select from the list");
        }
    }
    public void displaycart(){
        Iterator d_cart=cart.iterator();
        System.out.println("Item in cart");
        while (d_cart.hasNext()){
            System.out.println(d_cart.next());
        }
    }

}
