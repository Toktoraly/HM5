package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss(100,50);
	Weapon weapon = new Weapon("Gun", "Ak-47" );
	boss.setWeapon(weapon);
        System.out.println("Оружие босса: "  + boss.getWeapon());
        System.out.println("Здоровье босса: "  + boss.getHealth());
        System.out.println("Урон босса: "  + boss.getDamage());
	}

}
