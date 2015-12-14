package chanh.killingtime;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpen extends SQLiteOpenHelper {

    public DBOpen(Context context) {
        super(context, "db_quiz", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE db_quiz"
             +   "(id integer primary key autoincrement, "
             +   "category INTEGER, quiz TEXT, right TEXT, "
              +  "wrong1 TEXT, wrong2 TEXT, wrong3 TEXT);");

        db.execSQL("insert into db_quiz (category ,quiz, right, wrong1, wrong2, wrong3)"
                + " VALUES(1, '퀴즈입니다1', '정답1', '1오답1', '1오답2', '1오답3');");
        db.execSQL("insert into db_quiz (category ,quiz, right, wrong1, wrong2, wrong3)"
                + " VALUES(2, '퀴즈입니다2', '정답2', '2오답1', '2오답2', '2오답3');");
        db.execSQL("insert into db_quiz (category ,quiz, right, wrong1, wrong2, wrong3)"
                + " VALUES(3, '퀴즈입니다3', '정답3', '3오답1', '3오답2', '3오답3');");
        db.execSQL("insert into db_quiz (category ,quiz, right, wrong1, wrong2, wrong3)"
                + " VALUES(4, '퀴즈입니다4', '정답4', '4오답1', '4오답2', '4오답3');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS db_quiz");
        onCreate(db);
    }
}
