import java.util.Iterator;
import java.util.TreeSet;

public class Collections16 {
    public static void main(String[] args) {
        //Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
        //TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
        //Beklenen Çıktı:
        //Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
        //Tree eleman sayısı: 5
        String[] str = {"yesil","sari","mavi","kirmizi","pembe"};
        TreeSet tree=new TreeSet<>();
        for (String w:str){tree.add(w);}
        Iterator it=tree.iterator();
        int count=0;
        while (it.hasNext()){
            it.next();
            count++;
        }
        System.out.println("Orjinal TreeSet : "+tree);
        System.out.println("Tree eleman sayisi : "+count);
    }
}
