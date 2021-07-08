package com.example.mymarketlist.ui.addItemToExistShoppingCart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mymarketlist.R;
import com.example.mymarketlist.model.Category;
import com.example.mymarketlist.model.Item;
import com.example.mymarketlist.model.Model;
import com.example.mymarketlist.model.ShoppingCart;

import java.util.LinkedList;
import java.util.List;

public class AddItemToExistShoppingCartViewModel extends ViewModel {

    private LiveData<List<ShoppingCart>> shoppingCartList;
    private LiveData<List<Item>> itemsList;
    public List<Item> list;
    public List<Category> categoryList;

    public AddItemToExistShoppingCartViewModel() {
        shoppingCartList = Model.instance.getAllShoppingCarts();
        itemsList = Model.instance.getAllItems();
        list = new LinkedList<>();
        categoryList = new LinkedList<>();
        categoryList.add(new Category("מקרר ומקפיא", R.drawable.ic_freezer));
        categoryList.add(new Category("פירות וירקות",R.drawable.ic_apple));
        categoryList.add(new Category("ניקיון",R.drawable.ic_rag));
        categoryList.add(new Category("לארונות",R.drawable.ic_closet));
    }

    public LiveData<List<ShoppingCart>>  getShoppingCartData() {
        return shoppingCartList;
    }

    public LiveData<List<Item>>  getData() {
        return itemsList;
    }

    public List<Item> getGeneralData() {
        list = new LinkedList<>();
        for ( Item item: itemsList.getValue()) {
            if(item.getOwner().equals("") && item.getCategory().equals("מקרר ומקפיא"))
                list.add(item);
        }
        return list;
    }

    public void filterDataByCategory(int position) {
        list = new LinkedList<>();
        String categoryName = categoryList.get(position).getName();
        for (Item item: itemsList.getValue()) {
            if(item.getOwner().equals("") && item.getCategory().equals(categoryName))
                list.add(item);
        }
    }

}