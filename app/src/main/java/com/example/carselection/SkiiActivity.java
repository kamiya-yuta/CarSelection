package com.example.carselection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;

public class SkiiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skii);

        // チェックボックスの初期化
        CheckBox liftPass = findViewById(R.id.liftPass);
        liftPass.setChecked(true);
        CheckBox skiLesson = findViewById(R.id.skiLesson);
        skiLesson.setChecked(false);
        CheckBox equipmentRental = findViewById(R.id.equipmentRental);
        equipmentRental.setChecked(false);

        // ボタンのリスナーを登録
        Button confirmButton = findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // チェックボックスの状態を取得
                boolean liftPassChecked = liftPass.isChecked();
                boolean skiLessonChecked = skiLesson.isChecked();
                boolean equipmentRentalChecked = equipmentRental.isChecked();

                // 次の画面に遷移
                Intent intent = new Intent(SkiiActivity.this, ConfirmActivity.class);
                intent.putExtra("liftPassChecked", liftPassChecked);
                intent.putExtra("skiLessonChecked", skiLessonChecked);
                intent.putExtra("equipmentRentalChecked", equipmentRentalChecked);
                startActivity(intent);
            }
        });
    }
}
