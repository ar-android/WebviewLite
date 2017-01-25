package com.ahmadrosid.webviewlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ahmadrosid.lib.webviewlite.WebviewLiteActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), WebviewLiteActivity.class);
                intent.putExtra("url", "http://jasaconnect.com/teknisi");
                intent.putExtra("title", "Helper");
                startActivity(intent);
            }
        });
    }
}
