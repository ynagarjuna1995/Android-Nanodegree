package com.startupmatters.nagarjuna.fragbst;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("onattach_in_fraga","OnAttach() in Fragemtn A invoked");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("oncreate_in_fragb","OnCreate() in Fragment A invoked");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_a,container,false);
        Log.i("onCretevie_fraga","OncreateVIew() invoked in Fragement A");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onstarti_fraga","onStart() invokde in Fragement A");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onresume_fragA","OnResume inovked in Frag A");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPausein_fraga","OnPuse invoked in Frag A");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("onstrop_fraga","Onstop() invoked in Frag A");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("ondestroyview_in_fraga","Ondestroy view in Frag A invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("ondestory_in_fraga","OnDestory invokde in Frag A");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("ondetach_in_fraga","OnDeatch invoked in Frag A");
    }
}
