import java.util.ArrayList;
import java.util.List;

/*
    man ska kunna:
           ange namn
           ha 100 health i början
           increase health
           decrease health
 */

public class Person {
    private String name;
    private int health;
    //private List<String> inventory;

    public Person(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void increaseHealth(int currentHealth) {
        if (currentHealth > 0) {
            health += currentHealth;
        }
    }

    public void decreaseHealth(int currentHealth) {
        if (currentHealth < 0) {
            health -= currentHealth;
        }
    }

    public int getHealth() {
        return health;
    }
}
