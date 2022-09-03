import java.util.PriorityQueue;

public class Collections18 {
    public static void main(String[] args) {
        //Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
        //priority queue elemanları: sari,yesil,mavi,kirmizi
        //Beklenen Çıktı:
        //Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
        String[] str = {"sari","yesil","mavi","kirmizi"};
        PriorityQueue<String> pq=new PriorityQueue<>();
       for (String w: str){pq.add(w);}
        System.out.println(pq);// national order

    }
}
