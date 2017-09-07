package tr.com.emrahkahraman.toast;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMain extends ActionBarActivity {

	Button btnToastMessage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnToastMessage = (Button) findViewById(R.id.btnToastMessage);
		btnToastMessage.setOnClickListener(clickListener);
		
	}

	 private OnClickListener clickListener = new OnClickListener() 
	 {
		    public void onClick(View v) 
		    {	         
		    	switch (v.getId())
		    	{
		    	case R.id.btnToastMessage:
		    		Toast.makeText(ActivityMain.this, "Toast Mesaj butonuna týklandý."
		    				, Toast.LENGTH_LONG).show();
		    	break;
		    	}
		   }
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
