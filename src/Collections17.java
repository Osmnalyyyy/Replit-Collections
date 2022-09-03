import java.util.Iterator;
import java.util.TreeSet;

public class Collections17 {
    public static void main(String[] args) {
        //Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek
        // karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.
        //1. TreeSet: mavi,yesil,kirmizi,sari
        //2. TreeSet: yesil,mavi,pembe,turuncu
        //Beklenen Çıktı:
        //1. TreeSet: [kirmizi,mavi,sari,yesil]
        //2. TreeSet: [mavi,pembe,turuncu,yesil
        //Karsilastirma Sonucu:
        //no
        //no
        //no
        //yes
        String[] str1={"mavi","yesil","kirmizi","sari"};
        String[] str2={"yesil","mavi","pembe","turuncu"};
        TreeSet tree1=new TreeSet<>();
        TreeSet tree2=new TreeSet<>();
        for (String w:str1){tree1.add(w);}
        for (String w:str2){tree2.add(w);}
        System.out.println(tree1);
        System.out.println(tree2);
        Iterator it1=tree1.iterator();
        Iterator it2=tree2.iterator();
        while (it1.hasNext()){
            if (it1.next().equals(it2.next())){
                System.out.println("yes");
            }else System.out.println("no");
        }




















    }
}
