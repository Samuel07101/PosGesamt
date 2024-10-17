import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Weapons {
        private String name;
        private int damage;
        private int speed;
        private int strength;
        private int value;
        private DamageType damageType;
        private WeaponType weaponType;

    public Weapons(String name, int damage, int speed, int strength, int value, DamageType damageType, WeaponType weaponType) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
        this.damageType = damageType;
        this.weaponType = weaponType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapons weapons = (Weapons) o;
        return damage == weapons.damage && Objects.equals(name, weapons.name) && damageType == weapons.damageType && weaponType == weapons.weaponType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, damage, damageType, weaponType);
    }

    public int[] sumSquare(){
        List<Integer> list = new ArrayList<>();
        int[] sum =  list.stream().map(x -> {
            x *= x;
            return x;
        }).mapToInt((x) -> {
            return x.intValue();
        }).toArray();

        return sum;
    }

    public void words(){
        
    }
}
