package app.practise.budgetdeft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button mButtonSignIn = (Button) findViewById(R.id.button_signin);
    Button mButtonSignUp = (Button) findViewById(R.id.button_signup);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mButtonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSignInActivity();
            }
        });

        mButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    private void launchSignInActivity() {
        Intent intentSignIn = new Intent(this, SignInActivity.class);
        startActivity(intentSignIn);
    }
}
