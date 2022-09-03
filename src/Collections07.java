import java.util.LinkedList;
import java.util.ListIterator;

public class Collections07 {
    public static void main(String[] args) {
        //bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan
        // istenilen pozisyondan başlayarak listeyi yazdıralım.
        //LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
        //1. elemandan itibaren yazdıralım.
        // Beklenen Çıktı:
        //beyaz
        //mavi
        //yesil
        //turuncu
        String[] str={"sari", "beyaz", "mavi", "yesil", "turuncu"};
        LinkedList<String> lk=new LinkedList<>();
        for (String w:str){lk.add(w);}
        ListIterator it= lk.listIterator();
        it.next();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
