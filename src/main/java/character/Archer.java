package character;

public class Archer extends BaseCharacter {
    private int arrowCount ;
    public Archer(String characterName){
        name = characterName;
        HP = 150;
        weapon = "Bow";
        arrowCount = 1;
        minAttack = 60;
        maxAttack = 300;
    }
    @Override
    public void attack() {
        System.out.println(name +" wields their " + weapon + " and attacks the monster using arrows!");
        arrowCount--;
        calculateDamage();
    }
    @Override
    public void reload(){
        System.out.println(name + " is reloading!");
        arrowCount += 1;
    }
    @Override
    public void dodge() {
        System.out.println(name + " uses their agility to dodge enemy's attacks!");
    }

}
