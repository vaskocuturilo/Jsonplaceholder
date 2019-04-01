package todos;

import api.controllers.TodosController;
import api.todos.Todos;
import listener.LogListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class TestTodosApi {

    @Test(description = "Get todos from ")
    public void testGet() {
        Todos todos = new Todos();
        TodosController todosController = new TodosController(todos);
        todosController.getElement();
    }

    @Test(description = "Add new todos to ")
    public void testAddNew() {
        Todos todos = new Todos("foo", "foo", 1, 1);
        TodosController todosController = new TodosController(todos);
        todosController.addNewElement(todos);
    }

    @Test(description = "Put todos to ")
    public void testPut() {
        Todos todos = new Todos("foo", "foo", 1, 1);
        TodosController todosController = new TodosController(todos);
        todosController.putElement(todos);
    }

    @Test(description = "Patch todos to ")
    public void testPatch() {
        Todos todos = new Todos("test1", "test2", 1, 1);
        TodosController todosController = new TodosController(todos);
        todosController.patchElement(todos);
    }

    @Test(description = "Delete todos from ")
    public void testDelete() {
        Todos todos = new Todos("foo", "foo", 1, 1);
        TodosController todosController = new TodosController(todos);
        todosController.deleteElements();
    }

}
