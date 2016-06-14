package pl.piotrswiatek.kalkulatordiabetyka;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Piter on 2016-06-10.
 */
public class CreateUserActivity extends Activity {
    //
    SQLiteDatabase usersDb = null;
    File database;
    Button addUser;
    TextView textViewCreateUserInfo;
    EditText editTextUserName, editTextUserInsulinRessistance, editTextUserPassword;
    String userName, userPassword;
    int userInsulinRessistance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user_activity);

        textViewCreateUserInfo = (TextView) findViewById(R.id.create_user_info_textView);
        editTextUserName = (EditText) findViewById(R.id.user_name_editText);
        editTextUserInsulinRessistance = (EditText) findViewById(R.id.set_insulinresisstance_editText);
        editTextUserPassword = (EditText) findViewById(R.id.set_password_editText);
        //Intent activityThatCalled = getIntent();
        //tworze lub otwieram baze danych w systemie po czym zapisuje ja do pliku
        try {
            usersDb = this.openOrCreateDatabase("UsersData", MODE_PRIVATE, null);
            usersDb.execSQL("CREATE TABLE IF NOT EXISTS users" +
                    "(id integer primary key, name VARCHAR, INTEGER insulinRessistance, password VARCHAR);");
            database = getApplicationContext().getDatabasePath("UsersData");
        } catch (Exception e) {
            Log.e("Users ERROR", "Error Creating Database");
        }
    }

    public void addUserToDB(View view) {
// tworze liste imion z bazy
        ArrayList<Object> namesInDb = new ArrayList<Object>();

//////////////////////////////////////////////////////////////////////////
        Cursor cursor = usersDb.rawQuery("SELECT name FROM user", null);

        int nameColumn = cursor.getColumnIndex("name");
        cursor.moveToFirst();

        if(cursor != null && (cursor.getCount() > 0)){
            do{
                String name = cursor.getString(nameColumn);
                namesInDb.add(name);
            }while(cursor.moveToNext());
        } else {

            Toast.makeText(this, "Pusta baza danych", Toast.LENGTH_SHORT).show();


        }





        //userName = editTextUserName.getText().toString();
        //userPassword = editTextUserPassword.getText().toString();
        //userInsulinRessistance = Integer.parseInt(editTextUserInsulinRessistance.getText().toString());
// Sprawdzam czy uzytkownik wprowadzil wymagane dane
       // if (editTextUserName == null || editTextUserPassword == null || editTextUserInsulinRessistance == null) {
            ///Toast.makeText(this,"Wprowadz wszystkie dane użutkownika",Toast.LENGTH_SHORT).show();
            //textViewCreateUserInfo.setText("Wprowadź wszystkie dane");
// Sprawdzam czy baza danych istnieje i czy nazwy uzytkownika sie nie dubluja
       /* }else if(database!=null){

        }*/

        }
    }
//}
