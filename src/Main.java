import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
	   // Create a list of names
       // add them in random order to a queue

       // dump the queue to show the order in which they are serviced

       ArrayList<String> names = new ArrayList<>();
       Queue<String> ticketLineQueue = new LinkedList<>();
       Random gen = new Random();
       int dex = 0;

        names.add("Tom");
        names.add("Sally");
        names.add("Fred");
        names.add("Yuki");
        names.add("Sven");
        names.add("Michiro");

        // now randomly add them to a queue
        while(!names.isEmpty())
        {
            // Get a random  dex of the element to remove from the list and add to the queue
            dex = gen.nextInt(names.size());

            ticketLineQueue.add(names.remove(dex));
        }

        // Now display the order of service:

        System.out.println(ticketLineQueue);

        while (!ticketLineQueue.isEmpty())
        {
            System.out.println(ticketLineQueue.remove() + " is serviced!");
            System.out.println(ticketLineQueue);
            System.out.println();
        }

    }
}
