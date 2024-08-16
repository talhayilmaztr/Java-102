package PatikaStore;
public class Phone {
    private int id;
    private double price;
    private double discount;
    private int stock;
    private String name;
    private String brand;
    private String memory;
    private String screen_size;
    private int power;
    private String color;
    private String ram;

    public Phone(int id, double price, double discount, int stock, String name, String brand, String memory, String screen_size, int power, String color, String ram) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.screen_size = screen_size;
        this.power = power;
        this.color = color;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(String screen_size) {
        this.screen_size = screen_size;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", price=" + price +
                ", discount=" + discount +
                ", stock=" + stock +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory='" + memory + '\'' +
                ", screen_size='" + screen_size + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
