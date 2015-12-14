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
