package fr.mds.adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Now playing VLC file: " + fileName);
	}

	@Override
	public void playMP4(String fileName) {}

	@Override
	public void pauseVLC(String fileName) {
		System.out.println("Paused VLC file: " + fileName);
	}

	@Override
	public void pauseMP4(String fileName) {}

}
