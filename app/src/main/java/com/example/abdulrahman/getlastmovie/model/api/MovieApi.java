package com.example.abdulrahman.getlastmovie.model.api;

import com.example.abdulrahman.getlastmovie.model.data.ResponseBody;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieApi {

//   https://api.themoviedb.org/3/movie/popular?api_key=2495fce449c638ba314cdb240b0ef5cb&language=en-US&page=1
   @GET("/3/movie/popular")
   Call<ResponseBody> getPopularMovie(@Query("api_key") String api_key);


   @GET("/3/movie/top_rated")
   Call<ResponseBody> getTopRatedMovie(@Query("api_key") String api_key);


   @GET("/3/movie/upcoming")
   Call<ResponseBody> getUpComingMovie(@Query("api_key") String api_key);


   @GET("/3/movie/{id}/")
   Call<ResponseBody> getOneMovie(@Path("id") int movie_id,@Query("api_key") String api_key);
}
