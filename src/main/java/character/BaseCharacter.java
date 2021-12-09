package character;

import lombok.Getter;
import lombok.Setter;
import monster.BaseMonster;

@Getter
@Setter
public abstract class BaseCharacter {
    protected String name;
    protected volatile int HP;
    protected int minAttack;
    protected int maxAttack;
    protected String weapon;
    protected int gold = 0;
    protected BaseMonster enemy;

    public final void fight() throws InterruptedException {
        findMonster();
        while (HP > 0 && enemy.getHP() > 0){
            attack();
            Thread.sleep(2000);
            reload();
            dodge();
            usePotion();
        }
        if (HP > 0) {
            pickUpGold();
        } else  {
            System.out.println("You're dead! :(");
        }
    }

    public void findMonster(){
        System.out.println("Finding monsters..");
        System.out.println(enemy.getClass().getName() + " found!");
    }

    public abstract void attack();

    public void reload(){

    }
    public abstract void dodge();

    public void usePotion(){
        HP += 20;
        System.out.println(name + " consumes a potion to recover some hp!");
    }

    public  void pickUpGold(){
        gold = (int) (Math.random() * 1000) + 500;
        System.out.println(name + " won!!");
        System.out.println(name + " picked up "+ gold + " gold!");
    }

    public void calculateDamage(){
        int damage = (int) (Math.random() * maxAttack) + minAttack;
        System.out.println(name + "deals "+ damage + " damage!");
        enemy.setHP(enemy.getHP() - damage);
    }
}
