package csm117.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.apache.commons.io.IOUtils;
import org.json.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class GroupList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] groups ={};

        String backend = "http://phpbackend-m117group.rhcloud.com/get_group_ID.php";
        try {
            String json_url = IOUtils.toString(new URL(backend));
            JSONObject object = new JSONObject(json_url);
            JSONArray grouplists = (JSONArray) object.get("groups");
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
        setContentView(R.layout.activity_group_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, groups);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(view.getContext(), GroupView.class);
                startActivity(intent);
            }
        });
    }
}
