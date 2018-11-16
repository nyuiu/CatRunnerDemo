package ru.rkn14.catrunnerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import ru.rkn14.catrunnerdemo.cat.CatView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean isRun = false;
    private CatView catView;
    private Button runStop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = findViewById(R.id.cat_view);
        runStop = findViewById(R.id.run_stop);
        runStop.setOnClickListener(this);

        catView.setSkin(CatView.Skins.NORMAL);
        catView.setHead(CatView.Heads.HAPPY_1);

        setButton(isRun);
    }

    @Override
    public void onClick(View view) {
        if (isRun) catView.run();
        else catView.stop();
        isRun = !isRun;
    }

    private void setButton(boolean isRun) {
        if (isRun) runStop.setText("STOP");
        else runStop.setText("RUN");
    }
}
