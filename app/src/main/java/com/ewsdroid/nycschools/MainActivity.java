package com.ewsdroid.nycschools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.ewsdroid.nycschools.fragments.SchoolDetailsFragment;
import com.ewsdroid.nycschools.fragments.SchoolsListFragment;
import com.ewsdroid.nycschools.nycapi.domain.CallbackResponse;
import com.ewsdroid.nycschools.nycapi.model.NYCSchoolModel;
import com.ewsdroid.nycschools.nycapi.retrofit.NYCSchoolsApiCall;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MAINACTIVITY";
    FragmentTransaction ft;
    private CallbackResponse responseCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        responseCall = new CallbackResponse() {
            @Override
            public void callbackResponse(ArrayList<NYCSchoolModel> response) {
                Log.e(TAG, "CALLBACKRESPONSE = " + response.size());
                goToSchoolList(response);
            }
        };

        NYCSchoolsApiCall schoolsApiCall = new NYCSchoolsApiCall();
        schoolsApiCall.getNYCSchools(responseCall);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public void goToSchoolList(ArrayList<NYCSchoolModel> schoolListResponse){
        Log.e(TAG, "goToSchoolList = " + schoolListResponse.size());
        SchoolsListFragment fragment = new SchoolsListFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("model", schoolListResponse);
        fragment.setArguments(bundle);

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.schoolsFragment, fragment);
        ft.commit();
    }

    public void goToSchoolDetails(NYCSchoolModel model){
        SchoolDetailsFragment fragment = new SchoolDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("model", model);
        fragment.setArguments(bundle);

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.schoolsFragment, fragment);
        ft.commit();
    }
}
