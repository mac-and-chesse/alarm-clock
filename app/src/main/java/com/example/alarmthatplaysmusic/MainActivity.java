package com.example.alarmthatplaysmusic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity implements
        MainFragment.FragmentListener
{

    NavController nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav = Navigation.findNavController(this, R.id.fragment_container);
    }

    @Override
    protected void onPause() { // another activity is in foreground
        super.onPause();
    }

    @Override
    protected void onStop() { // activity is no longer visible
        super.onStop();
    }

    @Override
    protected void onDestroy() { // SIGTERM
        super.onDestroy();
    }


    @Override
    public void onFragmentInteraction() {

    }
}
