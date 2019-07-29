package newapp.example.com.gravitycontrol_hackermode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import java.util.ArrayList;
import java.util.Iterator;

public class BouncingBallView extends View {
    int maxX,maxY;
    public Circle ball1,ball2,ball3,ball4,ball5,ball6;
    public ArrayList<Circle> ballList=new ArrayList<Circle>();

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged( w, h, oldw, oldh );

        maxX=w;
        maxY=h;
        Iterator itr=ballList.iterator();
        while (itr.hasNext())
        {
            Circle ball=(Circle) itr.next();
            ball.setmax( maxX,maxY );
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw( canvas );
        Iterator itr=ballList.iterator();
        while (itr.hasNext())
        {
            Circle ball=((Circle)itr.next());
            ball.draw(canvas);
        }
        invalidate();
    }

    public BouncingBallView(Context context) {
        super( context );
        ball1= new Circle( Color.BLUE );
        ball1.setCords( 0,0,100 );
        //ball1.setSpeed( 0,5 );
        ballList.add(ball1);

      /*  ball2= new Circle( Color.RED );
        ball2.setCords(0,0,100 );
        ball2.setSpeed( 0,4 );
        ballList.add( ball2 );

        ball3= new Circle( Color.GREEN );
        ball3.setCords(0,0,100 );
        ball3.setSpeed( 0,4 );
        ballList.add( ball3 );

        ball4= new Circle( Color.GRAY );
        ball4.setCords(0,0,100 );
        ball4.setSpeed( 0,4 );
        ballList.add( ball4 );

        ball5= new Circle( Color.YELLOW );
        ball5.setCords(0,0,100 );
        ball5.setSpeed( 0,4 );
        ballList.add( ball5 );

        ball6= new Circle( Color.CYAN );
        ball6.setCords(0,0,100 );
        ball6.setSpeed( 0,4 );
        ballList.add( ball6 );*/


    }




}
