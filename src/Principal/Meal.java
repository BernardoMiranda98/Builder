
package Principal;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item){
        items.add(item);
    }
    public float gesCost(){
        float cost = 0.0f;
        
        for (Item item : items){
            cost += item.price();
    }
        return cost;
     }
    public void showItems(){
        
        for (Item item : items) {
            System.out.print("Item : " + item.nome());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
        }
    }
