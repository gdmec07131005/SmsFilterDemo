package cn.edu.gdmec.s07131005.logindemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {
	EditText username,password;
	Button bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		username=(EditText) findViewById(R.id.editText1);
		password=(EditText) findViewById(R.id.editText2);
		bt=(Button) findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("username", username.getText().toString());
				intent.putExtra("password", password.getText().toString());
				setResult(RESULT_OK, intent);
				finish();
				
			}
			
		});
	}
}
