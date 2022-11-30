public class Player {
    private String name;
    private int hp;

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Your name is empty");
        } else {
            this.name = name;
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
