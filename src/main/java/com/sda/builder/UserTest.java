package com.sda.builder;

public class UserTest {
    public static void main(String[] args) {
//        User user = new User();
//        user.setBithDate("kiedysTam");
//        user.setFirstName("Michał");
//        user.setLastName("Wordowski");
//        user.setPhoneNumber("sadsadsad");

        User user = User.builder().firstName("Jacek").lastName("Przypadek").phoneNumber("123456").bithDate("789456").build();

//        UserWithLombok user2 = new UserWithLombok();
//        user2.setFirstName("Janusz");
        UserWithLombok user2 = new UserWithLombok.UserWithLombokBuilder().firstName("asdafsa").build();

    }
}
