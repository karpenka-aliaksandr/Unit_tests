package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserAndUserRepositoryTest {
    User user, admin;

    UserRepository userRepository;


    @BeforeEach
    void setup(){
        user = new User("User", "pass");
        admin = new User("Admin", "admin", true);
        userRepository = new UserRepository();
    }

    @Test
    void positiveAuthenticate(){
        assertTrue(user.authenticate("User", "pass"));
    }

    @ParameterizedTest
    @CsvSource({
            "User, password",
            "user, pass",
            "user, password"
    })
    void negativeAuthenticate(String name, String password){
        assertFalse(user.authenticate(name, password));
    }

    @Test
    void addIfUserAuthenticate(){
        user.authenticate("User", "pass");
        userRepository.addUser(user);
        assertTrue(userRepository.findByName("User"));
    }

    @Test
    void notAddIfUserNotAuthenticate(){
        user.authenticate("user", "pass");
        userRepository.addUser(user);
        assertFalse(userRepository.findByName("user"));
    }



}