package greendroid.app;

import greendroid.widget.MenuBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class GDSharedMenu {
	
	protected static void onCreateOptionsMenu(GDActivity activity, Menu menu) {
		
		MenuBar menuBar;
		MenuBar.Type type = activity.getMenuBarType();
		// get menu bar according to its type
		if (type == MenuBar.Type.Default) {
			menuBar = activity.getGDApplication().getApplicationMenuBar();
		} else {
			menuBar = activity.getMenuBar();
		}
		
		if (menuBar != null) {
			int resId = menuBar.getMenuLayoutId();
			if (resId != 0) {
				MenuInflater inflater = activity.getMenuInflater();
				inflater.inflate(resId, menu);
			}
		}
	}
	
	protected static void onOptionsItemSelected(GDActivity activity, MenuItem item) {
		
		Runnable action;
		MenuBar.Type type = activity.getMenuBarType();
		// get menu bar according to its type
		if (type == MenuBar.Type.Default) {
			action = activity.getGDApplication().getMenuAction(item);
		} else {
			action = activity.getMenuAction(item);
		}
		
		if (action != null) {
			activity.runOnUiThread(action);
		}
	}
}
