package com.example.user.ex11;

import android.app.ListFragment;
import android.content.Context;

/**
 * Created by User on 11/05/2018.
 */

public class ItemsFragment extends ListFragment {
    CountryAdapter adapter;
public ItemsFragment(){super();}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        adapter =new CountryAdapter(context);
        setListAdapter(adapter);

    }
}


