package threejs.lights;

import com.google.gwt.core.client.JavaScriptObject;

public class Light extends JavaScriptObject {
	protected Light() {}
	
	public static native Light create() /*-{
		return new $wnd.THREE.Light();
	}-*/;
}
