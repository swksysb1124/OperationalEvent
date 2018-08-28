package crop.computer.askey.windowoperationpractice.windowoperation.system;

import android.os.Bundle;
import android.view.KeyEvent;
import crop.computer.askey.windowoperationpractice.BaseActivity;

public class VolumeButtonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("音量鍵操作");
        setTextDescription("請操作 [音量鍵]");
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        if(event.getKeyCode()
                == KeyEvent.KEYCODE_VOLUME_UP) {

            toast("音量調高了");

        }

        if(event.getKeyCode()
                == KeyEvent.KEYCODE_VOLUME_DOWN) {

            toast("音量調低了");

        }

        if(event.getKeyCode()
                == KeyEvent.KEYCODE_VOLUME_MUTE) {

            toast("靜音模式");

        }

        return super.dispatchKeyEvent(event);
    }
}
