package com.cuahang.smartphone.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class DanhSachSanPham extends AppCompatActivity {
    ImageView hinh;
    ListView lvDanhSachDienThoai;
    SmartPhoneAdapter smartPhoneAdapter;
    ImageView imgMua;
    ArrayList<SmartPhone>arrayList= new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listsanpham);
        Anhxa();
        addEvents();
        fakeData();
    }
    private void fakeData() {
        arrayList.add(new SmartPhone(1,"iPhone 7 Plus 32GB","Chiếc điện thoại sở hữu camera kép đầu tiên của Apple. iPhone 7 Plus là chiếc iPhone đầu tiên được trang bị camera kép có cùng độ phân giải 12 MP, đem lại khả năng chụp ảnh ở hai tiêu cự khác nhau. Camera chính chụp hình góc rộng, còn camera phụ có tiêu cự phù hợp để chụp chân dung, có tính năng chụp chân dung xóa phông (làm mờ hậu cảnh). Ngoài trái tim Apple A10 Fusion 4 nhân với hiệu năng cực kì mạnh mẽ và ấn tượng thì iPhone 7 Plus còn được cập nhật hệ điều hành mới nhất với nhiều tính năng bất ngờ, và thú vị. Màn hình Retina trên 7 Plus hỗ trợ DCI-P3 gam màu rộng.","Apple",R.drawable.iphone_7_plus,22290000,0,530));
        arrayList.add(new SmartPhone(2,"iPhone 6 64GB","Đặc điểm nổi bật của iPhone 6 32GB, iPhone 6 là một trong những smartphone được yêu thích nhất của Apple. Lắng nghe nhu cầu về thiết kế, khả năng lưu trữ và giá cả, iPhone 6 32GB được chính thức phân phối chính hãng tại Việt Nam hứa hẹn sẽ là một sản phẩm rất Hot. Không phải tự nhiên mà thiết kế của iPhone 7 gần như được giữ nguyên từ thời iPhone 6, triết lý thiết kế của Apple đã ảnh hưởng sâu sắc tới nhiều hãng sản xuất smartphone khác. Các góc cạnh được bo tròn, chế tác từ nhôm nguyên khối cho cảm giác cầm rất thoải mái, mịn và không bị cấn tay.","Apple",R.drawable.iphone_6,23290000,0,345));
        arrayList.add(new SmartPhone(3,"iPhone 6s 64GB","iPhone 6s được nâng cấp độ phân giải camera sau lên 12 MP (thay vì 8 MP như trên iPhone 6), camera có tốc độ lấy nét và chụp nhanh, thao tác chạm để chụp nhẹ nhàng. Chất lượng ảnh trong các điều kiện chụp khác nhau tốt. 3D Touch là tính năng hoàn toàn mới trên iPhone 6s, cho phép người dùng xem trước được các tùy chọn nhanh dựa vào lực nhấn mạnh hay nhẹ mà không cần phải nhấp vào ứng dụng. Để sử dụng, bạn chỉ cần nhấn vào màn hình hoặc ứng dụng 1 lực mạnh đến khi máy rung nhẹ là có thể xem được. Đáng tiếc là tính năng 3D Touch này chỉ mới được áp dụng trên các ứng dụng như: danh bạ, camera, mail, máy ảnh, facebook ... ","Apple",R.drawable.iphone_6s,21290000,0,582));
        arrayList.add(new SmartPhone(4,"Iphone XR 128GB","Màn hình tai thỏ tràn viền công nghệ LCD: Khác với iPhone Xs hay Xs Max, chiếc smartphone này sở hữu màn hình LCD. Ngoài ra, Apple cũng giới thiệu rằng, iPhone Xr được trang bị một loại công nghệ mới có tên Liquid Retina. Máy có độ phân giải 1792 x 828 Pixels cùng 1.4 triệu điểm ảnh. Apple A12 được tích hợp trí tuệ thông minh nhân tạo, mọi phản hồi trên máy đều nhanh chóng và gần như là ngay lập tức, kể cả khi bạn chơi game hay thao tác bình thường.","Apple",R.drawable.iphone_xr,18290000,0,742));
        arrayList.add(new SmartPhone(5,"SamSung J7","Thiết kế đậm chất dòng Galaxy J Series: Galaxy J7 sở hữu phong cách thiết kế đầy trẻ trung và năng động của dòng Galaxy J Series, các cạnh máy được bo tròn cùng với viền giả kim loại mang lại cảm giác thoải mái khi cầm trên tay. Nhờ được tích hợp cảm biến khẩu độ f/1.9 trên camera 13 MP cho chất lượng hình ảnh chụp ấn tượng, đồng thời hỗ trợ chụp ảnh tốt hơn trong điều kiện thiếu sáng nhờ tích hợp đèn flash. Đáng tiếc một chút khi trên Galaxy J7 không hỗ trợ 4G, tuy nhiên điều này cũng không quá cần thiết khi tốc độ 3G hay Wi-Fi hiện nay đã khá tốt.","Samsung",R.drawable.sam_sung_j7,25290000,0,832));
        arrayList.add(new SmartPhone(6,"SamSung S7","Với những nâng cấp tuyệt vời mà Samsung mang lại cho người dùng như khả năng chống nước, thiết kế hoàn hảo, Galaxy S7 sẽ khiến bạn không thể rời mắt. Điện thoại Samsung Galaxy S7 đạt chuẩn chống nước IP68 giúp bảo vệ máy vẫn an toàn khi vô tình làm đổ nước hay dính nước mưa. Galaxy S7 với các cạnh máy được bo cong một cách mềm mại, giúp máy cầm gọn trong lòng bàn tay và không hề có cảm giác cấn. Các góc cạnh ở mặt trước được mài cong 2.5D tạo cảm giác thoải mái khi thao tác trên màn hình.","Samsung",R.drawable.sam_sung_s7,15290000,0,573));
        arrayList.add(new SmartPhone(7,"Iphone 11 256GB","Nếu như trước đây iPhone Xr chỉ có một camera thì nay với iPhone 11 chúng ta sẽ có tới hai camera ở mặt sau. Ngoài camera chính vẫn có độ phân giải 12 MP thì chúng ta sẽ có thêm một camera góc siêu rộng và cũng với độ phân giải tương tự. Chúng ta sẽ có một mặt lưng hoàn thiện dưới dạng kính và Apple nói rằng họ đã sử dụng loại kính bền nhất từ trước tới nay cho chiếc iPhone này. Logo quả táo truyền thống của Apple nay đã được di chuyển về phần chính giữa của mặt lớn thay vì đặt lệch về phía cạnh trên như những đời iPhone trước đó.","Apple",R.drawable.iphone_11,19290000,0,332));
        smartPhoneAdapter.addAll(arrayList);

    }
    private void addEvents() {
        imgMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChuyenSangDonDat=new Intent(DanhSachSanPham.this, GiaoDienGioHang.class);
                for(SmartPhone smp:arrayList){
                    intentChuyenSangDonDat.putExtra(smp.getId()+"",smp);
                }
                startActivity(intentChuyenSangDonDat);
            }
        });
        lvDanhSachDienThoai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SmartPhone sm = arrayList.get(position);

                String ten = sm.getProductName();
                int gia = sm.getPrice();
                int soluong = sm.getSoluong();
                String thongtin = sm.getDescription();

                Bundle bundle = new Bundle();
                bundle.putInt("Hinh anh",sm.getAvatar());
                bundle.putString("Ten", ten);
                bundle.putInt("Gia", gia);
                bundle.putInt("So luong", soluong);
                bundle.putString("Thong tin", thongtin);

                Intent intentChiTiet = new Intent(DanhSachSanPham.this, ChiTietSanPham.class);
                intentChiTiet.putExtras(bundle);
                startActivity(intentChiTiet);

                }
        });
    }
    private void Anhxa() {
        imgMua=(ImageView)findViewById(R.id.imgMua);
        lvDanhSachDienThoai=(ListView)findViewById(R.id.lvDanhSachDienThoai);
        smartPhoneAdapter=new SmartPhoneAdapter(DanhSachSanPham.this,R.layout.itemrow);
        lvDanhSachDienThoai.setAdapter(smartPhoneAdapter);
    }
}
