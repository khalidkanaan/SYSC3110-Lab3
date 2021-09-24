import java.util.ArrayList;

public class AddressBook { //This comment is an edit that was made on the github website

    private static ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String args[]){
        BuddyInfo khalid = new BuddyInfo("Khalid", "Bank St.", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(khalid);
        addressBook.removeBuddy(0);
    }
}
