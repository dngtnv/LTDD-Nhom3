package com.cuahang.smartphone.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView listsp = (TextView) findViewById(R.id.listsanpham);
        listsp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, DanhSachSanPham.class);
                startActivity(intent);
            }
        });
        TextView listsp2 = (TextView) findViewById(R.id.listsanpham2);
        listsp2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, DanhSachSanPham.class);
                startActivity(intent);
            }
        });
    }
}
