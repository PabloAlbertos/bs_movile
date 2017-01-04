package com.example.pabloalbertos.bs_movile;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.Call;

/**
 * Created by pabloalbertos on 04/01/17.
 */

public interface StackOverflowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<StackOverflowQuestions> loadQuestions(@Query("tagged") String tags);
}
