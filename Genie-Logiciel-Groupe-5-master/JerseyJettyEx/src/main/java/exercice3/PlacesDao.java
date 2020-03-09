package exercice3;

import java.util.List;

public interface PlacesDao {
	List<Places> putPlaces();
	List<Places> deletePlaces();
	List<Places> getPlaces();
	List<Places> getClosestPlaces(String position);
	List<Places> getFriendsPlaces(User friend);// use with a user
	List<Places> postPlaces();// to modify a places
}
