package Iterator;

import java.util.List;

public class IteratorClimbingFriendArrayList implements Iterator {

    private List<Friend> climbingFriendList;

    private int pos = 0;

    public IteratorClimbingFriendArrayList(List<Friend> climbingFriendList) {
        this.climbingFriendList = climbingFriendList;
    }

    public Object next() {
        Friend friend = climbingFriendList.get(pos);
        pos += 1;
        return friend;
    }

    @Override
    public boolean hasNext() {
        return pos < climbingFriendList.size() && climbingFriendList.get(pos) != null;
    }
}
