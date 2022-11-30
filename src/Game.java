import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player firstPlayer;
    private Player secondPlayer;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public int punch(Player player) {
        int punchPower = 0;
        while (!(punchPower > 0 && punchPower < 10)) {
            System.out.println(player.getName() + " enter number 1-9 :");
            punchPower = scanner.nextInt();
        }
        return punchPower;

    }

    public void fight() {
        int hp = 0;
        int hp2 = 0;
        while (firstPlayer.getHp() > 0 && secondPlayer.getHp() > 0) {
            hp2 = secondPlayer.getHp() - punch(firstPlayer);
            secondPlayer.setHp(hp2);
            System.out.println(hp2);
            if (secondPlayer.getHp() <= 0 || firstPlayer.getHp() <= 0) {
                break;
            }
            hp = firstPlayer.getHp() - punch(secondPlayer);
            firstPlayer.setHp(hp);
            System.out.println(hp);
            if (secondPlayer.getHp() <= 0 || firstPlayer.getHp() <= 0) {
                break;
            }
        }
        if (firstPlayer.getHp() <= 0 && secondPlayer.getHp() > 0) {
            System.out.println(secondPlayer.getName() + "you win");
        }
        if (secondPlayer.getHp() <= 0 && firstPlayer.getHp() > 0) {
            System.out.println(firstPlayer.getName() + " you win");
        }
//        for (int i = 1; i < punch(firstPlayer); i++) {
//            if(){
//
//            }
//        }
//        for (int j = 1; j < punch(secondPlayer); j++) {
//        }
    }
}
