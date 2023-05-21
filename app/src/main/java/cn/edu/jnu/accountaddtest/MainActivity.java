package cn.edu.jnu.accountaddtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_Expenditure=this.findViewById(R.id.button_Expenditure);
        Button button_Income=this.findViewById(R.id.button_Income);
        Button button_Cancel=this.findViewById(R.id.button_Cancel);
        button_Expenditure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,AccountType.class);
                startActivity(intent);
            }
        });
    }
}