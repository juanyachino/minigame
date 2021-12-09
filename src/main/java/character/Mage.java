package character;

public class Mage extends BaseCharacter {
    private int mana;
    public Mage(String characterName){
        name = characterName;
        HP = 100;
        weapon = "Wand";
        mana = 50;
        minAttack = 100;
        maxAttack = 200;
    }
    @Override
    public void attack() {
        System.out.println(name +" wields their " + weapon + " and attacks the monster using spells!");
        mana--;
        calculateDamage();
    }
    @Override
    public void dodge() {
        System.out.println(name + " uses their magic powers to create a defensive barrier!");
        mana--;
    }
    @Override
    public void usePotion() {
        HP += 10;
        useManaPotion();
        System.out.println(name + " Consumes a potion to recover some HP and Mana!");
    }
    private void useManaPotion(){
        mana += 20;
    }

}
