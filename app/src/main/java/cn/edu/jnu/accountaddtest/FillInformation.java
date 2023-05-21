package cn.edu.jnu.accountaddtest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class FillInformation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_information);
        TextView textViewRemark = this.findViewById(R.id.textView_remark);
        TextView textViewMoney = this.findViewById(R.id.textView_money);
        EditText editTextRemark = this.findViewById(R.id.edittext_remark);
        EditText editTextMoney = this.findViewById(R.id.edittext_money);
        Button buttonFinish = this.findViewById(R.id.button_finish);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FillInformation.this,AccountType.class);
                startActivity(intent);
                Toast.makeText(FillInformation.this,"添加完成",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
