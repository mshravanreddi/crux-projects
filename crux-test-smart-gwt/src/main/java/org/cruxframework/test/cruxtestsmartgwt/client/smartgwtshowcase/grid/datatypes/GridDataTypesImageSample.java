package org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.grid.datatypes;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.PanelFactory;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.ShowcasePanel;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.data.CountrySampleData;

public class GridDataTypesImageSample extends ShowcasePanel {
    private static final String DESCRIPTION = "\"Flag\" is an image field.";

    public static class Factory implements PanelFactory {
        private String id;

        public Canvas create() {
            GridDataTypesImageSample panel = new GridDataTypesImageSample();
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

    public Canvas getViewPanel() {

        Canvas canvas = new Canvas();

        final ListGrid countryGrid = new ListGrid();
        countryGrid.setWidth(200);
        countryGrid.setHeight(224);
        countryGrid.setShowAllRecords(true);

        ListGridField countryCodeField = new ListGridField("countryCode", "Flag", 50);
        countryCodeField.setAlign(Alignment.CENTER);
        countryCodeField.setType(ListGridFieldType.IMAGE);
        countryCodeField.setImageURLPrefix("flags/16/");
        countryCodeField.setImageURLSuffix(".png");
        ListGridField nameField = new ListGridField("countryName", "Country");
        countryGrid.setFields(new ListGridField[] {countryCodeField, nameField});
        countryGrid.setData(CountrySampleData.getRecords());
        canvas.addChild(countryGrid);

        return canvas;
    }

    public String getIntro() {
        return DESCRIPTION;
    }

}