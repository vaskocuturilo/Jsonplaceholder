package api.controllers;

import api.todos.Todos;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class TodosController {
    private RequestSpecification requestSpecification;
    private Todos tod;

    public TodosController(Todos todos) {
        requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-type", "application/json; charset=UTF-8")
                .setBaseUri("https://jsonplaceholder.typicode.com/")
                .setBasePath("posts")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
        RestAssured.defaultParser = Parser.JSON;
        this.tod = todos;
    }

    public Todos addNewElement(Todos todos) {
        return given(requestSpecification).body(todos).when().post().as(Todos.class);
    }

    public Todos putElement(Todos todos) {
        return given(requestSpecification).body(todos).when().put().as(Todos.class);
    }

    public Todos patchElement(Todos todos) {
        return given(requestSpecification).body(todos).when().patch().as(Todos.class);
    }

    public Todos getElement() {
        return given(requestSpecification).get(String.valueOf(tod.getId())).as(Todos.class);
    }

    public Todos deleteElements() {
        return given(requestSpecification)
                .delete(String.valueOf(tod.getId()))
                .then()
                .statusCode(200)
                .and()
                .extract().response().as(Todos.class);
    }

}
