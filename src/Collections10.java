import java.util.Collections;
import java.util.LinkedList;

public class Collections10 {
    public static void main(String[] args) {
        //Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
        //LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
        //**hint:  Collections.swap();**
        //Beklene Çıktı:
        //Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
        //Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
        String[] str = {"mavi", "kirmizi", "beyaz", "siyah", "yesil", "turuncu"};
        LinkedList<String> link = new LinkedList<>();
        for (String w : str) {
            link.add(w);
        }

        System.out.println("Original LinkedList : " + link);
        Collections.swap(link, 0, 3);// swap yaptik
        System.out.println("Last LinkedList : " + link);


    }
}
