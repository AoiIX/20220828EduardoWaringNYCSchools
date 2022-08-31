package com.ewsdroid.nycschools.nycapi.retrofit;

import android.util.Log;

import androidx.annotation.NonNull;

import com.ewsdroid.nycschools.nycapi.domain.CallbackResponse;
import com.ewsdroid.nycschools.nycapi.model.NYCSchoolModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NYCSchoolsApiCall {
    private final String TAG = "NYCSCHOOLSAPICALL";
    private static final String BaseUrl = "https://data.cityofnewyork.us/";

    public void getNYCSchools(final CallbackResponse callbackResponse) {
        Log.e(TAG, "GETSCHOOLS1");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NYCApiService service = retrofit.create(NYCApiService.class);
        Call<ArrayList<NYCSchoolModel>> call = service.getNYCSchools();
        call.enqueue(new Callback<ArrayList<NYCSchoolModel>>() {
            @Override
            public void onResponse(@NonNull Call<ArrayList<NYCSchoolModel>> call,
                                   @NonNull Response<ArrayList<NYCSchoolModel>> response) {
                if (response.code() == 200) {
                    ArrayList<NYCSchoolModel> schoolsResponse = response.body();
                    assert schoolsResponse != null;

                    callbackResponse.callbackResponse(schoolsResponse);
                }
            }

            @Override
            public void onFailure(@NonNull Call<ArrayList<NYCSchoolModel>> call, @NonNull Throwable t) {
                Log.e(TAG, "FAIL " + t.getMessage());
            }
        });
    }
}
