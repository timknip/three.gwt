package threejs.lights;

public class AmbientLight extends Light {
	protected AmbientLight() {}
	
	public static native AmbientLight create(int hex) /*-{
		return new $wnd.THREE.AmbientLight(hex);
	}-*/;
}
