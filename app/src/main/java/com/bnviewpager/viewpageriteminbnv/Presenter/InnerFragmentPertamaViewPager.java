package com.bnviewpager.viewpageriteminbnv.Presenter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.bnviewpager.viewpageriteminbnv.R;
import com.bnviewpager.viewpageriteminbnv.View.FragmentTemanDalam1;
import com.bnviewpager.viewpageriteminbnv.View.FragmentTemanDalam2;

/*Tanggal Pengerjaan : 21/5/2019
  Nim                : 10116135
  Nama               : Rival Agung Fahrizal
  Kelas              : IF-3
* */

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InnerFragmentPertamaViewPager#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InnerFragmentPertamaViewPager extends Fragment {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    Button add;

    public InnerFragmentPertamaViewPager() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment
     * @return A new instance of fragment ViewPagerFragment.
     */
    public static InnerFragmentPertamaViewPager newInstance() {
        InnerFragmentPertamaViewPager fragment = new InnerFragmentPertamaViewPager();
        return fragment;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inner_pertama_view_pager, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.inner_viewpager2);
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);


        add= (Button) view.findViewById(R.id.tambah);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment FragmentTemanDalam2 = new FragmentTemanDalam2();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.inner_viewpager2, FragmentTemanDalam2).commit();
                Toast toast = Toast.makeText(getContext(), "tambah", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return view;
    }






    public static class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private static final int NUM_ITEMS = 2;

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0){
                return FragmentTemanDalam1.newInstance();
            }
            else {
                return FragmentTemanDalam2.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {

            if(position == 0){
                return FragmentTemanDalam1.PAGE_TITLE;
            }
            else {
                return FragmentTemanDalam2.PAGE_TITLE;
            }
        }
    }
}
