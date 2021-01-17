import java.util.Scanner;

public class CharacterSelection {
    private String key;
    private String playerName;

    public void name() {
        if(select() != null) {
            Scanner input = new Scanner(System.in);
            System.out.print("name the Character : ");
            playerName = input.nextLine();
            Character character = new Character(playerName);
            character.createCharacter(playerName);
            System.out.print("Hi " + playerName + "!");
            character.printStat();
        }
    }
    public String select() {
        Scanner input = new Scanner(System.in);
        System.out.print("press any key : ");
        key = input.nextLine();
        return key;
    }

    //select() == key
}
