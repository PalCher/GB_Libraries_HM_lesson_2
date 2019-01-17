package com.nexp.pavel.gb_libraries_hm_lesson_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding3.widget.RxTextView;

import org.reactivestreams.Subscription;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        editText = findViewById(R.id.ed);

         RxTextView.textChanges(editText)
                .subscribe(charSeq ->{
                    textView.setText(charSeq);
                });

    }
}
