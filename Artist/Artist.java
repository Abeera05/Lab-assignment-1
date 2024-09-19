public class Artist{
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	Artist(){
		name="Abeera Rehman";
	}

	void display(){
		System.out.println("Artist Name: "+name);
	}
}