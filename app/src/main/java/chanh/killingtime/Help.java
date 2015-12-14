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
