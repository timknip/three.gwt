package threejs.core;

import com.google.gwt.core.client.JavaScriptObject;

public class Color extends JavaScriptObject {
	protected Color() {}
	
	public static native Color create(int hex) /*-{
		return new $wnd.THREE.Color(hex);
	}-*/;
}
