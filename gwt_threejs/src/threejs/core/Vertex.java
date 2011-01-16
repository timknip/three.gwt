package threejs.core;

import com.google.gwt.core.client.JavaScriptObject;

public class Vertex extends JavaScriptObject {
	protected Vertex() {}

	public static native Vertex create() /*-{
		return new $wnd.THREE.Vertex();
	}-*/;
	public static native Vertex create(Vector3 postition) /*-{
		return new $wnd.THREE.Vertex(position);
	}-*/;
	public static native Vertex create(Vector3 postition, Vector3 normal) /*-{
		return new $wnd.THREE.Vertex(position, normal);
	}-*/;
	
	public final native Vector3 getPosition() /*-{
		return this.position;
	}-*/;
	
	public final native Vector3 getNormal() /*-{
		return this.normal;
	}-*/;
}
