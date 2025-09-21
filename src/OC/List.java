package OC;

import java.util.HashMap;
import java.util.Map;

public class List{
    

    public static void main(String[] args){

        

        Map<String,String> country = new HashMap<>();

        country.put("France","Paris");
        country.put("Algerie","Alger");
        country.put("USA","Washington");

        for(Map.Entry<String,String> couple : country.entrySet()){

            System.out.println(couple.getKey() +" -> "+ couple.getValue());
            
        }

    }



}
