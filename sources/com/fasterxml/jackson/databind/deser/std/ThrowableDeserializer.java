package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;
import o.AbstractC5548Vy;

/* JADX INFO: loaded from: classes21.dex */
public class ThrowableDeserializer extends BeanDeserializer {
    protected static final String PROP_NAME_LOCALIZED_MESSAGE = "localizedMessage";
    protected static final String PROP_NAME_MESSAGE = "message";
    protected static final String PROP_NAME_SUPPRESSED = "suppressed";
    private static final long serialVersionUID = 1;

    @Deprecated
    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    public static ThrowableDeserializer construct(DeserializationContext deserializationContext, BeanDeserializer beanDeserializer) {
        return new ThrowableDeserializer(beanDeserializer);
    }

    public ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC5548Vy
    public AbstractC5548Vy<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return getClass() != ThrowableDeserializer.class ? this : new ThrowableDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean zCanCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean zCanCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!zCanCreateFromString && !zCanCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        int i = 0;
        Throwable th = null;
        Object[] objArr = null;
        Throwable[] thArr = null;
        while (!jsonParser.copydefault(JsonToken.END_OBJECT)) {
            String strKWHzl = jsonParser.KWHzl();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            jsonParser.RcXXUw();
            if (settableBeanPropertyFind != null) {
                if (th != null) {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, th);
                } else {
                    if (objArr == null) {
                        int size = this._beanProperties.size();
                        objArr = new Object[size + size];
                    }
                    objArr[i] = settableBeanPropertyFind;
                    objArr[i + 1] = settableBeanPropertyFind.deserialize(jsonParser, deserializationContext);
                    i += 2;
                }
            } else if ("message".equalsIgnoreCase(strKWHzl) && zCanCreateFromString) {
                th = (Throwable) this._valueInstantiator.createFromString(deserializationContext, jsonParser.QKVWgx());
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(strKWHzl)) {
                    jsonParser.UeEOUB();
                } else if (PROP_NAME_SUPPRESSED.equalsIgnoreCase(strKWHzl)) {
                    thArr = (Throwable[]) deserializationContext.readValue(jsonParser, Throwable[].class);
                } else if (PROP_NAME_LOCALIZED_MESSAGE.equalsIgnoreCase(strKWHzl)) {
                    jsonParser.UeEOUB();
                } else {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, th, strKWHzl);
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, th, strKWHzl);
                    }
                }
            }
            jsonParser.RcXXUw();
        }
        if (th == null) {
            if (zCanCreateFromString) {
                th = (Throwable) this._valueInstantiator.createFromString(deserializationContext, null);
            } else {
                th = (Throwable) this._valueInstantiator.createUsingDefault(deserializationContext);
            }
        }
        if (objArr != null) {
            for (int i2 = 0; i2 < i; i2 += 2) {
                ((SettableBeanProperty) objArr[i2]).set(th, objArr[i2 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th2 : thArr) {
                th.addSuppressed(th2);
            }
        }
        return th;
    }
}
