package collection;

import java.util.*;

public class treemap {
    public static void main(String[] args){
        Map<String, String> cobatreemap = new TreeMap<>();

        //menambahkan data
        cobatreemap.put("11", "satu");
        cobatreemap.put("22", "dua");
        cobatreemap.put("22", "duaa");
        cobatreemap.put("44", "empat");
        cobatreemap.put("33", "tiga");
        cobatreemap.put("22", "dua");

        System.out.println("Isi dari cobahashmap :");
        System.out.println(cobatreemap);

        System.out.println("Isi dari cobahashmap setelah remove 22 :");
        cobatreemap.remove("22");
        System.out.println(cobatreemap);

        System.out.println("Isi dari cobahashmap map key 44 (empat) :");
        System.out.println(cobatreemap.get("44"));
    }
}
