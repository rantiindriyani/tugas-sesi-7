package universitas.util;

import java.util.ArrayList;
import java.util.ArrayDeque;

public class CollectionExample {
    
    public static void main(String[] args) {
        // contoh penggunaan ArrayList dengan tipe data generik
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Isi ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Contoh penggunaan ArrayDeque dengan tipe data generik
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);

        System.out.println("\nIsi ArrayDeque:");
        for (int number : arrayDeque) {
            System.out.println(number);
        }
    }
}
    
