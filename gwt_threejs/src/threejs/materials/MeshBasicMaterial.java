package threejs.materials;

public class MeshBasicMaterial extends Material {
	protected MeshBasicMaterial() {}
	
	public static native MeshBasicMaterial create() /*-{
		return new $wnd.THREE.MeshBasicMaterial({color:0xff0000, opacity:0.2});
	}-*/;
}
