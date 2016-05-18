package csm117.finalproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Handler;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void loginAuth(View v){
        Button btn = (Button)findViewById(R.id.button);
        btn.setBackgroundColor(0xFF438918);
        btn.setText("Authenticating...");
        Handler handler = new Handler();
        final Intent newIntent = new Intent(this, OptionScreen.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(newIntent);
            }
        }, 3000);

    }
}
