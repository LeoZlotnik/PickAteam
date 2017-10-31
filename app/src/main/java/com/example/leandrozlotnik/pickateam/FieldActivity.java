package com.example.leandrozlotnik.pickateam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by leandrozlotnik on 17/10/2017.
 */

public class FieldActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field);

        Intent intent = getIntent();
        String fname0 = intent.getStringExtra("name0");
        String lname0 = intent.getStringExtra("lname0");
        int att0 = intent.getIntExtra("0att",0);
        int def0 = intent.getIntExtra("0def",0);

        String fname1 = intent.getStringExtra("name1");
        String lname1 = intent.getStringExtra("lname1");
        int att1 = intent.getIntExtra("1att",0);
        int def1 = intent.getIntExtra("1def",0);

        String fname2 = intent.getStringExtra("name2");
        String lname2 = intent.getStringExtra("lname2");
        int att2 = intent.getIntExtra("2att",0);
        int def2 = intent.getIntExtra("2def",0);

        String fname3 = intent.getStringExtra("name3");
        String lname3 = intent.getStringExtra("lname3");
        int att3 = intent.getIntExtra("3att",0);
        int def3 = intent.getIntExtra("3def",0);

        String fname4 = intent.getStringExtra("name4");
        String lname4 = intent.getStringExtra("lname4");
        int att4 = intent.getIntExtra("4att",0);
        int def4 = intent.getIntExtra("4def",0);

        String fname5 = intent.getStringExtra("name5");
        String lname5 = intent.getStringExtra("lname5");
        int att5 = intent.getIntExtra("5att",0);
        int def5 = intent.getIntExtra("5def",0);

        String fname6 = intent.getStringExtra("name6");
        String lname6 = intent.getStringExtra("lname6");
        int att6 = intent.getIntExtra("6att",0);
        int def6 = intent.getIntExtra("6def",0);

        String fname7 = intent.getStringExtra("name7");
        String lname7 = intent.getStringExtra("lname7");
        int att7 = intent.getIntExtra("7att",0);
        int def7 = intent.getIntExtra("7def",0);

        String fname8 = intent.getStringExtra("name8");
        String lname8 = intent.getStringExtra("lname8");
        int att8 = intent.getIntExtra("8att",0);
        int def8 = intent.getIntExtra("8def",0);

        String fname9 = intent.getStringExtra("name9");
        String lname9 = intent.getStringExtra("lname9");
        int att9 = intent.getIntExtra("9att",0);
        int def9 = intent.getIntExtra("9def",0);

        String fname10 = intent.getStringExtra("name10");
        String lname10 = intent.getStringExtra("lname10");
        int att10 = intent.getIntExtra("10att",0);
        int def10 = intent.getIntExtra("10def",0);

        String fname11 = intent.getStringExtra("name11");
        String lname11 = intent.getStringExtra("lname11");
        int att11 = intent.getIntExtra("11att",0);
        int def11 = intent.getIntExtra("11def",0);

        String fname12 = intent.getStringExtra("name12");
        String lname12 = intent.getStringExtra("lname12");
        int att12 = intent.getIntExtra("12att",0);
        int def12 = intent.getIntExtra("12def",0);

        String fname13 = intent.getStringExtra("name13");
        String lname13 = intent.getStringExtra("lname13");
        int att13 = intent.getIntExtra("13att",0);
        int def13 = intent.getIntExtra("13def",0);

        String fname14 = intent.getStringExtra("name14");
        String lname14 = intent.getStringExtra("lname14");
        int att14 = intent.getIntExtra("14att",0);
        int def14 = intent.getIntExtra("14def",0);
    }
}