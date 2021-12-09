package character;

public class Warrior extends BaseCharacter {
    public Warrior(String characterName){
        name = characterName;
        HP = 400;
        weapon = "Dual axes";
        minAttack = 50;
        maxAttack = 70;

    }
    @Override
    public void attack() {
        System.out.println(name + " wields their "+ weapon +" and hits the monster!");
        calculateDamage();
    }
    @Override
    public void dodge() {
        System.out.println(name + " uses their axes to parry the enemy's attacks!");
    }
}
