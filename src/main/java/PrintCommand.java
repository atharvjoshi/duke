/**
 * Encapsulates command to print all tasks in the task list.
 *
 * @author atharvjoshi
 * @version CS2103 AY19/20 Sem 1 iP Week 3
 */
public class PrintCommand extends Command {

    /**
     * Initialises a command to print the whole list on the user interface.
     *
     * @param imperative the term used to identify command type
     */
    public PrintCommand(String imperative) {
        super(imperative);
    }

    /**
     * Executes the print command method by asking the user interface handler
     * to print all the tasks in the lists to the terminal.
     *
     * @param tasks the task list the task is to be added to
     * @param ui the user interface associated with this run of Duke
     * @param storage the storage handler associated with this run of Duke
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printTasks(tasks);
    }
}