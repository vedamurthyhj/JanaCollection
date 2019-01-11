package com.example.user.janacollection;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.janacollection.model.Jana;

import java.util.List;

public class JanaAdapter extends RecyclerView.Adapter<JanaAdapter.NoticeViewHolder> {


    private List<Jana> dataList;

    public JanaAdapter(List<Jana> dataList) {
        this.dataList = dataList;
    }


    @Override
    public NoticeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.roe_item, parent, false);
        return new NoticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoticeViewHolder holder, int position) {
        holder.id.setText(dataList.get(position).getCREC_ID());
        holder.house.setText(dataList.get(position).getCollection_MC_Name());
        holder.number.setText(dataList.get(position).getCollection_MC_Code());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class NoticeViewHolder extends RecyclerView.ViewHolder {

        TextView id, house, number;

        NoticeViewHolder(View itemView) {
            super(itemView);
            id =  itemView.findViewById(R.id.id);
            house =  itemView.findViewById(R.id.house);
            number =  itemView.findViewById(R.id.number);
        }
    }
}
