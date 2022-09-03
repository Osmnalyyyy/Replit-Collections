import java.util.Arrays;

public class Collections1 {
    public static void main(String[] args) {
        //Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
        //Array elemanları:  siyah,sari,mavi,turuncu
        //Beklenen Çıktı:
        //siyah
        //sari
        //mavi
        //turuncu
        String[] colours={"siyah","sari","mavi","turuncu"};
        for (String w:colours){
            System.out.println(w);
        }
        // 2. yol functional programming
        Arrays.stream(colours).forEach(System.out::println);
    }
}
