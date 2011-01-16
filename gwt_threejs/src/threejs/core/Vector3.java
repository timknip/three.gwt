package threejs.core;

import com.google.gwt.core.client.JavaScriptObject;

public class Vector3 extends JavaScriptObject {
	/**
	 * Constructor must be protected, empty, and no-argument
	 */
	protected Vector3() {}
	
	public static native Vector3 create(float x, float y, float z) /*-{
		return new $wnd.THREE.Vector3(x, y, z);
	}-*/;
	
	public final native void set(float x, float y, float z) /*-{
		this.set(x, y, z);
	}-*/;

	public final native Vector3 copy(Vector3 v) /*-{
		return this.copy(v);
	}-*/;
	
	public final native Vector3 add(Vector3 a, Vector3 b) /*-{
		return this.add(a, b);
	}-*/;
	
	public final native Vector3 addScalar(float s) /*-{
		return this.addScalar(s);
	}-*/;
	
	public final native Vector3 addSelf(Vector3 v) /*-{
		return this.addSelf(v);
	}-*/;

	public final native Vector3 sub(Vector3 a, Vector3 b) /*-{
		return this.sub(a, b);
	}-*/;
	
	public final native Vector3 subSelf(Vector3 v) /*-{
		return this.subSelf(v);
	}-*/;
	
	public final native Vector3 cross(Vector3 a, Vector3 b) /*-{
		return this.cross(a, b);
	}-*/;
	
	public final native Vector3 crossSelf(Vector3 v) /*-{
		return this.crossSelf(v);
	}-*/;
	
	public final native Vector3 multiply(Vector3 a, Vector3 b) /*-{
		return this.multiply(a, b);
	}-*/;
	
	public final native Vector3 multiplyScalar(float s) /*-{
		return this.multiplyScalar(s);
	}-*/;
	
	public final native Vector3 multiplySelf(Vector3 v) /*-{
		return this.multiplySelf(v);
	}-*/;

	public final native Vector3 divideScalar(float s) /*-{
		return this.divideScalar(s);
	}-*/;
	
	public final native Vector3 divideSelf(Vector3 v) /*-{
		return this.divideSelf(v);
	}-*/;
	
	public final native float dot(Vector3 v) /*-{
		return this.dot(v);
	}-*/;
	
	public final native float distanceTo(Vector3 v) /*-{
		return this.distanceTo(v);
	}-*/;
	
	public final native float distanceToSquared(Vector3 v) /*-{
		return this.distanceToSquared(v);
	}-*/;
	
	public final native float length() /*-{
		return this.length();
	}-*/;
	
	public final native float lengthSq() /*-{
		return this.lengthSq();
	}-*/;

	public final native Vector3 negate() /*-{
		return this.negate();
	}-*/;
	
	public final native Vector3 normalize() /*-{
		return this.normalize();
	}-*/;
	
	public final native Vector3 setLength(float len) /*-{
		return this.setLength(len);
	}-*/;
	
	public final native boolean isZero() /*-{
		return this.isZero();
	}-*/;
	
	public final native Vector3 clone() /*-{
		return this.clone();
	}-*/;
}
