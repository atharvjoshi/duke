/**
 * Encapsulates command for exiting Duke.
 *
 * @author atharvjoshi
 * @version CS2103 AY19/20 Sem 1 iP Week 3
 */
public class ExitCommand extends Command {

    /**
     * Initialises a command for exiting Duke.
     * @param imperative the term used to identify command type
     */
    public ExitCommand(String imperative) {
        super(imperative);
    }

    /**
     * Executes the command by setting its exit status to true.
     *
     * @param tasks the task list the task is to be added to
     * @param ui the user interface associated with this run of Duke
     * @param storage the storage handler associated with this run of Duke
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        this.isExit = true;
    }
}
