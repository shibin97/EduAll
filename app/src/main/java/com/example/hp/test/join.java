package com.example.hp.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.test.R;

/**
 * Created by Belal on 18/09/16.
 */


public class join extends Fragment {
    View parentHolder;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        parentHolder = inflater.inflate(R.layout.start, container, false);
        Intent i =new Intent(getActivity(),abc1.class);
        startActivity(i);
        return parentHolder;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Join Campaign");
    }
}
