package com.example.driverules;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox rulesCB;

    TextView rulesTextTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rulesCB = findViewById(R.id.rulesCB);
        rulesTextTV = findViewById(R.id.rulesTextTV);

        rulesCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rulesTextTV.setText("1.1. Настоящие Правила дорожного движения (в дальнейшем — Правила) устанавливают\n" +
                            "единый порядок дорожного движения на всей территории Российской Федерации. Другие\n" +
                            "нормативные акты, касающиеся дорожного движения, должны основываться на требованиях Правил и не противоречить им.\n" +
                            "В пункте 1.2 будут рассмотрены основные понятия и термины, которые используются в Правилах.\n" +
                            "В официальном тексте Правил они размещены в алфавитном порядке. Мы же с вами\n" +
                            "будем рассматривать их несколько иначе, объединив по смыслу.");
                } else {
                    rulesTextTV.setText("");
                }
            }
        });
    }
}