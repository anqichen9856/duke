package duke.command;

import duke.core.DukeException;
import duke.core.Storage;
import duke.core.TaskList;
import duke.core.Ui;

/**
 * Represents a command inputted by user. <code>Command</code> is an abstract
 * class that can not be instantiated, but it has many child classes to 
 * represent different types of commands.
 */
public abstract class Command {
    /**
     * Executes the command with respect to tasks (modifying the task list), 
     * UI, and storage (saving tasks in a file in hard disk).
     *
     * @param tasks The task list where tasks are stored.
     * @param ui The user interface that interacts with user input.
     * @param storage The <code>Storage</code> object that handles task 
     *      storage in local file.
     * @throws DukeException If an exception occurs during execution of the 
     *      command.
     */
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;

    public abstract String executeGui(TaskList tasks, Ui ui, Storage storage) throws DukeException;

    /**
     * Indicates whether this command tells Duke to exit.
     *
     * @return A boolean. True if the command tells Duke to exit, false 
     *          otherwise.      
     */
    public abstract boolean isExit();
}
