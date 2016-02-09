// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package vehiclelookup.proxies;

/**
 * 
 */
public class VehicleObj
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject vehicleObjMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "VehicleLookUp.VehicleObj";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		vrm("vrm"),
		make("make"),
		model("model"),
		engine_size("engine_size"),
		fuel_type("fuel_type"),
		colour("colour"),
		vehicle_type_approval("vehicle_type_approval"),
		wheelplan("wheelplan"),
		revenue_weight("revenue_weight"),
		vehicle_status("vehicle_status"),
		registration_date("registration_date"),
		manufacture_year("manufacture_year"),
		vehicle_information("VehicleLookUp.vehicle_information");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public VehicleObj(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "VehicleLookUp.VehicleObj"));
	}

	protected VehicleObj(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vehicleObjMendixObject)
	{
		if (vehicleObjMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("VehicleLookUp.VehicleObj", vehicleObjMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a VehicleLookUp.VehicleObj");

		this.vehicleObjMendixObject = vehicleObjMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'VehicleObj.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static vehiclelookup.proxies.VehicleObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return vehiclelookup.proxies.VehicleObj.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static vehiclelookup.proxies.VehicleObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new vehiclelookup.proxies.VehicleObj(context, mendixObject);
	}

	public static vehiclelookup.proxies.VehicleObj load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return vehiclelookup.proxies.VehicleObj.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of vrm
	 */
	public final String getvrm()
	{
		return getvrm(getContext());
	}

	/**
	 * @param context
	 * @return value of vrm
	 */
	public final String getvrm(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.vrm.toString());
	}

	/**
	 * Set value of vrm
	 * @param vrm
	 */
	public final void setvrm(String vrm)
	{
		setvrm(getContext(), vrm);
	}

	/**
	 * Set value of vrm
	 * @param context
	 * @param vrm
	 */
	public final void setvrm(com.mendix.systemwideinterfaces.core.IContext context, String vrm)
	{
		getMendixObject().setValue(context, MemberNames.vrm.toString(), vrm);
	}

	/**
	 * @return value of make
	 */
	public final String getmake()
	{
		return getmake(getContext());
	}

	/**
	 * @param context
	 * @return value of make
	 */
	public final String getmake(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.make.toString());
	}

	/**
	 * Set value of make
	 * @param make
	 */
	public final void setmake(String make)
	{
		setmake(getContext(), make);
	}

	/**
	 * Set value of make
	 * @param context
	 * @param make
	 */
	public final void setmake(com.mendix.systemwideinterfaces.core.IContext context, String make)
	{
		getMendixObject().setValue(context, MemberNames.make.toString(), make);
	}

	/**
	 * @return value of model
	 */
	public final String getmodel()
	{
		return getmodel(getContext());
	}

	/**
	 * @param context
	 * @return value of model
	 */
	public final String getmodel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.model.toString());
	}

	/**
	 * Set value of model
	 * @param model
	 */
	public final void setmodel(String model)
	{
		setmodel(getContext(), model);
	}

	/**
	 * Set value of model
	 * @param context
	 * @param model
	 */
	public final void setmodel(com.mendix.systemwideinterfaces.core.IContext context, String model)
	{
		getMendixObject().setValue(context, MemberNames.model.toString(), model);
	}

	/**
	 * @return value of engine_size
	 */
	public final String getengine_size()
	{
		return getengine_size(getContext());
	}

	/**
	 * @param context
	 * @return value of engine_size
	 */
	public final String getengine_size(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.engine_size.toString());
	}

	/**
	 * Set value of engine_size
	 * @param engine_size
	 */
	public final void setengine_size(String engine_size)
	{
		setengine_size(getContext(), engine_size);
	}

	/**
	 * Set value of engine_size
	 * @param context
	 * @param engine_size
	 */
	public final void setengine_size(com.mendix.systemwideinterfaces.core.IContext context, String engine_size)
	{
		getMendixObject().setValue(context, MemberNames.engine_size.toString(), engine_size);
	}

	/**
	 * @return value of fuel_type
	 */
	public final String getfuel_type()
	{
		return getfuel_type(getContext());
	}

	/**
	 * @param context
	 * @return value of fuel_type
	 */
	public final String getfuel_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.fuel_type.toString());
	}

	/**
	 * Set value of fuel_type
	 * @param fuel_type
	 */
	public final void setfuel_type(String fuel_type)
	{
		setfuel_type(getContext(), fuel_type);
	}

	/**
	 * Set value of fuel_type
	 * @param context
	 * @param fuel_type
	 */
	public final void setfuel_type(com.mendix.systemwideinterfaces.core.IContext context, String fuel_type)
	{
		getMendixObject().setValue(context, MemberNames.fuel_type.toString(), fuel_type);
	}

	/**
	 * @return value of colour
	 */
	public final String getcolour()
	{
		return getcolour(getContext());
	}

	/**
	 * @param context
	 * @return value of colour
	 */
	public final String getcolour(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.colour.toString());
	}

	/**
	 * Set value of colour
	 * @param colour
	 */
	public final void setcolour(String colour)
	{
		setcolour(getContext(), colour);
	}

	/**
	 * Set value of colour
	 * @param context
	 * @param colour
	 */
	public final void setcolour(com.mendix.systemwideinterfaces.core.IContext context, String colour)
	{
		getMendixObject().setValue(context, MemberNames.colour.toString(), colour);
	}

	/**
	 * @return value of vehicle_type_approval
	 */
	public final String getvehicle_type_approval()
	{
		return getvehicle_type_approval(getContext());
	}

	/**
	 * @param context
	 * @return value of vehicle_type_approval
	 */
	public final String getvehicle_type_approval(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.vehicle_type_approval.toString());
	}

	/**
	 * Set value of vehicle_type_approval
	 * @param vehicle_type_approval
	 */
	public final void setvehicle_type_approval(String vehicle_type_approval)
	{
		setvehicle_type_approval(getContext(), vehicle_type_approval);
	}

	/**
	 * Set value of vehicle_type_approval
	 * @param context
	 * @param vehicle_type_approval
	 */
	public final void setvehicle_type_approval(com.mendix.systemwideinterfaces.core.IContext context, String vehicle_type_approval)
	{
		getMendixObject().setValue(context, MemberNames.vehicle_type_approval.toString(), vehicle_type_approval);
	}

	/**
	 * @return value of wheelplan
	 */
	public final String getwheelplan()
	{
		return getwheelplan(getContext());
	}

	/**
	 * @param context
	 * @return value of wheelplan
	 */
	public final String getwheelplan(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.wheelplan.toString());
	}

	/**
	 * Set value of wheelplan
	 * @param wheelplan
	 */
	public final void setwheelplan(String wheelplan)
	{
		setwheelplan(getContext(), wheelplan);
	}

	/**
	 * Set value of wheelplan
	 * @param context
	 * @param wheelplan
	 */
	public final void setwheelplan(com.mendix.systemwideinterfaces.core.IContext context, String wheelplan)
	{
		getMendixObject().setValue(context, MemberNames.wheelplan.toString(), wheelplan);
	}

	/**
	 * @return value of revenue_weight
	 */
	public final String getrevenue_weight()
	{
		return getrevenue_weight(getContext());
	}

	/**
	 * @param context
	 * @return value of revenue_weight
	 */
	public final String getrevenue_weight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.revenue_weight.toString());
	}

	/**
	 * Set value of revenue_weight
	 * @param revenue_weight
	 */
	public final void setrevenue_weight(String revenue_weight)
	{
		setrevenue_weight(getContext(), revenue_weight);
	}

	/**
	 * Set value of revenue_weight
	 * @param context
	 * @param revenue_weight
	 */
	public final void setrevenue_weight(com.mendix.systemwideinterfaces.core.IContext context, String revenue_weight)
	{
		getMendixObject().setValue(context, MemberNames.revenue_weight.toString(), revenue_weight);
	}

	/**
	 * @return value of vehicle_status
	 */
	public final String getvehicle_status()
	{
		return getvehicle_status(getContext());
	}

	/**
	 * @param context
	 * @return value of vehicle_status
	 */
	public final String getvehicle_status(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.vehicle_status.toString());
	}

	/**
	 * Set value of vehicle_status
	 * @param vehicle_status
	 */
	public final void setvehicle_status(String vehicle_status)
	{
		setvehicle_status(getContext(), vehicle_status);
	}

	/**
	 * Set value of vehicle_status
	 * @param context
	 * @param vehicle_status
	 */
	public final void setvehicle_status(com.mendix.systemwideinterfaces.core.IContext context, String vehicle_status)
	{
		getMendixObject().setValue(context, MemberNames.vehicle_status.toString(), vehicle_status);
	}

	/**
	 * @return value of registration_date
	 */
	public final String getregistration_date()
	{
		return getregistration_date(getContext());
	}

	/**
	 * @param context
	 * @return value of registration_date
	 */
	public final String getregistration_date(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.registration_date.toString());
	}

	/**
	 * Set value of registration_date
	 * @param registration_date
	 */
	public final void setregistration_date(String registration_date)
	{
		setregistration_date(getContext(), registration_date);
	}

	/**
	 * Set value of registration_date
	 * @param context
	 * @param registration_date
	 */
	public final void setregistration_date(com.mendix.systemwideinterfaces.core.IContext context, String registration_date)
	{
		getMendixObject().setValue(context, MemberNames.registration_date.toString(), registration_date);
	}

	/**
	 * @return value of manufacture_year
	 */
	public final String getmanufacture_year()
	{
		return getmanufacture_year(getContext());
	}

	/**
	 * @param context
	 * @return value of manufacture_year
	 */
	public final String getmanufacture_year(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.manufacture_year.toString());
	}

	/**
	 * Set value of manufacture_year
	 * @param manufacture_year
	 */
	public final void setmanufacture_year(String manufacture_year)
	{
		setmanufacture_year(getContext(), manufacture_year);
	}

	/**
	 * Set value of manufacture_year
	 * @param context
	 * @param manufacture_year
	 */
	public final void setmanufacture_year(com.mendix.systemwideinterfaces.core.IContext context, String manufacture_year)
	{
		getMendixObject().setValue(context, MemberNames.manufacture_year.toString(), manufacture_year);
	}

	/**
	 * @return value of vehicle_information
	 */
	public final vehiclelookup.proxies.dataObj getvehicle_information() throws com.mendix.core.CoreException
	{
		return getvehicle_information(getContext());
	}

	/**
	 * @param context
	 * @return value of vehicle_information
	 */
	public final vehiclelookup.proxies.dataObj getvehicle_information(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		vehiclelookup.proxies.dataObj result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.vehicle_information.toString());
		if (identifier != null)
			result = vehiclelookup.proxies.dataObj.load(context, identifier);
		return result;
	}

	/**
	 * Set value of vehicle_information
	 * @param vehicle_information
	 */
	public final void setvehicle_information(vehiclelookup.proxies.dataObj vehicle_information)
	{
		setvehicle_information(getContext(), vehicle_information);
	}

	/**
	 * Set value of vehicle_information
	 * @param context
	 * @param vehicle_information
	 */
	public final void setvehicle_information(com.mendix.systemwideinterfaces.core.IContext context, vehiclelookup.proxies.dataObj vehicle_information)
	{
		if (vehicle_information == null)
			getMendixObject().setValue(context, MemberNames.vehicle_information.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.vehicle_information.toString(), vehicle_information.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return vehicleObjMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final vehiclelookup.proxies.VehicleObj that = (vehiclelookup.proxies.VehicleObj) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "VehicleLookUp.VehicleObj";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}