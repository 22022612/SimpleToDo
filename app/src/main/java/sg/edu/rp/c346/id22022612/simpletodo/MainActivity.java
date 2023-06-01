package sg.edu.rp.c346.id22022612.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editTextInput;
    Button btnAdd;
    Button btnClear;
    ArrayList<String> List = new ArrayList<String>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = findViewById(R.id.editTextInput);
        btnAdd = findViewById(R.id.btnAdd);
        btnClear = findViewById(R.id.btnClear);
        lv = findViewById(R.id.lv);

        ArrayAdapter adapter = new ArrayAdapter<> (this,
                android.R.layout.simple_list_item_1,List);

        lv.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editTextInput.getText().toString();
                List.add(input);
                adapter.notifyDataSetChanged();
                //lv.setAdapter(adapter);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List.clear();
                adapter.notifyDataSetChanged();
              //  lv.setAdapter(adapter);
            }
        });
    }
}