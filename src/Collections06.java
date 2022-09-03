import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections06 {
    public static void main(String[] args) {
        // Bir LinkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
        //LinkedList elemanları: sari,mavi,mor,yesil,beyaz
        //Beklenen Çıktı:
        //sari
        //mavi
        //mor
        //yesil
        //beyaz
        String[] arr={"sari","mavi","mor","yesil","beyaz"};
        LinkedList<String> lk=new LinkedList<>();
        for (String w:arr){lk.add(w);}
        for (String w:lk){
            System.out.println(w);
        }
        // 2. yol functional programming
        lk.stream().forEach(System.out::println);
    }
}
