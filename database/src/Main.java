import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String cols[] = {"lasname", "firstname", "id"};
        String vals[] = {"Strasser", "Molly", "12345"};
        DataObject obj1 = new DataObject(cols, vals);
        String cols2[] = {"lasname", "firstname", "id"};
        String vals2[] = {"Dugo", "Giulia", "54321"};
        DataObject obj2 = new DataObject(cols2, vals2);
        String cols3[] = {"lasname", "firstname", "id"};
        String vals3[] = {"Bautista", "Amanada", "00000"};
        DataObject obj3 = new DataObject(cols3, vals3);
        String cols4[] = {"lasname", "firstname", "id"};
        String vals4[] = {"Temp", "Added", "11111"};
        DataObject obj4 = new DataObject(cols4, vals4);
        ArrayList<String> columnNames = new ArrayList<String>();
        columnNames.add("lasname");
        columnNames.add("firstname");
        columnNames.add("id");
        DbTable table = new DbTable(columnNames);
        table.insert(obj1);
        table.insert(obj2);
        table.insert(obj3);
        table.insert(obj4);
        table.delete(obj4);
        table.printEntries();
        String returnFile = new String();
        table.writeToFile(returnFile);
    }
}
