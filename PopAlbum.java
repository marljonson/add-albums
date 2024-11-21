
/**
 * 
 *
 * @author  Marl Jonson
 * @version 2024-11-20
 */
public class PopAlbum extends Album
{
    protected String vibe;
    
    public PopAlbum(String albumName, String artistName, String genreName, String yourVibe)
    {
        super(albumName, artistName, genreName);
        vibe = yourVibe;
    }
    
    /**
     * Print the album's information in a pretty form.
     */
    @Override
    public void printInfo() {
        System.out.println("\nINFO\nName:   " + getName() + "\nArtist: " + getArtist() + "\nGenre:  " + getGenre() + "\nVibe:   " + vibe);
    }
    
    /**
     * Write out the PopAlbum object as a string.
     */
    @Override
    public String toString()
    {
        return "\nINFO\nName:    " + getName() + "\nArtist: " + getArtist() + "\nGenre:  " + getGenre() + "\nVibe:   " + vibe;
    }
}
