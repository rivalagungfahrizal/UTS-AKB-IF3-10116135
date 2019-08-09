package com.bnviewpager.viewpageriteminbnv.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnviewpager.viewpageriteminbnv.R;

/*Tanggal Pengerjaan : 21/5/2019
  Nim                : 10116135
  Nama               : Rival Agung Fahrizal
  Kelas              : IF-3
* */

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentKedua#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentKedua extends Fragment {


    public FragmentKedua() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment
     * @return A new instance of fragment FragmentKedua.
     */
    public static FragmentKedua newInstance() {
        FragmentKedua fragment = new FragmentKedua();
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
        return inflater.inflate(R.layout.fragment_kedua, container, false);
    }
}
