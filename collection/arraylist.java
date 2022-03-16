package collection;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        List<String> cobaarraylist = new ArrayList<>();

        cobaarraylist.add("11");
        cobaarraylist.add("22");
        cobaarraylist.add("44");
        cobaarraylist.add("33");
        cobaarraylist.add("22");

        System.out.println("Isi dari cobaarraylist :");
        System.out.println(cobaarraylist);

        cobaarraylist.remove(2);
        System.out.println("Isi dari cobaarraylist setelah remove list data ke-2 (44) :");
        System.out.println(cobaarraylist);

        System.out.println("Isi dari cobaarraylist list data ke-0 (11) :");
        System.out.println(cobaarraylist.get(0));
    }
}
