package crop.computer.askey.windowoperationpractice.windowoperation.system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import crop.computer.askey.windowoperationpractice.BaseActivity;

public class BackButtonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("返回鍵操作");
        setTextDescription("請按下 [返回鍵]");
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event){

        if(event.getKeyCode()
                == KeyEvent.KEYCODE_BACK){

            toast("按下返回鍵了");

        }

        return super.dispatchKeyEvent(event);
    }

}
