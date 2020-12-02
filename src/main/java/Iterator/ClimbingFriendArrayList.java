package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ClimbingFriendArrayList implements Collection {

    List<Friend> climbingFriends;

    public ClimbingFriendArrayList() {
        climbingFriends = new ArrayList<>();

        // Een aantal voorbeeld-klimvrienden
        addItem("Klimvriend Nathan");
        addItem("Klimvriend Tim");
        addItem("Klimvriend Michel");
        addItem("Klimvriend Huub");

    }

    public void addItem(String str) {
        Friend friend = new Friend(str);
        climbingFriends.add(friend);
    }

    @Override
    public Iterator getIterator() {
        return new IteratorClimbingFriendArrayList(climbingFriends);
    }
}
