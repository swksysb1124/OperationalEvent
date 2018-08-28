package crop.computer.askey.windowoperationpractice.windowoperation.system;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import crop.computer.askey.windowoperationpractice.BaseActivity;

public class OrientationChangeDetectionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("畫面轉向操作");
        setTextDescription("請 [旋轉手機]");
        detectOrientation();
    }

    private void detectOrientation() {
        if(getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {

            toast("橫向配置");

        }else if(getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_PORTRAIT) {

            toast("縱向配置");

        }
    }
}
