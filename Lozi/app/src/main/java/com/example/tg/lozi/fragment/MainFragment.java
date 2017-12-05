package com.example.tg.lozi.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tg.lozi.activity.R;
import com.example.tg.lozi.adapter.MainAdapter;
import com.example.tg.lozi.model.MainItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    private GridLayoutManager xLayout;
    private  View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      view =inflater.inflate(R.layout.fragment_main,container,false);

        Control();
        return view;
    }




    private void Control(){
        List<MainItemModel> rowListItem=getAllItemList();
        xLayout = new GridLayoutManager(getActivity(), 2);
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.rvItem);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(xLayout);

        MainAdapter rvAdapter=new MainAdapter(rowListItem,getActivity());
        recyclerView.setAdapter(rvAdapter);

    }

   private List<MainItemModel> getAllItemList(){
        List<MainItemModel>allItems=new ArrayList<MainItemModel>();
        allItems.add(new MainItemModel("Quanh đây",R.mipmap.find));
       allItems.add(new MainItemModel("Đồ ăn",R.mipmap.main_food));
       allItems.add(new MainItemModel("Đồ ăn ship",R.mipmap.main_ship_food));
       allItems.add(new MainItemModel("Góc con gái",R.mipmap.main_girls_corner));
       allItems.add(new MainItemModel("Đồ con trai",R.mipmap.main_boy_clothes));
       allItems.add(new MainItemModel("Mỹ phẩm",R.mipmap.main_cosmetic));
       allItems.add(new MainItemModel("Phụ kiện thời trang",R.mipmap.main_accessories_fashion));
       allItems.add(new MainItemModel("Giày sneaker",R.mipmap.main_sneaker_shoe));
       allItems.add(new MainItemModel("Tóc, Móng & Làm đẹp",R.mipmap.main_hair_nails_beautify));
       allItems.add(new MainItemModel("Đồ điện tử",R.mipmap.main_electronic_devices));
       allItems.add(new MainItemModel("Idol Hàn Quốc",R.mipmap.main_idol_korea));
       allItems.add(new MainItemModel("Fan Nhật Bản",R.mipmap.main_fan_japan));
       allItems.add(new MainItemModel("Sách & Truyện",R.mipmap.main_books_comics));
       allItems.add(new MainItemModel("Thú cưng",R.mipmap.main_pets));
       allItems.add(new MainItemModel("Xe cộ",R.mipmap.main_vehicle));
       allItems.add(new MainItemModel("Đồ chơi & Sở thích",R.mipmap.main_toys_hobbies));
       allItems.add(new MainItemModel("Âm nhạc",R.mipmap.main_musics));
       allItems.add(new MainItemModel("Đồ gia dụng",R.mipmap.main_household_article));
       allItems.add(new MainItemModel("Mẹ & Bé",R.mipmap.main_mother_baby));
       allItems.add(new MainItemModel("Vật dụng trang trí nhà cửa",R.mipmap.main_ornament));
       allItems.add(new MainItemModel("Phòng & Trọ",R.mipmap.main_home_bedsit));
       allItems.add(new MainItemModel("Hàng order trước",R.mipmap.main_order_product));
       allItems.add(new MainItemModel("Cần mua",R.mipmap.main_to_do));
       allItems.add(new MainItemModel("Homestay",R.mipmap.main_homestay));
       allItems.add(new MainItemModel("Vé sự kiện/Thẻ giảm giá",R.mipmap.main_ticket_voucher));
       allItems.add(new MainItemModel("Khác",R.mipmap.main_others));
       allItems.add(new MainItemModel("Quan tâm",R.mipmap.main_concern));
       allItems.add(new MainItemModel("",R.mipmap.main_nothing));

        return allItems;
   }
}


