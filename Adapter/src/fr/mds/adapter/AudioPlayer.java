package fr.mds.adapter;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {

		MediaAdapter mediaAdapter;

		// Si le format est "MP3", on le lit
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Now playing MP3 file: " + fileName);
		}

		// Si le format est "VLC", on appel le MediaAdapter
		else if (audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}

		// Si le format est "MP4", on appel le MediaAdapter
		else if (audioType.equalsIgnoreCase("mp4")) {
		    mediaAdapter = new MediaAdapter(audioType);
		    mediaAdapter.play(audioType, fileName);
		}

		// Sinon, le format n'est pas supporté
		else {
			System.out.println("Media format '" + audioType + "' is not supported.");
		}
	}

	@Override
	public void pause(String audioType, String fileName) {

		MediaAdapter mediaAdapter;

		// Si le format est "MP3", on suspend la lecture
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Now playing MP3 file: " + fileName);
		}

		// Si le format est "VLC", on appel le MediaAdapter
		else if (audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}

		// Si le format est "MP4", on appel le MediaAdapter
		else if (audioType.equalsIgnoreCase("mp4")) {
		    mediaAdapter = new MediaAdapter(audioType);
		    mediaAdapter.play(audioType, fileName);
		}

		// Sinon, le format n'est pas supporté
		else {
			System.out.println("Media format '" + audioType + "' is not supported.");
		}
	}

}
