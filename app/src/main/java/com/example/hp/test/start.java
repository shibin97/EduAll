
package com.example.hp.test;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hp.test.R;

/**
 * Created by Belal on 18/09/16.
 */


public class start extends Fragment {
    View parentHolder;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        parentHolder = inflater.inflate(R.layout.start, container, false);

       //Button btn;
        //btn = (Button) parentHolder.findViewById(R.id.GO);
       // btn.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {

                Intent i =new Intent(getActivity(),child_reg.class);
                startActivity(i);


            //}
        //});
        return parentHolder;
    }
  /*  public void goToAttract(View v)
    {
        Intent intent = new Intent(getActivity(), child_reg.class);
        startActivity(intent);
    }*/

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Start campaign");
    }
}

