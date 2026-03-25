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
public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsWrapperTypeDeserializer(JavaType javaType, XB xb, String str, boolean z, JavaType javaType2) {
        super(javaType, xb, str, z, javaType2);
    }

    public AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public AbstractC5597Xv forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    @Override // o.AbstractC5597Xv
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5597Xv
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
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
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenDjBIcL == jsonToken) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonTokenRcXXUw != jsonToken2) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken2, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")", new Object[0]);
            }
        } else if (jsonTokenDjBIcL != JsonToken.FIELD_NAME) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
        }
        String strZLjUOn = jsonParser.zLjUOn();
        AbstractC5548Vy<Object> abstractC5548Vy_findDeserializer = _findDeserializer(deserializationContext, strZLjUOn);
        jsonParser.RcXXUw();
        if (this._typeIdVisible && jsonParser.copydefault(jsonToken)) {
            YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            yaBufferForInputBuffering.AkhnZx();
            yaBufferForInputBuffering.KWHzl(this._typePropertyName);
            yaBufferForInputBuffering.AhwBna(strZLjUOn);
            jsonParser.OLrzqt();
            jsonParser = C5543Vt.copydefault(false, yaBufferForInputBuffering.gEmmrt(jsonParser), jsonParser);
            jsonParser.RcXXUw();
        }
        Object objDeserialize = abstractC5548Vy_findDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken jsonTokenRcXXUw2 = jsonParser.RcXXUw();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenRcXXUw2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return objDeserialize;
    }
}
