package com.example.umsun_android.databindingex;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.umsun_android.databindingex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.tvText1.setText("안녕");

        User user = new User("Junhee", "Lee");
        mainBinding.setUser(user);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSample:
                Toast.makeText(MainActivity.this, "눌림!!!!!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
