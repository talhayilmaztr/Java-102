package PatikaStore;

import java.util.*;


public class brand {

    Scanner sc = new Scanner(System.in);

    public static HashMap<String ,String> brandList = new HashMap();

    static {
        brandList.put("SM", "Samsung");
        brandList.put("LN", "Lenovo");
        brandList.put("AP", "Apple");
        brandList.put("HW", "Huawei");
        brandList.put("CP", "Casper");
        brandList.put("AS", "Asus");
        brandList.put("HP", "HP");
        brandList.put("XM", "Xiaomi");
        brandList.put("MN", "Monster");
    }

    public brand() {
    }
    public static List<String> getSortedBrands() {

        List<String> sortedList = new ArrayList<>(brandList.values());
        Collections.sort(sortedList);
        return sortedList;
    }
    public void markaListele(){

        for (String key : brand.brandList.keySet()) {
            String value = brand.brandList.get(key);
            System.out.println(key + " - " + value);
        }
    }
    public void phoneListShow(Phone phone){
        for (String key : brand.brandList.keySet()) {
            String value = brand.brandList.get(key);
            System.out.println(key + " - " + value);

        }
    }
    public static void phoneList(HashMap<String, Phone> phones){
        Iterator<Map.Entry<String, Phone>> phoneIterator = phones.entrySet().iterator();

        System.out.println("__________________________________________________________________________________________________________");
        System.out.println("| ID | Ürün Adı                  | Fiyat       | Marka    | Depolama | Ekran  | Renk      | RAM   | Güç |");
        System.out.println("__________________________________________________________________________________________________________");

        int id= 1;
        while (phoneIterator.hasNext()) {
            Map.Entry<String, Phone> entry = phoneIterator.next();
            Phone phone = entry.getValue();

            System.out.printf("| %-2d | %-25s | %-8.1f TL | %-8s | %-8s | %-6s | %-9s | %-5s | %-4d |\n",
                    id++,
                    phone.getName(),
                    phone.getPrice(),
                    phone.getBrand(),
                    phone.getMemory(),
                    phone.getScreen_size(),
                    phone.getColor(),
                    phone.getRam(),
                    phone.getPower());

            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

    }
    public static void notebookList(HashMap<String, Notebook> notebooks){
        Iterator<Map.Entry<String, Notebook>> notebookIterator = notebooks.entrySet().iterator();

        System.out.println("__________________________________________________________________________________________________________");
        System.out.println("| ID | Ürün Adı                  | Fiyat       | Marka    | Depolama | Ekran   | RAM  | Stok  | İndirim |");
        System.out.println("__________________________________________________________________________________________________________");

        int id = 1;
        while (notebookIterator.hasNext()) {
            Map.Entry<String, Notebook> entry = notebookIterator.next();
            Notebook notebook = entry.getValue();

            System.out.printf("| %-2d | %-25s | %-8.1f TL | %-8s | %-8s | %-6s | %-4s | %-5d | %-8.1f TL |\n",
                    id++,
                    notebook.getName(),
                    notebook.getPrice(),
                    notebook.getBrand(),
                    notebook.getStorage(),
                    notebook.getScreenSize(),
                    notebook.getRam(),
                    notebook.getStock(),
                    notebook.getDiscount());

            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public static HashMap<String, String> getBrandList() {
        return brandList;
    }

    public static void setBrandList(HashMap<String, String> brandList) {
        brand.brandList = brandList;
    }
}



