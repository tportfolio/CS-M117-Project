package csm117.finalproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);
    }

    public void returnToTaskList(View v){
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, TaskList.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 1000);

    }
}
