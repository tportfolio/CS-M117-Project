package csm117.finalproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import org.json.*;
import java.io.*;
import java.util.*;

public class AssignUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_user);
        String[] users = {};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, users);
        final ListView listView = (ListView) findViewById(R.id.listView5);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //stack overflow
                for (int i = 0; i < listView.getChildCount(); i++) {
                    if (position == i)
                        listView.getChildAt(i).setBackgroundColor(Color.DKGRAY);
                    else
                        listView.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
                }
                Button btn = (Button)findViewById(R.id.button11);
                btn.setBackgroundColor(0xFF438918);
            }
        });
    }
    public void returnToGroupTasks(View v) {
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, TaskView.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 1000);
    }
}
