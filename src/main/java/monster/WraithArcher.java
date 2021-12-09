package monster;

public class WraithArcher extends BaseMonster {
    public WraithArcher(){
        this.HP = 700;
        this.attack = 20;
    }
    @Override
    public void basicAttack() {
        System.out.println("Wraith Archer shoots an arrow and deals  " + attack + " damage!");
        enemy.setHP(enemy.getHP() - attack);
    }

    @Override
    public void skillAttack() {
        System.out.println("Wraith Archer shoots a barrage of arrows that deal " + attack * 10 + " damage!");
        enemy.setHP(enemy.getHP() - attack);
    }
}
