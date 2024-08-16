package PatikaStore;
import java.util.*;

// Main class
public class Main {
    public static void main(String[] args) {
        brand brand = new brand();
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Phone> phones = new HashMap<>();
        HashMap<String, Notebook> notebooks = new HashMap<>();



        Phone phone1 = new Phone(1, 999.99, 0.10, 50, "Galaxy S21", brand.getBrandList().get("SM"), "128GB", "6.2\"", 4000, "Black", "8GB");
        Phone phone2 = new Phone(2, 799.99, 0.15, 40, "Legion Phone Duel 2", brand.getBrandList().get("LN"), "512GB", "6.92\"", 5500, "Red", "12GB");
        Phone phone3 = new Phone(3, 1299.99, 0.05, 30, "iPhone 13", brand.getBrandList().get("AP"), "256GB", "6.1\"", 3200, "White", "6GB");
        Phone phone4 = new Phone(4, 699.99, 0.20, 60, "P40 Pro", brand.getBrandList().get("HW"), "256GB", "6.58\"", 4200, "Silver", "8GB");
        Phone phone5 = new Phone(5, 899.99, 0.12, 45, "VIA A4", brand.getBrandList().get("CP"), "64GB", "6.09\"", 4000, "Blue", "4GB");
        Phone phone6 = new Phone(6, 499.99, 0.18, 70, "ROG Phone 5", brand.getBrandList().get("AS"), "256GB", "6.78\"", 6000, "Black", "16GB");
        Phone phone7 = new Phone(7, 1199.99, 0.10, 35, "Pavilion Aero 13", brand.getBrandList().get("HP"), "512GB", "13.3\"", 4300, "Silver", "8GB");
        Phone phone8 = new Phone(8, 649.99, 0.15, 55, "Mi 11 Lite", brand.getBrandList().get("XM"), "128GB", "6.55\"", 4250, "Green", "6GB");
        Phone phone9 = new Phone(9, 1099.99, 0.05, 20, "Tulpar T7", brand.getBrandList().get("MN"), "1TB", "17.3\"", 5800, "Black", "32GB");

        phones.put(phone1.getBrand(), phone1);
        phones.put(phone2.getBrand(), phone2);
        phones.put(phone3.getBrand(), phone3);
        phones.put(phone4.getBrand(), phone4);
        phones.put(phone5.getBrand(), phone5);
        phones.put(phone6.getBrand(), phone6);
        phones.put(phone7.getBrand(), phone7);
        phones.put(phone8.getBrand(), phone8);
        phones.put(phone9.getBrand(), phone9);

        Notebook notebook1 = new Notebook(1, 11899.99, 0.10, 20, "Galaxy Book3", brand.getBrandList().get("SM"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook2 = new Notebook(2, 11799.99, 0.15, 15, "ThinkPad X1 Carbon", brand.getBrandList().get("LN"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook3 = new Notebook(3, 21099.99, 0.05, 10, "MacBook Air M2", brand.getBrandList().get("AP"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook4 = new Notebook(4, 11699.99, 0.20, 25, "MateBook X Pro", brand.getBrandList().get("HW"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook5 = new Notebook(5, 11649.99, 0.25, 30, "Nirvana C350", brand.getBrandList().get("CP"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook6 = new Notebook(6, 19149.99, 0.12, 12, "ZenBook 14", brand.getBrandList().get("AS"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook7 = new Notebook(7, 11199.99, 0.08, 8, "Pavilion 15", brand.getBrandList().get("HP"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook8 = new Notebook(8, 11599.99, 0.18, 22, "Mi Notebook Pro 14", brand.getBrandList().get("XM"), "8GB", "512GB SSD", "14 inch");
        Notebook notebook9 = new Notebook(9, 17149.99, 0.20, 18, "Tulpar T7 V5.2", brand.getBrandList().get("MN"), "8GB", "512GB SSD", "14 inch");

        notebooks.put(notebook1.getBrand(), notebook1);
        notebooks.put(notebook2.getBrand(), notebook2);
        notebooks.put(notebook3.getBrand(), notebook3);
        notebooks.put(notebook4.getBrand(), notebook4);
        notebooks.put(notebook5.getBrand(), notebook5);
        notebooks.put(notebook6.getBrand(), notebook6);
        notebooks.put(notebook7.getBrand(), notebook7);
        notebooks.put(notebook8.getBrand(), notebook8);
        notebooks.put(notebook9.getBrand(), notebook9);
        System.out.print("Patika Store Product Management Panel " +
                "\n 1- Brands " +
                "\n 2- Notebooks " +
                "\n 3- Phones " +
                "\n Please Select one : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("...Brands...");
                brand.markaListele();
                break;
            case 2:
                brand.notebookList(notebooks);
                break;
            case 3:
                brand.phoneList(phones);
                break;
            default:
                System.out.println("Wrong input. Try again");
                break;
        }


    }
}