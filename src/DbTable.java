
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;



public class DbTable {


    private ArrayList<String> columnNames;

    // Actual data objects
    private LinkedList<DataObject> entries;

    private HashMap<String, TreeMap<String, String>>  indexTrees;

    // Types of comparisons that can be performed
    public enum CompareType {
        LessThan, GreaterThan, LessEq, GreaterEq, Equal, NotEqual
    }

    /**
     * Initializes a table
     *
     * @param columnNames ArrayList of all the column names in the table. Valid column names are alphanumeric strings
     *                    (i.e. letters, numbers, and spaces are ok, but no symbols)
     * @throws            java.util.IllegalFormatException if columnNames is empty or null, or if any String in
     *                    columnNames is not alphanumeric
     */
    public DbTable(ArrayList<String> columnNames) throws java.util.IllegalFormatException {
        this.columnNames = new ArrayList<String>(columnNames);
        this.entries = new LinkedList<DataObject>();
        this.indexTrees = new HashMap<String, TreeMap<String, String>>();
    }

    /**
     * Inserts new DataObject into table
     *
     * @param newRow    DataObject to be inserted
     * @throws          java.util.IllegalFormatException if newRow is missing any column in columnNames, or any column
     *                  value is not an alphanumeric String
     */
    public void insert(DataObject newRow) throws java.util.IllegalFormatException {

    }

    /**
     * Returns a subset of the table rows where the columns satisfy ALL of the corresponding conditions specified in the
     * values and ctype Arrays.
     *
     * For example, if  columns = {"lastname", "score"};
     *                  values = {"Smith", "20"};
     *                  ctype = {Equal, LessEq};
     *
     * Then the select call will return all DataObjects in the table where the "lastname" column is equal to "Smith"
     * AND the "score" column is less than or equal to 20
     *
     * @param columns   String array that specifies which columns are to be compared
     * @param values    String array of the value corresponding to each column
     * @param ctype     Type of comparison to be performed (e.g. equality, less than, etc)
     * @return          All the DataObjects in the table that satisfy the conditions
     * @throws          IllegalArgumentException if the lengths of columns, values and ctype arrays do not match, or if
     *                  any of the strings in the columns array do not match strings in this.columnNames
     */
    public ArrayList<DataObject> select(String[] columns, String[] values, CompareType[] ctype)
            throws IllegalArgumentException {

        return null;
    }

    /**
     * Removes a DataObject from the table
     *
     * @param toDelete  the DataObject to be removed
     */
    public void delete(DataObject toDelete) {

    }

    /**
     * Writes the contents of the table to an output file. The output file has the following format:
     *
     * First line:
     * All column names, with each name separated by a comma
     *
     * Second line:
     * Contents of first data object, with each column value separated by a comma
     *
     * Third line:
     * Contents of second data object, etc.
     *
     *
     * Example: If the DbTable had the columns "id", "coursename", and "meetingtime", and had 3 entries with values:
     * ("123", "comp285", "0900"), ("021", "math150", "1500"), and ("421", "math151", "1000"), then the output file
     * contents would look like:
     *
     * id,coursename,meetingtime
     * 123,comp285,0900
     * 021,math150,1500
     * 421,math151,1000
     *
     *
     * @param outputFileName    Name of the file to write the contents to.  If the file already exists then it will be
     *                          overwritten.
     * @throws                  java.io.IOException if the file cannot be written to
     *
     */
    public void writeToFile(String outputFileName) throws java.io.IOException{

    }

    /**
     * Reads a saved table file (usually one written by the writeToFile method) and re-constructs the DbTable instance.
     * See writeToFile for description of file format.
     *
     * @param inputFileName     Name of the file to read
     * @return                  DbTable instance
     * @throws                  java.io.FileNotFoundException if the specified file doesn't exist.
     * @throws                  java.util.IllegalFormatException if the specified file exists but is malformed.
     */
    public static DbTable constructFromFile(String inputFileName)
            throws java.util.IllegalFormatException, java.io.FileNotFoundException {
        return null;
    }



}
