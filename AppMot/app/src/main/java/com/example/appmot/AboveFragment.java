package com.example.appmot;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboveFragment extends Fragment {



    private int Qualify;
    SendingData sendingData;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        sendingData = (SendingData) context ;
    }

    public AboveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AboveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AboveFragment newInstance(String param1, String param2) {
        AboveFragment fragment = new AboveFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view = inflater.inflate(R.layout.fragment_above, container, false);
        TextView tvQualify = view.findViewById(R.id.tvQualify);
        ImageButton imgAdd = view.findViewById(R.id.imgAdd);

        Qualify =Integer.parseInt(tvQualify.getText().toString());
        imgAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               Qualify++;
               tvQualify.setText(String.valueOf(Qualify));
               sendingData.sendData(String.valueOf(Qualify));
            }
        });
        ImageButton imgRe = view.findViewById(R.id.imgRemove);
        imgRe.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Qualify--;
                if(Qualify<0){
                    Qualify=0;
                }
                tvQualify.setText(String.valueOf(Qualify));
                sendingData.sendData(String.valueOf(Qualify));
            }
        });
        return view;

    }
}