package Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- 1 -----\n");

        MetalFriendArray mfa = new MetalFriendArray();
        FriendViewer viewer1 = new FriendViewer(mfa);
        viewer1.printList();


        System.out.println("\n----- 2 -----\n");

        ClimbingFriendArrayList cfal = new ClimbingFriendArrayList();
        FriendViewer viewer2 = new FriendViewer(cfal);
        viewer2.printList();


        System.out.println("\n----- 3 -----\n");
        ClimbingFriendStack cfs = new ClimbingFriendStack();
        FriendViewer viewer3 = new FriendViewer(cfs);
        viewer3.printList();
    }

}
