package newapp.example.com.gravitycontrol_hackermode;

import android.graphics.Canvas;
import android.graphics.Paint;

import android.graphics.RectF;
import android.provider.Settings;

public class Circle {
    private int leftTopX;
    private int leftTopY;
    private int radius;
    private Paint paint;
    private RectF bounds;
    private int speedX;
    private int sppedy;
    private int maxX;
    private int maxY;

    public Circle(int Color) {
        paint = new Paint();
        paint.setColor( Color );
        bounds = new RectF();
    }
    public void setCords(int x,int y,int radius)
    {
        leftTopX =x;
        leftTopY =y;
        this.radius=radius;
        bounds.set(leftTopX,leftTopY,leftTopX+this.radius,leftTopY+this.radius);
    }
    public void draw(Canvas canvas)
    {
        canvas.drawOval( bounds,paint );
        update();
    }
    public void setSpeed(int speedX,int sppedy)
    {
        this.speedX=speedX;
        this.sppedy=sppedy;
    }
    public void setmax(int maxX,int maxy)
    {
        this.maxX=maxX;
        this.maxY=maxy;
    }

    public void update()
    {
        if(leftTopX+2*radius>maxX)
        {
            speedX=speedX*-1;
        }
        else if(leftTopX<0)
        {
            speedX=speedX*-1;
        }

        if(leftTopY+2*radius>maxY)
        {
            sppedy=sppedy*-1;
        }
        else if(leftTopY<0)
        {
            sppedy=sppedy*-1;
        }
        leftTopX=leftTopX+speedX;
        leftTopY=leftTopY+sppedy;
        bounds.set( leftTopX,leftTopY,leftTopX+radius,leftTopY+radius );
    }


    }

