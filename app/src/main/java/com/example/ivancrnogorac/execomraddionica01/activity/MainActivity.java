package com.example.ivancrnogorac.execomraddionica01.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ivancrnogorac.execomraddionica01.R;
import com.example.ivancrnogorac.execomraddionica01.UserAdapter.UserAdapter;
import com.example.ivancrnogorac.execomraddionica01.dao.mock.UserDao;
import com.example.ivancrnogorac.execomraddionica01.model.User;
import com.example.ivancrnogorac.execomraddionica01.protocol.UserSelectedInterface;

public class MainActivity extends AppCompatActivity implements UserSelectedInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        final UserAdapter adapter = new UserAdapter(this, UserDao.fetchUsers(),this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void userSelected(User user) {

    }
}
