package chanh.killingtime;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpen extends SQLiteOpenHelper {

    public DBOpen(Context context) {
        super(context, "db_quiz", null, 1);
    }

    // 최초 실행시 Data Base 한번만 생성
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE db_quiz"
             +   "(id integer primary key autoincrement, "
             +   "category TEXT, quiz TEXT, right INTEGER, answer1 TEXT, "
              +  "answer2 TEXT, answer3 TEXT, answer4 TEXT);");

        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영화', '영화 [친구]에서 유오성은 장돈건에게 어디로 가라고 했는가?', 1, '하와이', '제주도', '울릉도', '대마도');");
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('드라마', '[발리에서 생긴 일]이란 드라마에서 조인성과 소지섭의 사랑을 받은 여배우는?', 3, '강부자', '수지', '하지원', '나문희');");
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('예능', '김병만, 류담이 출연하는 야생 버라이어티 프로그램의 이름은?', 2, '무한도전', '정글의 법칙', '런닝맨', '체험 삶의 현장');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS db_quiz");
        onCreate(db);
    }
}
