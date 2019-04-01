package todos;

import api.controllers.UsersController;
import api.users.Users;
import listener.LogListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class TestUsersApi {

    @Test(description = "Get users from ")
    public void testGetUsersId(){
        Users users = new Users();
        UsersController usersController = new UsersController(users);
        usersController.getUsers();
    }
}
