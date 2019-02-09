package com.example.abdulrahman.getlastmovie.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.example.abdulrahman.getlastmovie.R;
import com.example.abdulrahman.getlastmovie.adapter.MovieViewPagerAdapter;
import com.example.abdulrahman.getlastmovie.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieFragment extends Fragment {

    private ViewPager mViewPager ;
    private TabLayout mTabLayout ;
    private List<Movie> mMovies ;
    private MovieViewPagerAdapter mAdapter ;

    public static MovieFragment newInstance(){
        return new MovieFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        mViewPager = view.findViewById(R.id.view_pager);
        mTabLayout = view.findViewById(R.id.tab_layout_slider);
        mMovies = new ArrayList<>();
        mMovies.add(new Movie(R.drawable.android_img,"Android \n best device"));
        mMovies.add(new Movie(R.drawable.vim,"Vim \n best Editor"));
        mMovies.add(new Movie(R.drawable.python,"Python \n This image can't rn"));
        mAdapter = new MovieViewPagerAdapter(getActivity(),mMovies);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager,true);
        return view;
    }
}
