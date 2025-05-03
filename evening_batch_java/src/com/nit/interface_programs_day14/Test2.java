package com.nit.interface_programs_day14;

interface MediaPlayer {
	public void play();

	public void pause();

	public void stop();
}

interface AdvancedMediaPlayer extends MediaPlayer {
	public void adjustingVolume(int volumeLevel);

	public void skippingTrack();

}

interface PlaylistMediaPlayer extends AdvancedMediaPlayer {
	public void palyLists(String playListName);

	public void addSong();

}

class VLCMediaPlayer implements PlaylistMediaPlayer {
	
	


	private String playListName;

	@Override
	public void skippingTrack() {
		System.out.println("Skipping Track:");
	}

	@Override
	public void play() {
		System.out.println("Starting playing:");
	}

	@Override
	public void pause() {
		System.out.println("Paused Song");
	}

	@Override
	public void stop() {
		System.out.println("Stoped Song");
	}

	//in the playlist how many songs can be added at a  time 
	//in the play list can we add duplicates 
	
	@Override
	public void palyLists(String playListName) {
		if (this.playListName.equals(null)) {
			this.playListName = playListName;
			System.out.println(playListName + "Created");
		}
		
	}

	

	@Override
	public void adjustingVolume(int volumeLevel) {
		if(volumeLevel<1) {
			System.out.println("Mute");
		}
		else if (volumeLevel>=1 && volumeLevel<=20) {
			System.out.println("Low Volume");
		}
		else if (volumeLevel>=21 && volumeLevel<=30) {
			System.out.println("med. Volume");
		}
		else if (volumeLevel>=31 ) {
			System.out.println("High Volume");
		}
	}

	@Override
	public void addSong() {
		// TODO Auto-generated method stub
		
	}

}

public class Test2 {
	public static void main(String[] args) {

		VLCMediaPlayer vlcMediaPlayer = new VLCMediaPlayer();
		vlcMediaPlayer.play();
		//vlcMediaPlayer.adjustingVolume();
		vlcMediaPlayer.pause();
		vlcMediaPlayer.skippingTrack();
		//vlcMediaPlayer.palyLists();
		//vlcMediaPlayer.addingItemsToPlayList();
		vlcMediaPlayer.stop();

	}

}

/*
 * 2)MediaPlayer - VLCMediaPlayer
WAP for the below requirement:
 Create a type Interface 'MediaPlayer'.
 It provides basic functionalities like play, pause, and stop.
 Create another type Interface 'AdvancedMediaPlayer' which
 is a type of MediaPlayer but adds some extra functionalities
 like adjusting volume and skipping track.
 Create another type Interface 'PlaylistMediaPlayer' which
 is a type of AdvancedMediaPlayer and adds functionalities for
 managing playlists like creating playlists and adding media items
 to playlists.
  Create a VLCMediaPlayer class which implements PlaylistMediaPlayer
  and provides implementations for all the methods defined
  in the interfaces./
 */