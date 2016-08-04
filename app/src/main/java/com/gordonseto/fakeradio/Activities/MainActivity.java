package com.gordonseto.fakeradio.Activities;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gordonseto.fakeradio.Fragments.DetailsFragment;
import com.gordonseto.fakeradio.Fragments.MainFragment;
import com.gordonseto.fakeradio.Fragments.StationsFragment;
import com.gordonseto.fakeradio.Model.Station;
import com.gordonseto.fakeradio.R;

public class MainActivity extends AppCompatActivity implements StationsFragment.OnFragmentInteractionListener {

    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager manager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)manager.findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("foo", "bar");
            manager.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void loadDetailsScreen(Station selectedStation) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_main, new DetailsFragment())
                .addToBackStack(null)
                .commit();
    }
}
