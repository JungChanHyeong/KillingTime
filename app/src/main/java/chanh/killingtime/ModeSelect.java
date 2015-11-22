package chanh.killingtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ModeSelect extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modeselect);
    }

    public void btnBack(View v) {
        finish();
    }
}
