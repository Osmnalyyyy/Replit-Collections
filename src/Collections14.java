import java.util.Iterator;
import java.util.TreeSet;

public class Collections14 {
    public static void main(String[] args) {
        //Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()
        // fonksiyonunu kullanarak ters sıradan yazdıralım.
        //TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
        //Beklenen Çıktı:
        //Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
        //Tersten Siralanisi:
        //yesil
        //turuncu
        //sari
        //mavi
        //kirmizi

        String[] str = {"yesil", "sari", "mavi", "turuncu", "kirmizi"};
        TreeSet<String> tree = new TreeSet<>();
        for (String w : str) {
            tree.add(w);
        }
        for (String w : tree) {
            System.out.println(w);
        }
        System.out.println();
        System.out.println("Tersten Siralanisi:");
        System.out.println();
       Iterator it= tree.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
