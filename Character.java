public class Character {
    private String playerName;
    private int hp;
    private int damage;
    private String weapon;

    public Character(String playerName) {
        this.playerName = playerName;
        this.hp = 200;
        this.damage = 10;
        this.weapon = "fist";

    }


    @Override
    public String toString() {
        return "Character\n" +
                "playerName='" + playerName + '\'' +
                ",\nhp=" + hp +
                ",\ndamage=" + damage +
                ",\nweapon='" + weapon + '\''
                ;
    }

    public void printStat()
    {
        System.out.print(toString());

    }
    public void createCharacter(String playerName)
    {

    }
}
