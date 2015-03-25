package com.application.yeh.refrigrecip;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class RefrigActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrig);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_refrig, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onMeatClick(View view) {
        Intent intent = new Intent(this, RefrigMeat.class);
        startActivity(intent);
    }

    public void onVegeClick(View view) {
        Intent intent = new Intent(this, RefrigVege.class);
        startActivity(intent);
    }

    public void onFruitClick(View view) {
        Intent intent = new Intent(this, RefrigFruit.class);
        startActivity(intent);
    }

    public void onGrainClick(View view) {
        Intent intent = new Intent(this, RefrigGrain.class);
        startActivity(intent);
    }

    public void onDairyClick(View view) {
        Intent intent = new Intent(this, RefrigDairy.class);
        startActivity(intent);
    }

    public void onBeverageClick(View view) {
        Intent intent = new Intent(this, RefrigBeverage.class);
        startActivity(intent);
    }

    public void onCondimentClick(View view) {
        Intent intent = new Intent(this, RefrigCondiment.class);
        startActivity(intent);
    }
}
