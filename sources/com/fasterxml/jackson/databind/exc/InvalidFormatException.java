package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;

/* JADX INFO: loaded from: classes21.dex */
public class InvalidFormatException extends MismatchedInputException {
    private static final long serialVersionUID = 1;
    protected final Object _value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object getValue() {
        return this._value;
    }

    @Deprecated
    public InvalidFormatException(String str, Object obj, Class<?> cls) {
        super(null, str);
        this._value = obj;
        this._targetType = cls;
    }

    @Deprecated
    public InvalidFormatException(String str, JsonLocation jsonLocation, Object obj, Class<?> cls) {
        super((JsonParser) null, str, jsonLocation);
        this._value = obj;
        this._targetType = cls;
    }

    public InvalidFormatException(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        super(jsonParser, str, cls);
        this._value = obj;
    }

    public static InvalidFormatException from(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        return new InvalidFormatException(jsonParser, str, obj, cls);
    }
}
