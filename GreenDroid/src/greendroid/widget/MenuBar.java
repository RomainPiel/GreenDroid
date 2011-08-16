package greendroid.widget;

import java.util.HashMap;

/**
 * @author Romain Piel
 * Aug 16, 2011 
 * 
 */
public class MenuBar extends HashMap<Integer, Runnable> {
	
	private static final long serialVersionUID = 1L;
	private int mLayoutId = 0;
	
	/**
	 * Type of the menu bar. Should be Default if it's the same MenuBar for the entire app, Specific otherwise.
	 */
	public enum Type {
        Default, Specific
    }
	
	public MenuBar() {
		super();
	}
	
	public MenuBar(int resId) {
		super();
		mLayoutId = resId;
	}
	
	public void setMenuLayoutId(int resId) {
    	this.mLayoutId = resId;
    }
    
    public int getMenuLayoutId() {
    	return mLayoutId;
    }
    
    public MenuBar put(int key, Runnable value) {
    	super.put(key, value);
    	return this;
    }
}
