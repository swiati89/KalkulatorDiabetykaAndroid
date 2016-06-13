package pl.piotrswiatek.kalkulatordiabetyka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Piter on 2016-06-10.
 */
public class CreateUserActivity extends Activity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user_activity);
        Intent activityThatCalled = getIntent();


    }

}
