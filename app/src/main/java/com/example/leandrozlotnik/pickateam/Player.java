package com.example.leandrozlotnik.pickateam;

import java.util.Random;

/**
 * Created by leandrozlotnik on 17/10/2017.
 */

public class Player {
    private String fName;
    private String lName;
    private int attSkill;
    private int defSkill;

    public Player(){
        fName = null;
        lName = null;
        attSkill = 0;
        defSkill = 0;
    }

    public Player(String fname, String lname, int att, int def){
        fName = fname;
        lName = lname;
        attSkill = att;
        defSkill = def;
    }

    public String getfName() {
        if(fName == null) {
            return " ";
        }
        else
            return fName;
    }


    public String getlName() {
        return lName;
    }


    public int getAttSkill() {
        return attSkill;
    }


    public int getDefSkill() {
        return defSkill;
    }

    public void buildTeams(Player[] pla, Player[] t1, Player[] t2, Player[] t3){

        Random a = new Random();
        int cT1 = 0;
        int cT2 = 0;
        int cT3 = 0;

        for(int i = 0; i < pla.length; i++){
            int n = a.nextInt(2);
            switch(n){
                case 0:
                    if(cT1 >= 5){
                        break;
                    }
                    else {
                        t1[cT1] = pla[i];
                        cT1++;
                    }
                break;
                case 1:
                    if(cT2 >= 5){
                        break;
                    }
                    else {
                        t2[cT2] = pla[i];
                        cT2++;
                    }
                    break;
                case 2:
                    if(cT3 >= 5){
                        break;
                    }
                    else {
                        t3[cT3] = pla[i];
                        cT3++;
                    }
                    break;
            }
        }

    }

}
