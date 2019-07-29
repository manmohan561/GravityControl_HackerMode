package newapp.example.com.gravitycontrol_hackermode;

import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    float px;
    int count1=0,count2=0,count3=0,count4=0,count5=0;
    ImageView i1,i2,i3,i4,i5;
    int count = 0;
    float height;
    int[] toggle = new int[]{0, 1};
    float width;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        RelativeLayout relativeLayout = findViewById( R.id.layout );
        Display display = getWindowManager().getDefaultDisplay();
         i1 = findViewById( R.id.imageView );
         i2 = findViewById( R.id.imageView2 );
         i3 = findViewById( R.id.imageView3 );
         i4 = findViewById( R.id.imageView4 );
         i5 = findViewById( R.id.imageView5 );
        Point point = new Point();
        display.getSize( point );

        this.width = (float) point.x;
        this.height = (float) point.y;
        relativeLayout.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                px=event.getX();
                String str = "y";
                ObjectAnimator objectAnimator;
                MainActivity mainActivity;
                if(px>=0&&px<216)
                {
                    if (MainActivity.this.toggle[MainActivity.this.count % 2]%2==0) {
                        objectAnimator = ObjectAnimator.ofFloat(i1, str, MainActivity.this.height - 225.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        //mainActivity = MainActivity.this;
                        count++;
                        i1.setY(1.0f);
                    } else if (MainActivity.this.toggle[MainActivity.this.count % 2] == 1) {
                        objectAnimator = ObjectAnimator.ofFloat(i1, str, 0.0f );
                        // objectAnimator.setInterpolator( new AccelerateDecelerateInterpolator(  ) );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        i1.setY(0.0f);
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                    }

                }

                else if(px>=216&&px<432)
                {

                    if (MainActivity.this.toggle[MainActivity.this.count % 2] == 0) {
                        objectAnimator = ObjectAnimator.ofFloat(i2, str, MainActivity.this.height - 225.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                        i2.setY(1.0f);
                    } else if (MainActivity.this.toggle[MainActivity.this.count % 2] == 1) {
                        objectAnimator = ObjectAnimator.ofFloat(i2, str, 0.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        i2.setY(0.0f);
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                    }

                }
                else if(px>=432&&px<648)
                {
                    if (MainActivity.this.toggle[MainActivity.this.count % 2] == 0) {
                        objectAnimator = ObjectAnimator.ofFloat(i3, str, MainActivity.this.height - 225.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                        i3.setY(1.0f);
                    } else if (MainActivity.this.toggle[MainActivity.this.count % 2] == 1) {
                        objectAnimator = ObjectAnimator.ofFloat(i3, str, 0.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        i3.setY(0.0f);
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                    }

                }

                else if(px>=648&&px<864)
                {

                    if (MainActivity.this.toggle[MainActivity.this.count % 2] == 0) {
                        objectAnimator = ObjectAnimator.ofFloat(i4, str, MainActivity.this.height - 225.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                        i4.setY(1.0f);
                    } else if (MainActivity.this.toggle[MainActivity.this.count % 2] == 1) {
                        objectAnimator = ObjectAnimator.ofFloat(i4, str, 0.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        i4.setY(0.0f);
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                    }

                }

                else if(px>=864&&px<=1080)
                {
                    if (MainActivity.this.toggle[MainActivity.this.count % 2] == 0) {
                        objectAnimator = ObjectAnimator.ofFloat(i5, str, MainActivity.this.height - 225.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                        i5.setY(1.0f);
                    } else if (MainActivity.this.toggle[MainActivity.this.count % 2] == 1) {
                        objectAnimator = ObjectAnimator.ofFloat(i5, str, 0.0f );
                        objectAnimator.setDuration(1500);
                        objectAnimator.start();
                        i5.setY(0.0f);
                        mainActivity = MainActivity.this;
                        mainActivity.count++;
                    }

                }

                return false;



            }
        } );

    }

}
