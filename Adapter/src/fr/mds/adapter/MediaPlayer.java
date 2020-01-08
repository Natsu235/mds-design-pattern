package fr.mds.adapter;

public interface MediaPlayer {

	// Lecture d'un fichier audio
	public abstract void play(String audioType, String fileName);

	// Mise en pause d'un fichier audio
	public abstract void pause(String audioType, String fileName);

}
