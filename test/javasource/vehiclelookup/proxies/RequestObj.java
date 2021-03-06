// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package vehiclelookup.proxies;

/**
 * 
 */
public class RequestObj
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject requestObjMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "VehicleLookUp.RequestObj";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RegistrationNumber("RegistrationNumber");

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

	public RequestObj(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "VehicleLookUp.RequestObj"));
	}

	protected RequestObj(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestObjMendixObject)
	{
		if (requestObjMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("VehicleLookUp.RequestObj", requestObjMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a VehicleLookUp.RequestObj");

		this.requestObjMendixObject = requestObjMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RequestObj.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static vehiclelookup.proxies.RequestObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return vehiclelookup.proxies.RequestObj.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static vehiclelookup.proxies.RequestObj initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new vehiclelookup.proxies.RequestObj(context, mendixObject);
	}

	public static vehiclelookup.proxies.RequestObj load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return vehiclelookup.proxies.RequestObj.initialize(context, mendixObject);
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
	 * @return value of RegistrationNumber
	 */
	public final String getRegistrationNumber()
	{
		return getRegistrationNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of RegistrationNumber
	 */
	public final String getRegistrationNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.RegistrationNumber.toString());
	}

	/**
	 * Set value of RegistrationNumber
	 * @param registrationnumber
	 */
	public final void setRegistrationNumber(String registrationnumber)
	{
		setRegistrationNumber(getContext(), registrationnumber);
	}

	/**
	 * Set value of RegistrationNumber
	 * @param context
	 * @param registrationnumber
	 */
	public final void setRegistrationNumber(com.mendix.systemwideinterfaces.core.IContext context, String registrationnumber)
	{
		getMendixObject().setValue(context, MemberNames.RegistrationNumber.toString(), registrationnumber);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return requestObjMendixObject;
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
			final vehiclelookup.proxies.RequestObj that = (vehiclelookup.proxies.RequestObj) obj;
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
		return "VehicleLookUp.RequestObj";
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
