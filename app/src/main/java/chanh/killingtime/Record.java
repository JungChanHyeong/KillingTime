package chanh.killingtime;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Record extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record);

        String dirPath = getFilesDir().getAbsolutePath();
        File file = new File(dirPath);
        File file2 = new File(dirPath + "/record.txt");

        ImageView rank = (ImageView) findViewById(R.id.rank);

        String content = "", temp = "";
        TextView totalrate, totalhit, totalpercent, day1, day2, day3, hit1, hit2, hit3, rate1, rate2, rate3;
        totalhit = (TextView) findViewById(R.id.totalhit);
        totalrate = (TextView) findViewById(R.id.totalsolve);
        totalpercent = (TextView) findViewById(R.id.totalpercent);
        day1 = (TextView) findViewById(R.id.day1);
        day2 = (TextView) findViewById(R.id.day2);
        day3 = (TextView) findViewById(R.id.day3);
        hit1 = (TextView) findViewById(R.id.hit1);
        hit2 = (TextView) findViewById(R.id.hit2);
        hit3 = (TextView) findViewById(R.id.hit3);
        rate1 = (TextView) findViewById(R.id.rate1);
        rate2 = (TextView) findViewById(R.id.rate2);
        rate3 = (TextView) findViewById(R.id.rate3);


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
                    Log.v(null, "" + content);
                } catch (Exception e) {
                }
            }

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);//소수점 아래 최소 자리수
        nf.setMaximumFractionDigits(2);//소수점 아래 최대자리수

        String strArray[] = content.split(",");
        totalhit.setText(strArray[0]);
        totalrate.setText(strArray[1]);
        totalpercent.setText(nf.format(Double.parseDouble(strArray[0]) / Double.parseDouble(strArray[1]) * 100) + "%");
        day1.setText(strArray[2]);
        hit1.setText(strArray[3]);
        rate1.setText(Double.parseDouble(strArray[3]) / 10 * 100 + "%");
        day2.setText(strArray[4]);
        hit2.setText(strArray[5]);
        rate2.setText(Double.parseDouble(strArray[5]) / 10 * 100 + "%");
        day3.setText(strArray[6]);
        hit3.setText(strArray[7]);
        rate3.setText(Double.parseDouble(strArray[7]) / 10 * 100 + "%");

        double save = Double.parseDouble(strArray[0]) / Double.parseDouble(strArray[1]) * 100;
        if (save < 50) {
            rank.setImageResource(R.drawable.d);
        } else if (save >= 50 && save < 75) {
            rank.setImageResource(R.drawable.c);
        } else if (save >= 75 && save < 90) {
            rank.setImageResource(R.drawable.b);
        } else if (save >= 90 && save <= 100) {
            rank.setImageResource(R.drawable.a);
        }
    }
}
