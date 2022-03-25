package ord.stepDefi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports 
{

	public static void reportGenerate(String jsonfile) 
	{
	
		
		//report dir
		File repositoryDirectory = new File("C:\\Users\\Lenovo\\eclipse-workspace\\CucumberMultipleLoginswithMultiscenario\\src\\test\\resources\\report");

		Configuration configuration = new Configuration(repositoryDirectory, "adactin hotel automation");
		configuration.addClassifications(   "os"	, "windows 10");
		configuration.addClassifications("browser"  , "chrome");
		configuration.addClassifications("version"  , "92");
		configuration.addClassifications("sprint"   , "37");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
		builder.generateReports();

	}
	
	
	
	
}
