package Iterator;

public class IteratorMetalFriendArray implements Iterator {

    private Friend[] metalFriendList;

    int pos = 0;

    public IteratorMetalFriendArray(Friend[] metalFriendList) {
        this.metalFriendList = metalFriendList;
    }

    public Object next() {
        Friend friend = metalFriendList[pos];
        pos += 1;
        return friend;
    }

    @Override
    public boolean hasNext() {
        if (pos >= metalFriendList.length || metalFriendList[pos] == null) {
            return false;
        } else {
            return true;
        }
    }

}