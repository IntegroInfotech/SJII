package com.integro.sjii.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.integro.sjii.R;
import com.integro.sjii.models.Faculty;

import java.util.ArrayList;

public class FacultyAdapter extends RecyclerView.Adapter<FacultyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Faculty> facultyArrayList;

    public FacultyAdapter(Context context, ArrayList<Faculty> facultyArrayList) {
        this.context = context;
        this.facultyArrayList = facultyArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_faculty, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Faculty faculty = facultyArrayList.get(position);

        Glide.with(context)
                .load(faculty.getImage())
                .into(holder.ivImage);

        holder.tvTitle.setText(faculty.getName());
        holder.tvDescription.setText(faculty.getDesignation());
        holder.tvInstitutions.setText(faculty.getInstitution());

    }

    @Override
    public int getItemCount() {
        return facultyArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivImage;
        private TextView tvInstitutions;
        private TextView tvTitle;
        private TextView tvDescription;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImage = itemView.findViewById(R.id.ivImage);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvInstitutions = itemView.findViewById(R.id.tvInstitutions);
        }
    }
}
