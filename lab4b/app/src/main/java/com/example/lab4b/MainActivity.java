package com.example.lab4b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter ca;
    ArrayList<Goods> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);
        arrayList = new ArrayList<Goods>();
        arrayList.add(new Goods("Ca nau lau","Shop DeVang",R.drawable.ca_nau_lau));
        arrayList.add(new Goods("1kg ga kho bo toi","Shop LTD",R.drawable.ga_bo_toi));
        arrayList.add(new Goods("Xe can cau da nang","Shop do choi",R.drawable.xa_can_cau));
        arrayList.add(new Goods("Do choi dang mo hinh","Shop the gioi ",R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new Goods("Lanh dao gian don","Minh long book",R.drawable.lanh_dao_gian_don));
        arrayList.add(new Goods("Heu long con tre","Minh long book",R.drawable.hieu_long_con_tre));

     ca= new CustomGoodsAdapter(this,R.layout.items_listtview,arrayList);
     lvGoods.setAdapter(ca);
    }
}