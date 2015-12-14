package chanh.killingtime;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class InfiniteMode extends Activity {

    DBOpen dbopen;
    SQLiteDatabase db;
    TextView tView1;
    TextView tView2;
    TextView tView3;
    TextView tView4;
    TextView tView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infinite_mode);

        dbopen = new DBOpen(this);
        db = dbopen.getReadableDatabase();

        selectData(2);
    }

    // Data 읽기(꺼내오기)
    public void selectData(int index){
        String sql = "select * from db_quiz where id = "+index+";";
        Cursor result = db.rawQuery(sql, null);

        tView1 = (TextView) findViewById(R.id.textView);
        tView2 = (TextView) findViewById(R.id.textView2);
        tView3 = (TextView) findViewById(R.id.textView3);
        tView4 = (TextView) findViewById(R.id.textView4);
        tView5 = (TextView) findViewById(R.id.textView5);

        if(result.moveToFirst()){
            String quiz = result.getString(2);
            String right = result.getString(3);
            String wrong1 = result.getString(4);
            String wrong2 = result.getString(5);
            String wrong3 = result.getString(6);

            tView1.setText(quiz);
            tView2.setText(right);
            tView3.setText(wrong1);
            tView4.setText(wrong2);
            tView5.setText(wrong3);
        }
        result.close();
    }
}