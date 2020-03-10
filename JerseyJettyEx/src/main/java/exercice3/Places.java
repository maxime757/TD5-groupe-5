package exercice3;

import java.util.List;

public class Places {
	private String name;
	private String message;
	private String position; // name of the place, but we can add a position with a number calculate 
							// between the distance of the person.
	private List<Object> Lpictures; //name, pictures and description
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public List<Object> getLpictures() {
		return Lpictures;
	}
	public void setLpictures(List<Object> lpictures) {
		Lpictures = lpictures;
	}
}
