package org.korndev;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Гомер";
        post.passport = "1234 №123456";
        post.patronymic = "Абрахамович";
        post.phone = "+1 (939)-555-0113";
        post.surname = "Симпсон";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = "12";
        post.birthday.month = "May";
        post.birthday.year = "1956";
    }
}