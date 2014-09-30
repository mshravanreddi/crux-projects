/*
 * Copyright 2011 cruxframework.org.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.cruxframework.mediamanager.test.screen;

import org.cruxframework.mediamanager.test.procedure.SetUp;

import br.ufmg.dcc.saotome.beholder.ui.Div;

/**
 * Class description: This class represent the screen Statistics.
 * 
 * @author guilherme.alecrim
 */
public class ScreenStatistics
{
	/*
	 * This parameters equivalent the elements in screen This element are providers by Beholder Framework
	 */
	private Div divCdsTotal;
	private Div divCdsBorrowed;
	private Div divMoreThanOneMonthCD;
	private Div divDVDsTotal;
	private Div divDVDsBorrowed;
	private Div divMoreThanOneMonthDVD;
	private Div nameSreen;

	/**
	 * Default constructor.
	 */
	public ScreenStatistics()
	{
		divCdsTotal = SetUp.getBuilder().uiComponentBuilderInstance().divInterface();
		divCdsBorrowed = SetUp.getBuilder().uiComponentBuilderInstance().divInterface();
		divMoreThanOneMonthCD = SetUp.getBuilder().uiComponentBuilderInstance().divInterface();
		divDVDsTotal = SetUp.getBuilder().uiComponentBuilderInstance().divInterface();
		divDVDsBorrowed = SetUp.getBuilder().uiComponentBuilderInstance().divInterface();
		divMoreThanOneMonthDVD = SetUp.getBuilder().uiComponentBuilderInstance().divInterface();
		nameSreen = SetUp.getBuilder().uiComponentBuilderInstance().divInterface();
	}

	/*
	 * accessors methods, this methods performed scan in the html before return the element this scan is necessary because the element can
	 * not is displayed in screen to the access
	 */
	public Div getDivCdsTotal()
	{
		divCdsTotal.loadById("statistics_totalCDsLabel");
		return divCdsTotal;
	}

	public Div getDivCdsBorrowed()
	{
		divCdsBorrowed.loadById("statistics_borrowedCDsLabel");
		return divCdsBorrowed;
	}

	public Div getDivMoreThanOneMonthCD()
	{
		divMoreThanOneMonthCD.loadById("statistics_forgottenCDsLabel");
		return divMoreThanOneMonthCD;
	}

	public Div getDivDVDsTotal()
	{
		divDVDsTotal.loadById("statistics_totalDVDsLabel");
		return divDVDsTotal;
	}

	public Div getDivDVDsBorrowed()
	{
		divDVDsBorrowed.loadById("statistics_borrowedDVDsLabel");
		return divDVDsBorrowed;
	}

	public Div getDivMoreThanOneMonthDVD()
	{
		divMoreThanOneMonthDVD.loadById("statistics_forgottenDVDsLabel");
		return divMoreThanOneMonthDVD;
	}

	public String getNameScreen()
	{
		nameSreen.loadByXPath("/html/body/div[3]/div[2]/div");
		String name = nameSreen.getText().substring(0, 10);
		return name;
	}
}
