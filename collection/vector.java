package collection;

import java.util.*;

public class vector {
    public static void main(String[] args) {
        List<String> cobavector = new Vector<>();

        cobavector.add("11");
        cobavector.add("22");
        cobavector.add("44");
        cobavector.add("33");
        cobavector.add("22");

        System.out.println("Isi dari cobavector :");
        System.out.println(cobavector);

        cobavector.remove(2);
        System.out.println("Isi dari cobavector setelah remove list data ke-2 (44) :");
        System.out.println(cobavector);

        System.out.println("Isi dari cobavector list data ke-0 (11) :");
        System.out.println(cobavector.get(0));
    }
}
