import java.util.HashSet;
import java.util.TreeSet;

public class Collections12 {
    public static void main(String[] args) {
        //Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
        //HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
        //Beklenen Çıktı:
        //Tree Set Elemanlari:
        //kirmizi
        //mavi
        //sari
        //turuncu
        //yesil
        String[] str={"sari","mavi","yesil","turuncu","kirmizi"};
        HashSet<String> hashSet=new HashSet<>();
        TreeSet<String> treeSet=new TreeSet<>();
        for (String w:str){hashSet.add(w);}
        for (String w:hashSet){treeSet.add(w);}
        System.out.println("Tree Set Elemanlari : ");
        for (String w:treeSet){
            System.out.println(w);
        }
    }
}
