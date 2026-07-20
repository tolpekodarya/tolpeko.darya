package Homework10;

import java.util.Objects;

public class User {

    private String username;
    private String email;
    private int age;
    private boolean isActive;
    public User(String username, String email, int age, boolean isActive) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.isActive = isActive;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, age, isActive);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        return age == other.age && isActive == other.isActive &&
                Objects.equals(username, other.username) && Objects.equals(email, other.email);
    }
}
