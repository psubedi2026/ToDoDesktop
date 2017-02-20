package sample;

/**
 * Created by psubedi2020 on 2/20/17.
 */
public class ToDoItem {

    String text;
    boolean isDone;

    public ToDoItem(String text) {
        this.text = text;
        this.isDone = false;
    }


    @Override
    public String toString() {
        return text + (isDone ? " (done) " : "");
    }


}
