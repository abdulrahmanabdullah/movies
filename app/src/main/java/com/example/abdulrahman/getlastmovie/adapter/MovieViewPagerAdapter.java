package com.example.abdulrahman.getlastmovie.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abdulrahman.getlastmovie.R;
import com.example.abdulrahman.getlastmovie.model.Movie;

import java.util.List;

public class MovieViewPagerAdapter extends PagerAdapter {


    private Context mContext ;
    private List<Movie> mMovies ;



    public MovieViewPagerAdapter(Context context,List<Movie> list) {
        mContext = context ;
        mMovies = list ;

    }


    @Override
    public int getCount() {
        return mMovies.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o ;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_image,container,false);
        ImageView imageView = view.findViewById(R.id.slide_image_view);
        TextView textView = view.findViewById(R.id.title_text_view_slide);
        imageView.setImageResource(mMovies.get(position).getMovie_image());
        textView.setText(mMovies.get(position).getTitle());
        container.addView(view);
        return view ;
    }
}
