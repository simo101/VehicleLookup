// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package vehiclelookup.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the VehicleLookUp module

	public static String getAPIKey()
	{
		return (String)Core.getConfiguration().getConstantValue("VehicleLookUp.APIKey");
	}
}