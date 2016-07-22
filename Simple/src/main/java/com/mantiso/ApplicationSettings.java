package com.mantiso;

import com.mantiso.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shgaikwa on 7/21/2016.
 */
public class ApplicationSettings {

    private String[] _tabNames;
    private List<Product> _products;
    private List<String> _title;

    public String[] getTabNames() {
        return _tabNames;
    }

    public void setTabNames(String[] names) {
        _tabNames=new String[names.length];
        System.arraycopy(names, 0, _tabNames, 0, names.length);
    }

    public List<Product> getProducts() {
        return _products;
    }

    public void setProducts(List<Product> productList) {
        _products=productList;
    }

    public List<String> getTitle() {
        return _title;
    }

    public void setTitle(List<String> title) {
        _title=title;
    }
}
