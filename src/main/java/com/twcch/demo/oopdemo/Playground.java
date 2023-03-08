package com.twcch.demo.oopdemo;

public class Playground {

    public static void main(String[] args) {

        // play A
        Player playerA = new Warrior("玩家A", 100, 200, 80, 30, 0.5F);

        // play B
        Player playerB = new Player("玩家B", 100, 200, 80, 30);

        int roundNumber = 1;

        while (playerA.isAlive() && playerB.isAlive()) {

            System.out.println("========== 第" + roundNumber + "回合 ==========");

            if (roundNumber % 2 == 1) {
                /*
                 * 奇數回合: A攻擊
                 */
                playerA.attack(playerB);
            } else {
                /*
                 * 偶數回合: B攻擊
                 */
                playerB.attack(playerA);
            }

            System.out.println(playerA.getStatus(playerA));
            System.out.println(playerB.getStatus(playerB));

            roundNumber++;

        }

        System.out.println("========== 遊戲結束 ==========");

        if (playerA.isAlive()) {
            System.out.println(playerA.getName() + "獲勝!");
        } else {
            System.out.println(playerB.getName() + "獲勝!");
        }

    }

}
