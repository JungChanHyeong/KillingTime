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

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PerfectMode extends InfiniteMode { // 형식이 비슷한 Infinite Mode 상속받아 사용

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infi_perf_mode);

        tView = (TextView) findViewById(R.id.category);
        problem = (TextView) findViewById(R.id.problem);
        count = (TextView) findViewById(R.id.count);
        ex1 = (Button) findViewById(R.id.ex1);
        ex2 = (Button) findViewById(R.id.ex2);
        ex3 = (Button) findViewById(R.id.ex3);
        ex4 = (Button) findViewById(R.id.ex4);

        toast = Toast.makeText(this, "null", Toast.LENGTH_SHORT);

        random = Math.abs(rand.nextInt(170) + 1);
        selectData(random);
        score = 0;
        count.setText(Integer.toString(score));

        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 1) {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, -230);
                    toast.show();
                    score++;
                } else {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "실패했습니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
                readDb();
            }
        });

        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 2) {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, -230);
                    toast.show();
                    score++;
                } else {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "실패했습니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
                readDb();
            }
        });

        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 3) {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, -230);
                    toast.show();
                    score++;
                } else {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "실패했습니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
                readDb();
            }
        });

        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 4) {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, -230);
                    toast.show();
                    score++;
                } else {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "실패했습니다!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
                readDb();
            }
        });
    }
}
