package fr.utt.if26.ben_miled_tp04;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.B01);
        Button b2 = (Button)findViewById(R.id.B02);

        b1.setBackgroundColor(Color.RED);
        b2.setBackgroundColor(Color.RED);

        b1.setOnClickListener(this);
        b1.setOnLongClickListener(clickLong);
        b2.setOnClickListener(this);
        b2.setOnLongClickListener(clickLong);

    }


    public void onClick(View view) {
        view.setBackgroundColor(Color.GREEN);
    }

    private View.OnLongClickListener clickLong = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {

            Intent intent = new Intent();

            Class target = null;

            if (v == findViewById(R.id.B01)) {
                target = ResultActivity.class;
            }
            else if (v == findViewById(R.id.B02)) {
                target = GridActivity.class;
            }

            intent = new Intent(v.getContext(), target);

            startActivity(intent);

            return false;
        }
    };

}
