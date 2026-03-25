package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5569Wt;
import o.C5619Yr;
import o.InterfaceC5554We;

/* JADX INFO: loaded from: classes21.dex */
class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements InterfaceC5554We {
    private static final long serialVersionUID = 1;
    protected final SettableBeanProperty[] _creatorProps;
    protected final AbstractC5548Vy<?> _deser;
    protected final AnnotatedMethod _factory;
    protected final boolean _hasArgs;
    protected final JavaType _inputType;
    private transient PropertyBasedCreator _propCreator;
    protected final ValueInstantiator _valueInstantiator;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = true;
        this._inputType = (javaType.hasRawClass(String.class) || javaType.hasRawClass(CharSequence.class)) ? null : javaType;
        this._deser = null;
        this._valueInstantiator = valueInstantiator;
        this._creatorProps = settableBeanPropertyArr;
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = false;
        this._inputType = null;
        this._deser = null;
        this._valueInstantiator = null;
        this._creatorProps = null;
    }

    public FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, AbstractC5548Vy<?> abstractC5548Vy) {
        super(factoryBasedEnumDeserializer._valueClass);
        this._inputType = factoryBasedEnumDeserializer._inputType;
        this._factory = factoryBasedEnumDeserializer._factory;
        this._hasArgs = factoryBasedEnumDeserializer._hasArgs;
        this._valueInstantiator = factoryBasedEnumDeserializer._valueInstantiator;
        this._creatorProps = factoryBasedEnumDeserializer._creatorProps;
        this._deser = abstractC5548Vy;
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType javaType;
        return (this._deser == null && (javaType = this._inputType) != null && this._creatorProps == null) ? new FactoryBasedEnumDeserializer(this, (AbstractC5548Vy<?>) deserializationContext.findContextualValueDeserializer(javaType, beanProperty)) : this;
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strQKVWgx;
        Object objDeserialize;
        AbstractC5548Vy<?> abstractC5548Vy = this._deser;
        if (abstractC5548Vy != null) {
            objDeserialize = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
        } else {
            if (!this._hasArgs) {
                jsonParser.UeEOUB();
                try {
                    return this._factory.call();
                } catch (Exception e) {
                    return deserializationContext.handleInstantiationProblem(this._valueClass, null, C5619Yr.gEmmrt(e));
                }
            }
            if (this._creatorProps != null) {
                if (!jsonParser.QVAiDq()) {
                    JavaType valueType = getValueType(deserializationContext);
                    deserializationContext.reportInputMismatch(valueType, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", C5619Yr.copydefault(valueType), this._factory, jsonParser.djBIcL());
                }
                if (this._propCreator == null) {
                    this._propCreator = PropertyBasedCreator.OLrzqt(deserializationContext, this._valueInstantiator, this._creatorProps, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.RcXXUw();
                return deserializeEnumUsingPropertyBased(jsonParser, deserializationContext, this._propCreator);
            }
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            boolean z = jsonTokenDjBIcL == JsonToken.START_ARRAY && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (z) {
                jsonTokenDjBIcL = jsonParser.RcXXUw();
            }
            if (jsonTokenDjBIcL == null || !jsonTokenDjBIcL.isScalarValue()) {
                jsonParser.UeEOUB();
                strQKVWgx = "";
            } else {
                strQKVWgx = jsonParser.QKVWgx();
            }
            if (z && jsonParser.RcXXUw() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            objDeserialize = strQKVWgx;
        }
        try {
            return this._factory.callOnWith(this._valueClass, objDeserialize);
        } catch (Exception e2) {
            Throwable thGEmmrt = C5619Yr.gEmmrt(e2);
            if ((thGEmmrt instanceof IllegalArgumentException) && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleInstantiationProblem(this._valueClass, objDeserialize, thGEmmrt);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        if (this._deser == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return abstractC5597Xv.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public Object deserializeEnumUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyBasedCreator propertyBasedCreator) throws IOException {
        C5569Wt c5569WtOLrzqt = propertyBasedCreator.OLrzqt(jsonParser, deserializationContext, null);
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyKWHzl = propertyBasedCreator.KWHzl(strKWHzl);
            if (!c5569WtOLrzqt.AEQbTJ(strKWHzl) || settableBeanPropertyKWHzl != null) {
                if (settableBeanPropertyKWHzl != null) {
                    c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyKWHzl));
                } else {
                    jsonParser.UeEOUB();
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        return propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            return wrapAndThrow(e, handledType(), settableBeanProperty.getName(), deserializationContext);
        }
    }

    public Object wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        Throwable thOLrzqt = C5619Yr.OLrzqt(th);
        C5619Yr.copydefault(thOLrzqt);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (thOLrzqt instanceof IOException) {
            if (!z || !(thOLrzqt instanceof JacksonException)) {
                throw ((IOException) thOLrzqt);
            }
        } else if (!z) {
            C5619Yr.AhwBna(thOLrzqt);
        }
        return thOLrzqt;
    }
}
