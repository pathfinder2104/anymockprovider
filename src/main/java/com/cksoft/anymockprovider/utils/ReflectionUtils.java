package com.cksoft.anymockprovider.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionUtils {

	// TODO Make this class generic if possible
	public Constructor[] getAllConstructors(Class clazz) {
		return clazz.getClass().getConstructors();
	}

	/**
	 * This method returns all kinds of fields, public, protected, private etc.
	 * 
	 * @param clazz
	 * @return {@link Field} array.
	 */
	public Field[] getAllFields(Class clazz) {
		return clazz.getDeclaredFields();
	}
}
