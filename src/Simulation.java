import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Simulation {
    ArrayList<Item> allItems = new ArrayList<>();

    ArrayList<Item> loadItems() {
        Scanner readFile;
        try {
            String filePath = "phase-1.txt";
            File file = new File(filePath);
            readFile = new Scanner(file);

            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                // split each line by "=" and take 1st item as item name and 2nd item as weight in kg
                String[] singleItem = line.split("=");
                // converting String to integer
                int weight = Integer.valueOf(singleItem[1]);

                // adding new Item to the allItems ArrayList
                allItems.add( new Item(singleItem[0], weight) );
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
        }
        return allItems;

    }

    ArrayList<U1> loadU1() {
        ArrayList<U1> loadedU1 = new ArrayList<>();
        Iterator itr = allItems.iterator(); // creating an iterator for allItems

        while (itr.hasNext()) {
            Item item = (Item) itr.next();
            System.out.println(item);
        }

        return loadedU1;
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        sim.loadItems();
        sim.loadU1();
    }
}