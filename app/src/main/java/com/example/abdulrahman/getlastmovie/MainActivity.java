package com.example.abdulrahman.getlastmovie;

import android.support.v4.app.Fragment;

import com.example.abdulrahman.getlastmovie.fragments.MovieFragment;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return MovieFragment.newInstance();
    }
}
