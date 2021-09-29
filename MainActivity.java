package com.example.idk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView text_date;
    private TextView text_numbers;
    private EditText editTextNumber;

    private Button button_minus;
    private Button button_plus;
    private Button button_reset;

    private Button button_minus5;
    private Button button_plus5;
    private Button button_minus10;
    private Button button_plus10;

    //Constants
    int number=0;
    int minus=1;
    int plus=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.d(TAG, "HEemos llamado a onPause()");

        link();
        start_date();
        button_minus_onClick();
        button_plus_onClick();

        button_minus5_onClick();
        button_minus10_onClick();
        button_plus5_onClick();
        button_plus10_onClick();

        button_reset_onClick();
    }

    public void link(){
        button_minus=findViewById(R.id.button_minus);
        button_plus=findViewById(R.id.button_plus);
        button_reset=findViewById(R.id.button_reset);

        button_minus5=findViewById(R.id.button_minus5);
        button_minus10=findViewById(R.id.button_minus10);
        button_plus5=findViewById(R.id.button_plus5);
        button_plus10=findViewById(R.id.button_plus10);

        editTextNumber=findViewById(R.id.editTextNumber);
        text_date=findViewById(R.id.text_date);
        text_numbers=findViewById(R.id.text_numbers);
    }

    public void start_date(){
        String currentDate = new SimpleDateFormat
                ("dd-MM-yyyy", Locale.getDefault())
                .format(new Date());
        text_date.setText(currentDate);
    }

    public boolean isFull(){
        if (editTextNumber.getText().toString().trim().length() > 0)
            return true;
        return false;
    }

    public void button_minus_onClick(){
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                if(!isFull()){
                    minus=1;
                    number=number-minus;
                    text_numbers.setText(""+number);
                }else{
                    minus=Integer.parseInt(editTextNumber
                            .getText().toString());
                    number=number-minus;
                    text_numbers.setText(""+number);
                    }
                }
        });
    }

    public void button_plus_onClick(){
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                if(!isFull()){
                    plus=1;
                    number=number+plus;
                    text_numbers.setText(""+number);
                }else{
                    plus=Integer.parseInt(editTextNumber
                            .getText().toString());
                    number=number+plus;
                    text_numbers.setText(""+number);
                }
            }
        });
    }

    public void button_minus5_onClick(){
        button_minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                minus=5;
                number=number-minus;
                text_numbers.setText(""+number);
            }
        });
    }

    public void button_minus10_onClick(){
        button_minus10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                minus=10;
                number=number-minus;
                text_numbers.setText(""+number);
            }
        });
    }

    public void button_plus5_onClick(){
        button_plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                plus=5;
                number=number+plus;
                text_numbers.setText(""+number);
            }
        });
    }

    public void button_plus10_onClick(){
        button_plus10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                plus=10;
                number=number+plus;
                text_numbers.setText(""+number);
            }
        });
    }

    public void button_reset_onClick(){
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                number=0;
                minus=1;
                plus=1;
                editTextNumber.setText("");
                text_numbers.setText(""+number);
            }
        });
    }
}
