package chanh.killingtime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModeSelect extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modeselect);
    }

    public void btnInfinite(View v) {
        Intent intent = new Intent(this, InfiniteMode.class);
        startActivity(intent);
    }

    public void btnTest(View v) {
        Intent intent = new Intent(this, TestMode.class);
        startActivity(intent);
    }

    public void btnPerfect(View v) {
        Intent intent = new Intent(this, PerfectMode.class);
        startActivity(intent);
    }

    public void btnBack(View v) {
        finish();
    }
}
