package com.seleniumexpress.lc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String myConvertedStringValue = text.toUpperCase();
		
		setValue(myConvertedStringValue);
	}

}
