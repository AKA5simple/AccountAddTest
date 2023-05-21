package cn.edu.jnu.accountaddtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccountType extends AppCompatActivity {
    Intent a,b,c,d,e,f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_type);
        Button button_Daily_Use=this.findViewById(R.id.button_Daily_Use);
        Button button_Food=this.findViewById(R.id.button_Food);
        Button button_Transportation=this.findViewById(R.id.button_Transportation);
        Button button_Shopping=this.findViewById(R.id.button_Shopping);
        Button button_Entertainment=this.findViewById(R.id.button_Entertainment);
        Button button_Sports=this.findViewById(R.id.button_Sports);
        Button button_Exit=this.findViewById(R.id.button_Exit);
        button_Daily_Use.setOnClickListener(new ButtonListener());
        button_Food.setOnClickListener(new ButtonListener());
        button_Transportation.setOnClickListener(new ButtonListener());
        button_Shopping.setOnClickListener(new ButtonListener());
        button_Entertainment.setOnClickListener(new ButtonListener());
        button_Sports.setOnClickListener(new ButtonListener());
        button_Exit.setOnClickListener(new ButtonListener());
    }

    public class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.button_Daily_Use:
                    a=new Intent(AccountType.this,FillInformation.class);
                    startActivity(a);
                    break;
                case R.id.button_Food:
                    b=new Intent(AccountType.this,FillInformation.class);
                    startActivity(b);
                    break;
                case R.id.button_Transportation:
                    c=new Intent(AccountType.this,FillInformation.class);
                    startActivity(c);
                    break;
                case R.id.button_Shopping:
                    d=new Intent(AccountType.this,FillInformation.class);
                    startActivity(d);
                    break;
                case R.id.button_Entertainment:
                    e=new Intent(AccountType.this,FillInformation.class);
                    startActivity(e);
                    break;
                case R.id.button_Sports:
                    f=new Intent(AccountType.this,FillInformation.class);
                    startActivity(f);
                    break;
                case R.id.button_Exit:
                    g=new Intent(AccountType.this,MainActivity.class);
                    startActivity(g);
                    break;
                default:
                    break;
            }
        }
    }
}
