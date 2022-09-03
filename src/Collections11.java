import java.util.HashSet;
import java.util.TreeSet;

public class Collections11 {
    public static void main(String[] args) {
        //HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
        //HashSet List: sari,mavi,kirmizi,yesil,mor
        //Beklenen Çıktı:
        //TreeSet elements:
        //kirmizi
        //mavi
        //mor
        //sari
        //yesil
        String[] str={"sari","mavi","kirmizi","yesil","mor"};
        HashSet<String> hash=new HashSet<>();
        for (String w:str){hash.add(w);}
        TreeSet<String> tree=new TreeSet<>();
        for (String w:hash){tree.add(w);}
        System.out.println("TreeSet Elements : ");
        for (String w:tree){
            System.out.println(w);
        }


    }
}
