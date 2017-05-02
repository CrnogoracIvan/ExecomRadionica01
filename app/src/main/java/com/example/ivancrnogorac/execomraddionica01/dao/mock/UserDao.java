package com.example.ivancrnogorac.execomraddionica01.dao.mock;

import com.example.ivancrnogorac.execomraddionica01.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Crnogorac on 4/29/2017.
 */

public class UserDao {
    public static List<User> fetchUsers(){

        final List<User>users = new ArrayList<User>();

        for (int i = 0; i < 42 ; i++) {
           users.add(new User ("Pero", null, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTj2GcJLhjsWQjRshXcCFftnRLst9LbWItZ1sVGtd2W1IguwbkZMA"));
           // users.add (new User(i%2 == 0? "Prvi":"Drugi", i%2 == 0? "Prvi":"Drugi", i%2 == 0? "https://d1o50x50snmhul.cloudfront.net/wp-content/uploads/2017/04/28211324/saturnnorth-e1493410671964.jpg":"Drugi"));
        }
        return users;
    }
}
