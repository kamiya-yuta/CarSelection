package com.example.carselection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;

public class BbqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skii);

        // チェックボックスの初期化
        CheckBox iron = findViewById(R.id.iron);
        iron.setChecked(true);
        CheckBox bado = findViewById(R.id.bado);
        bado.setChecked(false);
        CheckBox food = findViewById(R.id.food);
        food.setChecked(false);

        // ボタンのリスナーを登録
        Button confirmButton = findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // チェックボックスの状態を取得
                boolean ironChecked = iron.isChecked();
                boolean badoChecked = bado.isChecked();
                boolean foodRentalChecked = food.isChecked();

                // 次の画面に遷移
                Intent intent = new Intent(BbqActivity.this, ConfirmActivity.class);
                intent.putExtra("liftPassChecked", ironChecked);
                intent.putExtra("skiLessonChecked", badoChecked);
                intent.putExtra("equipmentRentalChecked", foodRentalChecked);
                startActivity(intent);
            }
        });
    }
}