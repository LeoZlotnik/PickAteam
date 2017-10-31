package com.example.leandrozlotnik.pickateam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.leandrozlotnik.pickateam.MainActivity.arrPlayers;


public class PlayersActivity extends AppCompatActivity {

    TextView p1A,p1B,p1C,p1D;
    TextView p2A,p2B,p2C,p2D;
    TextView p3A,p3B,p3C,p3D;
    TextView p4A,p4B,p4C,p4D;
    TextView p5A,p5B,p5C,p5D;
    TextView p6A,p6B,p6C,p6D;
    TextView p7A,p7B,p7C,p7D;
    TextView p8A,p8B,p8C,p8D;
    TextView p9A,p9B,p9C,p9D;
    TextView p10A,p10B,p10C,p10D;
    TextView p11A,p11B,p11C,p11D;
    TextView p12A,p12B,p12C,p12D;
    TextView p13A,p13B,p13C,p13D;
    TextView p14A,p14B,p14C,p14D;
    TextView p15A,p15B,p15C,p15D;
    Button build_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        p1A = (TextView)findViewById(R.id.p1_fn);
        p1B = (TextView)findViewById(R.id.p1_ln);
        p1C = (TextView)findViewById(R.id.p1_at);
        p1D = (TextView)findViewById(R.id.p1_de);
        p2A = (TextView)findViewById(R.id.p2_fn);
        p2B = (TextView)findViewById(R.id.p2_ln);
        p2C = (TextView)findViewById(R.id.p2_at);
        p2D = (TextView)findViewById(R.id.p2_de);
        p3A = (TextView)findViewById(R.id.p3_fn);
        p3B = (TextView)findViewById(R.id.p3_ln);
        p3C = (TextView)findViewById(R.id.p3_at);
        p3D = (TextView)findViewById(R.id.p3_de);
        p4A = (TextView)findViewById(R.id.p4_fn);
        p4B = (TextView)findViewById(R.id.p4_ln);
        p4C = (TextView)findViewById(R.id.p4_at);
        p4D = (TextView)findViewById(R.id.p4_de);
        p5A = (TextView)findViewById(R.id.p5_fn);
        p5B = (TextView)findViewById(R.id.p5_ln);
        p5C = (TextView)findViewById(R.id.p5_at);
        p5D = (TextView)findViewById(R.id.p5_de);
        p6A = (TextView)findViewById(R.id.p6_fn);
        p6B = (TextView)findViewById(R.id.p6_ln);
        p6C = (TextView)findViewById(R.id.p6_at);
        p6D = (TextView)findViewById(R.id.p6_de);
        p7A = (TextView)findViewById(R.id.p7_fn);
        p7B = (TextView)findViewById(R.id.p7_ln);
        p7C = (TextView)findViewById(R.id.p7_at);
        p7D = (TextView)findViewById(R.id.p7_de);
        p8A = (TextView)findViewById(R.id.p8_fn);
        p8B = (TextView)findViewById(R.id.p8_ln);
        p8C = (TextView)findViewById(R.id.p8_at);
        p8D = (TextView)findViewById(R.id.p8_de);
        p9A = (TextView)findViewById(R.id.p9_fn);
        p9B = (TextView)findViewById(R.id.p9_ln);
        p9C = (TextView)findViewById(R.id.p9_at);
        p9D = (TextView)findViewById(R.id.p9_de);
        p10A = (TextView)findViewById(R.id.p10_fn);
        p10B = (TextView)findViewById(R.id.p10_ln);
        p10C = (TextView)findViewById(R.id.p10_at);
        p10D = (TextView)findViewById(R.id.p10_de);
        p11A = (TextView)findViewById(R.id.p11_fn);
        p11B = (TextView)findViewById(R.id.p11_ln);
        p11C = (TextView)findViewById(R.id.p11_at);
        p11D = (TextView)findViewById(R.id.p11_de);
        p12A = (TextView)findViewById(R.id.p12_fn);
        p12B = (TextView)findViewById(R.id.p12_ln);
        p12C = (TextView)findViewById(R.id.p12_at);
        p12D = (TextView)findViewById(R.id.p12_de);
        p13A = (TextView)findViewById(R.id.p13_fn);
        p13B = (TextView)findViewById(R.id.p13_ln);
        p13C = (TextView)findViewById(R.id.p13_at);
        p13D = (TextView)findViewById(R.id.p13_de);
        p14A = (TextView)findViewById(R.id.p14_fn);
        p14B = (TextView)findViewById(R.id.p14_ln);
        p14C = (TextView)findViewById(R.id.p14_at);
        p14D = (TextView)findViewById(R.id.p14_de);
        p15A = (TextView)findViewById(R.id.p15_fn);
        p15B = (TextView)findViewById(R.id.p15_ln);
        p15C = (TextView)findViewById(R.id.p15_at);
        p15D = (TextView)findViewById(R.id.p15_de);
        build_t = (Button)findViewById(R.id.build_teams);

