import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numberList.add(i);
        }

        List<Integer> part1 = numberList.subList(0, 2500);
        List<Integer> part2 = numberList.subList(2500, 5000);
        List<Integer> part3 = numberList.subList(5000, 7500);
        List<Integer> part4 = numberList.subList(7500, 10000);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        Thread t1 = new Thread(new NumberProcessor(part1, evenNumbers, oddNumbers));
        Thread t2 = new Thread(new NumberProcessor(part2, evenNumbers, oddNumbers));
        Thread t3 = new Thread(new NumberProcessor(part3, evenNumbers, oddNumbers));
        Thread t4 = new Thread(new NumberProcessor(part4, evenNumbers, oddNumbers));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

       try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
       } catch (InterruptedException e) {
            e.printStackTrace();
       }


        System.out.println("Çift Sayılar: " + evenNumbers.size());
        System.out.println("Tek Sayılar: " + oddNumbers.size());
    }
}

