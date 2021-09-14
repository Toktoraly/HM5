package com.company;

public class Weapon {
    private String weaponType;
    private String weaponName;

    public Weapon(String weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "Оружие {" +
                "Тип оружия'" + weaponType + '\'' +
                ", Названия оружия'" + weaponName + '\'' +
                '}';
    }
}
