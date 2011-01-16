package threejs.client;


import threejs.THREE;
import threejs.renderers.CanvasRenderer;
import threejs.ui.ThreeJS;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_threejs implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Test t = new Test();
	
		t.setSize("100%", "100%");
		
		DockLayoutPanel panel = new DockLayoutPanel(Unit.PX);

		Label lbl = new Label("orthographic projection");
		lbl.setStyleName("info");
		panel.addNorth(lbl, 20);
		
		panel.add(t);

		RootLayoutPanel.get().add(panel);
	
		RootLayoutPanel.get().setWidgetLeftWidth(panel, 0, Unit.PCT, 100, Unit.PCT);
		RootLayoutPanel.get().setWidgetTopHeight(panel, 0, Unit.PCT, 100, Unit.PCT);
		
		RootLayoutPanel.get().onResize();
		
	}
	
	class Test extends ResizeComposite {
		
		CanvasRenderer renderer = CanvasRenderer.create();
		THREE three;
		
		public Test() {
			three = new THREE(renderer);
			
			initWidget(three);
			
			setSize("100%", "100%");
			
			three.test();
			three.render();
		}
	}
}
