package com.cuahang.smartphone.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChiTietSanPham extends AppCompatActivity {
    ImageView hinhSMP;
    TextView tenSMP;
    TextView giaSMP;
    TextView soLuong;
    TextView thongtinSMP;
    Button btnQuaylai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietsanpham);
        hinhSMP=(ImageView)findViewById(R.id.imgHinhDienThoai);
        tenSMP=(TextView)findViewById(R.id.txtTenDienThoai);
        giaSMP=(TextView)findViewById(R.id.txtGiaDienThoai);
        soLuong=(TextView)findViewById(R.id.txtSoLuong);
        thongtinSMP=(TextView)findViewById(R.id.txtThongTin);
        btnQuaylai=(Button) findViewById(R.id.btnQuaylai);

        Bundle bundle = getIntent().getExtras();

        int hinh = bundle.getInt("Hinh anh");
        String ten = bundle.getString("Ten");
        int gia = bundle.getInt("Gia");
        int soluong = bundle.getInt("So luong");
        String thongtin = bundle.getString("Thong tin");

        hinhSMP.setImageResource(hinh);
        tenSMP.setText("Tên Sản phẩm: " + ten);
        giaSMP.setText("Giá: " + gia + " VNĐ");
        soLuong.setText("Hàng còn: " + soluong);
        thongtinSMP.setText("Thông tin chi tiết:\n" + thongtin);

        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbtnQuaylai = new Intent(ChiTietSanPham.this, DanhSachSanPham.class);
                startActivity(intentbtnQuaylai);
            }
        });

    }
}