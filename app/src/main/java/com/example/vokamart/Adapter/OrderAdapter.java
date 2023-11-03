package com.example.vokamart.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vokamart.Models.Pesanan;
import com.example.vokamart.R;

import java.util.List;

//public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {
//    private List<Pesanan> orderList;
//    private String filterStatus;
//
//    public OrderAdapter(List<Pesanan> orderList, String filterStatus) {
//        this.orderList = orderList;
//        this.filterStatus = filterStatus;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder() {
//        return onCreateViewHolder(null, 0);
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_pesanan, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Pesanan item = orderList.get(position);
//        // Check if the item matches the filter status
//        if (item.getOrderStatus().equals(filterStatus)) {
//            holder.bind(item);
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        int count = 0;
//        for (Pesanan item : orderList) {
//            if (item.getOrderStatus().equals(filterStatus)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        private TextView orderIdTextView;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            orderIdTextView = itemView.findViewById(R.id.order_id_text);
//        }
//
//        public void bind(Pesanan item) {
//            orderIdTextView.setText(item.getOrderId());
//        }
//    }
//}