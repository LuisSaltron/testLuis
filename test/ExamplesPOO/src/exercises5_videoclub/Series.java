package exercises5_videoclub;

public class Series implements Deliver {

	private String title;
	private int seasonNum;
	private String genre;
	private String maker;
	private boolean delivered;

	// default constructor
	public Series() {
		this.title = "Título de la serie por defecto";
		this.seasonNum = 3;
		this.genre = "Género por defecto";
		this.maker = "Creador por defecto";
		this.delivered = false;
	}

	public Series(String title, String maker) {
		this.title = title;
		this.maker = maker;
		this.seasonNum = 3;
		this.genre = "Género por defecto";
		this.delivered = false;
	}

	public Series(String title, int seasonNum, String genre, String maker) {
		super();
		this.title = title;
		this.seasonNum = seasonNum;
		this.genre = genre;
		this.maker = maker;
		this.delivered = false;
	}

	@Override
	public boolean deliver() {
		this.delivered = true;
		return this.delivered;
	}

	@Override
	public boolean giveBack() {
		this.delivered = false;
		return this.delivered;
	}

	@Override
	public boolean isDeliver() {
		return this.delivered;
	}

	@Override
	public String toString() {
		return "Series [title=" + title + ", seasonNum=" + seasonNum + ", genre=" + genre + ", maker=" + maker
				+ ", delivered=" + delivered + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSeasonNum(int seasonNum) {
		this.seasonNum = seasonNum;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public String getTitle() {
		return title;
	}

	public int getSeasonNum() {
		return seasonNum;
	}

	public String getGenre() {
		return genre;
	}

	public String getMaker() {
		return maker;
	}

	public boolean isDelivered() {
		return delivered;
	}

}
