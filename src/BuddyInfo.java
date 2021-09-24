public class BuddyInfo {

    private String name;
    private String Address;
    private String phoneNumber;

    public BuddyInfo(String name, String Address, String phoneNumber) {
        this.name = name;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");;
        System.out.println("Hello " + buddy.getName());
        System.out.println("Hello world");
    }
}
