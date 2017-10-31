package com.example.leandrozlotnik.pickateam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button attP;
    Button attM;
    Button defP;
    Button defM;
    Button set;
    Button playerList;
    Button appInfo;
    int attCount = 0;
    int defCount = 0;
    TextView attackView;
    TextView defenceView;
    TextView numberOPlayers;
    EditText fiName;
    EditText laName;
    static Player[] arrPlayers = new Player[15];
    static Player[] team1 = new Player[5];
    static Player[] team2 = new Player[5];
    static Player[] team3 = new Player[5];
    static int number_of_players = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attP = (Button)findViewById(R.id.attplus);
        attM = (Button)findViewById(R.id.attmin);
        defP = (Button)findViewById(R.id.defplus);
        defM = (Button)findViewById(R.id.defmin);
        set = (Button)findViewById(R.id.setbutton);
        playerList = (Button)findViewById(R.id.plist);
        appInfo = (Button)findViewById(R.id.appInfo);
        attackView = (TextView)findViewById(R.id.Att);
        numberOPlayers = (TextView)findViewById(R.id.nOplayers);
        defenceView = (TextView)findViewById(R.id.Def);
        fiName = (EditText)findViewById(R.id.firstName);
        laName = (EditText)findViewById(R.id.lastName);

        attP.setOnClickListener(this);
        attM.setOnClickListener(this);
        defP.setOnClickListener(this);
        defM.setOnClickListener(this);
        set.setOnClickListener(this);
        playerList.setOnClickListener(this);
        appInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == attP) {
            if(attCount<5){
                attCount++;
            }
        }
        else if (v == attM) {
            if(attCount>0){
                attCount--;
            }
        }
        else if(v == defP){
            if(defCount<5) {
                defCount++;
            }
        }
        else if(v == defM) {
            if (defCount > 0) {
                defCount--;
            }
        }
        else if(v == set){
            Player temp = new Player(fiName.getText().toString(), laName.getText().toString(), attCount, defCount);
            arrPlayers[number_of_players] = temp;
            number_of_players++;
            numberOPlayers.setText("   Number of players = " + number_of_players + "   " );
            if(number_of_players > 15){
                set.setBackgroundColor(000000);
            }
            else{
                Toast.makeText(MainActivity.this,"Player created succesfully",Toast.LENGTH_LONG).show();
            }
        }
        else if(v == playerList){
            Intent intent = new Intent(MainActivity.this, PlayersActivity.class);
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
        else if(v == appInfo){

        }
        attackView.setText("Att = " + attCount+ "   ");
        defenceView.setText("Def = " + defCount+ "   ");
    }


}
