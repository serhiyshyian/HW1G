package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Serhiy","Syian");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);


    }
}