package com.example.ivancrnogorac.execomraddionica01.generic;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Ivan Crnogorac on 4/29/2017.
 */


public class ViewWrapper<V extends View> extends RecyclerView.ViewHolder {

        private V view;

        public ViewWrapper(V itemView) {
            super(itemView);
            view = itemView;
        }

        public V getView() {
            return view;
        }

}
