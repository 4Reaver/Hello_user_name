package com.example.reaver.hello_user_name;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity implements View.OnClickListener {
    private Button sayHi;
    private EditText enterField;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        sayHi = (Button) findViewById(R.id.button);
        sayHi.setOnClickListener(this);
        enterField = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if ( view.getId() == R.id.button ) {
            textView.setText("Hello, ".concat(enterField.getText().toString()));
            enterField.setText("");
        }
    }
}
