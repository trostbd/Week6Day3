package com.example.lawre.week6day3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomRectangle extends View
{
    int fillColor;
    float top, left, right, bottom;

    Paint paint;
    public CustomRectangle(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomRectangle);
        fillColor = typedArray.getInt(R.styleable.CustomRectangle_fillColor,R.color.colorRectangle);
        top = typedArray.getFloat(R.styleable.CustomRectangle_top,100);
        left = typedArray.getFloat(R.styleable.CustomRectangle_left,100);
        right = typedArray.getFloat(R.styleable.CustomRectangle_right,300);
        bottom = typedArray.getFloat(R.styleable.CustomRectangle_bottom,300);
        typedArray.recycle();
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        paint.setColor(fillColor);
        canvas.drawRect(left,top,right,bottom,paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int desiredWidth = 300;
        int desiredHeight = 300;

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);  //comes from device
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);  //comes from device
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int usedWidth;
        int usedHeight;

        if(widthMode == MeasureSpec.EXACTLY)
        {
            usedWidth = widthSize;
        }
        else if(widthMode == MeasureSpec.AT_MOST)
        {
            usedWidth = Math.min(desiredWidth,widthSize);
        }
        else
        {
            usedWidth = desiredWidth;
        }

        if(heightMode == MeasureSpec.EXACTLY)
        {
            usedHeight = heightSize;
        }
        else if(heightMode == MeasureSpec.AT_MOST)
        {
            usedHeight = Math.min(desiredHeight,heightSize);
        }
        else
        {
            usedHeight = desiredHeight;
        }

        super.onMeasure(usedWidth, usedHeight);
    }
}
