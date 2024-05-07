package studentcsv;

import java.util.Date;

public class Student {
    private String name;
    private Date   birthday;
    private String id;
    private String gender;
    private String societyID;
    private String address;
    private String postcode;
    private String phone;
    private String school;
    private String classID;
    private String roomID;

    public Student(String name, Date birthday, String id,
                   String gender, String societyID, String address,
                   String postcode, String phone, String school,
                   String classID, String roomID) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
        this.gender = gender;
        this.societyID = societyID;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.school = school;
        this.classID = classID;
        this.roomID = roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSocietyID() {
        return societyID;
    }

    public void setSocietyID(String societyID) {
        this.societyID = societyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
}
