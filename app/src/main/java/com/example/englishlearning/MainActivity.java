package com.example.englishlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int[] ID_DRAWABLES = {R.drawable.ic_cocktail, R.drawable.ic_education, R.drawable.ic_flight,
                                                R.drawable.ic_hospital, R.drawable.ic_hotel, R.drawable.ic_mess,
                                                R.drawable.ic_movie, R.drawable.ic_restaurant, R.drawable.ic_store,
                                                R.drawable.ic_time};
    private static final int[] ID_TEXTS = {R.string.txt_cocktail, R.string.txt_education, R.string.txt_flight,
                                            R.string.txt_hospital, R.string.txt_hospital, R.string.txt_mess,
                                            R.string.txt_movie, R.string.txt_restaurant, R.string.txt_store,
                                            R.string.txt_time};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        LinearLayout lnMain = findViewById(R.id.ln_main);
        lnMain.removeAllViews();
        for (int i = 0; i < ID_DRAWABLES.length; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.item_topic, null);
            ImageView ivTopic = view.findViewById(R.id.iv_topic);
            TextView tvTopic = view.findViewById(R.id.tv_topic);
            ivTopic.setImageResource(ID_DRAWABLES[i]);
            tvTopic.setText(ID_TEXTS[i]);

            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );
            view.setLayoutParams(param);
            lnMain.addView(view);
        }
    }
}