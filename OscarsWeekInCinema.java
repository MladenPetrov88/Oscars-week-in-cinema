import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String room = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (movieName.equals("A Star Is Born")) {
            if (room.equals("normal")) {
                price = 7.50;
            } else if (room.equals("luxury")) {
                price = 10.50;
            } else {
                price = 13.50;
            }
        }

        if (movieName.equals("Bohemian Rhapsody")) {
            if (room.equals("normal")) {
                price = 7.35;
            } else if (room.equals("luxury")) {
                price = 9.45;
            } else {
                price = 12.75;
            }
        }

        if (movieName.equals("Green Book")) {
            if (room.equals("normal")) {
                price = 8.15;
            } else if (room.equals("luxury")) {
                price = 10.25;
            } else {
                price = 13.25;
            }
        }

        if (movieName.equals("The Favourite")) {
            if (room.equals("normal")) {
                price = 8.75;
            } else if (room.equals("luxury")) {
                price = 11.55;
            } else {
                price = 13.95;
            }
        }

        double totalprice = tickets * price;
        System.out.printf("%s -> %.2f lv.", movieName, totalprice);
    }
}
