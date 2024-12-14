package hust.soict.pfiev.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.pfiev.aims.media.Media;

public class Store {

	private List<Media> itemsInStore = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsInStore.contains(media)) {
			System.out.println("The item is already in the Store!");
		} else {
			itemsInStore.add(media);
			System.out.println("Added successfully!");
		}
	}

	public void removeMedia(Media media) {
		if (!itemsInStore.contains(media)) {
			System.out.println("The item is not in the Store!");
		} else {
			itemsInStore.remove(media);
			System.out.println("Removed successfully!");
		}
	}

	public Media search(int id) {
		for (Media media : itemsInStore) {
			if (media.getId() == id) {
				System.out.println("Found");
				return media;
			}
		}
		System.out.println("Not found");
		return null;
	}

	public Media search(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title)) {
				System.out.println("Found");
				return media;
			}
		}
		System.out.println("Not found");
		return null;
	}

	public void print() {
		System.out.println("***********************STORE***********************");
		System.out.println("Store list:");
		for (Media m : this.itemsInStore) {
			System.out.println(m.toString());
		}
		System.out.println("****************************************************");
	}

	public ArrayList<Media> getItemsInStore() {
		return (ArrayList<Media>) itemsInStore;
	}
}