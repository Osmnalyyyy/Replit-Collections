import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections2 {
    public static void main(String[] args) {
        // Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array
        // elemanlarını ekleyen java kodunu yazınız.
        //Array List:  siyah,mavi,kirmizi,beyaz
        //en başa: **pembe**
        //mavi-kirmizi arasına **yesil**  renk eklenecek.``
        //Beklenen Çıktı:
        //[pembe,siyah,mavi,yesil,kirmizi,beyaz]
        String[] arr = {"siyah", "mavi", "kirmizi", "beyaz"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        list.add(0,"pembe");
        int index=list.indexOf("mavi");
        list.add(index+1,"yesil");
        System.out.println(list);


    }
}
