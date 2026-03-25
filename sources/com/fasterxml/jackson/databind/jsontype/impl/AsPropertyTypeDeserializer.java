package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import java.io.IOException;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5543Vt;
import o.XB;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;
    protected final JsonTypeInfo.As _inclusion;
    protected final String _msgForMissingId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public JsonTypeInfo.As getTypeInclusion() {
        return this._inclusion;
    }

    public AsPropertyTypeDeserializer(JavaType javaType, XB xb, String str, boolean z, JavaType javaType2) {
        this(javaType, xb, str, z, javaType2, JsonTypeInfo.As.PROPERTY);
    }

    public AsPropertyTypeDeserializer(JavaType javaType, XB xb, String str, boolean z, JavaType javaType2, JsonTypeInfo.As as) {
        String str2;
        super(javaType, xb, str, z, javaType2);
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            str2 = String.format("missing type id property '%s'", this._typePropertyName);
        } else {
            str2 = String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, beanProperty.getName());
        }
        this._msgForMissingId = str2;
        this._inclusion = as;
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        String str;
        super(asPropertyTypeDeserializer, beanProperty);
        BeanProperty beanProperty2 = this._property;
        if (beanProperty2 == null) {
            str = String.format("missing type id property '%s'", this._typePropertyName);
        } else {
            str = String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, beanProperty2.getName());
        }
        this._msgForMissingId = str;
        this._inclusion = asPropertyTypeDeserializer._inclusion;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public AbstractC5597Xv forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC5597Xv
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strQKVWgx;
        Object objAxsJAY;
        if (jsonParser.AEQbTJ() && (objAxsJAY = jsonParser.AxsJAY()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objAxsJAY);
        }
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        YA yaBufferForInputBuffering = null;
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        } else if (jsonTokenDjBIcL != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, this._msgForMissingId);
        }
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            if ((strKWHzl.equals(this._typePropertyName) || (zIsEnabled && strKWHzl.equalsIgnoreCase(this._typePropertyName))) && (strQKVWgx = jsonParser.QKVWgx()) != null) {
                return _deserializeTypedForId(jsonParser, deserializationContext, yaBufferForInputBuffering, strQKVWgx);
            }
            if (yaBufferForInputBuffering == null) {
                yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            yaBufferForInputBuffering.KWHzl(strKWHzl);
            yaBufferForInputBuffering.EZpvd(jsonParser);
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, yaBufferForInputBuffering, this._msgForMissingId);
    }

    public Object _deserializeTypedForId(JsonParser jsonParser, DeserializationContext deserializationContext, YA ya, String str) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy_findDeserializer = _findDeserializer(deserializationContext, str);
        if (this._typeIdVisible) {
            if (ya == null) {
                ya = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            ya.KWHzl(jsonParser.KWHzl());
            ya.AhwBna(str);
        }
        if (ya != null) {
            jsonParser.OLrzqt();
            jsonParser = C5543Vt.copydefault(false, ya.gEmmrt(jsonParser), jsonParser);
        }
        if (jsonParser.djBIcL() != JsonToken.END_OBJECT) {
            jsonParser.RcXXUw();
        }
        return abstractC5548Vy_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Deprecated
    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, YA ya) throws IOException {
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, ya, null);
    }

    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, YA ya, String str) throws IOException {
        if (!hasDefaultImpl()) {
            Object objDeserializeIfNatural = AbstractC5597Xv.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
            if (objDeserializeIfNatural != null) {
                return objDeserializeIfNatural;
            }
            if (jsonParser.RJOkX()) {
                return super.deserializeTypedFromAny(jsonParser, deserializationContext);
            }
            if (jsonParser.copydefault(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.zLjUOn().trim().isEmpty()) {
                return null;
            }
        }
        AbstractC5548Vy<Object> abstractC5548Vy_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (abstractC5548Vy_findDefaultImplDeserializer == null) {
            JavaType javaType_handleMissingTypeId = _handleMissingTypeId(deserializationContext, str);
            if (javaType_handleMissingTypeId == null) {
                return null;
            }
            abstractC5548Vy_findDefaultImplDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleMissingTypeId, this._property);
        }
        if (ya != null) {
            ya.DbNXlk();
            jsonParser = ya.gEmmrt(jsonParser);
            jsonParser.RcXXUw();
        }
        return abstractC5548Vy_findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC5597Xv
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.copydefault(JsonToken.START_ARRAY)) {
            return super.deserializeTypedFromArray(jsonParser, deserializationContext);
        }
        return deserializeTypedFromObject(jsonParser, deserializationContext);
    }
}
