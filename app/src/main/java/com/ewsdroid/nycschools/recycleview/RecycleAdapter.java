package com.ewsdroid.nycschools.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.ewsdroid.nycschools.MainActivity;
import com.ewsdroid.nycschools.R;
import com.ewsdroid.nycschools.nycapi.model.NYCSchoolModel;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private final String TAG = "RECYCLERADAPTER";
    private ArrayList<NYCSchoolModel> schoolList;
    private Context mContext;

    public RecycleAdapter(ArrayList<NYCSchoolModel> schoolList, Context context) {
        this.schoolList = schoolList;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_school, parent, false);

        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final NYCSchoolModel schoolData = schoolList.get(position);
        holder.tvSchoolName.setText(schoolData.schoolName);
        holder.tvLocation.setText(schoolData.location);
        holder.tvDistrict.setText(schoolData.councilDistrict);
        holder.tvOverview.setText(schoolData.overviewParagraph);
        holder.tvNeighborhood.setText(schoolData.neighborhood);
        holder.tvCity.setText(schoolData.city);

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSchoolDetails(schoolData);
            }
        });
    }

    private void showSchoolDetails(NYCSchoolModel listModel) {
        ((MainActivity) mContext).goToSchoolDetails(listModel);
    }

    @Override
    public int getItemCount() {
        return schoolList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSchoolName;
        public TextView tvLocation;
        public TextView tvDistrict;
        public TextView tvOverview;
        public TextView tvNeighborhood;
        public TextView tvCity;
        public ConstraintLayout layout;
        public View itemView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.tvSchoolName = itemView.findViewById(R.id.tvSchoolName);
            this.tvLocation = itemView.findViewById(R.id.tvLocation);
            this.tvDistrict = itemView.findViewById(R.id.tvDistrict);
            this.tvOverview = itemView.findViewById(R.id.tvOverview);
            this.tvNeighborhood = itemView.findViewById(R.id.tvNeighborhood);
            this.tvCity = itemView.findViewById(R.id.tvCity);
            this.itemView = itemView;
            this.layout = itemView.findViewById(R.id.layout);
        }
    }
}
