import java.util.ArrayList;
import java.util.List;

public class Collections3 {
    public static void main(String[] args) {
        //Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
        //ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu
        //Beklenen Çıktı:
        //Arrayin 1. elemani: beyaz
        //Arrayin 3. elemani: sari
        String[] arr = {"beyaz", "siyah", "sari", "kirmizi", "turuncu"};
        List<String> list = new ArrayList<>() ;
        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        System.out.println("Arrayin 1. elemani = " + list.get(0));
        System.out.println("Arrayin 3. elemani = " + list.get(2));

    }
}