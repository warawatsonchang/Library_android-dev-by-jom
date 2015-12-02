package com.joelapenna.foursquared;

import com.joelapenna.foursquared.widget.SegmentedButton;
import com.joelapenna.foursquared.widget.SegmentedButton.OnClickListenerSegmentedButton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Create the segmented buttons
        SegmentedButton buttons = (SegmentedButton)findViewById(R.id.segmented);
        buttons.clearButtons();
        buttons.addButtons(
                getString(R.string.friendsactivity_btn_recent),
                getString(R.string.friendsactivity_btn_nearby));

        // First button is selected
        buttons.setPushedButtonIndex(0);

        // Some example click handlers. Note the click won't get executed
        // if the segmented button is already selected (dark blue)
        buttons.setOnClickListener(new OnClickListenerSegmentedButton() {
            @Override
            public void onClick(int index) {
                if (index == 0) {
                	Toast.makeText(MainActivity.this, "Sort by recent", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sort by nearby", Toast.LENGTH_SHORT).show();
                }
            }
        });
        

    }
}