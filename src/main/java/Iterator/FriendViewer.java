package Iterator;

public class FriendViewer {
    private Collection friendlist;

    public FriendViewer(Collection friendlist) {
        this.friendlist = friendlist;
    }

    public void printList()
    {
        Iterator iterator = friendlist.getIterator();
        System.out.println("--------- LISTVIEWER -----------");
        while (iterator.hasNext())
        {
            Friend item = (Friend)iterator.next();
            System.out.println(item.getFriendName());
        }
    }
}
