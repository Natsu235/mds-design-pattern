package fr.mds.adapter;

public interface AdvancedMediaPlayer {

	// Lecture d'un fichier VLC
	public abstract void playVLC(String fileName);

	// Lecture d'un fichier MP4
	public abstract void playMP4(String fileName);

	// Mise en pause d'un fichier VLC
	public abstract void pauseVLC(String fileName);

	// Mise en pause d'un fichier MP4
	public abstract void pauseMP4(String fileName);

}
