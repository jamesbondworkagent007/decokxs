package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.io.Serializable;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5543Vt;
import o.XB;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public boolean _usesExternalId() {
        return false;
    }

    public AsArrayTypeDeserializer(JavaType javaType, XB xb, String str, boolean z, JavaType javaType2) {
        super(javaType, xb, str, z, javaType2);
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public AbstractC5597Xv forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    @Override // o.AbstractC5597Xv
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5597Xv
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5597Xv
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5597Xv
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objAxsJAY;
        if (jsonParser.AEQbTJ() && (objAxsJAY = jsonParser.AxsJAY()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objAxsJAY);
        }
        boolean zRJOkX = jsonParser.RJOkX();
        String str_locateTypeId = _locateTypeId(jsonParser, deserializationContext);
        AbstractC5548Vy<Object> abstractC5548Vy_findDeserializer = _findDeserializer(deserializationContext, str_locateTypeId);
        if (this._typeIdVisible && !_usesExternalId() && jsonParser.copydefault(JsonToken.START_OBJECT)) {
            YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            yaBufferForInputBuffering.AkhnZx();
            yaBufferForInputBuffering.KWHzl(this._typePropertyName);
            yaBufferForInputBuffering.AhwBna(str_locateTypeId);
            jsonParser.OLrzqt();
            jsonParser = C5543Vt.copydefault(false, yaBufferForInputBuffering.gEmmrt(jsonParser), jsonParser);
            jsonParser.RcXXUw();
        }
        if (zRJOkX && jsonParser.djBIcL() == JsonToken.END_ARRAY) {
            return abstractC5548Vy_findDeserializer.getNullValue(deserializationContext);
        }
        Object objDeserialize = abstractC5548Vy_findDeserializer.deserialize(jsonParser, deserializationContext);
        if (zRJOkX) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenRcXXUw != jsonToken) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
            }
        }
        return objDeserialize;
    }

    public String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.RJOkX()) {
            if (this._defaultImpl != null) {
                return this._idResolver.EZpvd();
            }
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
            return null;
        }
        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonTokenRcXXUw == jsonToken || (jsonTokenRcXXUw != null && jsonTokenRcXXUw.isScalarValue())) {
            String strZLjUOn = jsonParser.zLjUOn();
            jsonParser.RcXXUw();
            return strZLjUOn;
        }
        deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON String, Number of Boolean that contains type id (for subtype of %s)", baseTypeName());
        return null;
    }
}
