package com.example.lawre.week6day3;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomCompound extends LinearLayout
{

    TextView tvCounter;
    int counter = 0;

    public CustomCompound(Context context) {
        this(context,null);
    }

    public CustomCompound(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomCompound(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomCompound(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void init()
    {

        inflate(getContext(),R.layout.custom_compound,this);
        tvCounter = findViewById(R.id.tvCounter);
    }

    public void incrementClick()
    {
        counter++;
        String text = "Clicks: " + String.valueOf(counter);
        tvCounter.setText(text);
    }
}
