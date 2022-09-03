import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collections8 {
    public static void main(String[] args) {
        //Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
        //LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
        //Beklenen Çıktı:
        //Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        //Listenin ilk elemani: sari
        //listenin son elemani: beyaz
        String[] arr={"sari","mavi","turuncu","siyah","yesil","beyaz"};
        LinkedList<String> link=new LinkedList<>();
        for (String w:arr){link.add(w);}
        ListIterator it= link.listIterator();
        System.out.println("listenin ilk elemani :"+it.next());
        while (it.hasNext()){
            it.next();
        }
        System.out.println("listenin son elemani :"+it.previous());
    }
}
