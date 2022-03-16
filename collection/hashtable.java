package collection;

import java.util.*;

public class hashtable {

    public static void main(String[] args){
        Map<String, String> cobahashtable = new Hashtable<>();

        //menambahkan data
        cobahashtable.put("11", "satu");
        cobahashtable.put("22", "dua");
        cobahashtable.put("22", "duaa");
        cobahashtable.put("44", "empat");
        cobahashtable.put("33", "tiga");
        cobahashtable.put("22", "dua");

        System.out.println("Isi dari cobahashtable :");
        System.out.println(cobahashtable);

        cobahashtable.remove("22");
        System.out.println("Isi dari cobahashtable setelah remove 22 :");
        System.out.println(cobahashtable);

        System.out.println("Isi dari cobahashtable map key 44 (empat) :");
        System.out.println(cobahashtable.get("44"));
    }
}
