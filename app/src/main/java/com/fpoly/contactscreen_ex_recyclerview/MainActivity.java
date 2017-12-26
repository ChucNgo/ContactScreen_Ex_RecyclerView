package com.fpoly.contactscreen_ex_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rc_list;
    private PersonAdapter adapter;
    private ArrayList<Person> arrPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrPerson = new ArrayList<>();

        arrPerson.add(new Person("Peter","man"));
        arrPerson.add(new Person("Mary","woman"));
        arrPerson.add(new Person("James","man"));
        arrPerson.add(new Person("David","man"));
        arrPerson.add(new Person("Sam","woman"));

        rc_list = (RecyclerView) findViewById(R.id.rc_friend_list);
        adapter = new PersonAdapter(this,arrPerson);



        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);

        rc_list.setLayoutManager(gridLayoutManager);
        rc_list.setHasFixedSize(true);

        // bao giờ cũng cuối cùng
        rc_list.setAdapter(adapter);
    }
}
