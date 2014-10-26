package cn.edu.gdmec.s07131005.mymenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
   TextView myview;
   @Override
   public boolean onMenuItemSelected(int featureId, MenuItem item) {
	// TODO Auto-generated method stub
   	super.onOptionsItemSelected(item);
   	switch (item.getItemId()) {
   		case R.id.item1:     
   			myview.setText("you have select 'help' menu item");
   			break;
		case R.id.item2:  
			myview.setText("you have select 'good' menu item");
   			break;
		case R.id.item3:    
			item.setTitle("动态设置菜单标题");
			break;	
			}
   	return super.onMenuItemSelected(featureId, item);
   }

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myview = (TextView) findViewById(R.id.textView1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
