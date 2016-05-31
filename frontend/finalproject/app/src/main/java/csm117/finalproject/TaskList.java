package csm117.finalproject;

import android.content.Context;
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
import org.apache.commons.io.IOUtils;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class TaskList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] my_tasks ={};
        String backend = "http://phpbackend-m117group.rhcloud.com/get_user_tasks.php";
        try {
            String json_url = IOUtils.toString(new URL(backend));
            JSONObject object = new JSONObject(json_url);
            JSONArray tasks = (JSONArray) object.get("my_tasks");
        }
        catch (MalformedURLException e) {
            System.err.println("bad url");
        }
        catch (IOException e) {
            System.err.println("bad io");
        }
        catch (JSONException e) {
            System.err.println("bad json");
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, my_tasks);
        final ListView listView = (ListView) findViewById(R.id.listView2);
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
                Button btn = (Button)findViewById(R.id.button13);
                btn.setTextColor(0xFFFFFFFF);

                Button btn2 = (Button)findViewById(R.id.button14);
                btn2.setTextColor(0xFFFFFFFF);

            }
        });
    }
    public void completeTask(View v){
        final String[] tasks = {};

        Handler handler = new Handler();
        Button btn = (Button)findViewById(R.id.button13);
        btn.setTextColor(0xFF000000);

        Button btn2 = (Button)findViewById(R.id.button14);
        btn2.setTextColor(0xFF000000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(TaskList.this, android.R.layout.simple_list_item_1, tasks);
                final ListView listView = (ListView) findViewById(R.id.listView2);
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        }, 500);

    }

}
