package hust.soict.pfiev.test;

import hust.soict.pfiev.aims.Store;
import hust.soict.pfiev.aims.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		store.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		store.addDVD(dvd3);
		
		//store.removeDVD(dvd2);
		
		store.print();
    }
}
