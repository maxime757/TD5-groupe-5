package exercice3;

import java.util.List;
/*
 * 
 *a user can have a list of other user to add his friend.
 *It also have a list of places for add the favorite place.
 *With this configuration we can have the favorite place of a friend
 *Or we can think a friend have a list of map witch contain a list of places.
 */
public class User {
	private String name;
	private String position;
	private String password;
	private String email;
	private List<Map> Lmap;
	private List<User> Lfriends;
	private List<Itinerary> Litinerary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Map> getLmap() {
		return Lmap;
	}
	public void setLmap(List<Map> lmap) {
		Lmap = lmap;
	}
	public List<User> getLfriends() {
		return Lfriends;
	}
	public void setLfriends(List<User> lfriends) {
		Lfriends = lfriends;
	}
	public List<Itinerary> getLitinerary() {
		return Litinerary;
	}
	public void setLitinerary(List<Itinerary> litinerary) {
		Litinerary = litinerary;
	}
	
}
