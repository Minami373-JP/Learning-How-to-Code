import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] uma1 = {
                "Kitasan Black",
                "Narita Taishin",
                "Super Creek"
        };

        String[] uma2 = {
                "Silence Suzuka",
                "Air Groove",
                "Agnes Digital",
                "Oguri Cap",
        };

        String[] uma3 = {
                "Haru Urara",
                "Sakura Bakushin O.",
                "Nishino Flower"
        };

        System.out.println("\n1 for Medium, Long. 2 for  Mile, Medium. 3 for Sprint, Mile" + "\n");

        int umaMusume;

        do {
            System.out.print("Choose you category: ");
            umaMusume = scanner.nextInt();

            switch (umaMusume) {
                case 1:
                    System.out.println("\nYour Uma is: " + uma1[random.nextInt(uma1.length)] + "\n");
                    int distance;

                    do {
                        System.out.print("What distance do you want to put your Uma (1.Medium, 2.Long)? ");
                        distance = scanner.nextInt();

                        switch (distance) {
                            case 1:
                                System.out.println("\nYour Uma Musume is going on a: Medium run");
                                break;

                            case 2:
                                System.out.println("\nYour Uma Musume is going on a: Long run");
                                break;

                            default:
                                System.out.println("\nInvalid choice! Please choose 1 or 2.\n");
                        };
                    } while (distance < 1 || distance >2);
                    break;

                case 2:
                    System.out.println("\nYour Uma is: " + uma2[random.nextInt(uma2.length)] + "\n");
                    int distance1;

                    do {
                        System.out.print("What distance do you want to put your Uma (1.Mile, 2.Medium)? ");
                        distance1 = scanner.nextInt();

                        switch (distance1) {
                            case 1:
                                System.out.println("\nYour Uma Musume is going on a: Mile run");
                                break;

                            case 2:
                                System.out.println("\nYour Uma Musume is going on a: Medium run");
                                break;

                            default:
                                System.out.println("\nInvalid choice! Please choose 1 or 2.\n");
                        };
                    } while (distance1 < 1 || distance1 >2);
                    break;

                case 3:
                    System.out.println("\nYour Uma is: " + uma3[random.nextInt(uma3.length)] + "\n");
                    int distance2;

                    do {
                        System.out.print("What distance do you want to put your Uma (1.Sprint, 2.Mile)? ");
                        distance2 = scanner.nextInt();

                        switch (distance2) {
                            case 1:
                                System.out.println("\nYour Uma Musume is going on a: Sprint run");
                                break;

                            case 2:
                                System.out.println("\nYour Uma Musume is going on a: Mile run");
                                break;

                            default:
                                System.out.println("\nInvalid choice! Please choose 1 or 2.\n");
                        };
                    } while (distance2 < 1 || distance2 >2);
                    break;

                default:
                    System.out.println("Invalid category! Please choose 1, 2, or 3.\n");
            };
        } while (umaMusume < 1 || umaMusume > 3);


        String[] track = {
            "Turf",
            "Dirt"
        };

        double speed = (int) Math.floor(Math.random() * 1501);
        double stamina = (int) Math.floor(Math.random() * 1501);
        double power = (int) Math.floor(Math.random() * 1501);
        double guts = (int) Math.floor(Math.random() * 1501);
        double wit = (int) Math.floor(Math.random() * 1501);

        System.out.println("Your track is: " + track[random.nextInt(track.length)] + "\n");

        System.out.println("Your stats for Speed is: " + speed);
        System.out.println("Your stats for Stamina is: " + stamina);
        System.out.println("Your stats for Power is: " + power);
        System.out.println("Your stats for Guts is: " + guts);
        System.out.println("Your stats for Wit is: " + wit + "\n");

        int rating = (int) (speed + stamina + power + guts + wit) / 5;
        if (rating >= 1050) {
            System.out.println("S");
        } else if (rating >= 850) {
            System.out.println("A+");
        } else if (rating >= 650) {
            System.out.println("A");
        } else {
            System.out.println("B+");
        }

        scanner.close();
    }
}