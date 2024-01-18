package seminars.five.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
//    @Test
//    void UserTest(){
//        UserRepository userRepository = new UserRepository();
//        UserService userService = new UserService(userRepository);
//
//        String res = userService.getUserName(1);
//
//        assertEquals("User 1", res);
//
//    }

    @ParameterizedTest
    @ValueSource(ints = {2,5})
    void UsersTest(int i){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String res = userService.getUserName(i);

        assertEquals("User "+ i, res);

    }


}
