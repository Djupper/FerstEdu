package etg.prog.hw16;

import java.util.ArrayList;

/**
 * Created by AsusD on 17.07.2016.
 */
public class Main {
    SteamEdu p1 = new SteamEdu("Ivan", 17);
    SteamEdu p2 = new SteamEdu("Semen", 15);
    SteamEdu p3 = new SteamEdu("John", 18);
    SteamEdu p4 = new SteamEdu("Senia", 20);
    SteamEdu p5 = new SteamEdu("Mik", 10);

    ArrayList<SteamEdu> list = new ArrayList<SteamEdu>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);

    list.stream().map(p -> p.getName()).distinct().forEach(System.out::println);

}
