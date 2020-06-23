package com.cuahang.smartphone.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class LoginSucess extends AppCompatActivity {
    ListView lvDanhSachDienThoai;
    SmartPhoneAdapter smartPhoneAdapter;
    ImageView imgMua;
    ArrayList<SmartPhone> arrayList=new ArrayList<SmartPhone>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Anhxa();
        addEvents();
        fakeData();
    }
    private void fakeData() {
        arrayList.add(new SmartPhone(1,"iPhone 7 Plus 32GB","iPhone 7 plus","Apple",R.drawable.iphone_7_plus,22290000,0));
        arrayList.add(new SmartPhone(2,"iPhone 6 ","iPhone 6","Apple",R.drawable.iphone_6,23290000,0));
        arrayList.add(new SmartPhone(3,"iPhone 6s","iPhone 6s","Apple",R.drawable.iphone_6s,21290000,0));
        arrayList.add(new SmartPhone(4,"Lumia 950 LX","Lumia","Lumia",R.drawable.lumia_950xl,18290000,0));
        arrayList.add(new SmartPhone(5,"SamSung J7","SamSung J7","Samsung",R.drawable.sam_sung_j7,25290000,0));
        arrayList.add(new SmartPhone(6,"SamSung S7","SamSung S7","Samsung",R.drawable.sam_sung_s7,15290000,0));
        arrayList.add(new SmartPhone(7,"Sony Expria","Sony Expria","Sony",R.drawable.lumia_950xl,19290000,0));
        smartPhoneAdapter.addAll(arrayList);

    }
    private void addEvents() {
        imgMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChuyenSangDonDat=new Intent(LoginSucess.this,GiaoDienGioHang.class);
                for(SmartPhone smp:arrayList){
                    intentChuyenSangDonDat.putExtra(smp.getId()+"",smp);
                }
                startActivity(intentChuyenSangDonDat);
            }
        });
    }
    private void Anhxa() {
        imgMua=(ImageView)findViewById(R.id.imgMua);
        lvDanhSachDienThoai=(ListView)findViewById(R.id.lvDanhSachDienThoai);
        smartPhoneAdapter=new SmartPhoneAdapter(LoginSucess.this,R.layout.itemrow);
        lvDanhSachDienThoai.setAdapter(smartPhoneAdapter);
    }
}
