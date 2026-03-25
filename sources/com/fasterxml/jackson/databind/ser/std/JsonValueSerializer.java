package com.fasterxml.jackson.databind.ser.std;

import com.amplifyframework.core.model.ModelIdentifier;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.C5594Xs;
import o.C5619Yr;
import o.InterfaceC5584Xi;
import o.InterfaceC5586Xk;
import o.InterfaceC5591Xp;
import o.InterfaceC5598Xw;
import o.VD;
import o.VI;
import o.VK;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class JsonValueSerializer extends StdSerializer<Object> implements XT, InterfaceC5586Xk, InterfaceC5598Xw {
    protected final AnnotatedMember _accessor;
    protected transient AbstractC5604Yc _dynamicSerializers;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final VD<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final AbstractC5601Xz _valueTypeSerializer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final Class<Object> _notNullClass(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, AbstractC5601Xz abstractC5601Xz, VD<?> vd) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueType = annotatedMember.getType();
        this._valueTypeSerializer = abstractC5601Xz;
        this._valueSerializer = vd;
        this._property = null;
        this._forceTypeInformation = true;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
    }

    @Deprecated
    public JsonValueSerializer(AnnotatedMember annotatedMember, VD<?> vd) {
        this(annotatedMember, null, vd);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, boolean z) {
        super(_notNullClass(jsonValueSerializer.handledType()));
        this._accessor = jsonValueSerializer._accessor;
        this._valueType = jsonValueSerializer._valueType;
        this._valueTypeSerializer = abstractC5601Xz;
        this._valueSerializer = vd;
        this._property = beanProperty;
        this._forceTypeInformation = z;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, boolean z) {
        return (this._property == beanProperty && this._valueTypeSerializer == abstractC5601Xz && this._valueSerializer == vd && z == this._forceTypeInformation) ? this : new JsonValueSerializer(this, beanProperty, abstractC5601Xz, vd, z);
    }

    @Override // o.VD
    public boolean isEmpty(VI vi, Object obj) {
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            return true;
        }
        VD<Object> vd_findDynamicSerializer = this._valueSerializer;
        if (vd_findDynamicSerializer == null) {
            try {
                vd_findDynamicSerializer = _findDynamicSerializer(vi, value.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return vd_findDynamicSerializer.isEmpty(vi, value);
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5601Xz abstractC5601XzOLrzqt = this._valueTypeSerializer;
        if (abstractC5601XzOLrzqt != null) {
            abstractC5601XzOLrzqt = abstractC5601XzOLrzqt.OLrzqt(beanProperty);
        }
        VD<?> vd = this._valueSerializer;
        if (vd == null) {
            if (!vi.isEnabled(MapperFeature.USE_STATIC_TYPING) && !this._valueType.isFinal()) {
                return beanProperty != this._property ? withResolved(beanProperty, abstractC5601XzOLrzqt, vd, this._forceTypeInformation) : this;
            }
            VD<Object> vdFindPrimaryPropertySerializer = vi.findPrimaryPropertySerializer(this._valueType, beanProperty);
            return withResolved(beanProperty, abstractC5601XzOLrzqt, vdFindPrimaryPropertySerializer, isNaturalTypeWithStdHandling(this._valueType.getRawClass(), vdFindPrimaryPropertySerializer));
        }
        return withResolved(beanProperty, abstractC5601XzOLrzqt, vi.handlePrimaryContextualization(vd, beanProperty), this._forceTypeInformation);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        Object value;
        try {
            value = this._accessor.getValue(obj);
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, this._accessor.getName() + "()");
            value = null;
        }
        if (value == null) {
            vi.defaultSerializeNull(jsonGenerator);
            return;
        }
        VD<Object> vd_findDynamicSerializer = this._valueSerializer;
        if (vd_findDynamicSerializer == null) {
            vd_findDynamicSerializer = _findDynamicSerializer(vi, value.getClass());
        }
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        if (abstractC5601Xz != null) {
            vd_findDynamicSerializer.serializeWithType(value, jsonGenerator, vi, abstractC5601Xz);
        } else {
            vd_findDynamicSerializer.serialize(value, jsonGenerator, vi);
        }
    }

    @Override // o.VD
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        Object value;
        try {
            value = this._accessor.getValue(obj);
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, this._accessor.getName() + "()");
            value = null;
        }
        if (value == null) {
            vi.defaultSerializeNull(jsonGenerator);
            return;
        }
        VD<Object> vd_findDynamicSerializer = this._valueSerializer;
        if (vd_findDynamicSerializer == null) {
            vd_findDynamicSerializer = _findDynamicSerializer(vi, value.getClass());
        } else if (this._forceTypeInformation) {
            WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(obj, JsonToken.VALUE_STRING));
            vd_findDynamicSerializer.serialize(value, jsonGenerator, vi);
            abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
            return;
        }
        vd_findDynamicSerializer.serializeWithType(value, jsonGenerator, vi, new TaskDescription(abstractC5601Xz, obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) throws JsonMappingException {
        InterfaceC5586Xk interfaceC5586Xk = this._valueSerializer;
        if (interfaceC5586Xk instanceof InterfaceC5598Xw) {
            return ((InterfaceC5598Xw) interfaceC5586Xk).getSchema(vi, null);
        }
        return C5594Xs.OLrzqt();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        Class<?> declaringClass = this._accessor.getDeclaringClass();
        if (declaringClass != null && C5619Yr.AkhnZx(declaringClass) && _acceptJsonFormatVisitorForEnum(interfaceC5584Xi, javaType, declaringClass)) {
            return;
        }
        VD<Object> vdFindTypedValueSerializer = this._valueSerializer;
        if (vdFindTypedValueSerializer == null && (vdFindTypedValueSerializer = interfaceC5584Xi.AEQbTJ().findTypedValueSerializer(this._valueType, false, this._property)) == null) {
            interfaceC5584Xi.EZpvd(javaType);
        } else {
            vdFindTypedValueSerializer.acceptJsonFormatVisitor(interfaceC5584Xi, this._valueType);
        }
    }

    public boolean _acceptJsonFormatVisitorForEnum(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, Class<?> cls) throws JsonMappingException {
        InterfaceC5591Xp interfaceC5591XpValueOf = interfaceC5584Xi.valueOf(javaType);
        if (interfaceC5591XpValueOf == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : cls.getEnumConstants()) {
            try {
                linkedHashSet.add(String.valueOf(this._accessor.getValue(obj)));
            } catch (Exception e) {
                e = e;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                C5619Yr.copydefault(e);
                throw JsonMappingException.wrapWithPath(e, obj, this._accessor.getName() + "()");
            }
        }
        interfaceC5591XpValueOf.EZpvd(linkedHashSet);
        return true;
    }

    public boolean isNaturalTypeWithStdHandling(Class<?> cls, VD<?> vd) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return isDefaultSerializer(vd);
    }

    public VD<Object> _findDynamicSerializer(VI vi, Class<?> cls) throws JsonMappingException {
        VD<Object> vdAEQbTJ = this._dynamicSerializers.AEQbTJ(cls);
        if (vdAEQbTJ != null) {
            return vdAEQbTJ;
        }
        if (this._valueType.hasGenericTypes()) {
            JavaType javaTypeConstructSpecializedType = vi.constructSpecializedType(this._valueType, cls);
            VD<Object> vdFindPrimaryPropertySerializer = vi.findPrimaryPropertySerializer(javaTypeConstructSpecializedType, this._property);
            this._dynamicSerializers = this._dynamicSerializers.EZpvd(javaTypeConstructSpecializedType, vdFindPrimaryPropertySerializer).EZpvd;
            return vdFindPrimaryPropertySerializer;
        }
        VD<Object> vdFindPrimaryPropertySerializer2 = vi.findPrimaryPropertySerializer(cls, this._property);
        this._dynamicSerializers = this._dynamicSerializers.OLrzqt(cls, vdFindPrimaryPropertySerializer2).EZpvd;
        return vdFindPrimaryPropertySerializer2;
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this._accessor.getDeclaringClass() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + this._accessor.getName() + ")";
    }

    public static class TaskDescription extends AbstractC5601Xz {
        public final AbstractC5601Xz EZpvd;
        public final Object OLrzqt;

        public TaskDescription(AbstractC5601Xz abstractC5601Xz, Object obj) {
            this.EZpvd = abstractC5601Xz;
            this.OLrzqt = obj;
        }

        @Override // o.AbstractC5601Xz
        public AbstractC5601Xz OLrzqt(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC5601Xz
        public JsonTypeInfo.As AEQbTJ() {
            return this.EZpvd.AEQbTJ();
        }

        @Override // o.AbstractC5601Xz
        public String EZpvd() {
            return this.EZpvd.EZpvd();
        }

        @Override // o.AbstractC5601Xz
        public WritableTypeId AEQbTJ(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.OLrzqt = this.OLrzqt;
            return this.EZpvd.AEQbTJ(jsonGenerator, writableTypeId);
        }

        @Override // o.AbstractC5601Xz
        public WritableTypeId copydefault(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.EZpvd.copydefault(jsonGenerator, writableTypeId);
        }
    }
}
