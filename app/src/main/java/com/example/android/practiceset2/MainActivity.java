package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        changeImage();

        // Find a reference to the TextView in the layout. Change the text.
        changeMessage();
    }

    public void changeImage() {
        ImageView imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
    }

    public void changeMessage() {
        TextView textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm so full");
    }
}