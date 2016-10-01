package id.sch.smktelkom_mlg.tugas01.xirpl4035.formpendaftaranpondokpesantrenbaitulmanshuuriin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView tvNama;
    TextView tvRumah;
    TextView tvHafalan;
    TextView tvHafal;
    TextView tvHasil;
    EditText etNama;
    EditText etRumah;
    Spinner spHafalan;
    String[] arHafalan = {"Juz 1", "Juz 2", "Juz 3"};
    ArrayList<String> listHafalan = new ArrayList<>();
    ArrayAdapter<String> adapter;
    Button bOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listHafalan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spHafalan.setAdapter(adapter);

        spHafalan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                {
                    listHafalan.clear();
                    listHafalan.addAll(Arrays.asList(arHafalan[pos]));
                    adapter.notifyDataSetChanged();
                    spHafalan.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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
