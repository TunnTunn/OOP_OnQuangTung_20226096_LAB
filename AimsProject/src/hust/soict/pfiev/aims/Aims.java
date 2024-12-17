package hust.soict.pfiev.aims;

import hust.soict.pfiev.aims.cart.Cart;
import hust.soict.pfiev.aims.media.Book;
import hust.soict.pfiev.aims.media.DigitalVideoDisc;
import hust.soict.pfiev.aims.screen.StoreScreen;
import hust.soict.pfiev.aims.store.Store;

public class Aims {

	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();

		store.addMedia(new DigitalVideoDisc("Titanic"));
		store.addMedia(new DigitalVideoDisc("Shrek"));
		store.addMedia(new DigitalVideoDisc("Bullet Train"));
		store.addMedia(new DigitalVideoDisc("Venom"));
		store.addMedia(new DigitalVideoDisc("The wolf of Wall Street"));
		store.addMedia(new DigitalVideoDisc("The god Father"));
		store.addMedia(new DigitalVideoDisc("Avenger: Endgame"));
		store.addMedia(new DigitalVideoDisc("Bust my nuts: Final Chapter", "Adults", 5));
		store.addMedia(new Book("Will he bonk ya in the chocolate factory", "Action", 12));
		store.addMedia(new DigitalVideoDisc("Puss in cuss"));

		new StoreScreen(store, cart);
		//new CartScreen(cart);
	}
}