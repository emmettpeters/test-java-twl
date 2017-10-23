package movies;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args){
        int times = 1;

        do {
            System.out.println("");
            System.out.println("0 - Exit");
            System.out.println("1 - View all");
            System.out.println("2 - Only Dramas");
            System.out.println("3 - Only Animated");
            System.out.println("4 - Only Horror");
            System.out.println("5 - Only Sci-fi");
            System.out.println("What would you like to do?");
            String userInput;
            Scanner response = new Scanner(System.in);
            userInput = response.nextLine();
            String movieType;

            switch (userInput) {
                case "0":
                    System.out.println("Exiting... Goodbye!");
                    times = 0;
                    break;
                case "1":
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.println(movie.getName());
                    }
                    ;
                    break;
                case "2":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory() == "drama") {
                            System.out.println(movie.getName());
                        }
                    }
                    ;
                    break;
                case "3":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory() == "animated") {
                            System.out.println(movie.getName());
                        }
                    }
                    ;
                    break;
                case "4":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory() == "horror") {
                            System.out.println(movie.getName());
                        }
                    }
                    ;
                    break;
                case "5":
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory() == "scifi") {
                            System.out.println(movie.getName());
                        }
                    }
                    ;
                    break;
                default:
                    System.out.println("That wasnt one of the options.... FAIL");
                    break;
            }
        } while (times != 0);




    }
}
