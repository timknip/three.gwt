package threejs.core;

import com.google.gwt.core.client.JavaScriptObject;

public class Matrix4 extends JavaScriptObject {
	protected Matrix4() {}
	
	public static native Matrix4 create() /*-{
		return new $wnd.THREE.Matrix4();
	}-*/;
	
	public static native Matrix4 makeOrtho(
			float left, float right, 
			float top, float bottom, 
			float near, float far) /*-{
				
		return $wnd.THREE.Matrix4.makeOrtho(
			left, right,
			top, bottom, 
			near, far);
	}-*/;
}
