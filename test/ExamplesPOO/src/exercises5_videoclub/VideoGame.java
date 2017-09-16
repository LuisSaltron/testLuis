package exercises5_videoclub;

public class VideoGame implements Deliver {

	private String title;
	private double expectedTime;
	private boolean delivered;
	private String genre;
	private String company;

	public VideoGame() {
		this.title = "Título por defecto";
		this.expectedTime = 10;
		this.delivered = false;
		this.genre = "Género por defecto";
		this.company = "Compañía por defecto";
	}

	public VideoGame(String title, double expectedTime) {
		this.title = title;
		this.expectedTime = expectedTime;
		this.delivered = false;
		this.genre = "Género por defecto";
		this.company = "Compañía por defecto";
	}

	public VideoGame(String title, double expectedTime, String genre, String company) {
		this.title = title;
		this.expectedTime = expectedTime;
		this.delivered = false;
		this.genre = genre;
		this.company = company;
	}

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
		return "VideoGame [title=" + title + ", expectedTime=" + expectedTime + ", delivered=" + delivered + ", genre="
				+ genre + ", company=" + company + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setExpectedTime(double expectedTime) {
		this.expectedTime = expectedTime;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public double getExpectedTime() {
		return expectedTime;
	}

	public String getGenre() {
		return genre;
	}

	public String getCompany() {
		return company;
	}

}
