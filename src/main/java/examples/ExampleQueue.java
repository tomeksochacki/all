package examples;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Command> myCommands = new LinkedList<>();
        myCommands.add(new Command());
        myCommands.add(new Command());

        ExampleQueue2.fillQueue(myCommands);

        for (Command c:myCommands) {
            c.operation();
        }

        //System.out.println(myCommands);


    }
}
