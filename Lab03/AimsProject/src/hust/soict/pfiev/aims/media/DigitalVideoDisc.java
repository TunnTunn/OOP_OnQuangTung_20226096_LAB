package hust.soict.pfiev.aims.media;

import java.util.Objects;

public class DigitalVideoDisc extends Disc implements Playable {

	private static int nbDigitalVideoDiscs = 0;

    private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	private int id;

	// Constructor by by all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(nbMedia++, title, category, director, length, cost);
	}

	// Constructor by title
	public DigitalVideoDisc(String title) {
		this(title, null, null, 0, 0.0f);
	}

	// Constructor by title, category and cost 
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title, category, null, 0, cost);
	}

	// Constructor by title, category, director and cost 
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, director, 0, cost);
	}

	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
	}
	
	public boolean isMatching(String title) {
		return this.title.equals(title);
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
