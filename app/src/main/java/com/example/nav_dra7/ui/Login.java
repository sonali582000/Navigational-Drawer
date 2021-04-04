package com.example.nav_dra7.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nav_dra7.R;
import com.example.nav_dra7.ui.ui.main.LoginFragment;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LoginFragment.newInstance())
                    .commitNow();
        }


    }
}