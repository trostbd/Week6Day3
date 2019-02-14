package com.example.lawre.week6day3;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;

public class CustomEditText extends android.support.v7.widget.AppCompatEditText
{

    public CustomEditText(Context context) {
        this(context, null);
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    public void checkColor()
    {
        if(getText().toString().length() < 8)
        {
            setTextColor(Color.RED);
        }
        else
        {
            setTextColor(Color.BLACK);
        }
    }
}
