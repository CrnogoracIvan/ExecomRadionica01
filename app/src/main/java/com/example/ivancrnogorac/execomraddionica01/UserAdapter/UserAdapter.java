package com.example.ivancrnogorac.execomraddionica01.UserAdapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.ivancrnogorac.execomraddionica01.generic.RecyclerViewerAdapterBase;
import com.example.ivancrnogorac.execomraddionica01.generic.ViewWrapper;
import com.example.ivancrnogorac.execomraddionica01.protocol.UserSelectedInterface;
import com.example.ivancrnogorac.execomraddionica01.view.UserItemView;
import com.example.ivancrnogorac.execomraddionica01.model.User;

import java.util.List;

/**
 * Created by Ivan Crnogorac on 4/29/2017.
 */

public class UserAdapter extends RecyclerViewerAdapterBase<User, UserItemView> {
    private final UserSelectedInterface userSelectedListener;
    public UserAdapter(Context context, List<User> items, UserSelectedInterface userSelectedListener){
        super(context);

           // this.items.add(user);
            this.userSelectedListener = userSelectedListener;
    }

    @Override
    protected UserItemView onCreateItemView(ViewGroup parent, int viewType) {
        return new UserItemView(context, userSelectedListener);
    }

    @Override
    public void onBindViewHolder(ViewWrapper<UserItemView> viewHolder, int position) {
        UserItemView view = viewHolder.getView();
        User user = items.get(position);

        view.bind(user);
    }

}
