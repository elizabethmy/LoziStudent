package com.example.tg.lozi.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tg.lozi.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridLayoutManager xLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(null);
        Control();
    }

    private void Control(){
        List<ItemObject> rowListItem=getAllItemList();
        xLayout = new GridLayoutManager(MainActivity.this, 2);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.rvItem);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(xLayout);

        MainAdapter rvAdapter=new MainAdapter(rowListItem,MainActivity.this);
        recyclerView.setAdapter(rvAdapter);
    }

   private List<ItemObject> getAllItemList(){
        List<ItemObject>allItems=new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Quanh đây",R.mipmap.find));
       allItems.add(new ItemObject("Đồ ăn",R.mipmap.main_food));
       allItems.add(new ItemObject("Đồ ăn ship",R.mipmap.main_ship_food));
       allItems.add(new ItemObject("Góc con gái",R.mipmap.main_girls_corner));
       allItems.add(new ItemObject("Đồ con trai",R.mipmap.main_boy_clothes));
       allItems.add(new ItemObject("Mỹ phẩm",R.mipmap.main_cosmetic));
       allItems.add(new ItemObject("Phụ kiện thời trang",R.mipmap.main_accessories_fashion));
       allItems.add(new ItemObject("Giày sneaker",R.mipmap.main_sneaker_shoe));
       allItems.add(new ItemObject("Tóc, Móng & Làm đẹp",R.mipmap.main_hair_nails_beautify));
       allItems.add(new ItemObject("Đồ điện tử",R.mipmap.main_electronic_devices));
       allItems.add(new ItemObject("Idol Hàn Quốc",R.mipmap.main_idol_korea));
       allItems.add(new ItemObject("Fan Nhật Bản",R.mipmap.main_fan_japan));
       allItems.add(new ItemObject("Sách & Truyện",R.mipmap.main_books_comics));
       allItems.add(new ItemObject("Thú cưng",R.mipmap.main_pets));
       allItems.add(new ItemObject("Xe cộ",R.mipmap.main_vehicle));
       allItems.add(new ItemObject("Đồ chơi & Sở thích",R.mipmap.main_toys_hobbies));
       allItems.add(new ItemObject("Âm nhạc",R.mipmap.main_musics));
       allItems.add(new ItemObject("Đồ gia dụng",R.mipmap.main_household_article));
       allItems.add(new ItemObject("Mẹ & Bé",R.mipmap.main_mother_baby));
       allItems.add(new ItemObject("Vật dụng trang trí nhà cửa",R.mipmap.main_ornament));
       allItems.add(new ItemObject("Phòng & Trọ",R.mipmap.main_home_bedsit));
       allItems.add(new ItemObject("Hàng order trước",R.mipmap.main_order_product));
       allItems.add(new ItemObject("Cần mua",R.mipmap.main_to_do));
       allItems.add(new ItemObject("Homestay",R.mipmap.main_homestay));
       allItems.add(new ItemObject("Vé sự kiện/Thẻ giảm giá",R.mipmap.main_ticket_voucher));
       allItems.add(new ItemObject("Khác",R.mipmap.main_others));
       allItems.add(new ItemObject("Quan tâm",R.mipmap.main_concern));
       allItems.add(new ItemObject("",R.mipmap.main_nothing));

        return allItems;
   }
}


