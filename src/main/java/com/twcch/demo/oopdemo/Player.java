package com.twcch.demo.oopdemo;

public class Player {

    protected static final int MAGIC_CONSUMPTION = 10;

    protected String name;
    protected int healthPoint;
    protected int magicPoint;
    protected int attackPoint;
    protected int defensePoint;

    public Player(String name, int healthPoint, int magicPoint, int attackPoint, int defensePoint) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
        this.attackPoint = attackPoint;
        this.defensePoint = defensePoint;
    }

    public String getStatus(Player player) {

        return player.name + "狀態: HP=" + player.healthPoint + " MP=" + player.magicPoint;

    }

    public boolean isAlive() {

        return healthPoint > 0;

    }

    protected boolean canAttack() {

        return magicPoint >= Player.MAGIC_CONSUMPTION;

    }

    public void attack(Player other) {

        if (!canAttack()) {
            System.out.println(name + "法力耗盡，無法攻擊");
            return;
        }

        magicPoint -= Player.MAGIC_CONSUMPTION;

        int harm = attackPoint - other.defensePoint;
        other.healthPoint -= harm;

        System.out.println(name + "造成" + other.name + "傷害: " + harm);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }

}
