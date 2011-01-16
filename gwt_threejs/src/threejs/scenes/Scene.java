package threejs.scenes;

import threejs.lights.Light;
import threejs.objects.Object3D;

import com.google.gwt.core.client.JavaScriptObject;

public class Scene extends JavaScriptObject {
	protected Scene() {}
	
	public static final native Scene create() /*-{
		return new $wnd.THREE.Scene();
	}-*/;

	public final native void addLight(Light light) /*-{
		this.addLight(light);
	}-*/;

	public final native void removeLight(Light light) /*-{
		this.removeLight(light);
	}-*/;

	public final native void addObject(Object3D object) /*-{
		this.addObject(object);
	}-*/;
	
	public final native void removeObject(Object3D object) /*-{
		this.removeObject(object);
	}-*/;
}
