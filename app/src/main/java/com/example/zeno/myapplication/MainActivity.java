package com.example.zeno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] str = {"大方蒸餃" , "珍多福燒腊家", "Mak & May", "湯皇拉麵", "P.T印度拉茶", "朴大哥的韓式炸雞", "梅香小吃", "阿伯霜淇淋", "台G店養生藥膳", "胖妞飲料", "大丸靚鍋(逢甲)", "金浦韓式泡菜火鍋", "啾哇嘿喲 韓式烤肉專門店-臺中逢甲1號店", "田季發爺燒肉 台中逢甲店", "激旨燒鳥逢甲總店", "Juice Factory", "星饗道國際自助餐-台中星享道酒店", "赤鬼牛排 - 逢甲店", "素食紅燒麵", "阿華黑輪店", "茶廬", "久享日歐懷石料理-台中星享道酒店", "復興蒸餃之家", "Da Yung's", "豬寶盒雙醬豬排", "黃金賊", "尊品原汁牛肉麵", "熊掌包", "台中逢甲塔塔咖啡屋", "Little Tibet Restaurant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//1234567
        ListView listview = (ListView) findViewById(R.id.listview);
        Button btn = (Button)findViewById(R.id.btn) ;

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, str);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(onClickListView);
        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startNextPage((int)(Math.random()* 11));
            }
        });
    }



    private AdapterView.OnItemClickListener onClickListView = new AdapterView.OnItemClickListener(){
        int posistion;
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Toast.makeText(MainActivity.this,"點選第 "+(position +1) +" 個 \n內容："+str[position], Toast.LENGTH_SHORT).show();
            startNextPage(position);

        }
    };
    private void startNextPage(int position){
        Intent intent = new Intent();
        intent.setClass(this , Main2Activity.class);
        intent.putExtra("position",position);
        startActivity(intent);
    }

}
