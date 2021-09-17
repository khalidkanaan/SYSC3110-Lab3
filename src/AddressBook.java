import java.util.ArrayList;

public class AddressBook {

    private static ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String args[]){
        BuddyInfo khalid = new BuddyInfo("Khalid", "Bank St.", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(khalid);
        addressBook.removeBuddy(khalid);
    }
}
