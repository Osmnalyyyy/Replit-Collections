import java.util.TreeSet;

public class Collections13 {
    public static void main(String[] args) {
        //Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
        //TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
        //Beklenen Çıktı:
        //beyaz
        //kirmizi
        //mavi
        //sari
        //siyah
        //yesil
        String[] str = {"yesil", "mavi", "kirmizi", "sari", "beyaz", "siyah"};
        TreeSet<String> tree=new TreeSet<>();
        for (String w:str){tree.add(w);}
        for (String w:tree){
            System.out.println(w);
        }

    }
}
