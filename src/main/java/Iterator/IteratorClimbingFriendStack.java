package Iterator;

import java.util.Stack;

public class IteratorClimbingFriendStack implements Iterator {

    Stack<Friend> stack;

    public IteratorClimbingFriendStack(Stack<Friend> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return stack.pop();
    }
}
