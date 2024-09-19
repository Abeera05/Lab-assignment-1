public class Artwork{

	private String title;
	private int year;
	private Artist artist;


	Artwork(String title, int year, Artist artist){
		this.title=title;
		this.year=year;
		this.artist=artist;
	}

	Artwork(){
		this.title=title;
		this.year=year;
		
	}




	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}

	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}

	public void setArtist(Artist artist){
		this.artist=artist;
	}
	public Artist getArtist(){
		return artist;
	}


	void displayInfo(){
		System.out.println("Title: "+title);
		System.out.println("Year: "+year);
		artist.display();

	}

}