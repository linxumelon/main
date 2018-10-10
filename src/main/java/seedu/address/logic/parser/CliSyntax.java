package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */

    /*
     * The prefix morphing is as follows:
     * Email -> Priority
     * Phone -> Date
     * Address -> Venue
     */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_VENUE = new Prefix("v/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_DATE = new Prefix("d/");
    public static final Prefix PREFIX_PRIORITY = new Prefix("p/");
}
