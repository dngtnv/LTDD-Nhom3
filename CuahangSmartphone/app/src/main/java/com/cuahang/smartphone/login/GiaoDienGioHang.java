package com.cuahang.smartphone.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class GiaoDienGioHang extends AppCompatActivity {
    ListView lvDanhSachDat;
    TextView txtTongTien;
    Button btnTroVe,btnMua;
    DanhSachDatAdapter danhSachDatAdapter;
    Integer tongTien;
    ArrayList<SmartPhone>arrayListDonDat=new ArrayList<SmartPhone>();
    ArrayList<SmartPhone>arrayListDanhSachCoDinh=new ArrayList<SmartPhone>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien_giohang);
        Anhxa();
        fakeData();
    }

    private void fakeData() {
        Intent intentNhanDuLieu=getIntent();
        for(int i=1; i<8;i++){
            SmartPhone smartPhoneNhan=(SmartPhone)intentNhanDuLieu.getSerializableExtra(i+"");
            if(smartPhoneNhan.getNumber()>0) {
                arrayListDonDat.add(smartPhoneNhan);
            }
        }
        for(SmartPhone smartPhoneDanhSachCoDinh:arrayListDonDat){
            arrayListDanhSachCoDinh.add(smartPhoneDanhSachCoDinh);
        }
        danhSachDatAdapter.addAll(arrayListDanhSachCoDinh);
        tongTien=0;
        for(SmartPhone smartPhoneGia:arrayListDanhSachCoDinh){
            tongTien=tongTien+smartPhoneGia.getNumber()*smartPhoneGia.getPrice();
        }
        txtTongTien.setText(tongTien+"VND");
        btnTroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTroVe=new Intent(GiaoDienGioHang.this,DanhSachSanPham.class);
                startActivity(intentTroVe);
            }
        });
        btnMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMua = new Intent(GiaoDienGioHang.this, RegisterPay.class);
                startActivity(intentMua);
            }
        });
    }

    private void Anhxa() {
        btnTroVe=(Button) findViewById(R.id.btnTroVe);
        btnMua=(Button) findViewById(R.id.btnMua);
        lvDanhSachDat=(ListView)findViewById(R.id.lvDanhSachDat);
        txtTongTien=(TextView)findViewById(R.id.txtTongTien);
        danhSachDatAdapter=new DanhSachDatAdapter(GiaoDienGioHang.this,R.layout.itemdanhsachdat);
        lvDanhSachDat.setAdapter(danhSachDatAdapter);
    }
}
