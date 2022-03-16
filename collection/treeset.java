package collection;

import java.util.*;

public class treeset {
    public static void main(String[] args) {
        Set<String> cobatreeset = new TreeSet<>();

        cobatreeset.add("11");
        cobatreeset.add("22");
        cobatreeset.add("44");
        cobatreeset.add("33");
        cobatreeset.add("22");

        System.out.println("Isi dari cobatreeset :");
        System.out.println(cobatreeset);

        cobatreeset.remove("33");
        System.out.println("Isi dari cobatreese setelah remove 33 dari cobahashset :");
        System.out.println(cobatreeset);

        cobatreeset.add("11");
        System.out.println("Isi dari cobatreese setelah meng-add 11 dari cobahashset :");
        System.out.println(cobatreeset);

        cobatreeset.add("66");
        System.out.println("Isi dari cobatreese setelah meng-add 66 dari cobahashset :");
        System.out.println(cobatreeset);
    }
}
