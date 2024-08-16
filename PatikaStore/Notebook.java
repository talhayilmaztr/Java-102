package PatikaStore;

public class Notebook {
    private int id;
    private double price;
    private double discount;
    private int stock;
    private String name;
    private String brand;
    private String ram;
    private String storage;
    private String screenSize;

    // Constructor
    public Notebook(int id, double price, double discount, int stock, String name, String brand, String ram, String storage, String screenSize) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", price=" + price +
                ", discount=" + discount +
                ", stock=" + stock +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}
