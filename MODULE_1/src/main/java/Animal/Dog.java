package Animal;

public class Dog {
    public class Dog extends Animal {
        private static int count;
        public Dog(String type, String name, int flying, int swims, int goes, int run, int crawling) {
            this.type = type;
            this.name = name;
            this.swims = swims;
            this.run = run;
            count++;
        }
        public static int getCount() {
            return count;
        }
    }
}
