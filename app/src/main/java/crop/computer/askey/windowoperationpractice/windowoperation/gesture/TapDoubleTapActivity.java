package crop.computer.askey.windowoperationpractice.windowoperation.gesture;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class TapDoubleTapActivity extends GestureDetectionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("單 \\ 雙點擊操作");
        setTextDescription("請 [單點擊] 或 \n[雙點擊]");
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        toast("執行雙點擊!!");
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        toast("執行單點擊!!");
        return false;
    }
}
