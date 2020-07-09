package com.cuahang.smartphone.login;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SmartPhoneAdapter extends ArrayAdapter<SmartPhone> {
    Activity context;
    int resource;
    public SmartPhoneAdapter(Activity context, int resource) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View customView=this.context.getLayoutInflater().inflate(this.resource,null);

        ImageView imgHinhDienThoai=(ImageView)customView.findViewById(R.id.imgHinhDienThoai);
        TextView txtTenDienThoai=(TextView)customView.findViewById(R.id.txtTenDienThoai);
        TextView txtGiaDienThoai=(TextView)customView.findViewById(R.id.txtGiaDienThoai);
        ImageView imgThem=(ImageView) customView.findViewById(R.id.imgThemdienThoai);
//        ImageView imgXoa=(ImageView) customView.findViewById(R.id.imgXoasanpham);

        final SmartPhone sm = getItem(position);
        txtTenDienThoai.setText(sm.getProductName());
        txtGiaDienThoai.setText(sm.getPrice()+"");
        imgHinhDienThoai.setImageResource(sm.getAvatar());
        imgThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Đã thêm 1 "+sm.getProductName(),Toast.LENGTH_SHORT).show();
                sm.setNumber(sm.getNumber()+1);
            }
        });
//        imgXoa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(),"Đã xóa 1 "+sm.getProductName(),Toast.LENGTH_SHORT).show();
//                sm.setNumber(sm.getNumber()-1);
//            }
//        });
        return customView;
    }
}
