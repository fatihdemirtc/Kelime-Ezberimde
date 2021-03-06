package com.kelimeezberimde;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnfav,btncontinuing,btncompleted,btntestyourself,btnsettings;
        btnfav=(Button) findViewById(R.id.btnfav);
        btncontinuing=(Button) findViewById(R.id.btncontiuning);
        btncompleted=(Button) findViewById(R.id.btncompleted);
        btntestyourself=(Button) findViewById(R.id.btntest);
        btnsettings=(Button) findViewById(R.id.btnsettings);

        btnfav.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentfav;
                intentfav = new Intent(view.getContext(), FavoriWords.class);
                startActivity(intentfav);
            }
        });
        btncontinuing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentcontinuing;
                intentcontinuing = new Intent(view.getContext(), ContinuingWords.class);
                startActivity(intentcontinuing);
            }
        });
        btncompleted.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentcompleted;
                intentcompleted = new Intent(view.getContext(), CompletedWords.class);
                startActivity(intentcompleted);
            }
        });
        btntestyourself.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intenttest;
                intenttest = new Intent(view.getContext(), TestYourself.class);
                startActivity(intenttest);
            }
        });
        btnsettings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentsettings;
                intentsettings = new Intent(view.getContext(), ChoiceClock.class);
                startActivity(intentsettings);
            }
        });
    }
}
