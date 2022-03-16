package collection;

import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {
        Set<String> cobalinkedhashset = new LinkedHashSet<>();

        cobalinkedhashset.add("11");
        cobalinkedhashset.add("22");
        cobalinkedhashset.add("44");
        cobalinkedhashset.add("33");
        cobalinkedhashset.add("22");

        System.out.println("Isi dari cobalinkedhashset :");
        System.out.println(cobalinkedhashset);

        cobalinkedhashset.remove("33");
        System.out.println("Isi dari setelah remove 33 dari cobalinkedhashset :");
        System.out.println(cobalinkedhashset);

        cobalinkedhashset.add("11");
        System.out.println("Isi dari setelah meng-add 11 dari cobalinkedhashset :");
        System.out.println(cobalinkedhashset);

        cobalinkedhashset.add("66");
        System.out.println("Isi dari setelah meng-add 66 dari cobalinkedhashset :");
        System.out.println(cobalinkedhashset);
    }
}
