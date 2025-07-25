import Lib.Animal;
import java.util.ArrayList;
import Lib.Dolphin;
import Lib.Eagle;
import Lib.Flyable;
import Lib.Lion;
import Lib.Penguin;
import Lib.Swimable;
public class zoo {
    public static void main(String[] args) {
         ArrayList<Animal> a = new ArrayList<>();
         a.add(new Lion("Biw"));
         a.add(new Penguin("Bacon"));
         a.add(new Eagle("Baimon"));
         a.add(new Dolphin("Baifren"));
         
         for (Animal animal : a) {
            System.out.println("Animal name : " + animal.getName());
            System.out.println("His Sound: " + animal.makeSound());
             if (animal instanceof Flyable) {
                System.out.println("Fly: " + ((Flyable) animal).fly());
            }

            else if (animal instanceof Swimable) {
                System.out.println("Swim: " + ((Swimable) animal).swim());
            }
            else
            System.out.println("Lion dont have talent only runner");
            System.out.println("----------------------------");
        }
        
    }
    
}
