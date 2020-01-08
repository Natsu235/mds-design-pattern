package fr.mds.adapter;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Now playing MP4 file: " + fileName);
	}

	@Override
	public void pauseVLC(String fileName) {}

	@Override
	public void pauseMP4(String fileName) {
		System.out.println("Paused MP4 file: " + fileName);
	}

}
