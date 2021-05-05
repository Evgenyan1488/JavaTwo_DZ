import java.util.*;

public class L3_Main {

    public static void main(String[] args) {

        String[] words = new String[]{"Kartoshka", "Zmeya", "Idiot", "Okno", "Stena"};
        List<String> MyList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 15; i++)
        {
            MyList.add(words[random.nextInt(words.length)]);
        }

        System.out.println(MyList);

        Map<String, Integer> tabl = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < MyList.size(); i++)
        {
            if (!set.add(MyList.get(i)))
            {
                tabl.put(MyList.get(i), tabl.get(MyList.get(i))+1);
            }
            else
            {
                tabl.put(MyList.get(i), 1);
            }
        }

        System.out.println("Без повторений: ");
        System.out.println(set);

        System.out.println("Количество каждых элементов ");
        System.out.println(tabl);


        System.out.println("--------------------------- Задание 2 --------------------------");


        Info sp = new Info();

        sp.add("Shvedov", "206123");
        sp.add("Shvedov", "282228");
        sp.add("Novikov", "123456");

        sp.get("Shvedov");
        sp.get("Novikov");
    }


}
