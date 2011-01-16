package threejs;

import threejs.cameras.Camera;
import threejs.core.Matrix4;
import threejs.core.extras.primitives.Plane;
import threejs.lights.AmbientLight;
import threejs.materials.Material;
import threejs.materials.MeshBasicMaterial;
import threejs.objects.Mesh;
import threejs.renderers.CanvasRenderer;
import threejs.scenes.Scene;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

public class THREE extends Widget implements RequiresResize {

	private Scene scene = Scene.create();
	private Camera camera = Camera.create(45, 1.33f, -2000f, 1000f);
	private CanvasRenderer canvasRenderer;
	private Mesh plane;
	
	public THREE() {
		
	}
	public THREE(CanvasRenderer renderer) {
		this.canvasRenderer = renderer;
		setElement(renderer.getElement());
	}
	
	public void render() {
		if (canvasRenderer != null) {
			canvasRenderer.render(scene, camera);
		}
	}
	
	public Camera getCamera() {
		return camera;
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public void test() {
		AmbientLight light = AmbientLight.create(0xcccccc);
		
		scene.addLight(light);
		
		Plane geometry = Plane.create(50, 50);
		Material material = MeshBasicMaterial.create();
		plane = Mesh.create(geometry, material);
		
		scene.addObject(plane);
		
		camera.getPosition().set(0, 0, 100);
		camera.getTarget().set(0, 0, 0);
		/*
		Timer timer = new Timer() {
			
			@Override
			public void run() {
				render();
			}
		};
		
		timer.scheduleRepeating(500);
		*/
	}
	
	@Override
	public void onResize() {
		int w = getParent().getOffsetWidth();
		int h = getParent().getOffsetHeight();
		int z = 4;

		Matrix4 projectionMatrix = Matrix4.makeOrtho(
				w/-z, w/z, h/z, h/-z, -2000, 1000);
		
		if (canvasRenderer != null) {
			canvasRenderer.setSize((float)w, (float)h);
		}
		GWT.log("RESIZE: " + w + ", " + h);
		camera.setProjectionMatrix(projectionMatrix);
		render();
	}
}
