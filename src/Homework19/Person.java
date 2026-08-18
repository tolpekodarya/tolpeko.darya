package Homework19;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String phone;
    private String address;

    public Person(String firstName, String lastName, String city, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
        this.address = address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCity() { return city; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setCity(String city) { this.city = city; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %s, %s",
                firstName, lastName, city, phone, address);
    }
}