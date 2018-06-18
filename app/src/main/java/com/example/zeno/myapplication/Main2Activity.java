package com.example.zeno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String[] str1 = {"大方蒸餃" , "珍多福燒腊家", "Mak & May", "湯皇拉麵", "P.T印度拉茶", "朴大哥的韓式炸雞", "梅香小吃", "阿伯霜淇淋", "台G店養生藥膳", "胖妞飲料", "大丸靚鍋(逢甲)", "金浦韓式泡菜火鍋", "啾哇嘿喲 韓式烤肉專門店-臺中逢甲1號店", "田季發爺燒肉 台中逢甲店", "激旨燒鳥逢甲總店", "Juice Factory", "星饗道國際自助餐-台中星享道酒店", "赤鬼牛排 - 逢甲店", "素食紅燒麵", "阿華黑輪店", "茶廬", "久享日歐懷石料理-台中星享道酒店", "復興蒸餃之家", "Da Yung's", "豬寶盒雙醬豬排", "黃金賊", "尊品原汁牛肉麵", "熊掌包", "台中逢甲塔塔咖啡屋", "Little Tibet Restaurant"};
    String[] dec = {"亞洲料理", "", "日式料理", "", "", "亞洲料理, 韓式料理", "亞洲料理, 台灣小吃/台菜", "", "亞洲料理, 台灣小吃/台菜", "", "亞洲料理, 韓式料理", "", "日式料理, 燒烤", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] loc = {"台灣台中西屯區文華路127巷6號", "台灣台中西屯區文華路6號", "台灣台中西屯區文華路121-3號", "台灣台中西屯區逢甲路20巷26-3號407", "台灣台中西屯區文華路99-2號", "台灣台中西屯區西平里文華路127巷19號", "台灣台中西屯區逢甲路20巷42號", "台灣台中西屯區逢甲路5號", "台'灣台中西屯區逢甲路74號407", "台灣台中西屯區逢甲路73號", "台灣台中西屯區逢甲路88號", "台灣台中西屯區逢甲路20巷47號", "台灣台中西屯區文華路121-29號407", "台灣台中台中市西屯區河南路二段256號", "台灣台中西屯區文華路150巷18號407", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] phone = {"+886 4 2451 9949", "+886 4 2451 9666", "", "+886 4 2452 6078", "+886 989 441 303", "+886 988 328 178", "+886 4 2451 4043", "+886 921 331 245", "+886 4 2451 3688", "+886 936 965 963", "+886 4 2451 7567", "+886 4 2451 9684", "+886 4 2451 1923", "", "+886 913 146 878", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//helloworld
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        TextView result = (TextView) findViewById(R.id.result);
        TextView descreiption = (TextView) findViewById(R.id.descreiption);
        TextView location = (TextView) findViewById(R.id.location);
        TextView phonenum = (TextView) findViewById(R.id.phonenum);
        result.setText(str1[position]);
           descreiption.setText(dec[position]);
        location.setText(loc[position]);
        phonenum.setText(phone[position]);
    }
}