        build_t.setOnClickListener((View.OnClickListener) this);


        Intent intent = getIntent();
        String fname0 = intent.getStringExtra("name0");
        String lname0 = intent.getStringExtra("lname0");
        int att0 = intent.getIntExtra("0att",0);
        int def0 = intent.getIntExtra("0def",0);
        if(fname0 != null){
            p1A.setText(""+fname0);
            p1B.setText(""+lname0);
            p1C.setText(""+att0);
            p1D.setText(""+def0);
        }

        String fname1 = intent.getStringExtra("name1");
        String lname1 = intent.getStringExtra("lname1");
        int att1 = intent.getIntExtra("1att",0);
        int def1 = intent.getIntExtra("1def",0);
        if(fname1 != null){
            p2A.setText(""+fname1);
            p2B.setText(""+lname1);
            p2C.setText(""+att1);
            p2D.setText(""+def1);
        }

        String fname2 = intent.getStringExtra("name2");
        String lname2 = intent.getStringExtra("lname2");
        int att2 = intent.getIntExtra("2att",0);
        int def2 = intent.getIntExtra("2def",0);
        if(fname0 != null){
            p3A.setText(""+fname2);
            p3B.setText(""+lname2);
            p3C.setText(""+att2);
            p3D.setText(""+def2);
        }

        String fname3 = intent.getStringExtra("name3");
        String lname3 = intent.getStringExtra("lname3");
        int att3 = intent.getIntExtra("3att",0);
        int def3 = intent.getIntExtra("3def",0);
        if(fname0 != null){
            p4A.setText(""+fname3);
            p4B.setText(""+lname3);
            p4C.setText(""+att3);
            p4D.setText(""+def3);
        }

        String fname4 = intent.getStringExtra("name4");
        String lname4 = intent.getStringExtra("lname4");
        int att4 = intent.getIntExtra("4att",0);
        int def4 = intent.getIntExtra("4def",0);
        if(fname0 != null){
            p5A.setText(""+fname4);
            p5B.setText(""+lname4);
            p5C.setText(""+att4);
            p5D.setText(""+def4);
        }

        String fname5 = intent.getStringExtra("name5");
        String lname5 = intent.getStringExtra("lname5");
        int att5 = intent.getIntExtra("5att",0);
        int def5 = intent.getIntExtra("5def",0);
        if(fname0 != null){
            p6A.setText(""+fname5);
            p6B.setText(""+lname5);
            p6C.setText(""+att5);
            p6D.setText(""+def5);
        }

        String fname6 = intent.getStringExtra("name6");
        String lname6 = intent.getStringExtra("lname6");
        int att6 = intent.getIntExtra("6att",0);
        int def6 = intent.getIntExtra("6def",0);
        if(fname0 != null){
            p7A.setText(""+fname6);
            p7B.setText(""+lname6);
            p7C.setText(""+att6);
            p7D.setText(""+def6);
        }

        String fname7 = intent.getStringExtra("name7");
        String lname7 = intent.getStringExtra("lname7");
        int att7 = intent.getIntExtra("7att",0);
        int def7 = intent.getIntExtra("7def",0);
        if(fname0 != null){
            p8A.setText(""+fname7);
            p8B.setText(""+lname7);
            p8C.setText(""+att7);
            p8D.setText(""+def7);
        }

