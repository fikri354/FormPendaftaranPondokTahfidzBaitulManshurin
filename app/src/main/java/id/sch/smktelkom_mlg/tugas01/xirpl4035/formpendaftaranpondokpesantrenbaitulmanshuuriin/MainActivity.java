package id.sch.smktelkom_mlg.tugas01.xirpl4035.formpendaftaranpondokpesantrenbaitulmanshuuriin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNama;
    TextView tvRumah;
    TextView tvHafalan;
    TextView tvHafal;
    EditText etNama;
    EditText etRumah;
    Spinner spHafalan;
    Button bOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvRumah = (TextView) findViewById(R.id.textViewAlamat);
        tvHafalan = (TextView) findViewById(R.id.textViewHafalan);
        tvHafal = (TextView) findViewById(R.id.textViewHafal);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etRumah = (EditText) findViewById(R.id.editTextRumah);
        spHafalan = (Spinner) findViewById(R.id.spinnerHafalan);
        bOk = (Button) findViewById(R.id.buttonOK);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    doclick();
                }

            }
        });
    }

    private void doclick() {

    }
}
