package Iterator;

public class MetalFriendArray implements Collection {

    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    Friend[] metalFriends;

    public MetalFriendArray()
    {
        metalFriends = new Friend[MAX_ITEMS];

        // Een aantal voorbeeld-metalvrienden
        addItem("Metalvriend Gabor");
        addItem("Metalvriend Erica");
        addItem("Metalvriend Arnout");
    }

    public void addItem(String str) {
        Friend friend = new Friend(str);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            metalFriends[numberOfItems] = friend;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator getIterator() {
        return new IteratorMetalFriendArray(metalFriends);
    }

}
