package crop.computer.askey.windowoperationpractice.windowoperation.gesture;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class FlingActivity extends GestureDetectionActivity {

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("滑動操作");
        setTextDescription("請 [往左滑動] 或 \n[向右滑動]");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        if(absDistanceOfY(e1, e2) > SWIPE_MAX_OFF_PATH) {
            return false;
        }

        if(distanceOfX(e1, e2) > SWIPE_MIN_DISTANCE
                && abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
            toast("向左滑動");
        }else if(distanceOfX(e2, e1) > SWIPE_MIN_DISTANCE
                && abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
            toast("向右滑動");
        }

        return false;
    }

    private float absDistanceOfY(MotionEvent e1, MotionEvent e2) {
        return abs(distanceOfY(e1, e2));
    }

    private float distanceOfX(MotionEvent e1, MotionEvent e2) {
        return (e1.getX() - e2.getX());
    }

    private float distanceOfY(MotionEvent e1, MotionEvent e2) {
        return (e1.getY() - e2.getY());
    }

    private float abs(float value) {
        return Math.abs(value);
    }
}
