package duke.exception;

/**
 * The duke.exception.DukeException Class extends Exception and is
 * used to denote any exception specific to duke.Duke
 */
public class DukeException extends Exception {
    public DukeException(String msg) {
        super(msg);
    }
}
