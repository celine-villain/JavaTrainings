package academy.learning;

import java.util.HashSet;
import java.util.Set;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Set<Song> songs = new HashSet<Song>();
        songs.add(this);
        Song current = this.nextSong;

        while (current != null && current.nextSong != null && !songs.contains(current.nextSong)) {
            songs.add(current);
            current = current.nextSong;
        }

        return songs.contains(current.nextSong);
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}