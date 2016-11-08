package com.startupmatters.nagarjuna.fragbst;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentB extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("onattach_in_fragb","OnAttach() in Fragemtn B invoked");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("oncreate_in_fragb","OnCreate() in Fragment b invoked");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        Log.i("onCretevie_fragb","OncreateVIew() invoked in Fragement B");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onstarti_fragb","onStart() invokde in Fragement B");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onresume_fragb","OnResume inovked in Frag B");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPausein_fragb","OnPuse invoked in Frag B");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("onstrop_fragb","Onstop() invoked in Frag B");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("ondestroyview_in_fragb","Ondestroy view in Frag B invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("ondestory_in_fragb","OnDestory invokde in Frag B");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("ondetach_in_fragb","OnDeatch invoked in Frag B");
    }

}
