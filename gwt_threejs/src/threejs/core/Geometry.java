package threejs.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class Geometry extends JavaScriptObject {
	protected Geometry() {}
	
	public static native Geometry create() /*-{
		return new $wnd.THREE.Geometry();
	}-*/;

	public final native void computeCentroids() /*-{
		this.computeCentroids();
	}-*/;
	
	public final native void computeFaceNormals(boolean useVertexNormals) /*-{
		this.computeFaceNormals(useVertexNormals);
	}-*/;

	public final native void computeTangents() /*-{
		this.computeTangents();
	}-*/;
	
	public final native void computeVertexNormals() /*-{
		this.computeVertexNormals();
	}-*/;
	
	public final native JsArray<Vertex> getVertices() /*-{
		return this.vertices;
	}-*/;
}
