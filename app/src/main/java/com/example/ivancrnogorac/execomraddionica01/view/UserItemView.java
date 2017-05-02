package com.example.ivancrnogorac.execomraddionica01.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ivancrnogorac.execomraddionica01.R;
import com.example.ivancrnogorac.execomraddionica01.model.User;
import com.example.ivancrnogorac.execomraddionica01.protocol.UserSelectedInterface;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Ivan Crnogorac on 4/29/2017.
 */

public class UserItemView extends RelativeLayout {

    private TextView firstName;
    private TextView lastName;
    private final SimpleDraweeView thumbnail;

    public UserItemView(Context context, final UserSelectedInterface userSelectedListener) {
        super(context);
        inflate(context, R.layout.item_view_user,this);
        firstName = (TextView) findViewById(R.id.first_name);
        lastName = (TextView) findViewById(R.id.last_name);
        thumbnail = (SimpleDraweeView) findViewById(R.id.thumbnail);

        //settovati card view lsisterner

    }


    public void bind(User user){
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLasteName());
        thumbnail.setImageURI(user.getIconUrl());

    }
}
