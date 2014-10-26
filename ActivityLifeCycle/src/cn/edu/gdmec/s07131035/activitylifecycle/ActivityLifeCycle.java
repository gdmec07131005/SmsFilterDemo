package cn.edu.gdmec.s07131035.activitylifecycle;

import cn.edu.gdmec.s07131005.activitylifecycle.R;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class ActivityLifeCycle extends Activity {

    private static final String TAG = "LIFECYCLE";




	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_life_cycle);
        Log.d(TAG, "this is a test string ");
    }
    protected void onStart(){  
   	        super.onStart();  
            Log.i(TAG, "The activity state---->onStart");  
        }  
        protected void onRestart(){  
    	        super.onRestart();  
    	        Log.i(TAG, "The activity state---->onReatart");  
    	    }  
    	    protected void onResume(){  
    	        super.onResume();  
    	        Log.i(TAG, "The activity state---->onResume");  
       }  
        protected void onPause(){  
            super.onPause();  
   	        Log.i(TAG, "The activity state---->onPause");  
        }  
        protected void onStop(){  
           super.onStop();  
            Log.i(TAG, "The activity state---->onStop");  
        }  
    	   protected void onDestroy(){  
    	        super.onDestroy();  
    	        Log.i(TAG, "The activity state---->onDestroy");  
    	    }  




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_life_cycle, menu);
        return true;
    }
    
}
