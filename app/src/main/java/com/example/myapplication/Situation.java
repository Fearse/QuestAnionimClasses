package com.example.myapplication;

public class Situation {
    String description;
    String situationame;
    public Variant[] choices;
    public static class Variant{
        public Situation situation;
        public int drep,dhealth,denergy;
        String text;
        Variant(int drep,int dhealth,int denergy,String text){
            this.drep=drep;
            this.text=text;
            this.dhealth=dhealth;
            this.denergy=denergy;;
        }
    }
    public Situation(int nextNumberOfChoices,String descriptiont,String situationname){
        this.situationame=situationname;
        this.description=descriptiont;
        choices = new Variant[nextNumberOfChoices];
    }
}
