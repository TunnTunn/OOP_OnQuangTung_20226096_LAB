package hust.soict.pfiev.test;

import hust.soict.pfiev.aims.cart.Cart;
import hust.soict.pfiev.aims.media.Book;
import hust.soict.pfiev.aims.media.DigitalVideoDisc;
import hust.soict.pfiev.aims.screen.StoreScreen;
import hust.soict.pfiev.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();

		store.addMedia(new DigitalVideoDisc("Mashle"));
		store.addMedia(new DigitalVideoDisc("Re:zero"));
		store.addMedia(new DigitalVideoDisc("AoT"));
		// store.addMedia(new DigitalVideoDisc("Naruto"));
		// store.addMedia(new DigitalVideoDisc("Boruto"));
		// store.addMedia(new DigitalVideoDisc("Jujutsu Kaisen"));
		// store.addMedia(new DigitalVideoDisc("Dungeon Meshi"));
		// store.addMedia(new DigitalVideoDisc("Honkai"));
		// store.addMedia(new Book("Genshin", "Action", 12));
		// store.addMedia(new DigitalVideoDisc("Mashle 2"));

		new StoreScreen(store, cart);
	}
}