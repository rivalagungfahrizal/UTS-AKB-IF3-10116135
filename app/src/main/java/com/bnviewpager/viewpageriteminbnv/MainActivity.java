package com.bnviewpager.viewpageriteminbnv;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.bnviewpager.viewpageriteminbnv.Model.ViewPagerFragment;
import com.bnviewpager.viewpageriteminbnv.Presenter.InnerFragmentPertamaViewPager;
import com.bnviewpager.viewpageriteminbnv.View.FragmentKedua;
import com.bnviewpager.viewpageriteminbnv.View.FragmentKetiga;

/*Tanggal Pengerjaan : 21/5/2019
  Nim                : 10116135
  Nama               : Rival Agung Fahrizal
  Kelas              : IF-3
* */

public class MainActivity extends AppCompatActivity {
    public static final String FRAGMENT_VIEWPAGER = "FRAGMENT_VIEWPAGER";
    public static final String FRAGMENT_FIRST = "FRAGMENT_FIRST";
    public static final String FRAGMENT_SECOND = "FRAGMENT_SECOND";
    public static final String FRAGMENT_THIRD = "FRAGMENT_THIRD";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    replaceFragment(InnerFragmentPertamaViewPager.newInstance(),FRAGMENT_FIRST);
                    return true;
                case R.id.navigation_profile:
                    replaceFragment(FragmentKedua.newInstance(),FRAGMENT_SECOND);
                    return true;
                case R.id.navigation_contact:
                    replaceFragment(FragmentKetiga.newInstance(),FRAGMENT_THIRD);
                    return true;
                case R.id.navigation_friend_list:
                    replaceFragment(ViewPagerFragment.newInstance(),FRAGMENT_VIEWPAGER);
                    return true;

            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container, ViewPagerFragment.newInstance(), FRAGMENT_VIEWPAGER)
                .commit();
    }



    private void replaceFragment(Fragment newFragment, String tag) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, newFragment, tag)
                .commit();

    }



}
