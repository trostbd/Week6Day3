package com.example.lawre.week6day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity
{
    CustomRectangle customRectangle;
    CustomCompound customCompound;
    CustomEditText customEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customRectangle = findViewById(R.id.custRectangle);
        customCompound = findViewById(R.id.customCompound);
        customEditText = findViewById(R.id.cetColorChangeText);
        customEditText.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                customEditText.checkColor();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                customEditText.checkColor();
            }

            @Override
            public void afterTextChanged(Editable s) {
                customEditText.checkColor();
            }
        });
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.customCompound)
        {
            customCompound.incrementClick();
        }
        else if(view.getId() == R.id.btAnimate)
        {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.rectangle_rotate);
            customRectangle.startAnimation(animation);
        }
    }
}
