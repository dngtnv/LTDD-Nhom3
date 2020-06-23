package com.cuahang.smartphone.login;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DanhSachDatAdapter extends ArrayAdapter<SmartPhone> {
    Activity context;
    int resource;
    public DanhSachDatAdapter(Activity context, int resource) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View customView=this.context.getLayoutInflater().inflate(this.resource,null);

        TextView txtTenDienThoai1=(TextView)customView.findViewById(R.id.txtTenDienThoai1);
        TextView txtGiaDienThoai1=(TextView)customView.findViewById(R.id.txtGiaDienThoai1);
        ImageView imgHinhDienThoai1=(ImageView)customView.findViewById(R.id.imgHinhDienThoai1);
        TextView txtSoLuong1=(TextView) customView.findViewById(R.id.txtSoLuong1);

        SmartPhone sm=getItem(position);
        txtTenDienThoai1.setText(sm.getProductName());
        txtGiaDienThoai1.setText(sm.getPrice()+"");
        txtSoLuong1.setText(sm.getNumber()+"");
        imgHinhDienThoai1.setImageResource(sm.getAvatar());
        return customView;
    }
}