// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package vehiclelookup.proxies;

/**
 * 
 */
public class MOTHistoryObj
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mOTHistoryObjMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "VehicleLookUp.MOTHistoryObj";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		test_date("test_date"),
		expiry_date("expiry_date"),
		test_result("test_result"),
		advisory_count("advisory_count"),
		failure_count("failure_count"),
		odometer_reading("odometer_reading"),
		mot_test_number("mot_test_number"),
		test_results("VehicleLookUp.test_results"),
		mot_history("VehicleLookUp.mot_history");

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

	public MOTHistoryObj(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "VehicleLookUp.MOTHistoryObj"));
	}

	protected MOTHistoryObj(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mOTHistoryObjMendixObject)
	{
		if (mOTHistoryObjMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("VehicleLookUp.MOTHistoryObj", mOTHistoryObjMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a VehicleLookUp.MOTHistoryObj");

		this.mOTHistoryObjMendixObject = mOTHistoryObjMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MOTHistoryObj.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static vehiclelookup.proxies.MOTHistoryObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return vehiclelookup.proxies.MOTHistoryObj.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static vehiclelookup.proxies.MOTHistoryObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new vehiclelookup.proxies.MOTHistoryObj(context, mendixObject);
	}

	public static vehiclelookup.proxies.MOTHistoryObj load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return vehiclelookup.proxies.MOTHistoryObj.initialize(context, mendixObject);
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
	 * @return value of test_date
	 */
	public final String gettest_date()
	{
		return gettest_date(getContext());
	}

	/**
	 * @param context
	 * @return value of test_date
	 */
	public final String gettest_date(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.test_date.toString());
	}

	/**
	 * Set value of test_date
	 * @param test_date
	 */
	public final void settest_date(String test_date)
	{
		settest_date(getContext(), test_date);
	}

	/**
	 * Set value of test_date
	 * @param context
	 * @param test_date
	 */
	public final void settest_date(com.mendix.systemwideinterfaces.core.IContext context, String test_date)
	{
		getMendixObject().setValue(context, MemberNames.test_date.toString(), test_date);
	}

	/**
	 * @return value of expiry_date
	 */
	public final String getexpiry_date()
	{
		return getexpiry_date(getContext());
	}

	/**
	 * @param context
	 * @return value of expiry_date
	 */
	public final String getexpiry_date(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.expiry_date.toString());
	}

	/**
	 * Set value of expiry_date
	 * @param expiry_date
	 */
	public final void setexpiry_date(String expiry_date)
	{
		setexpiry_date(getContext(), expiry_date);
	}

	/**
	 * Set value of expiry_date
	 * @param context
	 * @param expiry_date
	 */
	public final void setexpiry_date(com.mendix.systemwideinterfaces.core.IContext context, String expiry_date)
	{
		getMendixObject().setValue(context, MemberNames.expiry_date.toString(), expiry_date);
	}

	/**
	 * @return value of test_result
	 */
	public final String gettest_result()
	{
		return gettest_result(getContext());
	}

	/**
	 * @param context
	 * @return value of test_result
	 */
	public final String gettest_result(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.test_result.toString());
	}

	/**
	 * Set value of test_result
	 * @param test_result
	 */
	public final void settest_result(String test_result)
	{
		settest_result(getContext(), test_result);
	}

	/**
	 * Set value of test_result
	 * @param context
	 * @param test_result
	 */
	public final void settest_result(com.mendix.systemwideinterfaces.core.IContext context, String test_result)
	{
		getMendixObject().setValue(context, MemberNames.test_result.toString(), test_result);
	}

	/**
	 * @return value of advisory_count
	 */
	public final Integer getadvisory_count()
	{
		return getadvisory_count(getContext());
	}

	/**
	 * @param context
	 * @return value of advisory_count
	 */
	public final Integer getadvisory_count(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.advisory_count.toString());
	}

	/**
	 * Set value of advisory_count
	 * @param advisory_count
	 */
	public final void setadvisory_count(Integer advisory_count)
	{
		setadvisory_count(getContext(), advisory_count);
	}

	/**
	 * Set value of advisory_count
	 * @param context
	 * @param advisory_count
	 */
	public final void setadvisory_count(com.mendix.systemwideinterfaces.core.IContext context, Integer advisory_count)
	{
		getMendixObject().setValue(context, MemberNames.advisory_count.toString(), advisory_count);
	}

	/**
	 * @return value of failure_count
	 */
	public final Integer getfailure_count()
	{
		return getfailure_count(getContext());
	}

	/**
	 * @param context
	 * @return value of failure_count
	 */
	public final Integer getfailure_count(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.failure_count.toString());
	}

	/**
	 * Set value of failure_count
	 * @param failure_count
	 */
	public final void setfailure_count(Integer failure_count)
	{
		setfailure_count(getContext(), failure_count);
	}

	/**
	 * Set value of failure_count
	 * @param context
	 * @param failure_count
	 */
	public final void setfailure_count(com.mendix.systemwideinterfaces.core.IContext context, Integer failure_count)
	{
		getMendixObject().setValue(context, MemberNames.failure_count.toString(), failure_count);
	}

	/**
	 * @return value of odometer_reading
	 */
	public final String getodometer_reading()
	{
		return getodometer_reading(getContext());
	}

	/**
	 * @param context
	 * @return value of odometer_reading
	 */
	public final String getodometer_reading(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.odometer_reading.toString());
	}

	/**
	 * Set value of odometer_reading
	 * @param odometer_reading
	 */
	public final void setodometer_reading(String odometer_reading)
	{
		setodometer_reading(getContext(), odometer_reading);
	}

	/**
	 * Set value of odometer_reading
	 * @param context
	 * @param odometer_reading
	 */
	public final void setodometer_reading(com.mendix.systemwideinterfaces.core.IContext context, String odometer_reading)
	{
		getMendixObject().setValue(context, MemberNames.odometer_reading.toString(), odometer_reading);
	}

	/**
	 * @return value of mot_test_number
	 */
	public final String getmot_test_number()
	{
		return getmot_test_number(getContext());
	}

	/**
	 * @param context
	 * @return value of mot_test_number
	 */
	public final String getmot_test_number(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.mot_test_number.toString());
	}

	/**
	 * Set value of mot_test_number
	 * @param mot_test_number
	 */
	public final void setmot_test_number(String mot_test_number)
	{
		setmot_test_number(getContext(), mot_test_number);
	}

	/**
	 * Set value of mot_test_number
	 * @param context
	 * @param mot_test_number
	 */
	public final void setmot_test_number(com.mendix.systemwideinterfaces.core.IContext context, String mot_test_number)
	{
		getMendixObject().setValue(context, MemberNames.mot_test_number.toString(), mot_test_number);
	}

	/**
	 * @return value of test_results
	 */
	public final vehiclelookup.proxies.TestResultObj gettest_results() throws com.mendix.core.CoreException
	{
		return gettest_results(getContext());
	}

	/**
	 * @param context
	 * @return value of test_results
	 */
	public final vehiclelookup.proxies.TestResultObj gettest_results(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		vehiclelookup.proxies.TestResultObj result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.test_results.toString());
		if (identifier != null)
			result = vehiclelookup.proxies.TestResultObj.load(context, identifier);
		return result;
	}

	/**
	 * Set value of test_results
	 * @param test_results
	 */
	public final void settest_results(vehiclelookup.proxies.TestResultObj test_results)
	{
		settest_results(getContext(), test_results);
	}

	/**
	 * Set value of test_results
	 * @param context
	 * @param test_results
	 */
	public final void settest_results(com.mendix.systemwideinterfaces.core.IContext context, vehiclelookup.proxies.TestResultObj test_results)
	{
		if (test_results == null)
			getMendixObject().setValue(context, MemberNames.test_results.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.test_results.toString(), test_results.getMendixObject().getId());
	}

	/**
	 * @return value of mot_history
	 */
	public final java.util.List<vehiclelookup.proxies.dataObj> getmot_history() throws com.mendix.core.CoreException
	{
		return getmot_history(getContext());
	}

	/**
	 * @param context
	 * @return value of mot_history
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<vehiclelookup.proxies.dataObj> getmot_history(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<vehiclelookup.proxies.dataObj> result = new java.util.ArrayList<vehiclelookup.proxies.dataObj>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.mot_history.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(vehiclelookup.proxies.dataObj.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of mot_history
	 * @param mot_history
	 */
	public final void setmot_history(java.util.List<vehiclelookup.proxies.dataObj> mot_history)
	{
		setmot_history(getContext(), mot_history);
	}

	/**
	 * Set value of mot_history
	 * @param context
	 * @param mot_history
	 */
	public final void setmot_history(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<vehiclelookup.proxies.dataObj> mot_history)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (vehiclelookup.proxies.dataObj proxyObject : mot_history)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.mot_history.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mOTHistoryObjMendixObject;
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
			final vehiclelookup.proxies.MOTHistoryObj that = (vehiclelookup.proxies.MOTHistoryObj) obj;
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
		return "VehicleLookUp.MOTHistoryObj";
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
