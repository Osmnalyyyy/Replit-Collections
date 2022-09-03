import java.util.LinkedList;
import java.util.ListIterator;

public class Collections9 {
    public static void main(String[] args) {
        //Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
        //LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
        //Beklenen Çıktı:
        //Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
        //LinkedList Tersi:
        //mor
        //beyaz
        //kirmizi
        //yesil
        //mavi
        //sari
        String [] str={"sari","mavi","yesil","kirmizi","beyaz","mor"};
        LinkedList<String> list=new LinkedList<>();
        for (String w:str){list.add(w);}
        ListIterator it= list.listIterator();
        while (it.hasNext()){
            it.next();
        }
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
