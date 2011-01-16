package threejs.core.extras.primitives;

import threejs.core.Geometry;

public class Plane extends Geometry {
	protected Plane() {}
	
	public static native Plane create(
			float width, float height) /*-{
		return new $wnd.Plane(width, height);
	}-*/;
	
	public static native Plane create(
			float width, float height, 
			int segments_width, int segments_height) /*-{
		return new $wnd.Plane(
			width, height, segments_width, segments_height);
	}-*/;
}
