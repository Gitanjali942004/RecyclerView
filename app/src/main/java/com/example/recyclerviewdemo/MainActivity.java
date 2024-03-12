package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button b=findViewById(R.id.btn);
        EditText n=findViewById(R.id.nm);
        EditText m=findViewById(R.id.mb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                arrContacts.add(new ContactModel(n.getText().toString(),m.getText().toString()));
            }
        });
        arrContacts.add(new ContactModel("Gita","7066784426"));
        arrContacts.add(new ContactModel("Sita","7066784426"));
        arrContacts.add(new ContactModel("Akku","7066784426"));
        arrContacts.add(new ContactModel("Monal","7066784426"));
        arrContacts.add(new ContactModel("Nama","7066784426"));
        arrContacts.add(new ContactModel("Shubham","7066784426"));
        arrContacts.add(new ContactModel("Rupesh","7066784426"));
        arrContacts.add(new ContactModel("Om","7066784426"));
        arrContacts.add(new ContactModel("Vivek","7066784426"));
        arrContacts.add(new ContactModel("Rutuja","7066784426"));
        arrContacts.add(new ContactModel("Harsha","7066784426"));
        arrContacts.add(new ContactModel("Shhruti","7066784426"));

        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

    }
}