        String fname8 = intent.getStringExtra("name8");
        String lname8 = intent.getStringExtra("lname8");
        int att8 = intent.getIntExtra("8att",0);
        int def8 = intent.getIntExtra("8def",0);
        if(fname0 != null){
            p9A.setText(""+fname8);
            p9B.setText(""+lname8);
            p9C.setText(""+att8);
            p9D.setText(""+def8);
        }

        String fname9 = intent.getStringExtra("name9");
        String lname9 = intent.getStringExtra("lname9");
        int att9 = intent.getIntExtra("9att",0);
        int def9 = intent.getIntExtra("9def",0);
        if(fname0 != null){
            p10A.setText(""+fname9);
            p10B.setText(""+lname9);
            p10C.setText(""+att9);
            p10D.setText(""+def9);
        }

        String fname10 = intent.getStringExtra("name10");
        String lname10 = intent.getStringExtra("lname10");
        int att10 = intent.getIntExtra("10att",0);
        int def10 = intent.getIntExtra("10def",0);
        if(fname0 != null){
            p11A.setText(""+fname10);
            p11B.setText(""+lname10);
            p11C.setText(""+att10);
            p11D.setText(""+def10);
        }

        String fname11 = intent.getStringExtra("name11");
        String lname11 = intent.getStringExtra("lname11");
        int att11 = intent.getIntExtra("11att",0);
        int def11 = intent.getIntExtra("11def",0);
        if(fname0 != null){
            p12A.setText(""+fname11);
            p12B.setText(""+lname11);
            p12C.setText(""+att11);
            p12D.setText(""+def11);
        }

        String fname12 = intent.getStringExtra("name12");
        String lname12 = intent.getStringExtra("lname12");
        int att12 = intent.getIntExtra("12att",0);
        int def12 = intent.getIntExtra("12def",0);
        if(fname0 != null){
            p13A.setText(""+fname12);
            p13B.setText(""+lname12);
            p13C.setText(""+att12);
            p13D.setText(""+def12);
        }

        String fname13 = intent.getStringExtra("name13");
        String lname13 = intent.getStringExtra("lname13");
        int att13 = intent.getIntExtra("13att",0);
        int def13 = intent.getIntExtra("13def",0);
        if(fname0 != null){
            p14A.setText(""+fname13);
            p14B.setText(""+lname13);
            p14C.setText(""+att13);
            p14D.setText(""+def13);
        }

