package org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.grid.datatypes;

import com.smartgwt.client.types.ListGridEditEvent;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.PanelFactory;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.ShowcasePanel;
import org.cruxframework.test.cruxtestsmartgwt.client.smartgwtshowcase.data.CountrySampleData;

public class GridDataTypesTextSample extends ShowcasePanel {
    private static final String DESCRIPTION = "Click on column headers to sort, or data values to" +
                                              " edit. All fields in this grid are text fields.";

    public static class Factory implements PanelFactory {
        private String id;

        public Canvas create() {
            GridDataTypesTextSample panel = new GridDataTypesTextSample();
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
        countryGrid.setWidth(500);
        countryGrid.setHeight(224);
        countryGrid.setShowAllRecords(true);
        countryGrid.setCanEdit(true);
        countryGrid.setEditEvent(ListGridEditEvent.CLICK);
        countryGrid.setModalEditing(true);

        ListGridField nameField = new ListGridField("countryName", "Country");
        ListGridField capitalField = new ListGridField("capital", "Capital");
        ListGridField continentField = new ListGridField("continent", "Continent");
        countryGrid.setFields(new ListGridField[] {nameField, capitalField, continentField});
        countryGrid.setData(CountrySampleData.getRecords());
        canvas.addChild(countryGrid);

        return canvas;
    }

    public String getIntro() {
        return DESCRIPTION;
    }

}