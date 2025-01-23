package Zadanie14;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2){
        int artistComparison = s1.artist.compareTo(s2.artist);

        if(artistComparison == 0){
            return s1.title.compareTo(s2.title);
        }
        return artistComparison;
    }
}
