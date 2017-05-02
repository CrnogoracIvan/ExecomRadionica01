package com.example.ivancrnogorac.execomraddionica01.generic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.ivancrnogorac.execomraddionica01.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Crnogorac on 4/29/2017.
 */


public abstract class RecyclerViewerAdapterBase<T, V extends View> extends RecyclerView.Adapter<ViewWrapper<V>> {

    protected final List<T> items = new ArrayList<T>();
    protected final Context context;

    protected RecyclerViewerAdapterBase(Context context, List<User> items) {
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public final ViewWrapper<V> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewWrapper<V>(onCreateItemView(parent, viewType));
    }

    protected abstract V onCreateItemView(ViewGroup parent, int viewType);

    // additional methods to manipulate the items
}