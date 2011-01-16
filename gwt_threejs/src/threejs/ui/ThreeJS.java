package threejs.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ThreeJS extends Composite {

	private static ThreeJSUiBinder uiBinder = GWT.create(ThreeJSUiBinder.class);

	interface ThreeJSUiBinder extends UiBinder<Widget, ThreeJS> {
	}

	public ThreeJS() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public ThreeJS(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
