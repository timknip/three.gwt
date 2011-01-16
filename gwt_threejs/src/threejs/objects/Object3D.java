package threejs.objects;

import threejs.core.Vector3;

import com.google.gwt.core.client.JavaScriptObject;

public class Object3D extends JavaScriptObject {
	protected Object3D() {}
	
	public static native Object3D create() /*-{
		return new $wnd.THREE.Object3D();
	}-*/;
	
	public final native void updateMatrix() /*-{
		this.updateMatrix();
	}-*/;
	
	public final native Vector3 getPosition() /*-{
		return this.position;
	}-*/;

	public final native void setPosition(Vector3 v) /*-{
		this.position = v;
	}-*/;

	public final native Vector3 getRotation() /*-{
		return this.rotation;
	}-*/;
	
	public final native void setRotation(Vector3 v) /*-{
		this.rotation = v;
	}-*/;

	public final native Vector3 getScale() /*-{
		return this.scale;
	}-*/;
	
	public final native void setScale(Vector3 v) /*-{
		this.scale = v;
	}-*/;
}
