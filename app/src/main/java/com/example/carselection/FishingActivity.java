package com.example.carselection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;

public class FishingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skii);

        // チェックボックスの初期化
        CheckBox lod = findViewById(R.id.lod);
        lod.setChecked(true);
        CheckBox esa = findViewById(R.id.esa);
        esa.setChecked(false);
        CheckBox baketsu= findViewById(R.id.baketsu);
        baketsu.setChecked(false);

        // ボタンのリスナーを登録
        Button confirmButton = findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // チェックボックスの状態を取得
                boolean lodChecked = lod.isChecked();
                boolean esaChecked = esa.isChecked();
                boolean baketsuChecked = baketsu.isChecked();

                // 次の画面に遷移
                Intent intent = new Intent(FishingActivity.this, ConfirmActivity.class);
                intent.putExtra("liftPassChecked", lodChecked);
                intent.putExtra("skiLessonChecked", esaChecked);
                intent.putExtra("equipmentRentalChecked", baketsuChecked);
                startActivity(intent);
            }
        });
    }
}