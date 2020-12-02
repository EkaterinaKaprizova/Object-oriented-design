package Iterator;

import java.util.Stack;

public class ClimbingFriendStack implements Collection {

    Stack<Friend> stack;


    public ClimbingFriendStack() {
        stack = new Stack<>();
        stack.push(new Friend("Mark"));
        stack.push(new Friend("Stefan"));
        stack.push(new Friend("Wolfgang"));
        stack.push(new Friend("Lynn"));
        stack.push(new Friend("Pit"));
    }

    @Override
    public Iterator getIterator() {
        return new IteratorClimbingFriendStack(stack);
    }
}
