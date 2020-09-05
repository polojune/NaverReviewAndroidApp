package com.cos.review.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cos.review.R;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {

    private  static final String TAG = "ProductAdapter";
    private List<Product> products = new ArrayList<>();

    public void setProducts(List<Product> prodcuts) {
        this.products = prodcuts;
    }

    class ProductHolder extends RecyclerView.ViewHolder{

        private ContainerItemBinding containerItemBinding;

        public ProductHolder(@NonNull ContainerItemBinding containerItemBinding) {
            super(containerItemBinding.getRoot());
            this.containerItemBinding = containerItemBinding;
        }
    }
    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       ContainerItemBinding containerItemBinding = DataBindingUtil.inflate(
               LayoutInflater.from(parent.getContext()),
               R.layout.container_item,
               parent,
               false
       );

        return new ProductHolder(containerItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        Product product = products.get(position);
        holder.containerItemBinding.setProduct(product); //레이아웃 xml에 오브젝트 투입

    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}

