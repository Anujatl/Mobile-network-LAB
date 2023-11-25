// MainActivity.java
package com.example.adap;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define a data source (array of strings)
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        // Get the ListView from the layout
        ListView listView = findViewById(R.id.listview);

        // Create an ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);

        // Set item click listener for the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Display a Toast message on item click
                showToast("You selected: " + data[position]);
            }
        });
    }

    private void showToast(String message) {
        // Display a Toast message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
