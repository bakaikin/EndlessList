package com.example.myapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private ListView list;
    private ListAdapter la;
    private List<Person> friends;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        list = (ListView) findViewById(R.id.lv);

        friends = new ArrayList<Person>();
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setName("Иван Петрович " + i);
            person.setBirth(System.currentTimeMillis() - 1000000000000L * i);
//            if (i % 2 == 0) {
            person.setEmail("email: " + i + "@mail.ru");
//            }
            person.setDoesAvatarExist(i % 3 == 0);
            person.setFavourite(i % 4 == 0);
            Random random = new Random();
            person.setTelephone("8-5555-555" + random.nextInt(10));
            friends.add(person);
        }

        la = new MyAdapter(this, friends);
        list.setAdapter(la);


    }
}
