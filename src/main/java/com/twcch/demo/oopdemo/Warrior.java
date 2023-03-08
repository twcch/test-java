package com.twcch.demo.oopdemo;

public class Warrior extends Player {

    private float comboRate;

    public Warrior(String name, int healthPoint, int magicPoint, int attackPoint, int defensePoint, float comboRate) {
        super(name, healthPoint, magicPoint, attackPoint, defensePoint);
        this.comboRate = comboRate;
    }

    @Override
    public void attack(Player other) {

        super.attack(other);

        double r = Math.random();
        if (r <= comboRate) {
            int harm = attackPoint - other.defensePoint;
            other.healthPoint -= harm;
            System.out.println(name + "造成" + other.name + "傷害: " + harm);
        }

    }

    public float getComboRate() {
        return comboRate;
    }

    public void setComboRate(float comboRate) {
        this.comboRate = comboRate;
    }

}
