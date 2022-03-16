package collection;

import java.util.*;

public class linkedhashmap {
    public static void main(String[] args){
        Map<String, String> cobalinkedhashmap = new LinkedHashMap<>();

        //menambahkan data
        cobalinkedhashmap.put("11", "satu");
        cobalinkedhashmap.put("22", "dua");
        cobalinkedhashmap.put("22", "duaa");
        cobalinkedhashmap.put("44", "empat");
        cobalinkedhashmap.put("33", "tiga");
        cobalinkedhashmap.put("22", "dua");

        System.out.println("Isi dari cobalinkedhashmap :");
        System.out.println(cobalinkedhashmap);

        System.out.println("Isi dari cobalinkedhashmap setelah remove 22 :");
        cobalinkedhashmap.remove("22");
        System.out.println(cobalinkedhashmap);

        System.out.println("Isi dari cobalinkedhashmap map key 44 (empat) :");
        System.out.println(cobalinkedhashmap.get("44"));
    }
}
