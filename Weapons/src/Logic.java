import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Logic {

    public void readCSV() throws IOException {
        List<Weapons> list = new ArrayList<>();
        List<Weapons> damageList = new ArrayList<>();
        List<Weapons> typelist = new ArrayList<>();

        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapons(
                        s[0],
                        Integer.parseInt(s[5]),
                        Integer.parseInt(s[6]),
                        Integer.parseInt(s[3]),
                        Integer.parseInt(s[4]),
                        DamageType.valueOf(s[1]),
                        WeaponType.valueOf(s[2])
                ))
                .collect(Collectors.toList());

        damageList = list;
        damageList.sort((w1,w2) -> {
           return Integer.compare(w1.getDamage(),w2.getDamage());
        });
        typelist = list;
        typelist.sort((w1,w2) ->  {

            if(
        });




    }
}
