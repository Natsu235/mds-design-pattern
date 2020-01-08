package fr.mds.adapter;

public class MediaAdapter extends AudioPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VLCPlayer();
		}
		else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new MP4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVLC(fileName);
		}
		else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playVLC(fileName);
		}
	}

	@Override
	public void pause(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
        	advancedMediaPlayer.pauseVLC(fileName);
        }
        else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.pauseVLC(fileName);
		}
	}

}
