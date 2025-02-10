
public class Movie {
	private String id;
	private String name;
	private Director;
	
	public Movie (String id, String name,Director ) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Director getDirector() {
		this.director;
	}
	
	public void setDirector (Director director) {
		this.director = director;
	}
	
	Override 
	public String toString() {
		return id+" " + name + "director by " + director.toString();
	}

}
