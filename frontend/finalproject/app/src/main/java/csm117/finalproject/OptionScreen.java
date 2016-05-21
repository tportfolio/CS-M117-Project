package csm117.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Handler;
import android.widget.Button;

public class OptionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_screen);
    }

    public void viewGroupList(View v){
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, GroupList.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 1000);

    }

    public void viewTaskList(View v){
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, TaskList.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 1000);

    }

    public void createGroup(View v){
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, CreateGroup.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 1000);

    }

    public void createTask(View v){
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, CreateTask.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 1000);

    }

}
