package duke.task;

/**
 * Represents a task with a deadline. The <code>Deadline</code> class 
 * inherits from the <code>Task</code> class.
 */
public class Deadline extends Task {
    /** A string that represents the deadline of the task, as inputted by user. */
    private String by;

    /**
     * Constructs a <code>Deadline</code> object. Date and time are parsed and 
     * stored in <code>dateTime</code> field if input is of "dd/MM/yyyy HHmm"
     * format.
     *
     * @param description A string that describes the specific
     *          content of the task.
     * @param by A string that specifies the deadline of the 
     *          task.
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    public void updateBy(String newBy) {
        this.by = newBy;
    }

    /**
     * Returns a string representatio of the task to be stored in a local file.
     *
     * @return A string in a specific format for clear display in a local file.
     */
    @Override
    public String format() {
        return "D | " + this.getStatusIcon() + " | " + this.getDescription() + " | " + this.by;
    }

    /**
     * Returns a string representation of the task to be printed upon user 
     * inquiry.
     *
     * @return A string representation of the task that displays the type,
     *          description and deadline of the task.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}
