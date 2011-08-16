package greendroid.widget;

import java.util.HashMap;

public class MenuBar extends HashMap<Integer, Runnable> {
	
	private static final long serialVersionUID = 1L;
	private int mLayoutId = 0;
	
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
