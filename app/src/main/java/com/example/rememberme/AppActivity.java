package com.example.rememberme;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AppActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.app_main);
            setup();
        }
        private void setup() {

        }

}
