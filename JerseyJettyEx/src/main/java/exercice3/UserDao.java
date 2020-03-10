package exercice3;

import java.util.List;
/*
 * For the moment, we don't create user's object, because there aren't builder method.
 * We put only the definition of the method use in the interface by the web-services.
 */
public interface UserDao {
	List<User> getUser();
	List<User> getUserName(String username);
	List<User> putUser(String login, String password);
	List<User> deleteUser(String username);
}
