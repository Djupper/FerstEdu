package etg.prog.hw16;

import java.util.ArrayList;

/**
 * Created by AsusD on 17.07.2016.
 */
public class Main {
    public static void main(String[] args) {

        SteamEdu p1 = new SteamEdu("Ivan", 19);
        SteamEdu p2 = new SteamEdu("Dima", 14);
        SteamEdu p3 = new SteamEdu("Mike", 31);
        SteamEdu p4 = new SteamEdu("Rif", 16);

        ArrayList<SteamEdu> list = new ArrayList<SteamEdu>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        list.stream().map(p -> p.getName()).distinct().forEach(System.out::println);

       /*String a = list.stream().map(p -> p.getName()).distinct().collect(Collectors.joining(", "));

        System.out.println(a);
        */

        //list.stream().filter(n -> n.getAge() < 20 ).mapToInt(n -> n.getAge()).average().ifPresent(System.out::println);

        // list.stream().map(p -> p.getName()).filter(n -> n.getAge() < 20 ).filter(n -> n.getAge() > 45).distinct().forEach(System.out::println);




    }
}
