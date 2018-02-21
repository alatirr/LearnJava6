import java.util.*;

public class TreatmentStrig {
    public ArrayList<String>  StringToWord(String st){
        String[] stv =  st.trim().split("[,;:.!?\\s]+");
        System.out.println("Ishodnii massive");
        for(String s : stv)
            System.out.print(s + " ");
        ArrayList<String> ar = new ArrayList();
        for(String s : stv){
            ar.add(s);
        }
        return ar;
    }

    public ArrayList<String> sortABC(ArrayList<String> ar){
        Collections.sort(ar);
        System.out.println();
        System.out.println("Sorted massive");
        for(String s : ar)
            System.out.print(s + " ");
        return ar;
    }

    public void findMaxWordAndCount(ArrayList<String> ar){
        System.out.println();
        String st = "";

        Map<String, Integer> map = new HashMap() ;

        for(String s : ar) {
            if(map.containsKey(s)){
                Integer k = map.get(s);
                map.put(s, k + 1);
            }else
                map.put(s, 1);
        }
        System.out.println("Number of each kind of words: ");
        System.out.println();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " qyantity: " + entry.getValue() + " ");
        }
        int i = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > i){
                i = entry.getValue();
            }
        }
        System.out.println("");
        System.out.println("Word with the maximum number of repetitions: ");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == i){
                System.out.println("word: " + entry.getKey() + " maximum: " + entry.getValue());
            }
        }
    }
}
