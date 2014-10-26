package cn.edu.gdmecs07131005.test;

import cn.edu.gdmec07131005.test.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;

public class Test1 extends Activity {
	private TextView textView1;
	private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        EditText editText1 = (EditText)findViewById(R.id.editText1);
        textView1.setText("ÓÃ»§Ãû£º");
        editText1.setText("³ÂÎý¶Ñ");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test1, menu);
        return true;
    }
    
}
