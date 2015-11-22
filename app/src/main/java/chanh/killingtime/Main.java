package chanh.killingtime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {

    private BackPressCloseSystem backPressCloseSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        backPressCloseSystem = new BackPressCloseSystem(this);
    }

    public void btnPlay(View v) {
        Intent intent = new Intent(this, ModeSelect.class);
        startActivity(intent);
    }

    public void btnRecord(View v) {
        Intent intent = new Intent(this, Record.class);
        startActivity(intent);
    }

    public void btnHelp(View v) {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    public void btnExit(View v) {
        finish();
    }

    @Override
    public void onBackPressed() {
        backPressCloseSystem.onBackPressed();
    }
}
