import character.Archer;
import character.BaseCharacter;
import character.Mage;
import character.Warrior;
import lombok.SneakyThrows;
import monster.BaseMonster;
import monster.Monk;
import monster.Troll;
import monster.WraithArcher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCharacter character;
        BaseMonster monster;
        System.out.println("Choose your class:");
        System.out.println("1- Archer");
        System.out.println("2- Mage");
        System.out.println("3- Warrior");
        Scanner scan= new Scanner(System.in);
        int option= scan.nextInt();
        System.out.println("Enter your name:");
        Scanner scan2= new Scanner(System.in);
        String characterName= scan2.nextLine();

        switch (option){
            case 1 : character = new Archer(characterName);
                    break;
            case 2 : character = new Mage(characterName);
                    break;
            case 3 : character = new Warrior(characterName);
                    break;
            default: throw new Exception("invalid option");
        }

        System.out.println("Choose your enemy:");
        System.out.println("1- Troll");
        System.out.println("2- Wraith Archer");
        System.out.println("3- Monk");

        option= scan.nextInt();
        switch (option){
            case 1 : monster = new Troll();
                break;
            case 2 : monster = new WraithArcher();
                break;
            case 3 : monster = new Monk();
                break;
            default: throw new Exception("invalid option");
        }
        System.out.println("Fight starting..");
        character.setEnemy(monster);
        monster.setEnemy(character);
        //fight
        new Thread("character"){
            @SneakyThrows
            public void run(){
                character.fight();
            }
        }.start();
        new Thread("monster"){
            @SneakyThrows
            public void run(){
                monster.combatMode();
            }
        }.start();
    }

}
