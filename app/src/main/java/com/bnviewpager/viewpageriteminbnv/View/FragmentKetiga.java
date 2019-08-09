package com.bnviewpager.viewpageriteminbnv.View;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.bnviewpager.viewpageriteminbnv.R;

/*Tanggal Pengerjaan : 21/5/2019
  Nim                : 10116135
  Nama               : Rival Agung Fahrizal
  Kelas              : IF-3
* */

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentKetiga#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentKetiga extends Fragment {

    ImageButton btn;
    public FragmentKetiga() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment
     * @return A new instance of fragment FragmentKedua.
     */
    public static FragmentKetiga newInstance() {
        FragmentKetiga fragment = new FragmentKetiga();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ketiga, container, false);
        btn = (ImageButton) view.findViewById(R.id.buttonfb);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW",
                        Uri.parse("https://www.facebook.com/rival.fafurizaru"));
                startActivity(intent);
            }
        });
        return view;
    }
}
