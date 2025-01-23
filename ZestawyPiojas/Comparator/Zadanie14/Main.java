package Zadanie14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Tworzymy przykładowe obiekty Song
        Song[] songs = new Song[]{
                new Song("Song A", "Artist X", 210),
                new Song("Song B", "Artist Y", 180),
                new Song("Song C", "Artist X", 210),
                new Song("Song D", "Artist Z", 150),
                new Song("Song E", "Artist Y", 180)
        };

        // Sortowanie po długości utworu, następnie po artyście i tytule
        Arrays.sort(songs, new SongDurationComparator().thenComparing(new ArtistTitleComparator()));

        // Wyświetlamy posortowaną tablicę
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}