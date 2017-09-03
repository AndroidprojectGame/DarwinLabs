package com.social.chaudhary.darwinlabs;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.tollbar);
        setSupportActionBar(toolbar);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.drawer_open,R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(false);

        navigationView=(NavigationView)findViewById(R.id.navigationView);

        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new BTCFragment());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Ledger EX");
        Fragment fragment = null;


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.btc:
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        BTCFragment btcFragment=new BTCFragment();
                        fragmentTransaction.replace(R.id.main_container,btcFragment);
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Ledger EX");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.eth:
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new ETHFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Ledger EX");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.ltc:
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new LTCFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Ledger EX");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.stm:
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new STMFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Ledger EX");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.dsh:
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new DSHFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Ledger EX");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                }
                return true;
            }
        });

        actionBarDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        actionBarDrawerToggle.setHomeAsUpIndicator(R.drawable.menuicon);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }
}
