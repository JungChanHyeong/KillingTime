/*
 * Copyright 2015 Killing Time Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package chanh.killingtime;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    static DBOpen dbopen;
    static SQLiteDatabase db;
    private BackPressCloseSystem backPressCloseSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbopen = new DBOpen(this);
        db = dbopen.getReadableDatabase();

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
        Context mContext = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.help, (ViewGroup) findViewById(R.id.popup));
        AlertDialog.Builder aDialog = new AlertDialog.Builder(this);

        aDialog.setTitle("도움말입니다.");
        aDialog.setView(layout);

        aDialog.setNegativeButton("돌아가기", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog ad = aDialog.create();
        ad.show();
    }

    public void btnExit(View v) {
        finish();
    }

    @Override
    public void onBackPressed() {
        backPressCloseSystem.onBackPressed();
    }

}
