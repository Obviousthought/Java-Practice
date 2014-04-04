import java.util.*;
import java.io.*;

public class Jukebox6 {
	ArrayList<Song1> songList = new ArrayList<Song1>();
	public static void main(String[] args) {
		new Jukebox6().go();
	}

	class ArtistCompare implements Comparator<Song1> {
		public int compare(Song1 one, Song1 two) {
			return one.getArtist().compareTo(two.getArtist());
		}
	}

	class TitleCompare implements Comparator<Song1> {
		public int compare(Song1 one, Song1 two) {
			return one.getTitle().compareTo(two.getTitle());
		}
	}

	public void go() {
		getSongs();
		System.out.println("Original: " + songList);

		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		System.out.println("By Artist: " + songList);

		TitleCompare titleCompare = new TitleCompare();
		Collections.sort(songList, titleCompare);
		System.out.println("By Title: " + songList);
	}

	void getSongs() {
		try {
			File file = new File("SongListMore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song1 nextSong = new Song1(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}