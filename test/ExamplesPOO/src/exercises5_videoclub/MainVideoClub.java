package exercises5_videoclub;

import java.util.ArrayList;

import java.util.List;

import java.util.Collections;
import java.util.Comparator;

public class MainVideoClub {

	public static void main(String[] args) {
		List<Series> serie = createSerie();
		printSerie(serie);
		printGreaterSerie(serie);
		List<VideoGame> video = createVideoGame();
		printVideoGame(video);
		printGreaterVideo(video);
	}

	public static List<Series> createSerie() {

		List<Series> series = new ArrayList<Series>();
		series.add(new Series());
		series.add(new Series("The Walking Dead", "Fox"));
		series.add(new Series("The Simpsons", 8, "Comedia", "Fox"));
		series.add(new Series("The Gifted", 5, "Ciencia Ficción", "Fox"));
		return series;
	}

	public static List<VideoGame> createVideoGame() {

		List<VideoGame> video = new ArrayList<VideoGame>();
		video.add(new VideoGame());
		video.add(new VideoGame("Starcraft", 4));
		video.add(new VideoGame("Warcraft", 20.5, "Ciencia Ficción", "Sierra"));
		return video;
	}

	public static void printSerie(List<Series> list) {
		int deliver = 0;
		for (Series serie : list) {
			if (serie.isDeliver()) {
				deliver++;
			}

			serie.giveBack();
			System.out.println(serie.toString());
		}
		System.out.println("Hay " + deliver + " series entregadas");
	}

	public static void printVideoGame(List<VideoGame> list) {
		for (VideoGame video : list) {
			video.giveBack();
			System.out.println(video.toString());
		}
	}

	public static void printGreaterSerie(List<Series> list) {

		Collections.sort(list, new Comparator<Series>() {
			public int compare(Series o1, Series o2) {
				return Integer.compare(o2.getSeasonNum(), o1.getSeasonNum());
			}
		});
		System.out.println("La serie con mayor cantidad de temporadas es: " + list.get(0).getTitle());

	}

	public static void printGreaterVideo(List<VideoGame> list) {

		Collections.sort(list,new Comparator<VideoGame>() {

		    public int compare(VideoGame o1, VideoGame o2) {
		        return Double.compare(o2.getExpectedTime(), o1.getExpectedTime());
		    }
		});
		System.out.println("El video con mayor cantidad de horas es: " + list.get(0).getTitle());

	}

}