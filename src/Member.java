
public class Member {
    private final int memberId;
    private final String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Member ID: " + memberId
                + " | Name: " + name);
    }
}
