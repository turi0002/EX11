package com.example.user.ex11;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static com.example.user.ex11.XMLParser.parseFromStream;

/**
 * Created by User on 11/05/2018.
 */

public class CountryAdapter extends ArrayAdapter <Country> {
    ArrayList<Country> allCountries;
    public CountryAdapter(@NonNull Context context) {
        super(context, android.R.layout.simple_list_item_1);
        openAssetDataStream(context);
        InputStream inputStream =  openAssetDataStream(context);
        this.allCountries=XMLParser.parseFromStream(inputStream);
        for (Country country:allCountries)
        {
            add(country);
        }
        try {
            inputStream.close();
        }   catch (IOException e){
            e.printStackTrace();
        }
    }

    private static InputStream openAssetDataStream(Context context) {
        AssetManager assetManager = context.getAssets();
        InputStream in = null;
        try {
            in = assetManager.open("countries.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return in;
    }


}



