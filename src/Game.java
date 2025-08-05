package src;

import java.util.Queue;

public class Game {
    private Character player;
    private Character enemy;
    private Queue<Character> turnOrder;
    private boolean gameOver;
    private int round;

    public Game(Character player, Character enemy) {
        if (player == null || enemy == null) {
            throw new IllegalArgumentException("Player and enemy cannot be null");
        }
        this.player = player;
        this.enemy = enemy;
        this.gameOver = false;
        this.round = 1;
    }

    public void start() {
        System.out.println("Game started between " + player.getName() + " and " + enemy.getName());
        while (!gameOver) {
            System.out.println("Round " + round);
            playerTurn();
            if (gameOver) break;
            enemyTurn();
            round++;
        }
        System.out.println("Game Over!");
    }

    private void playerTurn() {
        System.out.println(player.getName() + "'s turn:");
        if (player.isAction()) {
            player.attack(enemy);
        } else {
            System.out.println(player.getName() + " has no action available.");
        }
        checkGameOver();
    }

    private void enemyTurn() {
        System.out.println(enemy.getName() + "'s turn:");
        if (enemy.isAction()) {
            enemy.attack(player);
        } else {
            System.out.println(enemy.getName() + " has no action available.");
        }
        checkGameOver();
    }

    private void checkGameOver() {
        if (!player.isAlive() || !enemy.isAlive()) {
            gameOver = true;
            if (!player.isAlive()) {
                System.out.println(player.getName() + " has been defeated.");
            }
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " has been defeated.");
            }
        }
    }

    public Character getPlayer() {
        return player;
    }

    public Character getEnemy() {
        return enemy;
    }



}
