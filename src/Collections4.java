import java.util.ArrayList;
import java.util.List;

public class Collections4 {
    public static void main(String[] args) {
        //Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
        //Array Elemanları: sari,yesil,mavi,pembe
        //**mavi rengini turuncu ile değiştirelim.**
        //Beklene Çıktı:
        //[sari,yesil,mavi,pembe]
        //[sari,yesil,turuncu,pembe]
        String[] arr={"sari","yesil","mavi","pembe"};
        List<String> list=new ArrayList<>();
        for (String w:arr){list.add(w);}
        list.set(list.indexOf("mavi"),"turuncu");
        System.out.println(list);


    }
}
