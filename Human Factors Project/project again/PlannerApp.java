package com.example.theo.myfirstapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlannerApp extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner_app);

        // Graphics & Design
        RelativeLayout plannerLayout = new RelativeLayout(this);
        plannerLayout.setBackgroundColor(Color.GREEN);

        Button inputButton = (Button)findViewById(R.id.inputButton);

        inputButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                    }
                }
        );

        //TextBox Listener Code
        EditText eventInput = (EditText) findViewById(R.id.eventInput);
        eventInput.setOnEditorActionListener((TextView.OnEditorActionListener) this);
        TextView textOut1 = (TextView) findViewById(R.id.eventInput);
        textOut1.setText(eventInput.getText());
        EditText commentInput = (EditText) findViewById(R.id.commentInput);
        commentInput.setOnEditorActionListener((TextView.OnEditorActionListener) this);
        TextView textOut2 = (TextView) findViewById(R.id.commentInput);
        textOut2.setText(commentInput.getText());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_planner_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
