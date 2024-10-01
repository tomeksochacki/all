package examples;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue2 {
    public static Queue<Command> fillQueue(Queue<Command> commands){
        Queue<Command> queue = new LinkedList<>();
        queue.addAll(commands);
        return queue;
    }
}
