package duke.command;

import duke.task.Task;
import duke.core.TaskList;
import duke.core.Ui;
import duke.core.Storage;
import duke.core.DukeException;

public class AddCommand extends Command {
    private Task t;

    public AddCommand(Task t) {
        super();
        this.t = t;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.addTask(t);
        ui.addedTask(t, tasks.getSize());
        storage.save(tasks);
    }
}
