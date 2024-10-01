package examples;

import java.util.LinkedList;

public class Stack<String> {
    private LinkedList<String> linkedList = new LinkedList<>();

    public void push(String string) {
        linkedList.add(string);
    }

    public String peek() {
        return linkedList.getFirst();
    }

    public String pop() {
        return linkedList.pop();
    }

    public boolean empty() {
        return linkedList.isEmpty();
    }

    @Override
    public java.lang.String toString() {
        return "example.Stack{" +
                "linkedList=" + linkedList +
                '}';
    }

}
