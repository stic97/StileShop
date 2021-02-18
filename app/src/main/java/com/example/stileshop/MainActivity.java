package com.example.stileshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import com.example.stileshop.Adapter.ProductAdapter;
import com.example.stileshop.Adapter.ProductCategoryAdapter;
import com.example.stileshop.model.ProductCategory;
import com.example.stileshop.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Trending"));
        productCategoryList.add(new ProductCategory(2, "Most Popular"));
        productCategoryList.add(new ProductCategory(3, "Sort by Quantity"));
        productCategoryList.add(new ProductCategory(4, "Sort by Price"));


        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Sobna lampa Zvezdano Nebo", "4", "1.270 RSD", R.drawable.prod2));
        productsList.add(new Products(2, "Organizator kljuceva", "4", "750 RSD", R.drawable.prod1));
        productsList.add(new Products(3, "Projektor pahuljica", "7", "2.490 RSD", R.drawable.prod3));
        productsList.add(new Products(4, "Bezkontaktni toplomer", "3", "2.490 RSD", R.drawable.prod4));
        productsList.add(new Products(5, "Led sijalica sa efektom vatre", "1", "950 RSD", R.drawable.prod5));
        productsList.add(new Products(6, "Ventil kapci za auto", "1", "890 RSD", R.drawable.prod6));
        productsList.add(new Products(7, "Led silikonska traka 5m bela", "1", "1.070 RSD", R.drawable.prod7));
        productsList.add(new Products(8, "VR BOX naocare 2.0 3D", "1", "1.500 RSD", R.drawable.prod8));
        productsList.add(new Products(9, "BT transmiter za auto", "1", "890 RSD", R.drawable.prod9));
        productsList.add(new Products(10, "Projektor RG Novogodisnji", "4", "2.490 RSD", R.drawable.prod10));
        productsList.add(new Products(11, "Bluetooth Dzojstik", "1", "1.890 RSD", R.drawable.prod11));
        productsList.add(new Products(12, "Konzola sa 620 igrica", "1", "2.190 RSD", R.drawable.prod12));
        productsList.add(new Products(13, "Pretvarac napona 20A", "1", "1.800 RSD", R.drawable.prod13));
        productsList.add(new Products(14, "Lampa MOON LIGHT", "1", "2.190 RSD", R.drawable.prod14));
        productsList.add(new Products(15, "Led zavesa bela 3x6", "1", "3.390 RSD", R.drawable.prod15));
        productsList.add(new Products(16, "Elektricna skara za rostilj", "1", "2.580 RSD", R.drawable.prod16));
        productsList.add(new Products(16, "Smart watch - model T8", "2", "2.190 RSD", R.drawable.prod17));





        setProdItemRecycler(productsList);





    }
    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);

    }
    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }
}
