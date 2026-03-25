package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.InterfaceC5501Ue;
import o.InterfaceC5609Yh;
import o.VD;
import o.VI;
import o.WJ;
import o.WT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase
    public boolean isVirtual() {
        return true;
    }

    public abstract Object value(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception;

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, WJ wj, WT wt, JavaType javaType);

    public VirtualBeanPropertyWriter(WT wt, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType) {
        this(wt, interfaceC5609Yh, javaType, null, null, null, wt.EZpvd());
    }

    public VirtualBeanPropertyWriter() {
    }

    public VirtualBeanPropertyWriter(WT wt, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType, VD<?> vd, AbstractC5601Xz abstractC5601Xz, JavaType javaType2, JsonInclude.Value value, Class<?>[] clsArr) {
        super(wt, wt.ejfBZ(), interfaceC5609Yh, javaType, vd, abstractC5601Xz, javaType2, _suppressNulls(value), _suppressableValue(value), clsArr);
    }

    @Deprecated
    public VirtualBeanPropertyWriter(WT wt, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType, VD<?> vd, AbstractC5601Xz abstractC5601Xz, JavaType javaType2, JsonInclude.Value value) {
        this(wt, interfaceC5609Yh, javaType, vd, abstractC5601Xz, javaType2, value, null);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter) {
        super(virtualBeanPropertyWriter);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter, PropertyName propertyName) {
        super(virtualBeanPropertyWriter, propertyName);
    }

    public static boolean _suppressNulls(JsonInclude.Value value) {
        JsonInclude.Include valueInclusion;
        return (value == null || (valueInclusion = value.getValueInclusion()) == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.USE_DEFAULTS) ? false : true;
    }

    public static Object _suppressableValue(JsonInclude.Value value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        JsonInclude.Include valueInclusion = value.getValueInclusion();
        if (valueInclusion == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.NON_NULL || valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return null;
        }
        return BeanPropertyWriter.MARKER_FOR_EMPTY;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        Object objValue = value(obj, jsonGenerator, vi);
        if (objValue == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.copydefault((InterfaceC5501Ue) this._name);
                this._nullSerializer.serialize(null, jsonGenerator, vi);
                return;
            }
            return;
        }
        VD<?> vd_findAndAddDynamic = this._serializer;
        if (vd_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            VD<?> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
            vd_findAndAddDynamic = vdAEQbTJ == null ? _findAndAddDynamic(abstractC5604Yc, cls, vi) : vdAEQbTJ;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (vd_findAndAddDynamic.isEmpty(vi, objValue)) {
                    return;
                }
            } else if (obj2.equals(objValue)) {
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, vi, vd_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.copydefault((InterfaceC5501Ue) this._name);
        AbstractC5601Xz abstractC5601Xz = this._typeSerializer;
        if (abstractC5601Xz == null) {
            vd_findAndAddDynamic.serialize(objValue, jsonGenerator, vi);
        } else {
            vd_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, vi, abstractC5601Xz);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        Object objValue = value(obj, jsonGenerator, vi);
        if (objValue == null) {
            VD<Object> vd = this._nullSerializer;
            if (vd != null) {
                vd.serialize(null, jsonGenerator, vi);
                return;
            } else {
                jsonGenerator.isConnected();
                return;
            }
        }
        VD<?> vd_findAndAddDynamic = this._serializer;
        if (vd_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            VD<?> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
            vd_findAndAddDynamic = vdAEQbTJ == null ? _findAndAddDynamic(abstractC5604Yc, cls, vi) : vdAEQbTJ;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (vd_findAndAddDynamic.isEmpty(vi, objValue)) {
                    serializeAsPlaceholder(obj, jsonGenerator, vi);
                    return;
                }
            } else if (obj2.equals(objValue)) {
                serializeAsPlaceholder(obj, jsonGenerator, vi);
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, vi, vd_findAndAddDynamic)) {
            return;
        }
        AbstractC5601Xz abstractC5601Xz = this._typeSerializer;
        if (abstractC5601Xz == null) {
            vd_findAndAddDynamic.serialize(objValue, jsonGenerator, vi);
        } else {
            vd_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, vi, abstractC5601Xz);
        }
    }
}
