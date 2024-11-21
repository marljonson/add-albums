import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Java class to add albums to your collection.
 * 
 * @author  Marl Jonson
 * @version 2024-11-20
 */
public class AddAlbums
{
    public static void main(String[] args)
    {
        ArrayList<Album> collection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        PopAlbum immunity = new PopAlbum("Immunity", "Clairo", "pop", "cozy");
        PopAlbum _1989 = new PopAlbum("1989", "Taylor Swift", "pop", "radiant");
        
        System.out.println("\nWELCOME TO add-albums");
        
        System.out.println("\nMAIN MENU");
        System.out.println("Add an album        ADD");
        System.out.println("Quit adding albums  STOP");
        
        input = scanner.nextLine().toLowerCase().trim();
        
        while (!input.equals("stop"))
        {
            String name = "";
            String artist = "";
            String genre = "";
            
            System.out.println("\nADD AN ALBUM");
            System.out.print("Enter an album name: ");
            name = scanner.nextLine().trim();
                String firstLetter = name.substring(0, 1).toUpperCase();
                name = firstLetter + name.substring(1);
            System.out.print("Enter the artist: ");
            artist = scanner.nextLine().trim();
                firstLetter = artist.substring(0, 1).toUpperCase();
                artist = firstLetter + artist.substring(1);
            System.out.print("Enter the genre: ");
            genre = scanner.nextLine().trim().toLowerCase();
            
            if (genre.equals("pop"))
            {
                System.out.print("What vibe does the album have? ");
                PopAlbum myNewAlbum = new PopAlbum(name, artist, genre, scanner.nextLine());
                collection.add(myNewAlbum);
            }
            else
            {
                Album myNewAlbum = new Album(name, artist, genre);
                collection.add(myNewAlbum);
            }
            
            System.out.println("\nMAIN MENU");
            System.out.println("Add an album        ADD");
            System.out.println("Quit adding albums  STOP");
            
            input = scanner.nextLine().toLowerCase().trim();
            
            while (!input.equals("add") && !input.equals("stop"))
            {
                System.out.println("INVALID INPUT");
                input = scanner.nextLine().toLowerCase().trim();
            }
        }
        
        System.out.println("\nYOUR COLLECTION");
        for (Album each : collection) {
            each.printInfo();
        }
    }
}
