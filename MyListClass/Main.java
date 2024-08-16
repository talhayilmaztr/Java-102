package MyListClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MyList<String> Obj1 = new MyList<String>();
        MyList<Integer> Obj2 = new MyList<>();

        Obj1.add("A");
        Obj1.add("B");
        Obj1.add("C");
        Obj1.add("D");
        Obj1.add("E");
        Obj1.add("F");
        Obj1.add("G");
//-------------------------------------------------------
        System.out.println("dizideki eleman sayisi : "+Obj1.size());
        System.out.println("dizinin kapasitesi : "+ Obj1.Capacity());

        Obj1.print();
        System.out.print("\nindexteki değeri bul : ");
        int input1 = scanner.nextInt();
        Obj1.getIndex(input1);
        System.out.print("indexteki değeri sil : ");
        int input2 = scanner.nextInt();
        Obj1.remove(input2);
        System.out.print("\nindexteki değeri değiştir : ");
        int input3 = scanner.nextInt();
        Obj1.setArray(input3, "k");
        System.out.println();
        Obj1.print();
        System.out.println();
        Obj1.contains("k");

/*
        Obj2.add(1);
        Obj2.add(2);
        Obj2.add(3);
        Obj2.add(4);
        Obj2.add(5);
        Obj2.add(6);
        Obj2.add(7);

        System.out.println("dizideki eleman sayisi : "+Obj2.size());
        System.out.println("dizinin kapasitesi : "+ Obj2.Capacity());

        Obj2.print();
        System.out.print("\nindexteki değeri bul : ");
        int input4 = scanner.nextInt();
        Obj2.getIndex(input4);
        System.out.print("indexteki değeri sil : ");
        int input5 = scanner.nextInt();
        Obj2.remove(input5);
        System.out.print("\nindexteki değeri değiştir : ");
        int input6 = scanner.nextInt();
        Obj2.setArray(input6, 10);
        System.out.println();
        Obj2.print();
        System.out.println();
        Obj2.contains(13);

*/

//--------------------------------------------------------

    }
}