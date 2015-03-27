
import sun.security.pkcs11.Secmod;

import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

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
    public DbTable(ArrayList<String> columnNames) throws IllegalArgumentException {
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
    public void insert(DataObject newRow) throws IllegalArgumentException {
        int numCol = columnNames.size();
        for(int i = 0; i < numCol; i++){
        if ((newRow.get(columnNames.get(i)) == null)){

            throw new IllegalArgumentException("Bad column");

        }
            else {

                if(isAlphaNumColVal(columnNames, newRow) == false){

                    throw new IllegalArgumentException("Not alphanumeric string");
                }

                else{}
        }

        }

        entries.add(newRow);
    }

    /**
     *
     */
    public void printEntries(){
    for(int i = 0; i < this.entries.size(); i++){
        System.out.println(this.entries.get(i));
    }
    for(int y = 0; y < this.columnNames.size(); y++){
            System.out.println(this.columnNames.get(y));
        }
    }



    /**
     * Returns true if the value of a column is alphanumeric
     * Returns false if the value of a column is not alphanumeric
     */
    private boolean isAlphaNumColVal(ArrayList columnNames, DataObject newRow){
        boolean isAlpha = true;
        String alphanum = "^[a-zA-Z0-9]*$";
        for(int i =0; i < columnNames.size(); i++) {
            if (newRow.get(this.columnNames.get(i)).matches(alphanum) == false) {
                return (isAlpha = false);
            }
        else{}
        }
        return isAlpha;
    }

    /**
     * Returns true if the name of a column is alphanumeric
     * Returns false if the name of a column is not alphanumeric
     */
    private static boolean isAlphaNumColNam(ArrayList<String> columnNames){
        boolean isAlpha = true;
        String alphanum = "^[a-zA-Z0-9]*$";
        for(int i =0; i < columnNames.size(); i++) {
            if (columnNames.get(i).matches(alphanum) == false) {
                return (isAlpha = false);
            }
            else{}
        }
        return isAlpha;
    }

    /**
     * Returns true if the dataObject matches
     * Returns false if the dataObjects are not the same
     */
 //   private boolean doesMatch(DataObject obj1, DataObject obj2){
//       if(obj1.matches)
//    }

    /**
     * Returns true if a new entry to be inserted contains values for all of the columns in
     * columnNames
     * Returns false if the new entry to be inserted does not
     */
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
//TODO: Implement me
        return null;
    }

    /**
     * Removes a DataObject from the table
     *
     * @param toDelete  the DataObject to be removed
     **/
    public void delete(DataObject toDelete) {
        if (toDelete == null){
            return;
        }

        else{
            DataObject toComp = entries.getFirst();

            if (entries.contains(toDelete)){
                entries.remove(toDelete);
                System.out.println("Deleted successfully!");
            }

        }
    return;
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
    public void writeToFile(String outputFileName){//} throws java.io.IOException, FileNotFoundException {

        String[] line = new String[this.entries.size()+1];

        outputFileName += ".txt";
        //try to write to file
        //throws error if file not found aka unable to create
        try {

            PrintWriter writer = new PrintWriter(outputFileName);
            String colNames = new String();
            for (int i = 0; i < this.columnNames.size()-1; i++) {
                colNames += this.columnNames.get(i) + ",";
            }

            colNames += this.columnNames.get(this.columnNames.size() -1);

            line[0] = colNames;

            for (int k = 1; k <= this.entries.size(); k++) {
                for (int y = 0; y < this.entries.size(); y++) {
                       // DataObject curr = this.entries.get(y);
                            for (int p = 0; p < this.columnNames.size(); p++){
                                line[k] += this.entries.get(y).get(columnNames.get(p));
                                line[k] += " ";
                            }
                        line[k] += ("\n");
                }
            }

                for (int l = 0; l <= this.entries.size(); l++) {
                    writer.println(line[l]);
                }

                writer.close();


        }  catch (FileNotFoundException ex) {
            System.out.println("Could not write to file."
                    + outputFileName + " not found");
        } catch (java.io.IOException ex) {
            System.out.println("Error writing to file "
                    + outputFileName);
        }

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
            throws IllegalArgumentException, java.io.FileNotFoundException {
        String line = null;
        //make sure program can access file
        //if not throw error
        try{
            FileReader reader = new FileReader(inputFileName);
            BufferedReader buffRead = new BufferedReader(reader);
            line = buffRead.readLine();
            ArrayList<String> entry = new ArrayList<String>();
            String delims = "[ ]+";
            String[] column = line.split(delims);

            for(int i =0; i< column.length; i++){
                String col = column[i];
                entry.add(col);
            }

            if (isAlphaNumColNam(entry) == false){
                throw new IllegalArgumentException("Column names are not alphanumeric");
            }

            DbTable table = new DbTable(entry);


            while((line = buffRead.readLine()) != null) {
            //TODO: DO something

            }
            buffRead.close();

        }

        catch(FileNotFoundException ex1){
            System.out.println( "Could not open file."
                    + inputFileName +" not found");
        }

        catch (IOException ex2){
            System.out.println("Error reading file "
                    + inputFileName);
        }

        return null;
    }



}
