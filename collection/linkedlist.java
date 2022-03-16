package collection;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        List<String> cobalinkedlist = new LinkedList<>();

        cobalinkedlist.add("11");
        cobalinkedlist.add("22");
        cobalinkedlist.add("44");
        cobalinkedlist.add("33");
        cobalinkedlist.add("22");

        System.out.println("Isi dari cobalinkedlist :");
        System.out.println(cobalinkedlist);

        cobalinkedlist.remove(2);
        System.out.println("Isi dari cobalinkedlist setelah remove list data ke-2 (44) :");
        System.out.println(cobalinkedlist);

            System.out.println("Isi dari cobalinkedlist list data ke-0 (11) :");
        System.out.println(cobalinkedlist.get(0));
    }
}
