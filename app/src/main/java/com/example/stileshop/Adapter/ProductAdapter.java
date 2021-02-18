package com.example.stileshop.Adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stileshop.Productdetails;
import com.example.stileshop.R;
import com.example.stileshop.model.Products;

import java.util.List;
import java.util.Locale;



public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<Products> productsList;

    TextView textv;



    public ProductAdapter(Context context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.products_row_item, parent, false);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder holder, final int position) {

        holder.prodImage.setImageResource(productsList.get(position).getImageUrl());
        holder.prodName.setText(productsList.get(position).getProductName());
        holder.prodQty.setText(productsList.get(position).getProductQty());
        holder.prodPrice.setText(productsList.get(position).getProductPrice());



        if(holder.prodName.getText().equals("Sobna lampa Zvezdano Nebo"))
        {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                   // textv.findViewById(R.id.prod_name);

                    //String naslov = productsList.get(position).getProductName();





                    Intent intent = new Intent(context,Productdetails.class);

                    //intent.putExtra("Zvezda", naslov);







                    //textv.getText().equals("Sobna lampa Zvezdano Nebo");




                    context.startActivity(intent);
                }
            });




        }
        if(holder.prodName.getText().equals("Organizator kljuceva"))
        {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // textv.findViewById(R.id.prod_name);

                    //String naslov = productsList.get(position).getProductName();





                    Intent intent = new Intent(context,Productdetails.class);


                    //intent.putExtra("Zvezda", naslov);







                    //textv.getText().equals("Sobna lampa Zvezdano Nebo");




                    context.startActivity(intent);
                }
            });




        }



        //holder.itemView.setOnClickListener(new View.OnClickListener() {
           // @Override
          //  public void onClick(View view) {

               // if(productsList.get(position).getProductName().equals("prod_name")){

                   // Intent intent = new Intent(context,Productdetails.class);

                   // context.startActivity(intent);
              //  }




                //Products pos = productsList.get(position);

                //Intent intent = new Intent(context,Productdetails.class);
                //intent.putExtra("image",pos.getImageUrl());
                //intent.putExtra("name",pos.getProductName());
                //context.startActivity(intent);





              /*  Intent i = new Intent(context, Productdetails.class);


                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                context.startActivity(i, activityOptions.toBundle()); */
    }
       // });


   // }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView prodImage;
        TextView prodName, prodQty, prodPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            prodImage = itemView.findViewById(R.id.prod_image);
            prodName = itemView.findViewById(R.id.prod_name);
            prodPrice = itemView.findViewById(R.id.prod_price);
            prodQty = itemView.findViewById(R.id.prod_qty);


        }
    }

}
