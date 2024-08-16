package MyListClass;

public class MyList<T> {

    private T[] array;
    private int size;
    private int capacity;

    MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;

    }

    MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int Capacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = data;
    }


    public void getIndex(int index) {
        boolean c = false;
        if (c == false) {
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    System.out.println(array[i]);
                    c = true;
                }
            }

        }
    }

    public void remove(int index) {

        boolean c = false;
        if (c == false) {
            for (int i = 0; i < size + 1; i++) {
                if (index == i) {
                    array[i] = (T) " ";
                    System.out.println(array[i]);

                    c = true;
                }
            }

        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];

        }print();
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "     ");
        }
    }

    public void setArray(int index, T data) {
        T oldValue = array[index];
        array[index] = data;

    }

    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(data)) {
                System.out.println( data +" Dizide bulundu");
                return true;
            }
        }
        System.out.println(data+" Dizide bulunamadı");
        return false;
    }
}

