package com.ewsdroid.nycschools.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.ewsdroid.nycschools.R;
import com.ewsdroid.nycschools.nycapi.model.NYCSchoolModel;

public class SchoolDetailsFragment extends Fragment {
    private final String TAG = "SCHOOLDETAILSFRAGMENT";
    private final String TAB_DETAILS = "Details";
    private final String TAB_ADDRESS = "Address";
    private final String TAB_CONTACT = "Contact";

    private NYCSchoolModel model;
    private TextView tvSchoolName;
    private TextView tvOverviewParagraph;
    private TextView tvAcademicOpportunities1;
    private TextView tvAcademicOpportunities2;

    private TextView tvNeighborhood;
    private TextView tvLocation;
    private TextView tvDirections1;
    private TextView tvCity;

    private TextView tvPhoneNumber;
    private TextView tvFaxNumber;
    private TextView tvSchoolEmail;
    private TextView tvWebsite;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details_tabhost, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        model = getArguments().getParcelable("model");

        TabHost tabhost = view.findViewById(R.id.tabhost);
        tabhost.setup();

        TabHost.TabSpec spec = tabhost.newTabSpec(TAB_DETAILS);
        spec.setContent(R.id.tabDetails);
        spec.setIndicator(TAB_DETAILS);
        tabhost.addTab(spec);

        spec = tabhost.newTabSpec(TAB_ADDRESS);
        spec.setContent(R.id.tabAddress);
        spec.setIndicator(TAB_ADDRESS);
        tabhost.addTab(spec);

        spec = tabhost.newTabSpec(TAB_CONTACT);
        spec.setContent(R.id.tabContact);
        spec.setIndicator(TAB_CONTACT);
        tabhost.addTab(spec);

        loadDetailsTab(view);
        loadAddressTab(view);
        loadContactTab(view);
    }

    private void loadDetailsTab(View view){
        tvSchoolName = view.findViewById(R.id.tvSchoolName);
        tvOverviewParagraph = view.findViewById(R.id.tvOverviewParagraph);
        tvAcademicOpportunities1 = view.findViewById(R.id.tvAcademicOpportunities1);
        tvAcademicOpportunities2 = view.findViewById(R.id.tvAcademicOpportunities2);

        tvSchoolName.setText(model.schoolName);
        tvOverviewParagraph.setText(model.overviewParagraph);
        tvAcademicOpportunities1.setText(model.academicOpportunities1);
        tvAcademicOpportunities2.setText(model.academicOpportunities2);
    }

    private void loadAddressTab(View view){
        tvNeighborhood = view.findViewById(R.id.tvNeighborhood);
        tvLocation = view.findViewById(R.id.tvLocation);
        tvDirections1 = view.findViewById(R.id.tvDirections1);
        tvCity = view.findViewById(R.id.tvCity);

        tvNeighborhood.setText(model.neighborhood);
        tvLocation.setText(model.location);
        tvDirections1.setText(model.directions1);
        tvCity.setText(model.city);
    }

    private void loadContactTab(View view){
        tvPhoneNumber = view.findViewById(R.id.tvPhoneNumber);
        tvFaxNumber = view.findViewById(R.id.tvFaxNumber);
        tvSchoolEmail = view.findViewById(R.id.tvSchoolEmail);
        tvWebsite = view.findViewById(R.id.tvWebsite);

        tvPhoneNumber.setText(model.phoneNumber);
        tvFaxNumber.setText(model.faxNumber);
        tvSchoolEmail.setText(model.schoolEmail);
        tvWebsite.setText(model.website);
    }
}
