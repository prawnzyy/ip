package duke.command;

import java.io.IOException;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.Task;

/**
 * The AddCommand represents a command
 * to add a task to the TaskList.
 */

public class AddCommand extends Command {
    private Task task;

    /**
     * Sets the isExit to false and adds the task.
     *
     * @param task the task to be added.
     */
    public AddCommand(Task task) {
        super(false);
        this.task = task;
    }

    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) throws IOException {
        tasks.add(this.task);
        storage.rewrite(tasks);
        return (ui.showAddMessage(task, tasks.getSize()));
    }
}
