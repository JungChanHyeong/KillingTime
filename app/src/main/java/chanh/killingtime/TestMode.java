package chanh.killingtime;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class TestMode extends InfiniteMode {
    // 총맞춘갯수, 총푼갯수, 날짜-날짜, 맞춘갯수, 푼갯수, 날짜-날짜, 맞춘갯수, 푼갯수, 날짜-날짜, 맞춘갯수, 푼갯수

    static int totalhit, totalsolve;

    static int remainCount;

    static TextView remain;

    Calendar today = Calendar.getInstance();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_mode);

        tView = (TextView) findViewById(R.id.category);
        problem = (TextView) findViewById(R.id.problem);
        count = (TextView) findViewById(R.id.count);
        remain = (TextView) findViewById(R.id.remain);
        ex1 = (Button) findViewById(R.id.ex1);
        ex2 = (Button) findViewById(R.id.ex2);
        ex3 = (Button) findViewById(R.id.ex3);
        ex4 = (Button) findViewById(R.id.ex4);

        toast = Toast.makeText(this, "null", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, -230);

        random = Math.abs(rand.nextInt(170) + 1);
        selectData(random);
        score = 0;
        remainCount = 10;
        count.setText(Integer.toString(score));
        remain.setText(Integer.toString(remainCount));

        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 1) {
                    toast.setText("정답입니다!");
                    toast.show();
                    score++;
                } else {
                    toast.setText("오답입니다!");
                    toast.show();
                }
                readDb();
                remainCount--;
                remain.setText(Integer.toString(remainCount));

                if (remainCount == 0) {
                    saveRecord();
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "10문제 중 " + score + "문제 정답", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
            }
        });

        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 2) {
                    toast.setText("정답입니다!");
                    toast.show();
                    score++;
                } else {
                    toast.setText("오답입니다!");
                    toast.show();
                }
                readDb();
                remainCount--;
                remain.setText(Integer.toString(remainCount));

                if (remainCount == 0) {
                    saveRecord();
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "10문제 중 " + score + "문제 정답", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
            }
        });

        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 3) {
                    toast.setText("정답입니다!");
                    toast.show();
                    score++;
                } else {
                    toast.setText("오답입니다!");
                    toast.show();
                }
                readDb();
                remainCount--;
                remain.setText(Integer.toString(remainCount));

                if (remainCount == 0) {
                    saveRecord();
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "10문제 중 " + score + "문제 정답", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
            }
        });

        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right == 4) {
                    toast.setText("정답입니다!");
                    toast.show();
                    score++;
                } else {
                    toast.setText("오답입니다!");
                    toast.show();
                }
                readDb();
                remainCount--;
                remain.setText(Integer.toString(remainCount));

                if (remainCount == 0) {
                    saveRecord();
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), "10문제 중 " + score + "문제 정답", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    finish();
                }
            }
        });
    }

    private void saveRecord() {

        String dirPath = getFilesDir().getAbsolutePath();
        File file = new File(dirPath);
        File file2 = new File(dirPath + "/record.txt");

        String content = "", temp = "";

        // 일치하는 폴더가 없으면 생성
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file2.exists()) {
            // txt 파일 생성
            // 총맞춘갯수, 총푼갯수, 날짜-날짜, 맞춘갯수, 날짜-날짜, 맞춘갯수, 날짜-날짜, 맞춘갯수

            String str = "0,0,none,0,none,0,none,0";
            File savefile = new File(dirPath + "/record.txt");
            try {
                FileOutputStream fos = new FileOutputStream(savefile);
                fos.write(str.getBytes());
                fos.close();
            } catch (IOException e) {
            }
        }

// 파일이 1개 이상이면 파일 이름 출력
        if (file.listFiles().length > 0)
            for (File f : file.listFiles()) {
                String str = f.getName();

// 파일 내용 읽어오기
                String loadPath = dirPath + "/" + str;
                try {
                    FileInputStream fis = new FileInputStream(loadPath);
                    BufferedReader bufferReader = new BufferedReader(new InputStreamReader(fis));

                    while ((temp = bufferReader.readLine()) != null) {
                        content += temp;
                    }
                } catch (Exception e) {
                }
            }

        String strArray[] = content.split(",");

        // 총 데이터 값 추가
        totalhit = Integer.parseInt(strArray[0]);
        totalhit += score;
        strArray[0] = Integer.toString(totalhit);
        totalsolve = Integer.parseInt(strArray[1]);
        totalsolve += 10;
        strArray[1] = Integer.toString(totalsolve);

        // 날짜, 정답갯수 한칸씩 미루기
        strArray[6] = strArray[4];
        strArray[7] = strArray[5];

        strArray[4] = strArray[2];
        strArray[5] = strArray[3];

        strArray[2] = Integer.toString(today.get(Calendar.MONTH) + 1) + "-" + Integer.toString(today.get(Calendar.DAY_OF_MONTH));
        strArray[3] = Integer.toString(score);

        String saveStr = strArray[0] + "," + strArray[1] + "," + strArray[2] + "," + strArray[3] + "," + strArray[4] + "," +
                strArray[5] + "," + strArray[6] + "," + strArray[7];
        File savefile = new File(dirPath + "/record.txt");
        try {
            FileOutputStream fos = new FileOutputStream(savefile);
            fos.write(saveStr.getBytes());
            fos.close();
        } catch (IOException e) {
        }
    }
}
