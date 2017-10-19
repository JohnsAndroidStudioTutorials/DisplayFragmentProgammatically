package com.sartainstudios.displayfragmentprogammatically;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create new fragment and transaction
        Fragment addedFragment = new AddedFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();


        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.fragment_container, addedFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();




    }
}
