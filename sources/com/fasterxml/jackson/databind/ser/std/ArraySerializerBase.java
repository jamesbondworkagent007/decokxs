package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Objects;
import o.AbstractC5601Xz;
import o.VD;
import o.VI;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements XT {
    protected final BeanProperty _property;
    public final Boolean _unwrapSingle;

    public abstract VD<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public abstract void serializeContents(T t, JsonGenerator jsonGenerator, VI vi) throws IOException;

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    @Deprecated
    public ArraySerializerBase(Class<T> cls, BeanProperty beanProperty) {
        super(cls);
        this._property = beanProperty;
        this._unwrapSingle = null;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase) {
        super(arraySerializerBase._handledType, false);
        this._property = arraySerializerBase._property;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = bool;
    }

    @Deprecated
    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }

    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides;
        if (beanProperty != null && (valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType())) != null) {
            Boolean feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(feature, this._unwrapSingle)) {
                return _withResolved(beanProperty, feature);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(T t, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (_shouldUnwrapSingle(vi) && hasSingleElement(t)) {
            serializeContents(t, jsonGenerator, vi);
            return;
        }
        jsonGenerator.gEmmrt(t);
        serializeContents(t, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    @Override // o.VD
    public final void serializeWithType(T t, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(t, JsonToken.START_ARRAY));
        jsonGenerator.KWHzl(t);
        serializeContents(t, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    public final boolean _shouldUnwrapSingle(VI vi) {
        Boolean bool = this._unwrapSingle;
        if (bool == null) {
            return vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        }
        return bool.booleanValue();
    }
}
