package greendroid.app;

import greendroid.widget.MenuBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class GDSharedMenu {
	
	protected static void onCreateOptionsMenu(GDActivity activity, Menu menu) {
		MenuBar menuBar = activity.getMenuBar();
		if (menuBar != null) {
			int resId = menuBar.getMenuLayoutId();
			if (resId != 0) {
				MenuInflater inflater = activity.getMenuInflater();
				inflater.inflate(resId, menu);
			}
		}
	}
	
	protected static void onOptionsItemSelected(GDActivity activity, MenuItem item) {
		Runnable action = activity.getMenuAction(item);
		if (action != null) {
			activity.runOnUiThread(action);
		}
	}
}
