package animals;

public class Cat extends Animal {
    private static final int MAX_DIST = 200;
    private static int counter = 0;
    @Override
    public void run(int distance) {
        if (distance > MAX_DIST) {
            System.out.println("Кот: '" + getName() + "' столько не пробежит");
        } else if (distance < 0) {
            System.out.println("Расстояние не может быть меньше нуля");
        } else if (distance == 0) {
            System.out.println("Кот: '" + getName() + "' не сдвинулся с места");
        } else {
            System.out.println("Кот: '" + getName() + "' пробежал: " + distance);
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("В этой программе коты не плавают");
    }

    public static int catCounter() {
        return counter;
    }
