
public class Player {
    private static int health = 100;
    private static int mushroomCount = 0;

    public static int getHP() {
        return health;
    }

    public static void takeDamage(int damage) {
        health -= damage;
    }

    public static void addMushroom() {
        mushroomCount++;
    }

    public static void removeMushroom() {
        mushroomCount--;
    }

    public static void eatMushroom() {
        if (mushroomCount >= 1) {
            mushroomCount--;
            health += 20;
        } else {
            System.out.println("You don't have any mushrooms to eat.");
        }
    }

    public static int getMushroomCount() {
        return mushroomCount;
    }

}
