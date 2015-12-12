package chanh.killingtime;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

public class Help extends Activity {

    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        selectData(0);
    }

    public void selectData(int index) {
        String sql = "select * from quiz_list where _id = " + index + ";";
        Cursor result = db.rawQuery(sql, null);

        int id = result.getInt(0);
        String name = result.getString(4);
        Toast.makeText(this, "index= " + id + " name=" + name, Toast.LENGTH_SHORT).show();
        result.close();
    }
}
