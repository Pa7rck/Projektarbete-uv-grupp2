/*
    man ska kunna:
           ange namn
           ha 100 health i början
           increase health
           decrease health
 */

public class Player {
    private String name;
    private static int health;
    private static int mushroomCount = 0;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }


    // health
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

    public static void takeDamage(int damage) {
        health -= damage;
    }

    // gets health from mushroom
    public static void eatMushroom() {
        if(mushroomCount > 0) {
            health += 5;
            mushroomCount--;
        }
        else {
            System.out.println("You have no mushrooms left");
        }
    }

    public static void addMushroom(int amount) {
        mushroomCount += amount;
    }

    public static void removeMushroom(int amount) {
        mushroomCount -= amount;
    }

    public static int getMushroomCount() {
        return mushroomCount;
    }


}
