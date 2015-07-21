package com.somecompany.portfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortfolioMenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_menu, menu);
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

    public void detectAndCheers(View view) {
        //Determine which of the buttons was clicked
        Context context = getApplicationContext();
        CharSequence msg = "";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,msg,duration);

        switch (view.getId()) {
            case R.id.spot_streamer_btn:
                msg = "Spotify Streamer";
                break;
            case R.id.scores_app_btn:
                msg = "Scores App";
                break;
            case R.id.lib_app_btn:
                msg = "Library App";
                break;
            case R.id.bigger_btn:
                msg = "Build it Bigger App";
                break;
            case R.id.xyz_btn:
                msg = "XYZ Reader App";
                break;
            case R.id.cap_btn:
                msg = "Capstone : My Awesome App";
                break;
            default:
                msg = "Uh-oh, I don't recognize this button!";
        }

        toast.setText(msg);
        toast.show();
    }
}
