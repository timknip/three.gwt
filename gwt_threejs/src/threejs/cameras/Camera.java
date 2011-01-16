package threejs.cameras;

import threejs.core.Matrix4;
import threejs.core.Vector3;

import com.google.gwt.core.client.JavaScriptObject;

public class Camera extends JavaScriptObject {
	protected Camera() {}
	
	public static final native Camera create(int fov, float aspect, float near, float far) /*-{
		return new $wnd.THREE.Camera(fov, aspect, near, far);
	}-*/;

	public final native Vector3 getPosition() /*-{
		return this.position;
	}-*/;
	
	public final native void setPosition(Vector3 v) /*-{
		this.position = v;
	}-*/;

	public final native Matrix4 getProjectionMatrix() /*-{
		return this.projectionMatrix;
	}-*/;
	
	public final native void setProjectionMatrix(Matrix4 matrix) /*-{
		this.projectionMatrix = matrix;
	}-*/;

	public final native Vector3 getTarget() /*-{
		return this.target.position;
	}-*/;
	
	public final native void setTarget(Vector3 v) /*-{
		this.target.position = v;
	}-*/;
}
