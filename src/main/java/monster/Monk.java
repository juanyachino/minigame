package monster;

public class Monk extends BaseMonster{
    public Monk(){
        this.HP = 400;
        this.attack = 40;
    }
    @Override
    public void basicAttack() {
        System.out.println("Monk swings its wand and deals " + attack / 2 + " damage!");
        enemy.setHP(enemy.getHP() - attack);
    }

    @Override
    public void skillAttack() {
        System.out.println("Monk casts a powerful spell and deals " + attack * 8 + " damage!");
        enemy.setHP(enemy.getHP() - attack);
    }
}
