package monster;

public class Troll extends BaseMonster{
    public Troll(){
        this.HP = 2000;
        this.attack = 10;
    }
    @Override
    public void basicAttack() {
        System.out.println("Troll swings its mallet and deals " + attack + " damage!");
        enemy.setHP(enemy.getHP() - attack);
    }

    @Override
    public void skillAttack() {
        System.out.println("Troll charges against its enemy and deals " + attack * 5 + " damage!");
        enemy.setHP(enemy.getHP() - attack);
    }
}
