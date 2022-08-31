package com.ewsdroid.nycschools.nycapi.retrofit;

import com.ewsdroid.nycschools.nycapi.model.NYCSchoolModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NYCApiService  {
@GET("resource/s3k6-pzi2.json")
    Call<ArrayList<NYCSchoolModel>> getNYCSchools();
}