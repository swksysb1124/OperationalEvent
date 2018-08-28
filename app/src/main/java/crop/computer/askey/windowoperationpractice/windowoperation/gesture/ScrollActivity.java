package crop.computer.askey.windowoperationpractice.windowoperation.gesture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import crop.computer.askey.windowoperationpractice.R;

public class ScrollActivity extends GestureDetectionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("捲動操作");
        setTextDescription("請 [捲動]");
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {

        if(distanceX > 0) {
            toast("向左捲動發生!!");
        }else if(distanceX < 0){
            toast("向右捲動發生!!");
        }

        if(distanceY > 0) {
            toast("向上捲動發生!!");
        }else if(distanceY < 0) {
            toast("向下捲動發生!!");
        }

        return super.onScroll(e1, e2, distanceX, distanceX);
    }
}
