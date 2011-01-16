package threejs.renderers;

import threejs.cameras.Camera;
import threejs.scenes.Scene;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class CanvasRenderer extends JavaScriptObject {
	protected CanvasRenderer() {}
	
	public static final native CanvasRenderer create() /*-{
		return new $wnd.THREE.CanvasRenderer();
	}-*/;
	
	public final native void setSize(float width, float height) /*-{
		this.setSize(width, height);
	}-*/;
	
	public final native Element getElement() /*-{
		return this.domElement;
	}-*/;
	
	public final native void render(Scene scene, Camera camera) /*-{
		this.render(scene, camera);
	}-*/;
}
