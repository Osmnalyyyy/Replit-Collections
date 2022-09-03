import java.util.Iterator;
import java.util.TreeSet;

public class Collections15 {
    public static void main(String[] args) {
        //Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
        //TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
        //Beklenen Çıktı:
        //Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
        //ilk elemen: kirmizi
        //son eleman: yesil
        String[] str = {"sari", "mavi", "yesil", "kirmizi", "turuncu", "pembe"};
        TreeSet<String> tree = new TreeSet<>();
        for (String w : str) {
            tree.add(w);
        }
        Iterator it = tree.iterator();
        Iterator it2 = tree.descendingIterator();

        System.out.println("ilk eleman : "+it.next());
        System.out.println("son eleman : "+it2.next());

    }
}
