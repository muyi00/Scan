package com.dlh.tools;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/4/24.
 */

public class ScanView extends LinearLayout{
    private Context context;
    private EditText input_et;
    private Button scan_btn;

    public ScanView(Context context) {
        super(context);
    }

    public ScanView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    private void initView(Context context, AttributeSet attrs){
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.scan_view_layout, this, true);
        input_et= (EditText) findViewById(R.id.input_et);
        scan_btn= (Button) findViewById(R.id.scan_btn);
    }



}
