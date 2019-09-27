package com.example.tareapoo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.tareapoo.question.*;
import android.widget.Toast;



public class GameActivity extends Activity implements View.OnClickListener, OnUpdateListener {
	Button buttonObjectChoice1;
	Button buttonObjectChoice2;
	Button buttonObjectChoice3;
	QuestionAdd Question= new QuestionAdd(); // Declaración del Objeto Question
	ScoreEasy update= new ScoreEasy();			// Declaración del Objeto update
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// next line loads our UI design to the screen
		setContentView(R.layout.activity_game);
 initialize();
	}

	void initialize(){

		TextView textObjectPartA;
		TextView textObjectPartB;
		TextView textObjectLevelValue;
		TextView textObjectScoreValue;

		textObjectPartA = (TextView)findViewById(R.id.textPartA);
		textObjectPartB = (TextView)findViewById(R.id.textPartB);
		textObjectLevelValue = (TextView)findViewById(R.id.textLevelValue);
		textObjectScoreValue =(TextView) findViewById(R.id.textScoreValue);
		buttonObjectChoice1 = (Button)findViewById(R.id.buttonChoice1);
		buttonObjectChoice2 = (Button)findViewById(R.id.buttonChoice2);
		buttonObjectChoice3 = (Button)findViewById(R.id.buttonChoice3);

		// now we use the setText method of the class on our objects
		// to show our variable values on the UI elements
		textObjectPartA.setText("" + Question.questionA);
		textObjectPartB.setText("" + Question.questionB);
		textObjectLevelValue.setText("" + update.level);
		textObjectScoreValue.setText("" + update.score);
		// which button receives which answer, at this stage is arbitrary
		buttonObjectChoice1.setText("" + Question.Answer1);
		buttonObjectChoice2.setText("" + Question.Answer2);
		buttonObjectChoice3.setText("" + Question.Answer3);

		// set click listeners for every button
		buttonObjectChoice1.setOnClickListener(this);
		buttonObjectChoice2.setOnClickListener(this);
		buttonObjectChoice3.setOnClickListener(this);
		update.setOnUpdateListener(this);
	}
	void check(View view){
		if(view.getId()==R.id.buttonChoice1)
			update.update(Question.check(Integer.parseInt("" + buttonObjectChoice1.getText())));
		if(view.getId()==R.id.buttonChoice2)
			update.update(Question.check(Integer.parseInt("" + buttonObjectChoice2.getText())));
		if(view.getId()==R.id.buttonChoice3)
			update.update(Question.check(Integer.parseInt("" + buttonObjectChoice3.getText())));
	}

	@Override
	public void onClick(View view) {
		// this line returns the text set of buttonObjectChoice1, but as an integer value
		Integer.parseInt("" + buttonObjectChoice1.getText());

		// this line returns the Id of the clicked view. It can be one of the next values:
		// R.id.buttonChoice1
		// R.id.buttonChoice2
		// R.id.buttonChoice3
		view.getId();

		// this line shows a Toast

		check(view);
		update.somework();

	}

	@Override
	public void onUpdate() {
		Question.init();
		TextView textObjectPartA;
		TextView textObjectPartB;
		TextView textObjectLevelValue;
		TextView textObjectScoreValue;

		textObjectPartA = (TextView)findViewById(R.id.textPartA);
		textObjectPartB = (TextView)findViewById(R.id.textPartB);
		textObjectLevelValue = (TextView)findViewById(R.id.textLevelValue);
		textObjectScoreValue =(TextView) findViewById(R.id.textScoreValue);
		buttonObjectChoice1 = (Button)findViewById(R.id.buttonChoice1);
		buttonObjectChoice2 = (Button)findViewById(R.id.buttonChoice2);
		buttonObjectChoice3 = (Button)findViewById(R.id.buttonChoice3);


		textObjectPartA.setText("" + Question.questionA);
		textObjectPartB.setText("" + Question.questionB);
		textObjectLevelValue.setText("" + update.level);
		textObjectScoreValue.setText("" + update.score);
		// which button receives which answer, at this stage is arbitrary
		buttonObjectChoice1.setText("" + Question.Answer1);
		buttonObjectChoice2.setText("" + Question.Answer2);
		buttonObjectChoice3.setText("" + Question.Answer3);

	}
}
