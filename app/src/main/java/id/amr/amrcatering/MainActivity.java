package id.amr.amrcatering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bLogin, bRegister;
    EditText eUser, ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRegister = (Button) findViewById(R.id.btnRegister);
        bLogin = (Button) findViewById(R.id.btnLogin);
        eUser = (EditText) findViewById(R.id.editUser);
        ePassword = (EditText) findViewById(R.id.editPassword);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sukses", Toast.LENGTH_SHORT).show();
            }
        });

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });


    }
}
