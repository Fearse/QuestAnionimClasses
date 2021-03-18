package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public TextView Rept;
    public TextView Healtht;
    public TextView Energyt;
    public TextView Situationt;
    public TextView Decriptiont;
    public TextView Option1t;
    public TextView Option2t;
    public TextView Option3t;
    public Button ChoiseButton1;
    public Button ChoiseButton2;
    public Button ChoiseButton3;
    public Button StartButton;
    public Button ExitButton;
    public Button Space;
    Character character=new Character("Player",50,75,75);
    Story story=new Story();

    public void reWrite(Situation.Variant pressedVariant){
    character.rep+=pressedVariant.drep;
    character.energy+=pressedVariant.denergy;
    character.health+=pressedVariant.dhealth;
    Rept.setText("Rep: "+character.rep);
    Energyt.setText("Energy: "+character.energy);
    Healtht.setText("HP: "+character.health);

    }
    public void Click(int i)
    {
        reWrite(story.current_situation.choices[i]);
        story.current_situation=story.current_situation.choices[i].situation;
        checkThird();
        if (checkEnd()==false) {
            reScreen();
        }
        else
        {
            endProg();
        }
    }
    public void endProg()
    {
        ChoiseButton1.setVisibility(View.GONE);
        ChoiseButton2.setVisibility(View.GONE);
        Decriptiont.setText(story.current_situation.description);
        Situationt.setText(story.current_situation.situationame);
        Option1t.setVisibility(View.GONE);
        Option2t.setVisibility(View.GONE);
        ExitButton.setVisibility(View.VISIBLE);
    }
    public void checkThird() {
        if (story.current_situation.choices.length == 3) {
            ChoiseButton3.setVisibility(View.VISIBLE);
            Option3t.setVisibility(View.VISIBLE);
            Option3t.setText(story.current_situation.choices[2].text);
        }
        else {
            Option3t.setVisibility(View.GONE);
            ChoiseButton3.setVisibility(View.GONE);
        }
    }
    public boolean checkEnd()
    {
        if (story.current_situation.choices.length == 0)
        return true;
        else
            return false;
    }
    public void reScreen(){
        Decriptiont.setText(story.current_situation.description);
        Situationt.setText(story.current_situation.situationame);
        Option1t.setText(story.current_situation.choices[0].text);
        Option2t.setText(story.current_situation.choices[1].text);

    }
    View.OnClickListener  Button1Click=(v) ->{
    Click(0);
    };
    View.OnClickListener  Button2Click=(v) ->{
        Click(1);
    };
    View.OnClickListener  Button3Click=(v) ->{
        Click(2);
    };
    View.OnClickListener  StartButtonClick=(v) ->{
        Option1t.setVisibility(View.VISIBLE);
        Option2t.setVisibility(View.VISIBLE);
        Decriptiont.setVisibility(View.VISIBLE);
        Situationt.setVisibility(View.VISIBLE);
        ChoiseButton1.setVisibility(View.VISIBLE);
        ChoiseButton2.setVisibility(View.VISIBLE);
        Rept.setVisibility(View.VISIBLE);
        Healtht.setVisibility(View.VISIBLE);
        Energyt.setVisibility(View.VISIBLE);
        StartButton.setVisibility(View.GONE);
        Space.setVisibility(View.GONE);
    };
    View.OnClickListener  ExitButtonClick=(v) ->{
      System.exit(0);
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartButton=(Button)findViewById(R.id.StartButton);
        StartButton.setOnClickListener(StartButtonClick);
        ExitButton=(Button)findViewById(R.id.ExitButton);
        ExitButton.setOnClickListener(ExitButtonClick);
        ChoiseButton1=(Button)findViewById(R.id.ChoiseButton1);
        ChoiseButton1.setOnClickListener(Button1Click);
        ChoiseButton1=(Button)findViewById(R.id.ChoiseButton1);
        ChoiseButton1.setOnClickListener(Button1Click);
        ChoiseButton2=(Button)findViewById(R.id.ChoiseButton2);
        ChoiseButton2.setOnClickListener(Button2Click);
        ChoiseButton3=(Button)findViewById(R.id.ChoiseButton3);
        ChoiseButton3.setOnClickListener(Button3Click);
        Space=(Button)findViewById(R.id.space);
        Rept=(TextView)findViewById(R.id.Rep);
        Energyt=(TextView)findViewById(R.id.En);
        Healtht=(TextView)findViewById(R.id.Health);
        Decriptiont=(TextView)findViewById(R.id.Description);
        Option1t=(TextView)findViewById(R.id.Option1);
        Option2t=(TextView)findViewById(R.id.Option2);
        Option3t=(TextView)findViewById(R.id.Option3);
        Situationt=(TextView)findViewById(R.id.Situation);
        Rept.setText("Rep: "+character.rep);
        Energyt.setText("Energy: "+character.energy);
        Healtht.setText("HP: "+character.health);
        Decriptiont.setText(story.current_situation.description);
        Situationt.setText(story.current_situation.situationame);
        Option1t.setText(story.current_situation.choices[0].text);
        Option2t.setText(story.current_situation.choices[1].text);

        Option1t.setVisibility(View.GONE);
        Option2t.setVisibility(View.GONE);
        Decriptiont.setVisibility(View.GONE);
        Situationt.setVisibility(View.GONE);
        ChoiseButton1.setVisibility(View.GONE);
        ChoiseButton2.setVisibility(View.GONE);
        Rept.setVisibility(View.GONE);
        Healtht.setVisibility(View.GONE);
        Energyt.setVisibility(View.GONE);
        Space.setVisibility(View.INVISIBLE);
        ChoiseButton3.setVisibility(View.GONE);
        Option3t.setVisibility(View.GONE);
        ExitButton.setVisibility(View.GONE);

    }
}