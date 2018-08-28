package crop.computer.askey.windowoperationpractice.windowoperation.gesture;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class LongPressActivity extends GestureDetectionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("長按操作");
        setTextDescription("請 [長按]");
    }

    @Override
    public void onLongPress(MotionEvent ev) {
        toast("長按發生");
    }
}
