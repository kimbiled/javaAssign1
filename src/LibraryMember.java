public class LibraryMember {
    private String name;
    private String memberId;

    // Constructor
    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "LibraryMember{name='" + name + "', memberId='" + memberId + "'}";
    }
}
