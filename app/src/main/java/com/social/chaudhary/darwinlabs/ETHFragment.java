package com.social.chaudhary.darwinlabs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ETHFragment extends Fragment {

    ImageView iv_recive,iv_send;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_eth, container, false);
        iv_recive=(ImageView)view.findViewById(R.id.iv_recive);
        iv_send=(ImageView)view.findViewById(R.id.iv_send);
        iv_recive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ReciveActivity.class);
                startActivity(intent);
            }
        });

        iv_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),SendActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
