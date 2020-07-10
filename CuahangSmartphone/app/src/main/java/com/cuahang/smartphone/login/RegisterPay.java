package com.cuahang.smartphone.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;

public class RegisterPay extends AppCompatActivity {
    Button btnPay, btnQuaylai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpay);
        Anhxa();
        addEvents();
    }
    private void addEvents() {
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterPay.this, "Bạn đã đặt thành công", Toast.LENGTH_SHORT).show();
                Intent intentbtnPay = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentbtnPay);
            }
        });
        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbtnQuaylai = new Intent(getApplicationContext(), GiaoDienGioHang.class);
                startActivity(intentbtnQuaylai);
            }
        });
    }
    private void Anhxa() {
        btnPay=(Button) findViewById(R.id.btnPay);
        btnQuaylai=(Button) findViewById(R.id.btnQuaylai);
    }

}

