package Zadanie14;

import java.util.Comparator;

public class SongDurationComparator implements Comparator<Song> {

    @Override
    public int compare(Song s1, Song s2){
        return Integer.compare(s1.duration, s2.duration);

    }
}
