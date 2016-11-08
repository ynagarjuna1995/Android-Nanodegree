package com.startupmatters.nagarjuna.fragbst;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {

    FragmentManager mfragManager;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mfragManager = getFragmentManager();
        text = (TextView) findViewById(R.id.textView);
        mfragManager.addOnBackStackChangedListener(this);
    }

    public void addA(View view) {
        FragmentA fragA = new FragmentA();
        FragmentTransaction transaction = mfragManager.beginTransaction();
        transaction.add(R.id.group, fragA, "fragA");
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void addB(View view) {
        FragmentB fragB = new FragmentB();
        FragmentTransaction transaction = mfragManager.beginTransaction();
        transaction.add(R.id.group, fragB, "fragB");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeA(View view) {
        FragmentA fragmentA = (FragmentA) mfragManager.findFragmentByTag("fragA");
        if (fragmentA == null) {
            Toast.makeText(this, "Sorry Fragment A doesn't exists", Toast.LENGTH_SHORT).show();
        } else {
            FragmentTransaction transaction = mfragManager.beginTransaction();
            transaction.remove(fragmentA);
            transaction.addToBackStack("removeA");
            transaction.commit();
        }
    }

    public void removeB(View view) {
        FragmentB fragmentB = (FragmentB) mfragManager.findFragmentByTag("fragB");
        if (fragmentB == null) {
            Toast.makeText(this, "Sorry Fragment B doesn't exists", Toast.LENGTH_SHORT).show();
        } else {
            FragmentTransaction transaction = mfragManager.beginTransaction();
            transaction.remove(fragmentB);
            transaction.addToBackStack("removeB");
            transaction.commit();
        }
    }

    public void replaceAwithB(View view) {
        FragmentA fragA = (FragmentA) mfragManager.findFragmentByTag("fragA");
        if (fragA == null) {
            Toast.makeText(this, "Sorry Fragment A deosn't exist to repalce with B", Toast.LENGTH_SHORT).show();
        } else {
            /**
             *  Intializing the new Fragment object here will result in abnormal behaviour
             *  so always retrieve the fragent object by using tag or ID
             */
            FragmentB fragB = (FragmentB) mfragManager.findFragmentByTag("fragB");
            FragmentTransaction transaction = mfragManager.beginTransaction();
            transaction.replace(R.id.group, fragB);
            transaction.addToBackStack("replaceAwithB");
            transaction.commit();
        }

    }

    public void replaceBwithA(View view) {
        FragmentB fragB = (FragmentB) mfragManager.findFragmentByTag("fragB");
        if (fragB == null) {
            Toast.makeText(this, "Sorry Fragment B deosn't exist to repalce with B", Toast.LENGTH_SHORT).show();
        } else {
            FragmentA fragA = (FragmentA) mfragManager.findFragmentByTag("fragA");
            FragmentTransaction transaction = mfragManager.beginTransaction();
            transaction.replace(R.id.group, fragA);
            transaction.addToBackStack("replaceBwithA");
            transaction.commit();
        }

    }

    public void attachA(View view) {
        FragmentA fragA = (FragmentA) mfragManager.findFragmentByTag("fragA");
        if (fragA != null) {
            FragmentTransaction transaction = mfragManager.beginTransaction();
            transaction.attach(fragA);
            transaction.addToBackStack("attachA");
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment Object deosn't exists you need to pass the Fragment Object ", Toast.LENGTH_SHORT).show();
        }
    }

    public void detachB(View view) {
        FragmentB fragB = (FragmentB) mfragManager.findFragmentByTag("fragB");
        if (fragB != null) {
            FragmentTransaction transaction = mfragManager.beginTransaction();
            transaction.detach(fragB);
            transaction.addToBackStack("detachB");
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B deosn;t exists to detach", Toast.LENGTH_SHORT).show();
        }
    }

    public void back(View view) {

    }

    public void pop(View view) {

    }

    @Override
    public void onBackStackChanged() {
        text.setText(text.getText() + "\n");
        text.setText(text.getText() + "The current screen in Backstack is \n");

        int count = mfragManager.getBackStackEntryCount();
        for (int i = count - 1; i >= 0; i--) {
            FragmentManager.BackStackEntry entry = mfragManager.getBackStackEntryAt(i);
            text.setText(text.getText() + " " + entry.getName() + " \n");
        }

        text.setText(text.getText() + " \n");
    }
}