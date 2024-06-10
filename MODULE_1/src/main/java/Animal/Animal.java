package animals;

public class Animal {
    private String name;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }
    public String getName() {
        return name;
    }
    public void run(int distance) {
        System.out.println("Животное бегает");
    }
    public void swim(int distance) {
        System.out.println("Животное плавает");
    }
    public static int getCounter() {
        return counter;
    }
}
