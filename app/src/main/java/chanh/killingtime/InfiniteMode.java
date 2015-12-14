package chanh.killingtime;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class InfiniteMode extends Activity {

    static DBOpen dbopen;
    static SQLiteDatabase db;
    static TextView tView;
    static TextView problem;
    static TextView count;
    static Button ex1;
    static Button ex2;
    static Button ex3;
    static Button ex4;

    public static Toast toast;

    static int right;
    static int score;

    static Random rand = new Random(System.currentTimeMillis());
    static int random; // 문제 램덤 출력을 위한 random 변수

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

        dbopen = new DBOpen(this);
        db = dbopen.getReadableDatabase();

        toast = Toast.makeText(this, "null", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, -230);

        random = Math.abs(rand.nextInt(170) + 1);
        selectData(random);
        score = 0;
        count.setText(Integer.toString(score));

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
            }
        });
    }

    // Data 읽기(꺼내오기)
    protected void selectData(int index) {
        String sql = "select * from db_quiz where id = " + index + ";";
        Cursor result = db.rawQuery(sql, null);

        if (result.moveToFirst()) {
            String category = result.getString(1);
            String quiz = result.getString(2);
            right = result.getInt(3);
            String answer1 = result.getString(4);
            String answer2 = result.getString(5);
            String answer3 = result.getString(6);
            String answer4 = result.getString(7);

            tView.setText(category);
            problem.setText(quiz);
            ex1.setText(answer1);
            ex2.setText(answer2);
            ex3.setText(answer3);
            ex4.setText(answer4);
        }
        result.close();
    }

    protected void readDb() {
        random = Math.abs(rand.nextInt(170) + 1);
        selectData(random);
        count.setText(Integer.toString(score));
    }
}