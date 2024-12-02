package hust.soict.pfiev.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost) {
		super(nbMedia++, title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public List<String> getAuthors() {
		return this.authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Already contained");
		}
		else {
			authors.add(authorName);
			System.out.println("Added successfully!");
		}
	}
	
	public void removeAuthor(String anotherName) {
		if(!authors.contains(anotherName)) {
			System.out.println("There is no author " + anotherName + " in the list!");
		}
		else {
			authors.remove(anotherName);
			System.out.println("Removed successfully!");
		}
	}

	@Override 
	public String toString() {
		int index = 1;
		String res = this.getId() + ". Book: ";
		if (this.getTitle() != null) {
			res += "Title: " + this.getTitle() + "\n";
		}
		if (this.getCategory() != null) {
			res += "Category: " + this.getCategory() + "\n";
		}
		if (this.getAuthors().size() != 0) {
			res += "Authors name: ";
			for (String name: this.authors) {
				res += name;
				if (index < this.authors.size()) {
					index++;
					res += ", ";
				}
			}
			res += "\n";
		}
		if (this.getCost() != 0.0f) {
			res += "Cost: "  + this.getCost();
		}
		return res;	
	}
	
}