package Animal;
public class Cat {
    public class Cat extends Animal {
        private static int count;
        public Cat(String type, String name, int flying, int swims, int goes, int run, int crawling) {
            this.type = type;
            this.name = name;
            this.swims = swims;
            this.run = run;
            count++;
        public static int getCount() {
            return count;
        }
    }
}