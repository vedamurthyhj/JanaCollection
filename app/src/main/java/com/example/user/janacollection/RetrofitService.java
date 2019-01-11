package com.example.user.janacollection;

import com.example.user.janacollection.model.Jana;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("api/CollectionLIst/")
    Call<List<Jana>> getNoticeData(@Query("JCCode") long JCCode,@Query("Date") String date);
}
