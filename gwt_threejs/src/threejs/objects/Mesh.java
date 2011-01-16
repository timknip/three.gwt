package threejs.objects;

import com.google.gwt.core.client.JsArray;

import threejs.core.Geometry;
import threejs.materials.Material;

public class Mesh extends Object3D {
	protected Mesh() {}

	public static native Mesh create(Geometry geometry) /*-{
		return new $wnd.THREE.Mesh(geometry);
	}-*/;
	
	public static native Mesh create(Geometry geometry, Material material) /*-{
		return new $wnd.THREE.Mesh(geometry, material);
	}-*/;
	
	public static native Mesh create(Geometry geometry, JsArray<Material> materials) /*-{
		return new $wnd.THREE.Mesh(geometry, materials);
	}-*/;
}
