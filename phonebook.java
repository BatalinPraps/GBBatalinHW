package HW2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class phonebook {
    static HashMap<Integer, String> phone = new HashMap<>();

    public static void setPhone(Integer ph, String name){

        phone.put(ph, name);

    }

}
