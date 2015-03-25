package com.application.yeh.refrigrecip;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRefrigClick(View view) {
        Intent intent = new Intent(this, RefrigActivity.class);
        startActivity(intent);
    }

    public void onRecipClick(View view) {
        Intent intent = new Intent(this, RecipActivity.class);
        startActivity(intent);
    }
}