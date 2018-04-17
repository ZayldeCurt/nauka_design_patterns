package com.sda.builder;

public class User {
    private String firstName;
    private String lastName;
    private String bithDate;
    private String phoneNumber;

    public User() {
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private String bithDate;
        private String phoneNumber;

        public User build(){
            User user = new User();
            user.setFirstName(this.firstName);
            user.setLastName(this.lastName);
            user.setBithDate(this.phoneNumber);
            user.setPhoneNumber(this.bithDate);

            return user;
        }
        public UserBuilder firstName(String value){
            this.firstName = value;
            return this;
        }
        public UserBuilder lastName(String value){
            this.lastName = value;
            return this;
        }
        public UserBuilder bithDate(String value){
            this.bithDate = value;
            return this;
        }
        public UserBuilder phoneNumber(String value){
            this.phoneNumber = value;
            return this;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBithDate() {
        return bithDate;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
