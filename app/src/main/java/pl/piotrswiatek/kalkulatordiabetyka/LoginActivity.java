package pl.piotrswiatek.kalkulatordiabetyka;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class LoginActivity extends Activity {

    SQLiteDatabase usersDb = null;
    TextView textViewPassword, textViewLogin;
    EditText editTextPassword, editTextLogin;
    Button btnLogin, btnCreateUser;
    File database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textViewPassword = (TextView) findViewById(R.id.password_textView);
        textViewLogin = (TextView) findViewById(R.id.login_textView);
        editTextLogin = (EditText) findViewById(R.id.password_editText);
        editTextPassword = (EditText) findViewById(R.id.password_editText);
        btnCreateUser = (Button) findViewById(R.id.create_user_btn);
        btnLogin = (Button) findViewById(R.id.logIn_btn);

        checkingIfDatabaseFileExist(database);

    }

    private void checkingIfDatabaseFileExist(File database) {
        if (database!=null) { btnLogin.setClickable(true);}
    }

    public void logInUser(View view) {

        Toast.makeText(this, "Kliknieto Zaloguj", Toast.LENGTH_SHORT).show();

    }

    public void createUser(View view) {

        Intent getCreateUserScreen = new Intent(this,CreateUserActivity.class);
        //final int result = 1;


            if (database==null) {
                //TODO ad code for login
                //usersDb = this.openOrCreateDatabase("UsersData", MODE_PRIVATE, null);
               // database = getApplicationContext().getDatabasePath("UsersData");
                //usersDb.execSQL("CREATE TABLE IF NOT EXISTS users" +
                        //"(id integer primary key, name VARCHAR, password VARCHAR, INTEGER insulinRessistance);");
               // btnLogin.setClickable(true);
                startActivity(getCreateUserScreen);

            } else if(database.exists()){
                //Toast.makeText(this, "otwieramy baze danych", Toast.LENGTH_SHORT).show();
                startActivity(getCreateUserScreen);
            }


    }
}
