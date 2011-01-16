package threejs.materials;

public class MeshLambertMaterial extends Material {
	protected MeshLambertMaterial() {}
	
	public static native MeshLambertMaterial create() /*-{
		return new $wnd.THREE.MeshLambertMaterial({color:0xff0000, wireframe:true});
	}-*/;
}
