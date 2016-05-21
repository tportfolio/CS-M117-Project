package csm117.finalproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group);
    }

    public void returnToGroupList(View v){
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, GroupList.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 1000);

    }
}
