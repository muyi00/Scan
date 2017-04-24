package com.dlh.tools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button scan_btn, input_btn;
    private EditText input_et;
    private TextView data_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_et= (EditText) findViewById(R.id.input_et);
        input_btn= (Button) findViewById(R.id.input_btn);
        scan_btn= (Button) findViewById(R.id.scan_btn);
        data_tv= (TextView) findViewById(R.id.data_tv);

        scan_btn.setOnClickListener(onClickListener);
        input_btn.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view==scan_btn){

            }else if(view==input_btn){
                setData();
            }
        }
    };

    private void setData(){
        String data=input_et.getText().toString();
        data_tv.append(data+"\r\n");
        input_et.requestFocus();
        input_et.setText("");
    }

}
