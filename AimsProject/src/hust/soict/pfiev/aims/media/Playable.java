package hust.soict.pfiev.aims.media;

import hust.soict.pfiev.aims.exception.PlayerException;

public interface Playable {
	public String play() throws PlayerException;
}