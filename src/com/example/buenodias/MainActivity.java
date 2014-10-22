package com.example.buenodias;

import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	private TextView caption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
    caption = (TextView) findViewById(R.id.caption);
    
    Typeface Jellyka_Estrya_Handwriting = Typeface.createFromAsset(getAssets(), getString(R.string.typeface_Jellyka_Estrya_Handwriting));
    caption.setTypeface(Jellyka_Estrya_Handwriting);
    
    caption.setText(Html.fromHtml(getString(R.string.caption)));
    
    }
}