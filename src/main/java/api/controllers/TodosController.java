package api.controllers;

import api.AbstractController;
import api.todos.Todos;
import io.restassured.builder.RequestSpecBuilder;

import static io.restassured.RestAssured.given;

public class TodosController extends AbstractController {
    private RequestSpecBuilder specBuilder = new RequestSpecBuilder()
            .addHeader("Content-type", "application/json; charset=UTF-8")
            .setBasePath("posts");
    private Todos tod;

    public TodosController(Todos todos) {
        this.tod = todos;
    }

    public Todos addNewElement(Todos todos) {
        return given(specBuilder.build()).body(todos).when().post().as(Todos.class);
    }

    public Todos putElement(Todos todos) {
        return given(specBuilder.build()).body(todos).when().put().as(Todos.class);
    }

    public Todos patchElement(Todos todos) {
        return given(specBuilder.build()).body(todos).when().patch().as(Todos.class);
    }

    public Todos getElement() {
        return given(specBuilder.build()).get(String.valueOf(tod.getId())).as(Todos.class);
    }

    public Todos deleteElements() {
        return given(specBuilder.build())
                .delete(String.valueOf(tod.getId()))
                .then()
                .statusCode(200)
                .and()
                .extract().response().as(Todos.class);
    }

}
