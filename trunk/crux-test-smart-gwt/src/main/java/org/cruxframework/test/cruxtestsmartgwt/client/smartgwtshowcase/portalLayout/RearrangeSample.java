package org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.portalLayout;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.DragAppearance;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.widgets.AnimationCallback;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.ImgProperties;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.LayoutSpacer;
import com.smartgwt.client.widgets.layout.PortalLayout;
import com.smartgwt.client.widgets.layout.Portlet;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.PanelFactory;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.ShowcasePanel;

public class RearrangeSample extends ShowcasePanel {
    private static final String DESCRIPTION = "Rearrange Portlets via drag-and-drop. Try dragging a Portlet by its title bar to a new position "+
        "above or below another Portlet. Also, drop a Portlet beside another Portlet to form a row. ";

    public static class Factory implements PanelFactory {
        private String id;

        public Canvas create() {
            RearrangeSample panel = new RearrangeSample();
            id = panel.getID();
            return panel;
        }

        public String getID() {
            return id;
        }

        public String getDescription() {
            return DESCRIPTION;
        }
    }

    @Override
    protected boolean isTopIntro() {
        return true;
    }

    public Canvas getViewPanel() {
        PortalLayout portalLayout = new PortalLayout();
        portalLayout.setWidth100();
        portalLayout.setHeight100();
		
        Portlet portlet1 = new Portlet();
        portlet1.setTitle("Portlet 1");
        Portlet portlet2 = new Portlet();
        portlet2.setTitle("Portlet 2");
        Portlet portlet3 = new Portlet();
        portlet3.setTitle("Portlet 3");
        Portlet portlet4 = new Portlet();
        portlet4.setTitle("Portlet 4");
		
        portalLayout.addPortlet(portlet1, 0, 0);
        portalLayout.addPortlet(portlet2, 0, 1, 0);
        portalLayout.addPortlet(portlet3, 0, 1, 1);
        portalLayout.addPortlet(portlet4, 1, 0);
		
        return portalLayout;
    }

    public String getIntro() {
        return DESCRIPTION;
    }
}