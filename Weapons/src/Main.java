import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        java.util.List<Weapons> list;
        list = new ArrayList<>();
        list.sort(new Comparator<Weapons>() {
            @Override
            public int compare(Weapons o1, Weapons o2) {
                return Integer.compare(o1.getDamage(), o2.getDamage());
            }
        });

        list.stream().sorted( );

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
            list = Files.lines(new File("weapons.csv"0))



    }

}

