package com.ewsdroid.nycschools.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ewsdroid.nycschools.MainActivity;
import com.ewsdroid.nycschools.R;
import com.ewsdroid.nycschools.nycapi.model.NYCSchoolModel;
import com.ewsdroid.nycschools.recycleview.RecycleAdapter;

import java.util.ArrayList;

public class SchoolsListFragment extends Fragment {
    private final String TAG = "SCHOOLLISTFRAGMENT";
    private RecyclerView recyclerView;
    private ArrayList<NYCSchoolModel> schoolListResponse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schools_list, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        schoolListResponse = getArguments().getParcelableArrayList("model");
        Log.e(TAG, "onCreateVIew " + schoolListResponse.size());
        recyclerView = view.findViewById(R.id.recyclerview);

        RecycleAdapter adapter = new RecycleAdapter(schoolListResponse, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
