package lesson9;

import java.util.ArrayList;


public class Box {
    private ArrayList<Fruits> product = new ArrayList<>();

    public Box() {
        ArrayList<Fruits> product = new ArrayList<>();
    }

    public double getWeight() {
        double sumWeightProducts = 0.0f;
        for (Fruits e : product) {
            sumWeightProducts += e.getWeight();
        }
        return sumWeightProducts;
    }

    public ArrayList<Fruits> getProduct() {
        return product;
    }

    public void add(Fruits fruit) {
        if (product.size() > 1) {
            if (isProductsComparable(fruit)) {
                throw new BoxCustomException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
            }
        }
        product.add(0, fruit);
    }

    private boolean isProductsComparable(Fruits fruit) {
        return false;
    }

    public boolean compare(Box other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
    }

    public void removeSingleItem() {
    }

    public void shiftSingleItem(Box box3) {
    }
}
