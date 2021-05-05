import java.util.HashMap;
import java.util.Map;


public class Info {

    private Map<String, String> spisok = new HashMap<>();


    public void get(String familiya)
    {
        System.out.println("Фамилия " + familiya + ": " + spisok.get(familiya));
    }


    public void add(String familiya, String nomer)
    {
        if(!spisok.containsKey(familiya))
        spisok.put(familiya, nomer);
        else
        {
            spisok.put(familiya, spisok.get(familiya) + ",  " + nomer);
        }
    }
}
