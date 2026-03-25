package com.fasterxml.jackson.databind.ser;

import com.amplifyframework.core.model.ModelIdentifier;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.C5594Xs;
import o.C5619Yr;
import o.InterfaceC5501Ue;
import o.InterfaceC5586Xk;
import o.InterfaceC5593Xr;
import o.InterfaceC5598Xw;
import o.InterfaceC5609Yh;
import o.VD;
import o.VI;
import o.VK;
import o.WT;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class BeanPropertyWriter extends PropertyWriter implements Serializable {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final transient InterfaceC5609Yh _contextAnnotations;
    protected final JavaType _declaredType;
    public transient AbstractC5604Yc _dynamicSerializers;
    protected transient Field _field;
    protected final Class<?>[] _includeInViews;
    protected transient HashMap<Object, Object> _internalSettings;
    protected final AnnotatedMember _member;
    public final SerializedString _name;
    public JavaType _nonTrivialBaseType;
    protected VD<Object> _nullSerializer;
    public VD<Object> _serializer;
    protected final boolean _suppressNulls;
    public final Object _suppressableValue;
    public AbstractC5601Xz _typeSerializer;
    protected final PropertyName _wrapperName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void assignTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        this._typeSerializer = abstractC5601Xz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._member;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC5501Ue getSerializedName() {
        return this._name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VD<Object> getSerializer() {
        return this._serializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._declaredType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5601Xz getTypeSerializer() {
        return this._typeSerializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Class<?>[] getViews() {
        return this._includeInViews;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasNullSerializer() {
        return this._nullSerializer != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasSerializer() {
        return this._serializer != null;
    }

    public boolean isUnwrapping() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }

    public BeanPropertyWriter(WT wt, AnnotatedMember annotatedMember, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType, VD<?> vd, AbstractC5601Xz abstractC5601Xz, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) {
        super(wt);
        this._member = annotatedMember;
        this._contextAnnotations = interfaceC5609Yh;
        this._name = new SerializedString(wt.getName());
        this._wrapperName = wt.getNewProxyInstance();
        this._declaredType = javaType;
        this._serializer = vd;
        this._dynamicSerializers = vd == null ? AbstractC5604Yc.copydefault() : null;
        this._typeSerializer = abstractC5601Xz;
        this._cfgSerializationType = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else {
            if (annotatedMember instanceof AnnotatedMethod) {
                this._accessorMethod = (Method) annotatedMember.getMember();
            } else {
                this._accessorMethod = null;
            }
            this._field = null;
        }
        this._suppressNulls = z;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    @Deprecated
    public BeanPropertyWriter(WT wt, AnnotatedMember annotatedMember, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType, VD<?> vd, AbstractC5601Xz abstractC5601Xz, JavaType javaType2, boolean z, Object obj) {
        this(wt, annotatedMember, interfaceC5609Yh, javaType, vd, abstractC5601Xz, javaType2, z, obj, null);
    }

    public BeanPropertyWriter() {
        super(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
        this._member = null;
        this._contextAnnotations = null;
        this._name = null;
        this._wrapperName = null;
        this._includeInViews = null;
        this._declaredType = null;
        this._serializer = null;
        this._dynamicSerializers = null;
        this._typeSerializer = null;
        this._cfgSerializationType = null;
        this._accessorMethod = null;
        this._field = null;
        this._suppressNulls = false;
        this._suppressableValue = null;
        this._nullSerializer = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter);
        this._name = new SerializedString(propertyName.getSimpleName());
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._member = beanPropertyWriter._member;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super(beanPropertyWriter);
        this._name = serializedString;
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._member = beanPropertyWriter._member;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }

    public BeanPropertyWriter rename(NameTransformer nameTransformer) {
        String strTransform = nameTransformer.transform(this._name.getValue());
        return strTransform.equals(this._name.toString()) ? this : _new(PropertyName.construct(strTransform));
    }

    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new BeanPropertyWriter(this, propertyName);
    }

    public void assignSerializer(VD<Object> vd) {
        VD<Object> vd2 = this._serializer;
        if (vd2 != null && vd2 != vd) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", C5619Yr.copydefault(vd2), C5619Yr.copydefault(vd)));
        }
        this._serializer = vd;
    }

    public void assignNullSerializer(VD<Object> vd) {
        VD<Object> vd2 = this._nullSerializer;
        if (vd2 != null && vd2 != vd) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", C5619Yr.copydefault(vd2), C5619Yr.copydefault(vd)));
        }
        this._nullSerializer = vd;
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public void fixAccess(SerializationConfig serializationConfig) {
        this._member.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        }
        if (this._serializer == null) {
            this._dynamicSerializers = AbstractC5604Yc.copydefault();
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC5623Yw
    public String getName() {
        return this._name.getValue();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(this._name.getValue());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return null;
        }
        return (A) annotatedMember.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        InterfaceC5609Yh interfaceC5609Yh = this._contextAnnotations;
        if (interfaceC5609Yh == null) {
            return null;
        }
        return (A) interfaceC5609Yh.get(cls);
    }

    public void _depositSchemaProperty(ObjectNode objectNode, JsonNode jsonNode) {
        objectNode.set(getName(), jsonNode);
    }

    public Object getInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this._internalSettings == null) {
            this._internalSettings = new HashMap<>();
        }
        return this._internalSettings.put(obj, obj2);
    }

    public Object removeInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        Object objRemove = map.remove(obj);
        if (this._internalSettings.size() == 0) {
            this._internalSettings = null;
        }
        return objRemove;
    }

    public boolean wouldConflictWithName(PropertyName propertyName) {
        PropertyName propertyName2 = this._wrapperName;
        if (propertyName2 != null) {
            return propertyName2.equals(propertyName);
        }
        return propertyName.hasSimpleName(this._name.getValue()) && !propertyName.hasNamespace();
    }

    @Deprecated
    public Class<?> getRawSerializationType() {
        JavaType javaType = this._cfgSerializationType;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    @Deprecated
    public Class<?> getPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getType();
        }
        return null;
    }

    @Deprecated
    public Type getGenericPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getGenericReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getGenericType();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        Object objInvoke;
        Method method = this._accessorMethod;
        if (method == null) {
            objInvoke = this._field.get(obj);
        } else {
            objInvoke = method.invoke(obj, null);
        }
        if (objInvoke == null) {
            Object obj2 = this._suppressableValue;
            if ((obj2 == null || !vi.includeFilterSuppressNulls(obj2)) && this._nullSerializer != null) {
                jsonGenerator.copydefault((InterfaceC5501Ue) this._name);
                this._nullSerializer.serialize(null, jsonGenerator, vi);
                return;
            }
            return;
        }
        VD<?> vd_findAndAddDynamic = this._serializer;
        if (vd_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            VD<?> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
            vd_findAndAddDynamic = vdAEQbTJ == null ? _findAndAddDynamic(abstractC5604Yc, cls, vi) : vdAEQbTJ;
        }
        Object obj3 = this._suppressableValue;
        if (obj3 != null) {
            if (MARKER_FOR_EMPTY == obj3) {
                if (vd_findAndAddDynamic.isEmpty(vi, objInvoke)) {
                    return;
                }
            } else if (obj3.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, vi, vd_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.copydefault((InterfaceC5501Ue) this._name);
        AbstractC5601Xz abstractC5601Xz = this._typeSerializer;
        if (abstractC5601Xz == null) {
            vd_findAndAddDynamic.serialize(objInvoke, jsonGenerator, vi);
        } else {
            vd_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, vi, abstractC5601Xz);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        if (jsonGenerator.OLrzqt()) {
            return;
        }
        jsonGenerator.OLrzqt(this._name.getValue());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        Object objInvoke;
        Method method = this._accessorMethod;
        if (method == null) {
            objInvoke = this._field.get(obj);
        } else {
            objInvoke = method.invoke(obj, null);
        }
        if (objInvoke == null) {
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
            Class<?> cls = objInvoke.getClass();
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            VD<?> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
            vd_findAndAddDynamic = vdAEQbTJ == null ? _findAndAddDynamic(abstractC5604Yc, cls, vi) : vdAEQbTJ;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (vd_findAndAddDynamic.isEmpty(vi, objInvoke)) {
                    serializeAsPlaceholder(obj, jsonGenerator, vi);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                serializeAsPlaceholder(obj, jsonGenerator, vi);
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, vi, vd_findAndAddDynamic)) {
            return;
        }
        AbstractC5601Xz abstractC5601Xz = this._typeSerializer;
        if (abstractC5601Xz == null) {
            vd_findAndAddDynamic.serialize(objInvoke, jsonGenerator, vi);
        } else {
            vd_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, vi, abstractC5601Xz);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        VD<Object> vd = this._nullSerializer;
        if (vd != null) {
            vd.serialize(null, jsonGenerator, vi);
        } else {
            jsonGenerator.isConnected();
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
        if (interfaceC5593Xr != null) {
            if (isRequired()) {
                interfaceC5593Xr.OLrzqt(this);
            } else {
                interfaceC5593Xr.copydefault(this);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, VI vi) throws JsonMappingException {
        JsonNode jsonNodeOLrzqt;
        JavaType serializationType = getSerializationType();
        Type type = serializationType == null ? getType() : serializationType.getRawClass();
        InterfaceC5586Xk serializer = getSerializer();
        if (serializer == null) {
            serializer = vi.findValueSerializer(getType(), this);
        }
        boolean zIsRequired = isRequired();
        if (serializer instanceof InterfaceC5598Xw) {
            jsonNodeOLrzqt = ((InterfaceC5598Xw) serializer).getSchema(vi, type, !zIsRequired);
        } else {
            jsonNodeOLrzqt = C5594Xs.OLrzqt();
        }
        _depositSchemaProperty(objectNode, jsonNodeOLrzqt);
    }

    public VD<Object> _findAndAddDynamic(AbstractC5604Yc abstractC5604Yc, Class<?> cls, VI vi) throws JsonMappingException {
        AbstractC5604Yc.TaskDescription taskDescriptionEZpvd;
        JavaType javaType = this._nonTrivialBaseType;
        if (javaType != null) {
            taskDescriptionEZpvd = abstractC5604Yc.AEQbTJ(vi.constructSpecializedType(javaType, cls), vi, this);
        } else {
            taskDescriptionEZpvd = abstractC5604Yc.EZpvd(cls, vi, this);
        }
        AbstractC5604Yc abstractC5604Yc2 = taskDescriptionEZpvd.EZpvd;
        if (abstractC5604Yc != abstractC5604Yc2) {
            this._dynamicSerializers = abstractC5604Yc2;
        }
        return taskDescriptionEZpvd.KWHzl;
    }

    public final Object get(Object obj) throws Exception {
        Method method = this._accessorMethod;
        if (method == null) {
            return this._field.get(obj);
        }
        return method.invoke(obj, null);
    }

    public boolean _handleSelfReference(Object obj, JsonGenerator jsonGenerator, VI vi, VD<?> vd) throws IOException {
        if (vd.usesObjectId()) {
            return false;
        }
        if (vi.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(vd instanceof BeanSerializerBase)) {
                return false;
            }
            vi.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
            return false;
        }
        if (!vi.isEnabled(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this._nullSerializer == null) {
            return true;
        }
        if (!jsonGenerator.valueOf().valueOf()) {
            jsonGenerator.copydefault((InterfaceC5501Ue) this._name);
        }
        this._nullSerializer.serialize(null, jsonGenerator, vi);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(getName());
        sb.append("' (");
        if (this._accessorMethod != null) {
            sb.append("via method ");
            sb.append(this._accessorMethod.getDeclaringClass().getName());
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
            sb.append(this._accessorMethod.getName());
        } else if (this._field != null) {
            sb.append("field \"");
            sb.append(this._field.getDeclaringClass().getName());
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
            sb.append(this._field.getName());
        } else {
            sb.append("virtual");
        }
        if (this._serializer == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this._serializer.getClass().getName());
        }
        sb.append(')');
        return sb.toString();
    }
}
