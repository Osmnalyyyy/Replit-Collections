import java.util.ArrayList;
import java.util.List;

public class Collections05 {
    public static void main(String[] args) {
        //Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
        //ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
        //Beklenen Çıktı:
        //Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        //siyah
        //mavi`
        //kirmizi
        //yesil``
        //mor
        //turuncu

        String[] arr={"siyah","mavi", "kirmizi","yesil","mor","turuncu"};
        List<String> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(i+". index elemani : "+list.get(i));
        }

    }
}
