package greendroid.app;

import greendroid.widget.MenuBar;
import android.view.MenuItem;

/**
 * @author Romain Piel
 * Aug 16, 2011 
 * 
 * Defines all methods related to Activities embedding an {@link MenuBar}
 * 
 */
public interface MenuBarActivity {
	
	/**
	 * Looks to the MenuBar map and gives back an action for a specific MenuItem
	 * 
	 * @param menuItem the specific MenuItem
	 * @return the action
	 */
	public Runnable getMenuAction(MenuItem menuItem);
    
    /**
     * Binds an action to a menuItem.
     * 
     * @param menuItemId the MenuItem's id. Usually get it with menuItem.getItemId()
     * @param action the action to bind
     * @return the MenuBar object
     */
    public MenuBar addMenuAction(int menuItemId, Runnable action);
    
    /**
     * Initialize the menu bar with a menu resource.
     * 
     * @param resId the resource id
     */
    public void setMenuBar(int resId);
    
    /**
     * Get the MenuBar object.
     * 
     * @return the menuBar object
     */
    public MenuBar getMenuBar();
}
