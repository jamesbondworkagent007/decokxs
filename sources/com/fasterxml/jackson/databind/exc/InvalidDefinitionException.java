package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import o.AbstractC5549Vz;
import o.WT;

/* JADX INFO: loaded from: classes21.dex */
public class InvalidDefinitionException extends JsonMappingException {
    protected transient AbstractC5549Vz _beanDesc;
    protected transient WT _property;
    protected final JavaType _type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5549Vz getBeanDescription() {
        return this._beanDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WT getProperty() {
        return this._property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType getType() {
        return this._type;
    }

    public InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public InvalidDefinitionException(JsonParser jsonParser, String str, AbstractC5549Vz abstractC5549Vz, WT wt) {
        super(jsonParser, str);
        this._type = abstractC5549Vz == null ? null : abstractC5549Vz.getNewProxyInstance();
        this._beanDesc = abstractC5549Vz;
        this._property = wt;
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, AbstractC5549Vz abstractC5549Vz, WT wt) {
        super(jsonGenerator, str);
        this._type = abstractC5549Vz == null ? null : abstractC5549Vz.getNewProxyInstance();
        this._beanDesc = abstractC5549Vz;
        this._property = wt;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, AbstractC5549Vz abstractC5549Vz, WT wt) {
        return new InvalidDefinitionException(jsonParser, str, abstractC5549Vz, wt);
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, AbstractC5549Vz abstractC5549Vz, WT wt) {
        return new InvalidDefinitionException(jsonGenerator, str, abstractC5549Vz, wt);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }
}
