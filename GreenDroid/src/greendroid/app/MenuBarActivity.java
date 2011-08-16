package greendroid.app;

import greendroid.widget.MenuBar;
import android.view.MenuItem;

public interface MenuBarActivity {
	
	public Runnable getMenuAction(MenuItem menuItem);
    
    public MenuBar addMenuAction(int menuItemId, Runnable action);
    
    public void setMenuBar(int resId);
    
    public MenuBar getMenuBar();
}
