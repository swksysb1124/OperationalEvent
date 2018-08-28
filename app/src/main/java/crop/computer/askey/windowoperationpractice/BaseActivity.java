package crop.computer.askey.windowoperationpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    protected void setTextDescription(String textDescription) {
        ((TextView)findViewById(R.id.txt_simple_description)).setText(textDescription);
    }

    protected void goToPage(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

    protected void toast(String text) {
        if(mToast == null) {
            mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(text);
        mToast.show();
    }
}
