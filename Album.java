
/**
 * A Java class to templatize the ability to rank music albums.
 *
 * @author  Marl Jonson
 * @version 2024-11-20
 */
public class Album
{
    protected String name = null;
    protected String artist = null;
    protected String genre = null;
    
    public Album(String albumName, String artistName, String genreName)
    {
        name = albumName;
        artist = artistName;
        genre = genreName;
    }
    
    /**
     * Gets the name of the album.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the artist of the album.
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * Gets the genre of the album.
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * Print the album's information in a pretty form.
     */
    public void printInfo() {
        System.out.println("\nINFO\nName:   " + getName() + "\nArtist: " + getArtist() + "\nGenre:  " + getGenre());
    }
    
    /**
     * Write out the Album object as a string.
     */
    @Override
    public String toString() {
        return "\nINFO\nName:   " + getName() + "\nArtist: " + getArtist() + "\nGenre:  " + getGenre();
    }
}
