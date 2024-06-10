package animals;

public class Dog extends Animal {
    private static final int MAX_RUN_DIST = 500;
    private static final int MAX_SWIM_DIST = 10;
    private static int counter = 0;

    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_RUN_DIST) {
            System.out.println("Собака: '" + getName() + "осталась стоять на месте");
        } else if (distance < 0) {
            System.out.println("Расстояние не может быть меньше нуля");
        } else if (distance == 0) {
            System.out.println("Собака: '" + getName() + "осталась стоять на месте");
        } else {
            System.out.println("Собака: '" + getName() + "' пробежала: " + distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > MAX_SWIM_DIST) {
            System.out.println("Собака: '" + getName() + "' не сможет столько проплыть");
        } else if (distance < 0) {
            System.out.println("Расстояние не может быть меньше нуля");
        } else if (distance == 0) {
            System.out.println("Собака: '" + getName() + "' осталась стоять на месте ");
        } else {
            System.out.println("Собака: '" + getName() + "' проплыла: " + distance);
        }
    }

    public static int dogCounter() {
        return counter;
    }

}
