package csm117.finalproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GroupView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_view);
    }

    public void viewUsers(View v){
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, UserList.class);
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

    public void viewTasks(View v){
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
