package ru.rkn14.catrunnerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import ru.rkn14.catrunnerdemo.cat.CatView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CatView catView = findViewById(R.id.cat_view);
        catView.run();
    }
}
