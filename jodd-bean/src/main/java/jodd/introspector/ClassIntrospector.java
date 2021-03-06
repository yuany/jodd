// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.introspector;

/**
 * Default class {@link Introspector} simply delegates method calls for
 * more convenient usage.
 */
public class ClassIntrospector {

	private static Introspector defaultInterceptor = new AccessibleIntrospector();

	/**
	 * Returns class descriptor for specified type.
	 */
	public static ClassDescriptor lookup(Class type) {
		return defaultInterceptor.lookup(type);
	}

	/**
	 * Registers new type.
	 */
	public static ClassDescriptor register(Class type) {
		return defaultInterceptor.register(type);
	}

	/**
	 * Clears cache.
	 */
	public static void reset() {
		defaultInterceptor.reset();
	}

	/**
	 * Specifies custom global default introspector.
	 */
	public static void setDefaultIntrospector(Introspector i) {
		defaultInterceptor = i;
	}
}