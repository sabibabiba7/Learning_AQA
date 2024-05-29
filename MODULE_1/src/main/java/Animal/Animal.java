package Animal;

public class Animal {
        protected String type;
        protected String name;
        protected int flying;
        protected int swims;
        protected int goes;
        protected int run;
        protected int crawling;
        private static int count;

        public Animal() {
            count++;
        }
        public static int getCount() {
            return count;
        }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            count++;
            return super.clone();
        }

        @Override
        public String toString() {
            return "Вид/порода: '" + type + '\'' +
                    ", Кличка: '" + name + "\' \nТТХ:" +
                    ", Может проплыть " + swims + "м. " +
                    ", Может пробежать " + run + "м. " +
        }

        protected void run(int distance) {
            if (run >= distance) {
                System.out.println(this.type + " по кличке " + this.name + "  - Пробежал " + distance + "м.");
            } else {
                System.out.println(this.type + " по кличке " + this.name + " ---- Не пробежал ---- ");
            }
        }

        protected void swim(int distance) {
            if (swims >= distance) {
                System.out.println(this.type + " по кличке " + this.name + "   - Проплыл " + distance + "м.");
            } else {
                System.out.println(this.type + " по кличке " + this.name + " ---- Не умеет плавать ---- ");
            }
        }
    }
}
