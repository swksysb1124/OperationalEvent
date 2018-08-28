package crop.computer.askey.windowoperationpractice.mainmenu;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

import crop.computer.askey.windowoperationpractice.BaseActivity;
import crop.computer.askey.windowoperationpractice.windowoperation.gesture.FlingActivity;
import crop.computer.askey.windowoperationpractice.windowoperation.gesture.LongPressActivity;
import crop.computer.askey.windowoperationpractice.windowoperation.gesture.ScrollActivity;
import crop.computer.askey.windowoperationpractice.windowoperation.system.BackButtonActivity;
import crop.computer.askey.windowoperationpractice.windowoperation.system.HomeButtonActivity;
import crop.computer.askey.windowoperationpractice.windowoperation.system.OrientationChangeDetectionActivity;
import crop.computer.askey.windowoperationpractice.R;
import crop.computer.askey.windowoperationpractice.windowoperation.gesture.TapDoubleTapActivity;
import crop.computer.askey.windowoperationpractice.windowoperation.system.VolumeButtonActivity;

public class MainMenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setTitle("選擇畫面操作");
    }

    public void goToTapDoubleTapPage(View v) {
        goToPage(TapDoubleTapActivity.class);
    }

    public void goToOrientationChangeDetectionPage(View v) {
        goToPage(OrientationChangeDetectionActivity.class);
    }

    public void goToFlingPage(View v) {
        goToPage(FlingActivity.class);
    }

    public void goToScrollPage(View view) {
        goToPage(ScrollActivity.class);
    }

    public void goToLongPressPage(View v) {
        goToPage(LongPressActivity.class);
    }

    public void goToBackButtonPage(View v) {
        goToPage(BackButtonActivity.class);
    }

    public void goToHomeButtonPage(View v) {
        goToPage(HomeButtonActivity.class);
    }

    public void goToVolumeButtonPage(View v) {
        goToPage(VolumeButtonActivity.class);
    }
}
