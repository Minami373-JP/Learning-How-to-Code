import java.util.Random;
import java.util.Scanner;
import java.util.SequencedSet;

public class Rpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String bold = "\033[1m";
        String reset = "\033[0m";

        String blank;

        System.out.println(bold + "\nWelcome to my RPG game!" + reset);
        System.out.print("(Press " + bold + "Enter " + reset + "to Start)\n");
        blank = scanner.nextLine();
        System.out.print("You're going to get a random " + bold + "Race, Class and Power, Spawn, and Items." + reset + "\n");
        blank = scanner.nextLine();

// __GENDER__
        System.out.print(bold + "Press enter to get a random Gender." + reset);
        blank = scanner.nextLine();

        int gender = random.nextInt(2);

        if (gender == 0) {
            System.out.println("Your gender is " + bold + "Female" + reset);
        } else {
            System.out.println("Your gender is " + bold + "Male" + reset);
        };

// __RACE__
        System.out.print(bold + "\nPress enter to get a random Race." + reset);
        blank = scanner.nextLine();

        String[] randomRace = {
                "Human",
                "Elf",
                "Angel",
                "Dark Elf",
                "Half-Beast",
                "Demon",
                "Dwarf",
                "Orc",
                "Vampire"
        };

        String race = randomRace[random.nextInt(randomRace.length)];
        System.out.println("Your race now is: " + bold + race + reset);

        if (race.equals("Dark Elf")) {
            System.out.println(bold + "You're black as fuck" + reset);
        } else if (race.equals("Demon")) {
            int demonRole = random.nextInt(4);

            switch (demonRole){
                case 0:
                    System.out.println("You're " + bold + "Demon Queen / King" + reset);
                    break;
                case 1:
                    System.out.println("You're " + bold + "Demon General" + reset);
                    break;
                case 2:
                    System.out.println("You're " + bold + "Demon Commander" + reset);
                    break;
                default:
                    System.out.println("You're " + bold + "Normal Demon" + reset);
            };
        } else if (race.equals("Half-Beast")) {
            int beastType = random.nextInt(4);

            switch (beastType) {
                case 0:
                    System.out.println("You're " + bold + "Half-Cat" + reset);
                    break;
                case 1:
                    System.out.println("You're " + bold + "Half-Rabbit" + reset);
                    break;
                case 2:
                    System.out.println("You're " + bold + "Half-Dragon" + reset);
                    break;
                default:
                    System.out.println("You're " + bold + "Half-Fox" + reset);
            };
        };

// __CLASS__
        System.out.print(bold + "\nPress Enter to get a random Class and Power." + reset);
        blank = scanner.nextLine();

        String[] randomClass = {
                "Mage",
                "Swordsman",
                "Magician Swordsman",
                "Tanker",
                "Support",
                "Martial Artist",
                "Archer",
        };

        String classes = randomClass[random.nextInt(randomClass.length)];
        System.out.println("Your class is: " + bold + classes + reset);

        if (classes.equals("Mage")) {
            int mageType = random.nextInt(3);

            switch (mageType) {
                case 0:
                    System.out.println("You're " + bold + "Sorcerer" + reset);
                    break;
                case 1:
                    System.out.println("You're " + bold + "Wizard" + reset);
                    break;
                default:
                    System.out.println("You're " + bold + "Witch" + reset);
            };
        } else if (classes.equals("Swordsman")) {
            int swordType = random.nextInt(3);

            switch (swordType) {
                case 0:
                    System.out.println("You're " + bold + "Heavy Sword " + reset + "type");
                    break;
                case 1:
                    System.out.println("You're " + bold + "Samurai " + reset + "type");
                    break;
                default:
                    System.out.println("You're " + bold + "Double Swords " + reset + "type");
            };
        } else if (classes.equals("Support")) {
            int supportType = random.nextInt(4);

            switch (supportType) {
                case 0:
                    System.out.println("You're " + bold + "Healer" + reset);
                    break;
                case 1:
                    System.out.println("You're " + bold + "Buffer" + reset);
                    break;
                case 2:
                    System.out.println("You're " + bold + "Debuffer" + reset);
                    break;
                default:
                    System.out.println("You're " + bold + "Hybrid " + reset + "support");
            };
        };

// __SPAWN__
        System.out.print(bold + "\nPress Enter to set your spawn" + reset);
        blank = scanner.nextLine();

        String[] randomSpawn = {
                "Kingdom / Queendom",
                "Forest",
                "Cave",
                "Dungeon",
                "Mountain",
                "Village",
                "Ruins",
                "Abandon Place"
        };

        String spawn = randomSpawn[random.nextInt(randomSpawn.length)];
        System.out.println("You're spawned in the " + bold + spawn + reset);

        scanner.close();
    }
}