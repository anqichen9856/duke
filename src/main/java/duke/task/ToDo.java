package duke.task;

public class ToDo extends Task {

    public ToDo(String description) {
        super(description);
    }

    public String format() {
        return "T | " + this.getStatusIcon() + " | " + this.description;
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}