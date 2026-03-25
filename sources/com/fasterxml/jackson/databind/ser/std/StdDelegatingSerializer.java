package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.lang.reflect.Type;
import o.AbstractC5601Xz;
import o.C5619Yr;
import o.InterfaceC5584Xi;
import o.InterfaceC5586Xk;
import o.InterfaceC5598Xw;
import o.InterfaceC5621Yt;
import o.VD;
import o.VI;
import o.XT;
import o.XZ;

/* JADX INFO: loaded from: classes21.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements XT, XZ, InterfaceC5586Xk, InterfaceC5598Xw {
    protected final InterfaceC5621Yt<Object, ?> _converter;
    protected final VD<Object> _delegateSerializer;
    protected final JavaType _delegateType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC5621Yt<Object, ?> getConverter() {
        return this._converter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VD
    public VD<?> getDelegatee() {
        return this._delegateSerializer;
    }

    public StdDelegatingSerializer(InterfaceC5621Yt<?, ?> interfaceC5621Yt) {
        super(Object.class);
        this._converter = interfaceC5621Yt;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public <T> StdDelegatingSerializer(Class<T> cls, InterfaceC5621Yt<T, ?> interfaceC5621Yt) {
        super(cls, false);
        this._converter = interfaceC5621Yt;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public StdDelegatingSerializer(InterfaceC5621Yt<Object, ?> interfaceC5621Yt, JavaType javaType, VD<?> vd) {
        super(javaType);
        this._converter = interfaceC5621Yt;
        this._delegateType = javaType;
        this._delegateSerializer = vd;
    }

    public StdDelegatingSerializer withDelegate(InterfaceC5621Yt<Object, ?> interfaceC5621Yt, JavaType javaType, VD<?> vd) {
        C5619Yr.AEQbTJ((Class<?>) StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(interfaceC5621Yt, javaType, vd);
    }

    @Override // o.XZ
    public void resolve(VI vi) throws JsonMappingException {
        InterfaceC5586Xk interfaceC5586Xk = this._delegateSerializer;
        if (interfaceC5586Xk == null || !(interfaceC5586Xk instanceof XZ)) {
            return;
        }
        ((XZ) interfaceC5586Xk).resolve(vi);
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<?> vdHandleSecondaryContextualization = this._delegateSerializer;
        JavaType javaTypeEZpvd = this._delegateType;
        if (vdHandleSecondaryContextualization == null) {
            if (javaTypeEZpvd == null) {
                javaTypeEZpvd = this._converter.EZpvd(vi.getTypeFactory());
            }
            if (!javaTypeEZpvd.isJavaLangObject()) {
                vdHandleSecondaryContextualization = vi.findValueSerializer(javaTypeEZpvd);
            }
        }
        if (vdHandleSecondaryContextualization instanceof XT) {
            vdHandleSecondaryContextualization = vi.handleSecondaryContextualization(vdHandleSecondaryContextualization, beanProperty);
        }
        return (vdHandleSecondaryContextualization == this._delegateSerializer && javaTypeEZpvd == this._delegateType) ? this : withDelegate(this._converter, javaTypeEZpvd, vdHandleSecondaryContextualization);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            vi.defaultSerializeNull(jsonGenerator);
            return;
        }
        VD<Object> vd_findSerializer = this._delegateSerializer;
        if (vd_findSerializer == null) {
            vd_findSerializer = _findSerializer(objConvertValue, vi);
        }
        vd_findSerializer.serialize(objConvertValue, jsonGenerator, vi);
    }

    @Override // o.VD
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        Object objConvertValue = convertValue(obj);
        VD<Object> vd_findSerializer = this._delegateSerializer;
        if (vd_findSerializer == null) {
            vd_findSerializer = _findSerializer(obj, vi);
        }
        vd_findSerializer.serializeWithType(objConvertValue, jsonGenerator, vi, abstractC5601Xz);
    }

    @Override // o.VD
    public boolean isEmpty(VI vi, Object obj) {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            return true;
        }
        VD<Object> vd = this._delegateSerializer;
        if (vd == null) {
            return obj == null;
        }
        return vd.isEmpty(vi, objConvertValue);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) throws JsonMappingException {
        InterfaceC5586Xk interfaceC5586Xk = this._delegateSerializer;
        if (interfaceC5586Xk instanceof InterfaceC5598Xw) {
            return ((InterfaceC5598Xw) interfaceC5586Xk).getSchema(vi, type);
        }
        return super.getSchema(vi, type);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type, boolean z) throws JsonMappingException {
        InterfaceC5586Xk interfaceC5586Xk = this._delegateSerializer;
        if (interfaceC5586Xk instanceof InterfaceC5598Xw) {
            return ((InterfaceC5598Xw) interfaceC5586Xk).getSchema(vi, type, z);
        }
        return super.getSchema(vi, type);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        VD<Object> vd = this._delegateSerializer;
        if (vd != null) {
            vd.acceptJsonFormatVisitor(interfaceC5584Xi, javaType);
        }
    }

    public Object convertValue(Object obj) {
        return this._converter.OLrzqt(obj);
    }

    public VD<Object> _findSerializer(Object obj, VI vi) throws JsonMappingException {
        return vi.findValueSerializer(obj.getClass());
    }
}
