package collection;

import java.util.*;

public class hashmap {

    public static void main(String[] args){
        Map<String, String> cobahashmap = new HashMap<>();

        //menambahkan data
        cobahashmap.put("11", "satu");
        cobahashmap.put("22", "dua");
        cobahashmap.put("22", "duaa");
        cobahashmap.put("44", "empat");
        cobahashmap.put("33", "tiga");
        cobahashmap.put("22", "dua");

        System.out.println("Isi dari cobahashmap :");
        System.out.println(cobahashmap);

        System.out.println("Isi dari cobahashmap setelah remove 22 :");
        cobahashmap.remove("22");
        System.out.println(cobahashmap);

        System.out.println("Isi dari cobahashmap map key 44 (empat) :");
        System.out.println(cobahashmap.get("44"));
    }
}