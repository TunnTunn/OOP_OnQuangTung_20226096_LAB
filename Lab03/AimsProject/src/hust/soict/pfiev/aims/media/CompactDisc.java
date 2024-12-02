package hust.soict.pfiev.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks;

    public CompactDisc(int id, String title, String category, String director, int length, float cost, String artist, List<Track> tracks)
    {
        super(id, title, category, director, length, cost);
        this.artist = artist;
        this.tracks = new ArrayList<Track>();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track newTrack) {
        if(tracks.contains(newTrack)){
            System.out.println("This track is already on the list");
        }
        else {
            tracks.add(newTrack);
            System.out.println("New track added successfully!");
        }
    }
    
    public void removeTrack(Track otherTrack) {
        if(!tracks.contains(otherTrack)) {
            System.out.println("This track is not on the list");
        }
        else {
            System.out.println("Track removed successfully!");
            tracks.remove(otherTrack);
        }
    }

    @Override
    public int getLength() {
        int result = 0;
        for(Track track: tracks) {
            result += track.getLength();
        }
        return result;
    }

	public void play() {
		for(int i = 0; i < tracks.size(); ++i) {
			System.out.println("Track " + i + ": ");
			tracks.get(i).play();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CD - " + "ID: " + getId() + " - Title: " + getTitle() + " - Category: " + getCategory() + ": " + getCost() + " $");
		
		for(Track track : tracks) {
			sb.append("\n\t" + track.toString());
		}
		
		return sb.toString();
	}
}
