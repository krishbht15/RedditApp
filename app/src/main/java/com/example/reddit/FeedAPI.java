package com.example.reddit;

import com.example.reddit.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by User on 4/18/2017.
 */

public interface FeedAPI {

    String BASE_URL = "https://www.reddit.com/r/";

    //Non-static feed name
    @GET("{feed_name}/.rss")
    Call<Feed> getFeed(@Path("feed_name") String feed_name);

    //static feed name
//    @GET("earthporn/.rss")
//    Call<Feed> getFeed();
}
