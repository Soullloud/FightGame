import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first player name: ");
        String nameFirstPlayer = scanner.nextLine();
        Player firstPlayer = new Player();
        firstPlayer.setName(nameFirstPlayer);
        firstPlayer.setHp(100);
        System.out.println("Name: " + firstPlayer.getName() + " " + "HP: " + firstPlayer.getHp());

        System.out.println("Enter second player name: ");
        String nameSecondPlayer = scanner.nextLine();
        Player secondPlayer = new Player();
        secondPlayer.setName(nameSecondPlayer);
        secondPlayer.setHp(100);
        System.out.println("Name: " + secondPlayer.getName() + " " + "HP: " + secondPlayer.getHp());


        Game gameOfFight = new Game(firstPlayer, secondPlayer);
        gameOfFight.fight();
    }
}
