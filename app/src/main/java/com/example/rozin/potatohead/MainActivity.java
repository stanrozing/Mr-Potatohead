package com.example.rozin.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v ;
        if (checkbox.isChecked()) {
            checkbox.getText().toString();
        }
        ImageView image = (ImageView) findViewById(R.id.arms);
        Log.d("potato", "checkClicked");
    }

}
