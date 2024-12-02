package hust.soict.pfiev.aims.media;

import java.util.Comparator;
import java.util.Objects;
import hust.soict.pfiev.aims.media.comparator.*;


public abstract class Media {
	static int nbMedia = 0;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST =
			new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE =
			new MediaComparatorByCostTitle();

	private int id;
	private String title;
	private String category;
	private float cost;

	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
}
