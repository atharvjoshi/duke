import ui.Duke;

/**
 * Driver method for Duke.
 *
 * @author atharvjoshi
 * @version CS2103 AY19/20 Sem 1 iP Week 4
 */
public class Main {
    /**
     * The main method that drives Duke.
     *
     * <p> Creates a new instance of Duke and runs it. </p>
     *
     * @param args command(s) from the user
     */
    public static void main(String[] args) {
        // create an instance of ui.Duke with the file containing the task list
        new Duke("data/tasks.txt").run();
    }
}