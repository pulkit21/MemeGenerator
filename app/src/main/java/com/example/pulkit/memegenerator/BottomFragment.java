package com.example.pulkit.memegenerator;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment {

    private static TextView topTextView;
    private static TextView bottomTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container,false);

        topTextView = (TextView) view.findViewById(R.id.topTextView);
        bottomTextView = (TextView) view.findViewById(R.id.bottomTextView);
        return view;
    }

    public void setMemeText(String top, String bottom){
        topTextView.setText(top);
        bottomTextView.setText(bottom);
    }
}
