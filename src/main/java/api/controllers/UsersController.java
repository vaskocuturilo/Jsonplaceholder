package api.controllers;

import api.AbstractController;
import api.todos.Todos;
import api.users.Users;
import io.restassured.builder.RequestSpecBuilder;

import static io.restassured.RestAssured.given;

public class UsersController extends AbstractController {
    private RequestSpecBuilder specBuilder = new RequestSpecBuilder()
            .addHeader("Content-type", "application/json; charset=UTF-8")
            .setBasePath("users");
    private Users users;

    public UsersController(Users users) {
        this.users = users;
    }

    public Users getUsers() {
        return given(specBuilder.build()).get(String.valueOf(users.getId())).as(Users.class);
    }
}


