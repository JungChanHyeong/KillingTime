package chanh.killingtime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ModeSelect extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modeselect);

        InfiniteMode.toast = Toast.makeText(this, "null", Toast.LENGTH_SHORT);
    }

    public void btnInfinite(View v) {
        InfiniteMode.toast.cancel();
        Intent intent = new Intent(this, InfiniteMode.class);
        startActivity(intent);
    }

    public void btnTest(View v) {
        InfiniteMode.toast.cancel();
        Intent intent = new Intent(this, TestMode.class);
        startActivity(intent);
    }

    public void btnPerfect(View v) {
        InfiniteMode.toast.cancel();
        Intent intent = new Intent(this, PerfectMode.class);
        startActivity(intent);
    }

    public void btnBack(View v) {
        finish();
    }
}
