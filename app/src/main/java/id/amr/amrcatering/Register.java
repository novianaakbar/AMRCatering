package id.amr.amrcatering;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbhelper;
    EditText eNama, eEmail, eTelp, ePass;
    Button bReg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle("Register");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dbhelper = new DataHelper(this);
        eNama = (EditText) findViewById(R.id.editNama);
        eEmail = (EditText) findViewById(R.id.editEmail);
        eTelp = (EditText) findViewById(R.id.editTelp);
        ePass = (EditText) findViewById(R.id.editPassword);
        bReg = (Button) findViewById(R.id.btnRegister);

        bReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbhelper.getWritableDatabase();
                db.execSQL("insert into user(nama, email, telp, password) values ('"+
                        eNama.getText().toString()+"','"+
                        eEmail.getText().toString()+"','"+
                        eTelp.getText().toString()+"','"+
                        ePass.getText().toString()+"')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
