package cn.edu.jnu.accountaddtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_Expenditure=this.findViewById(R.id.button_Expenditure);
        Button button_Income=this.findViewById(R.id.button_Income);
        Button button_Cancel=this.findViewById(R.id.button_Cancel);
        button_Expenditure.setOnClickListener(new MainActivity.ButtonListener());
        button_Income.setOnClickListener(new MainActivity.ButtonListener());
        button_Cancel.setOnClickListener(new MainActivity.ButtonListener());

    }
    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_Expenditure:
                    a=new Intent(MainActivity.this,AccountType.class);
                    startActivity(a);
                    break;
                case R.id.button_Income:
                    b=new Intent(MainActivity.this,AccountType.class);
                    startActivity(b);
                    break;
                case R.id.button_Cancel:
                    finish();
                    System.exit(0);
                    break;
            }
        }
    }
}