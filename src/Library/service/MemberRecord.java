package Library.service;

import java.util.Date;

public class MemberRecord {
    private long memberID;
    private MemberType type;
    private String dateOfMemberShip;
    private int noBooksIssued;
    private final int maxBookLimit=5;
    private String name;
    private String address;
    private String phone;

    public MemberRecord(long memberID, MemberType type, String dateOfMemberShip, String name, String address, String phone) {
        this.memberID = memberID;
        this.type = type;
        this.dateOfMemberShip = dateOfMemberShip;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public long getMemberID() {
        return memberID;
    }

    public MemberType getType() {
        return type;
    }

    public String getDateOfMemberShip() {
        return dateOfMemberShip;
    }

    public int getNoBooksIssued() {
        return noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    public void incrementBooksIssued(){//alınan kitap sayısını arttırma
        if(this.noBooksIssued<maxBookLimit){
            noBooksIssued++;
        }
        else{
            System.out.println("Kitap alma limitini aştınız.");
        }
    }
    public void decrementBooksIssued(){
        if(this.noBooksIssued>0){
            noBooksIssued--;
        }
        else{
            System.out.println("Ödünç alınan kitap yok.");
        }
    }
}
