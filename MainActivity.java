package com.example.learningenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec;
    ArrayList<String> word = new ArrayList<>(Arrays.asList("Molly", "Hello"));
    private EditText link;
    private Button take;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec = findViewById(R.id.rec);
        link = findViewById(R.id.link);
        take = findViewById(R.id.takeButton);

        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        rec.setLayoutManager(manager);

        MyListAdapter adapter = new MyListAdapter(word, MainActivity.this);

        rec.setAdapter(adapter);

        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String youTube = link.getText().toString();
                Toast.makeText(MainActivity.this, "Your link ->>" + youTube, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
