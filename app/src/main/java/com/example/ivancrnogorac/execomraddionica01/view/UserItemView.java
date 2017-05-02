package com.example.ivancrnogorac.execomraddionica01.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
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

    private User user;
    private TextView firstName;
    private TextView lastName;
    private final SimpleDraweeView thumbnail;

    public UserItemView(Context context, final UserSelectedInterface userSelectedListener) {
        super(context);
        inflate(context, R.layout.item_view_user,this);

        final CardView cardView = (CardView) findViewById(R.id.cardView);
        firstName = (TextView) findViewById(R.id.first_name);
        lastName = (TextView) findViewById(R.id.last_name);
        thumbnail = (SimpleDraweeView) findViewById(R.id.thumbnail);

       cardView.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               userSelectedListener.userSelected(user);
           }
       });

    }

    public void bind(User user){
        this.user = user;
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLasteName());
        thumbnail.setImageURI(user.getIconUrl());

    }
}
