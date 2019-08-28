package duke.command;

import duke.core.TaskList;
import duke.core.Ui;
import duke.core.Storage;

public class ListCommand extends Command {
    public ListCommand() {
        super();
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printTasks(tasks);
    }
}