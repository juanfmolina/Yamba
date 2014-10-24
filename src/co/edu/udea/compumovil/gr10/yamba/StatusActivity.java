package co.edu.udea.compumovil.gr10.yamba;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class StatusActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Check if this activity was created before
		if (savedInstanceState == null) { //
			// Create a fragment
			StatusFragment fragment = new StatusFragment(); //
			getFragmentManager()
					.beginTransaction()
					.add(android.R.id.content, fragment,
							fragment.getClass().getSimpleName()).commit(); //
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu); //
		return true; //
		
	}
	
	
}
