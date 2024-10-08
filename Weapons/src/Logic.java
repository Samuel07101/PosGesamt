import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class Logic {
    Printable printable;
    private String[] arr = new String[10];
    Random random;
    private int[] bigInt = new int[10000];

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

        });

    }

    public void fillArr(){
       random = new Random();
       for (int i = 0; i <bigInt.length;i++){
           bigInt[i] = random.nextInt(100);
       }
    }

    public double average(int[] numbers){
    return  Arrays.stream(numbers).average().getAsDouble();
    }

    public void RandGeneratedStr(int l)
        {
            for (int i = 0; i <= 10;i++) {
                // a list of characters to choose from in form of a string
                String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
                // creating a StringBuffer size of AlphaNumericStr
                StringBuilder s = new StringBuilder(l);
                int j;
                for (j = 0; j < l; j++) {
                    //generating a random number using math.random()
                    int ch = (int) (AlphaNumericStr.length() * Math.random());
                    //adding Random character one by one at the end of s
                    s.append(AlphaNumericStr.charAt(ch));
                }
                arr[i] = s.toString();
            }
        }

    public void print(){
        printable = list -> {
            for(int i = 0;i <= list.size();i++){
                System.out.println(list.get(i));
            }
        };
    }
}
