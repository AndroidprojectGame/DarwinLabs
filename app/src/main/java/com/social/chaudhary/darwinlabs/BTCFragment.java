package com.social.chaudhary.darwinlabs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BTCFragment extends Fragment {

    TextView tv_btc;
    ImageView iv_recive,iv_send,iv_bysell;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_btc, container, false);
        tv_btc=(TextView)view.findViewById(R.id.tv_btc);
        iv_recive=(ImageView)view.findViewById(R.id.iv_recive);
        iv_send=(ImageView)view.findViewById(R.id.iv_send);
        iv_bysell=(ImageView)view.findViewById(R.id.iv_byesell);
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

        iv_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),EnterpinActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
