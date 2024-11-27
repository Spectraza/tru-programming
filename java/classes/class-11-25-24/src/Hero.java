public class Hero {
    private String name;
    private String spellQ;
    private String spellW;
    private String spellE;
    private String spellR;
    private int level;

    public Hero(String name, String spellQ, String spellW, String spellE, String spellR, int level) {
        this.name = name;
        this.spellQ = spellQ;
        this.spellW = spellW;
        this.spellE = spellE;
        this.spellR = spellR;
        this.level = level;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Name of Q spell: " + this.spellQ);
        System.out.println("Name of W spell: " + this.spellW);
        System.out.println("Name of E spell: " + this.spellE);
        System.out.println("Name of R spell: " + this.spellR);
        System.out.println("Level: " + this.level);
    }
}

