package fr.mds.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {

		// Initialisation de l'AudioPlayer
		AudioPlayer audioPlayer = new AudioPlayer();

		// Lecture de differents fichiers audio
		audioPlayer.play("mp3", "beyond_the_horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far_far_away.vlc");
		audioPlayer.play("avi", "mind_me.avi");

		MediaPlayer player1 = new MediaAdapter("mp4");
		player1.play("mp4", "test1.mp4");

		MediaPlayer player2 = new AudioPlayer();
		player2.play("mp4", "test2.mp4");

	}

}
