package monster;

import character.BaseCharacter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseMonster {
    protected volatile int HP;
    protected int attack;
    protected BaseCharacter enemy;

    public final void combatMode() throws InterruptedException {
        while (HP > 0 && enemy.getHP() > 0){
            basicAttack();
            Thread.sleep(2000);
            skillAttack();
        }
    }
    public abstract void basicAttack();
    public abstract void skillAttack();

}
