package com.example.gek0n.timetable;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gek0n.timetable.adapter.SlidingMenuAdapter;
import com.example.gek0n.timetable.adapter.SlidingMenuAdapter2;
import com.example.gek0n.timetable.fragment.Fragment1;
import com.example.gek0n.timetable.fragment.Fragment2;
import com.example.gek0n.timetable.fragment.Fragment3;
import com.example.gek0n.timetable.model.CheckedSlideMenuItem;
import com.example.gek0n.timetable.model.HeaderGroupSlideMenuItem;
import com.example.gek0n.timetable.model.HeaderSlideMenuItem;
import com.example.gek0n.timetable.model.ListTextSlideMenuItem;
import com.example.gek0n.timetable.model.ShareSlideMenuItem;
import com.example.gek0n.timetable.model.SlideMenuItem;
import com.example.gek0n.timetable.model.TextWithIconSlideMenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NgocTri on 10/18/2015.
 */
public class MainActivity extends AppCompatActivity {

    private List<SlideMenuItem> listSliding;
    private List<SlideMenuItem> listSliding2;
    private SlidingMenuAdapter adapter;
    private SlidingMenuAdapter2 adapter2;
    private ListView listViewSliding;
    private ListView listViewSliding2;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init component

        listViewSliding = (ListView) findViewById(R.id.lv_sliding_menu);
        listViewSliding2 = (ListView) findViewById(R.id.lv_sliding_menu2);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        listSliding = new ArrayList<>();
        listSliding2 = new ArrayList<>();

        //Add item for sliding list
        listSliding.add(new HeaderSlideMenuItem("Настройки"));
        listSliding.add(new HeaderGroupSlideMenuItem("Отображать в расписании:"));
        listSliding.add(new CheckedSlideMenuItem(true, "Пустые пары"));
        listSliding.add(new CheckedSlideMenuItem(true, "Практические занятия"));
        listSliding.add(new CheckedSlideMenuItem(true, "Лабы"));
        listSliding.add(new CheckedSlideMenuItem(true, "Лекции"));
        listSliding.add(new ShareSlideMenuItem(R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, "Поделиться:"));
        listSliding.add(new HeaderGroupSlideMenuItem("Дополнительно:"));
        listSliding.add(new TextWithIconSlideMenuItem(R.mipmap.ic_launcher, "Обновить расписание"));
        listSliding.add(new TextWithIconSlideMenuItem(R.mipmap.ic_launcher, "Оценить на Google Play"));
        listSliding.add(new TextWithIconSlideMenuItem(R.mipmap.ic_launcher, "Сообщить об ошибке"));
        listSliding.add(new TextWithIconSlideMenuItem(R.mipmap.ic_launcher, "О программе"));
        adapter = new SlidingMenuAdapter(this, listSliding);
        listViewSliding.setAdapter(adapter);

        //Add item for sliding list2
        listSliding2.add(new HeaderSlideMenuItem("Поиск"));
        listSliding2.add(new HeaderSlideMenuItem("Поиск3"));
        ArrayList<String> list = new ArrayList<>();
        list.add("КТсо5-1");
        list.add("КТсо3-2");
        list.add("КТсо1-4");
        listSliding2.add(new ListTextSlideMenuItem(list, "Поиск2"));

        adapter2 = new SlidingMenuAdapter2(this, listSliding2);
        listViewSliding2.setAdapter(adapter2);

        //Display icon to open/ close sliding list
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Set title
        setTitle("I love you babe");
        //item selected
        listViewSliding.setItemChecked(0, true);
        listViewSliding2.setItemChecked(0, true);
        //Close menu
        drawerLayout.closeDrawer(listViewSliding);
        drawerLayout.closeDrawer(listViewSliding2);

        //Display fragment 1 when start
        replaceFragment(0);
        //Hanlde on item click

        listViewSliding.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Set title
                //setTitle(listSliding.get(position).getTitle());
                //item selected
                listViewSliding.setItemChecked(position, true);
                //Replace fragment
                replaceFragment(position);
                //Close menu
                drawerLayout.closeDrawer(listViewSliding);
            }
        });

        listViewSliding2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // ПУСТОТА СУКА
            }
        });

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.hello_blank_fragment, R.string.hello_blank_fragment){

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
            }
        };

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_search)
        {
            return true;
        }
        if(actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    //Create method replace fragment

    private void replaceFragment(int pos) {
        Fragment fragment = null;
        switch (pos) {
            case 0:
                fragment = new Fragment1();
                break;
            case 1:
                fragment = new Fragment2();
                break;
            case 2:
                fragment = new Fragment3();
                break;
            default:
                fragment = new Fragment1();
                break;
        }

        if(null!=fragment) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.main_content, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}