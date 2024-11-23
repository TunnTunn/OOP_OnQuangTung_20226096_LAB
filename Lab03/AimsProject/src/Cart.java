package hust.soict.pfiev.aims;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = 
        new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered += 1;
        System.out.println("The disc has been added!");

        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
            return;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for(DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    /*
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for(DigitalVideoDisc disc : dvdList) {
			addDigitalVideoDisc(disc);
		}
	}
	*/

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int discPosition = -1;
        for(int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if(itemsOrdered[i].equals(disc)) {
                discPosition = i;
                break;
            }
        }

        if(discPosition == -1) {
            System.out.println("Could not find the searched disc in cart!");
        }

        for(int i = discPosition; i <MAX_NUMBERS_ORDERED; i++) {
            if(i == MAX_NUMBERS_ORDERED -1) {
                itemsOrdered[i] = null;
            }
            else itemsOrdered[i] = itemsOrdered[i+1];
        }
        qtyOrdered -= 1;
        System.out.println("The disc has been remove!");
    }

    public float totalCost() {
        float result = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
			result += itemsOrdered[i].getCost();
		}
        return result;
    }

    public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for(int i = 0; i < qtyOrdered; ++i) {
			DigitalVideoDisc disc = itemsOrdered[i];
			System.out.println((i + 1) + ". " + disc);
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}

    // Search by ID
    public boolean search(int id) {
		for(int i = 0; i < qtyOrdered; ++i) {
			DigitalVideoDisc disc = itemsOrdered[i];
			if(disc.getId() == id) {
				System.out.println("Found in cart: " + disc);
				return true;
			}
		}
		System.out.println("Not found!");
		return false;
	}

    // Search by title
    public boolean search(String title) {
		for(int i = 0; i < qtyOrdered; ++i) {
			DigitalVideoDisc disc = itemsOrdered[i];
			if(disc.isMatching(title)) {
				System.out.println("Found in cart: " + disc);
				return true;
			}
		}
		System.out.println("Not found!");
		return false;
	}
}