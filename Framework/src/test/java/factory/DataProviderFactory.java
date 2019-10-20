package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

public class DataProviderFactory {
	
	public static ConfigDataProvider getConfig() {
		
		ConfigDataProvider Config = new ConfigDataProvider();
		
		return Config;
	}
	
	public static ExcelDataProvider getExcel() {
		
		ExcelDataProvider Excel = new ExcelDataProvider();
		
		return Excel;
	}

}
