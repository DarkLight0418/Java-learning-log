package test;

public class Movie {
	String title;
	int year;
	int hours;
	int mins;
	
	public String getTitle() {
		return title;
	}
	
	public Movie(String title, int year, String times) {
		this.title = title;
		this.year = year;
		this.hours = Integer.parseInt(times.substring(0, 1));
		this.mins = Integer.parseInt(times.substring(4, 6));
	}
	
	public String toString() {
		return "제목: " + title + ", 개봉: " + year + ", 길이: " + hours + "시간 " + mins + "분";
	}
	
	public boolean isLongerThan(Movie movie) {
		if (this.getTitle().length() > movie.getTitle().length()) {
			return true;
		} else {
			return false;
		}
	}
}
