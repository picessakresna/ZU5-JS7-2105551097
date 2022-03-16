package collection;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        Set<String> cobahashset = new HashSet<>();

        cobahashset.add("11");
        cobahashset.add("22");
        cobahashset.add("44");
        cobahashset.add("33");
        cobahashset.add("22");

        System.out.println("Isi dari cobahashset :");
        System.out.println(cobahashset);

        cobahashset.remove("33");
        System.out.println("Isi dari cobahashset setelah remove 33 dari cobahashset :");
        System.out.println(cobahashset);

        cobahashset.add("11");
        System.out.println("Isi dari cobahashset setelah meng-add 11 dari cobahashset :");
        System.out.println(cobahashset);

        cobahashset.add("66");
        System.out.println("Isi dari cobahashset setelah meng-add 66 dari cobahashset :");
        System.out.println(cobahashset);
    }
}
