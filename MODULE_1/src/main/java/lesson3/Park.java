package lesson3;

public class Park {
    private String name;
    private String time;
    private String price;
    public Park(String name, String time, String price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

}
