package com.example.zhan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private Button addFrontButton;
    private Button addEndButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList ll = new LinkedList();



        ViewGroup theVLL = (ViewGroup)this.findViewById(R.id.payloadLinearLayout);


    }

    public void addFrontButtonPressed(View v)
    {
        if(v == this.addFrontButton)
        {
            EditText inputPayload = (EditText)this.findViewById(R.id.inputPayload);
            String addF = inputPayload.getText().toString();
            ll.addFront(addF);
            TextView tv = new TextView(this);
            tv.setText("");
            theVLL.addView(tv);
        }
    }

    public void addEndButtonPressed(View v)
    {
        if(v == this.addEndButton)
        {
            EditText inputPayload = (EditText)this.findViewById(R.id.inputPayload);
            String addE = inputPayload.getText().toString();
            ll.addEnd(addE);

        }
    }

}
