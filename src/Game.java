import java.util.Queue;
import java.util.Scanner;

import characters.Character;

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

        player.setAction(true);
        player.setBonusAction(true);

        Scanner stdin = new Scanner(System.in);

        if (player.isAction()) {
            String decision = stdin.nextLine();

            if (!handlePlayerAction(decision)) {
                System.exit(1);
            }
            
        } else {
            System.out.println(player.getName() + " has no action available.");
        }
        checkGameOver();

        stdin.close();
    }

    private void enemyTurn() {
        System.out.println(enemy.getName() + "'s turn:");

        enemy.setAction(true);
        enemy.setBonusAction(false);

        if (enemy.isAction()) {
            enemy.attack(player);
        } else {
            System.out.println(enemy.getName() + " has no action available.");
        }
        checkGameOver();
    }

    private boolean handlePlayerAction(String decision) {
        switch(decision) {
            case "ATTACK": 
                player.attack(enemy);
                break;
            case "DEFEND":
                System.out.println("Currently no defend action available");
                break;
            case "CAST":
                System.out.println("Currently no casting action available");
                break;
            default:
                System.out.println("ERROR - invalid decision please try again or quit");
                return false;
        }

        return true;
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

/*
 * 
 * hello i love you
 */

    public Character getPlayer() {
        return player;
    }

    public Character getEnemy() {
        return enemy;
    }

    public void prompt() {
        System.out.println("What would you like to do " + player.getName() + "?");
        System.out.println("ATTACK - attack the enemy");
        System.out.println("DEFEND - attempt to block an incoming physical attack");
        System.out.println("CAST - Cast a spell from player spell list");
        System.out.println("");
    }

}
