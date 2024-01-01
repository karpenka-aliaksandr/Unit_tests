package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {

    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate) {
            data.add(user);
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void unloginUsersWithoutIsAdmin(){
        for (User user: data) {
            System.out.println(user);
        }
        data = data.stream().filter(user -> user.isAdmin = true).collect(Collectors.toList());
        for (User user: data) {
            System.out.println(user);
        }
    }

}