        String fname14 = intent.getStringExtra("name14");
        String lname14 = intent.getStringExtra("lname14");
        int att14 = intent.getIntExtra("14att",0);
        int def14 = intent.getIntExtra("14def",0);
        if(fname0 != null){
            p15A.setText(""+fname14);
            p15B.setText(""+lname14);
            p15C.setText(""+att14);
            p15D.setText(""+def14);
        }

    }

    public void onClick(View v) {
        if(v == build_t){
            Toast.makeText(PlayersActivity.this,"Building Teams",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(PlayersActivity.this, FieldActivity.class);
            if(arrPlayers[0] != null) {
                intent.putExtra("name0", arrPlayers[0].getfName());
                intent.putExtra("lname0", arrPlayers[0].getlName());
                intent.putExtra("0att", arrPlayers[0].getAttSkill());
                intent.putExtra("0def", arrPlayers[0].getDefSkill());
            }
            if(arrPlayers[1] != null) {
                intent.putExtra("name1", arrPlayers[1].getfName());
                intent.putExtra("lname1", arrPlayers[1].getlName());
                intent.putExtra("1att", arrPlayers[1].getAttSkill());
                intent.putExtra("1def", arrPlayers[1].getDefSkill());
            }
            if(arrPlayers[2] != null) {
                intent.putExtra("name2", arrPlayers[2].getfName());
                intent.putExtra("lname2", arrPlayers[2].getlName());
                intent.putExtra("2att", arrPlayers[2].getAttSkill());
                intent.putExtra("2def", arrPlayers[2].getDefSkill());
            }
            if(arrPlayers[3] != null) {
                intent.putExtra("name3", arrPlayers[3].getfName());
                intent.putExtra("lname3", arrPlayers[3].getlName());
                intent.putExtra("3att", arrPlayers[3].getAttSkill());
                intent.putExtra("3def", arrPlayers[3].getDefSkill());
            }
            if(arrPlayers[4] != null) {
                intent.putExtra("name4", arrPlayers[4].getfName());
                intent.putExtra("lname4", arrPlayers[4].getlName());
                intent.putExtra("4att", arrPlayers[4].getAttSkill());
                intent.putExtra("4def", arrPlayers[4].getDefSkill());
            }
            if(arrPlayers[5] != null) {
                intent.putExtra("name5", arrPlayers[5].getfName());
                intent.putExtra("lname5", arrPlayers[5].getlName());
                intent.putExtra("5att", arrPlayers[5].getAttSkill());
                intent.putExtra("5def", arrPlayers[5].getDefSkill());
            }
            if(arrPlayers[6] != null) {
                intent.putExtra("name6", arrPlayers[6].getfName());
                intent.putExtra("lname6", arrPlayers[6].getlName());
                intent.putExtra("6att", arrPlayers[6].getAttSkill());
                intent.putExtra("6def", arrPlayers[6].getDefSkill());
            }
            if(arrPlayers[7] != null) {
                intent.putExtra("name7", arrPlayers[7].getfName());
                intent.putExtra("lname7", arrPlayers[7].getlName());
                intent.putExtra("7att", arrPlayers[7].getAttSkill());
                intent.putExtra("7def", arrPlayers[7].getDefSkill());
            }
            if(arrPlayers[8] != null) {
                intent.putExtra("name8", arrPlayers[8].getfName());
                intent.putExtra("lname8", arrPlayers[8].getlName());
                intent.putExtra("8att", arrPlayers[8].getAttSkill());
                intent.putExtra("8def", arrPlayers[8].getDefSkill());
            }
            if(arrPlayers[9] != null) {
                intent.putExtra("name9", arrPlayers[9].getfName());
                intent.putExtra("lname9", arrPlayers[9].getlName());
                intent.putExtra("9att", arrPlayers[9].getAttSkill());
                intent.putExtra("9def", arrPlayers[9].getDefSkill());
            }
            if(arrPlayers[10] != null) {
                intent.putExtra("name10", arrPlayers[10].getfName());
                intent.putExtra("lname10", arrPlayers[10].getlName());
                intent.putExtra("10att", arrPlayers[10].getAttSkill());
                intent.putExtra("10def", arrPlayers[10].getDefSkill());
            }
            if(arrPlayers[11] != null) {
                intent.putExtra("name11", arrPlayers[11].getfName());
                intent.putExtra("lname11", arrPlayers[11].getlName());
                intent.putExtra("11att", arrPlayers[11].getAttSkill());
                intent.putExtra("11def", arrPlayers[11].getDefSkill());
            }
            if(arrPlayers[12] != null) {
                intent.putExtra("name12", arrPlayers[12].getfName());
                intent.putExtra("lname12", arrPlayers[12].getlName());
                intent.putExtra("12att", arrPlayers[12].getAttSkill());
                intent.putExtra("12def", arrPlayers[12].getDefSkill());
            }
            if(arrPlayers[13] != null) {
                intent.putExtra("name13", arrPlayers[13].getfName());
                intent.putExtra("lname13", arrPlayers[13].getlName());
                intent.putExtra("13att", arrPlayers[13].getAttSkill());
                intent.putExtra("13def", arrPlayers[13].getDefSkill());
            }
            if(arrPlayers[14] != null) {
                intent.putExtra("name14", arrPlayers[14].getfName());
                intent.putExtra("lname14", arrPlayers[14].getlName());
                intent.putExtra("14att", arrPlayers[14].getAttSkill());
                intent.putExtra("14def", arrPlayers[14].getDefSkill());
            }
            startActivity(intent);

        }

    }


}

