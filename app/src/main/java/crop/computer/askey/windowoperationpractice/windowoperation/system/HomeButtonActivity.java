package crop.computer.askey.windowoperationpractice.windowoperation.system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import crop.computer.askey.windowoperationpractice.BaseActivity;

public class HomeButtonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Home 鍵操作");
        setTextDescription("請按下 [Home鍵]");
    }

    @Override
    public void onUserLeaveHint() {
        toast("按下Home鍵了");
    }

}
