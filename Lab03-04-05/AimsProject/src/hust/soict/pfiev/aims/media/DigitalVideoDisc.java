package hust.soict.pfiev.aims.media;

import java.util.Objects;

public class DigitalVideoDisc extends Disc implements Playable {

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

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		String res = this.getId() + ". Digital Video Disc (DVD): \n";
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

	public boolean isMatching(String title) {
		return this.getTitle().equals(title);
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}