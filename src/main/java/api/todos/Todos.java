package api.todos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Todos {

    @JsonProperty("id")
    private int id;

    @JsonProperty("completed")
    private boolean completed;

    @JsonProperty("title")
    private String title;

    @JsonProperty("userId")
    private int userId;

    @JsonProperty("body")
    private String body;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }


    public Todos() {
        super();
        //empty
        return;
    }

    public Todos(int id) {
        this.id = id;
    }

    public Todos(String title) {
        this.title = title;
    }

    public Todos(String title, String body, int id, int userId) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return
                "Todos{" +
                        "id = '" + id + '\'' +
                        ",completed = '" + completed + '\'' +
                        ",title = '" + title + '\'' +
                        ",userId = '" + userId + '\'' +
                        "}";
    }
}