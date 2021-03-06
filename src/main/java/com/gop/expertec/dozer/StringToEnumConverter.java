package com.gop.expertec.dozer;

import org.dozer.CustomConverter;

public class StringToEnumConverter implements CustomConverter {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass, Class<?> sourceClass) {

        if (null == sourceFieldValue)
            return null;
        if (String.class.isAssignableFrom(sourceClass) && Enum.class.isAssignableFrom(destinationClass)) {
            return Enum.valueOf((Class<Enum>) destinationClass, (String) sourceFieldValue);
        }
        if (Enum.class.isAssignableFrom(sourceClass) && String.class.isAssignableFrom(destinationClass)) {
            return sourceFieldValue.toString();
        }
        return null;
    }

}
