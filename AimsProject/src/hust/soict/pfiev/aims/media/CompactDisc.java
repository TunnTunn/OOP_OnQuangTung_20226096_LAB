package hust.soict.pfiev.aims.media;

import java.util.List;
import hust.soict.pfiev.aims.media.Playable;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks;

    public CompactDisc(String title, String category, String director, int length, float cost, String artist,
            List<Track> tracks) {
        super(nbMedia++, title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track newTrack) {
        if (tracks.contains(newTrack)) {
            System.out.println("This track is already on the list");
        } else {
            tracks.add(newTrack);
            System.out.println("New track added successfully!");
        }
    }

    public void removeTrack(Track otherTrack) {
        if (!tracks.contains(otherTrack)) {
            System.out.println("This track is not on the list");
        } else {
            System.out.println("Track removed successfully!");
            tracks.remove(otherTrack);
        }
    }

    @Override
    public int getLength() {
        int result = 0;
        for (Track track : tracks) {
            result += track.getLength();
        }
        return result;
    }

    public void play() {
        for (int i = 0; i < tracks.size(); ++i) {
            System.out.println("Track " + i + ": ");
            tracks.get(i).play();
        }
    }

    @Override
    public String toString() {
        String res = this.getId() + ". Compact Disc (CD): \n";
        if (this.getTitle() != null) {
            res += "Title: " + this.getTitle() + "\n";
        }
        if (this.getCategory() != null) {
            res += "Category: " + this.getCategory() + "\n";
        }
        if (this.getDirector() != null) {
            res += "Director: " + this.getDirector() + "\n";
        }
        if (this.getLength() != 0) {
            res += "Total legnth: " + this.getLength() + "\n";
        }
        if (this.getCost() != 0.0f) {
            res += "Cost: " + this.getCost();
        }
        return res;
    }
}