package com.gordonseto.fakeradio.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gordonseto.fakeradio.Fragments.MainFragment;
import com.gordonseto.fakeradio.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)manager.findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("foo", "bar");
            manager.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }
}
