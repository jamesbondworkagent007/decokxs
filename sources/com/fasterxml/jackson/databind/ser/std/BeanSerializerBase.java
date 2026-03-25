package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AbstractC5601Xz;
import o.C5576Xa;
import o.C5606Ye;
import o.C5610Yi;
import o.C5617Yp;
import o.C5619Yr;
import o.InterfaceC5584Xi;
import o.InterfaceC5586Xk;
import o.InterfaceC5593Xr;
import o.InterfaceC5596Xu;
import o.InterfaceC5598Xw;
import o.InterfaceC5621Yt;
import o.VD;
import o.VI;
import o.XN;
import o.XT;
import o.XU;
import o.XX;
import o.XZ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> implements XT, XZ, InterfaceC5586Xk, InterfaceC5598Xw {
    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    public static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    public final XN _anyGetterWriter;
    protected final JavaType _beanType;
    public final BeanPropertyWriter[] _filteredProps;
    public final C5606Ye _objectIdWriter;
    public final Object _propertyFilterId;
    public final BeanPropertyWriter[] _props;
    protected final JsonFormat.Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    public abstract BeanSerializerBase asArraySerializer();

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VD
    public boolean usesObjectId() {
        return this._objectIdWriter != null;
    }

    public abstract BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    /* JADX DEBUG: Method merged with bridge method: withFilterId(Ljava/lang/Object;)Lo/VD; */
    @Override // o.VD
    public abstract BeanSerializerBase withFilterId(Object obj);

    public abstract BeanSerializerBase withObjectIdWriter(C5606Ye c5606Ye);

    public abstract BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2);

    public BeanSerializerBase(JavaType javaType, XU xu, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this._beanType = javaType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        if (xu == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
            this._serializationShape = null;
            return;
        }
        this._typeId = xu.gEmmrt();
        this._anyGetterWriter = xu.copydefault();
        this._propertyFilterId = xu.AEQbTJ();
        this._objectIdWriter = xu.AhwBna();
        this._serializationShape = xu.OLrzqt().OLrzqt(null).getShape();
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C5606Ye c5606Ye) {
        this(beanSerializerBase, c5606Ye, beanSerializerBase._propertyFilterId);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C5606Ye c5606Ye, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = c5606Ye;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    @Deprecated
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, String[] strArr) {
        this(beanSerializerBase, C5617Yp.AEQbTJ(strArr), (Set<String>) null);
    }

    @Deprecated
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set) {
        this(beanSerializerBase, set, (Set<String>) null);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase._props;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase._filteredProps;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = beanPropertyWriterArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (!IgnorePropertiesUtil.KWHzl(beanPropertyWriter.getName(), set, set2)) {
                arrayList.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList2.add(beanPropertyWriterArr2[i]);
                }
            }
        }
        this._props = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        this._filteredProps = arrayList2 != null ? (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]) : null;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    @Deprecated
    public BeanSerializerBase withIgnorals(Set<String> set) {
        return withByNameInclusion(set, null);
    }

    @Deprecated
    public BeanSerializerBase withIgnorals(String[] strArr) {
        return withIgnorals(C5617Yp.AEQbTJ(strArr));
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase) {
        this(beanSerializerBase, beanSerializerBase._props, beanSerializerBase._filteredProps);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, rename(beanSerializerBase._props, nameTransformer), rename(beanSerializerBase._filteredProps, nameTransformer));
    }

    private static final BeanPropertyWriter[] rename(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i] = beanPropertyWriter.rename(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    @Override // o.XZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void resolve(VI vi) throws JsonMappingException {
        BeanPropertyWriter beanPropertyWriter;
        AbstractC5601Xz abstractC5601Xz;
        VD<Object> vdFindNullValueSerializer;
        BeanPropertyWriter beanPropertyWriter2;
        BeanPropertyWriter[] beanPropertyWriterArr = this._filteredProps;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this._props.length;
        for (int i = 0; i < length2; i++) {
            BeanPropertyWriter beanPropertyWriter3 = this._props[i];
            if (!beanPropertyWriter3.willSuppressNulls() && !beanPropertyWriter3.hasNullSerializer() && (vdFindNullValueSerializer = vi.findNullValueSerializer(beanPropertyWriter3)) != null) {
                beanPropertyWriter3.assignNullSerializer(vdFindNullValueSerializer);
                if (i < length && (beanPropertyWriter2 = this._filteredProps[i]) != null) {
                    beanPropertyWriter2.assignNullSerializer(vdFindNullValueSerializer);
                }
            }
            if (!beanPropertyWriter3.hasSerializer()) {
                VD<Object> vdFindConvertingSerializer = findConvertingSerializer(vi, beanPropertyWriter3);
                if (vdFindConvertingSerializer == null) {
                    JavaType serializationType = beanPropertyWriter3.getSerializationType();
                    if (serializationType == null) {
                        serializationType = beanPropertyWriter3.getType();
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                beanPropertyWriter3.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    VD<Object> vdFindValueSerializer = vi.findValueSerializer(serializationType, beanPropertyWriter3);
                    vdFindConvertingSerializer = (serializationType.isContainerType() && (abstractC5601Xz = (AbstractC5601Xz) serializationType.getContentType().getTypeHandler()) != null && (vdFindValueSerializer instanceof ContainerSerializer)) ? ((ContainerSerializer) vdFindValueSerializer).withValueTypeSerializer(abstractC5601Xz) : vdFindValueSerializer;
                    if (i >= length) {
                        beanPropertyWriter3.assignSerializer(vdFindConvertingSerializer);
                    }
                } else if (i >= length && (beanPropertyWriter = this._filteredProps[i]) != null) {
                    beanPropertyWriter.assignSerializer(vdFindConvertingSerializer);
                } else {
                    beanPropertyWriter3.assignSerializer(vdFindConvertingSerializer);
                }
            }
        }
        XN xn = this._anyGetterWriter;
        if (xn != null) {
            xn.OLrzqt(vi);
        }
    }

    public VD<Object> findConvertingSerializer(VI vi, BeanPropertyWriter beanPropertyWriter) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindSerializationConverter;
        AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
        if (annotationIntrospector == null || (member = beanPropertyWriter.getMember()) == null || (objFindSerializationConverter = annotationIntrospector.findSerializationConverter(member)) == null) {
            return null;
        }
        InterfaceC5621Yt<Object, Object> interfaceC5621YtConverterInstance = vi.converterInstance(beanPropertyWriter.getMember(), objFindSerializationConverter);
        JavaType javaTypeEZpvd = interfaceC5621YtConverterInstance.EZpvd(vi.getTypeFactory());
        return new StdDelegatingSerializer(interfaceC5621YtConverterInstance, javaTypeEZpvd, javaTypeEZpvd.isJavaLangObject() ? null : vi.findValueSerializer(javaTypeEZpvd, beanPropertyWriter));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0199 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x01b5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x01bb */
    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Shape shape;
        Object objFindFilterId;
        Set<String> included;
        Set<String> setFindIgnoredForSerialization;
        int i;
        BeanSerializerBase beanSerializerBaseWithFilterId;
        C5606Ye c5606YeOLrzqt;
        BeanPropertyWriter beanPropertyWriter;
        Object obj;
        C5576Xa c5576XaFindObjectReferenceInfo;
        AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
        BeanPropertyWriter[] beanPropertyWriterArr = null;
        AnnotatedMember member = (beanProperty == null || annotationIntrospector == null) ? null : beanProperty.getMember();
        SerializationConfig config = vi.getConfig();
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, this._handledType);
        if (valueFindFormatOverrides == null || !valueFindFormatOverrides.hasShape()) {
            shape = null;
        } else {
            shape = valueFindFormatOverrides.getShape();
            if (shape != JsonFormat.Shape.ANY && shape != this._serializationShape) {
                if (this._beanType.isEnumType()) {
                    int i2 = AnonymousClass1.copydefault[shape.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        return vi.handlePrimaryContextualization(EnumSerializer.construct(this._beanType.getRawClass(), vi.getConfig(), config.introspectClassAnnotations(this._beanType), valueFindFormatOverrides), beanProperty);
                    }
                } else if (shape == JsonFormat.Shape.NATURAL && ((!this._beanType.isMapLikeType() || !Map.class.isAssignableFrom(this._handledType)) && Map.Entry.class.isAssignableFrom(this._handledType))) {
                    JavaType javaTypeFindSuperType = this._beanType.findSuperType(Map.Entry.class);
                    return vi.handlePrimaryContextualization(new MapEntrySerializer(this._beanType, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1), false, null, beanProperty), beanProperty);
                }
            }
        }
        C5606Ye c5606YeKWHzl = this._objectIdWriter;
        if (member != null) {
            setFindIgnoredForSerialization = annotationIntrospector.findPropertyIgnoralByName(config, member).findIgnoredForSerialization();
            included = annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded();
            C5576Xa c5576XaFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (c5576XaFindObjectIdInfo == null) {
                if (c5606YeKWHzl != null && (c5576XaFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, null)) != null) {
                    c5606YeKWHzl = this._objectIdWriter.AEQbTJ(c5576XaFindObjectReferenceInfo.KWHzl());
                }
                i = 0;
            } else {
                C5576Xa c5576XaFindObjectReferenceInfo2 = annotationIntrospector.findObjectReferenceInfo(member, c5576XaFindObjectIdInfo);
                Class<? extends ObjectIdGenerator<?>> clsEZpvd = c5576XaFindObjectReferenceInfo2.EZpvd();
                JavaType javaType = vi.getTypeFactory().findTypeParameters(vi.constructType(clsEZpvd), ObjectIdGenerator.class)[0];
                if (clsEZpvd == ObjectIdGenerators.PropertyGenerator.class) {
                    String simpleName = c5576XaFindObjectReferenceInfo2.AEQbTJ().getSimpleName();
                    int length = this._props.length;
                    i = 0;
                    while (true) {
                        if (i == length) {
                            vi.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", C5619Yr.uzCIH(handledType()), C5619Yr.copydefault(simpleName)));
                        }
                        beanPropertyWriter = this._props[i];
                        if (simpleName.equals(beanPropertyWriter.getName())) {
                            break;
                        }
                        i++;
                    }
                    c5606YeKWHzl = C5606Ye.KWHzl(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(c5576XaFindObjectReferenceInfo2, beanPropertyWriter), c5576XaFindObjectReferenceInfo2.KWHzl());
                } else {
                    c5606YeKWHzl = C5606Ye.KWHzl(javaType, c5576XaFindObjectReferenceInfo2.AEQbTJ(), vi.objectIdGeneratorInstance(member, c5576XaFindObjectReferenceInfo2), c5576XaFindObjectReferenceInfo2.KWHzl());
                    i = 0;
                }
            }
            objFindFilterId = annotationIntrospector.findFilterId(member);
            if (objFindFilterId == null || ((obj = this._propertyFilterId) != null && objFindFilterId.equals(obj))) {
                objFindFilterId = null;
            }
        } else {
            objFindFilterId = null;
            included = null;
            setFindIgnoredForSerialization = null;
            i = 0;
        }
        if (i > 0) {
            BeanPropertyWriter[] beanPropertyWriterArr2 = this._props;
            BeanPropertyWriter[] beanPropertyWriterArr3 = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr2, beanPropertyWriterArr2.length);
            BeanPropertyWriter beanPropertyWriter2 = beanPropertyWriterArr3[i];
            System.arraycopy(beanPropertyWriterArr3, 0, beanPropertyWriterArr3, 1, i);
            beanPropertyWriterArr3[0] = beanPropertyWriter2;
            BeanPropertyWriter[] beanPropertyWriterArr4 = this._filteredProps;
            if (beanPropertyWriterArr4 != null) {
                beanPropertyWriterArr = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr4, beanPropertyWriterArr4.length);
                BeanPropertyWriter beanPropertyWriter3 = beanPropertyWriterArr[i];
                System.arraycopy(beanPropertyWriterArr, 0, beanPropertyWriterArr, 1, i);
                beanPropertyWriterArr[0] = beanPropertyWriter3;
            }
            beanSerializerBaseWithFilterId = withProperties(beanPropertyWriterArr3, beanPropertyWriterArr);
        } else {
            beanSerializerBaseWithFilterId = this;
        }
        if (c5606YeKWHzl != null && (c5606YeOLrzqt = c5606YeKWHzl.OLrzqt(vi.findValueSerializer(c5606YeKWHzl.OLrzqt, beanProperty))) != this._objectIdWriter) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withObjectIdWriter(c5606YeOLrzqt);
        }
        if ((setFindIgnoredForSerialization != null && !setFindIgnoredForSerialization.isEmpty()) || included != null) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withByNameInclusion(setFindIgnoredForSerialization, included);
        }
        if (objFindFilterId != null) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withFilterId(objFindFilterId);
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanSerializerBaseWithFilterId.asArraySerializer() : beanSerializerBaseWithFilterId;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            copydefault = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[JsonFormat.Shape.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // o.VD
    public Iterator<PropertyWriter> properties() {
        return Arrays.asList(this._props).iterator();
    }

    @Override // o.VD
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, vi, abstractC5601Xz);
            return;
        }
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(abstractC5601Xz, obj, JsonToken.START_OBJECT);
        abstractC5601Xz.AEQbTJ(jsonGenerator, writableTypeId_typeIdDef);
        jsonGenerator.KWHzl(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, vi);
        } else {
            serializeFields(obj, jsonGenerator, vi);
        }
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeId_typeIdDef);
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, VI vi, boolean z) throws IOException {
        C5606Ye c5606Ye = this._objectIdWriter;
        C5610Yi c5610YiFindObjectId = vi.findObjectId(obj, c5606Ye.AEQbTJ);
        if (c5610YiFindObjectId.copydefault(jsonGenerator, vi, c5606Ye)) {
            return;
        }
        Object objCopydefault = c5610YiFindObjectId.copydefault(obj);
        if (c5606Ye.copydefault) {
            c5606Ye.KWHzl.serialize(objCopydefault, jsonGenerator, vi);
            return;
        }
        if (z) {
            jsonGenerator.AYXKKw(obj);
        }
        c5610YiFindObjectId.AEQbTJ(jsonGenerator, vi, c5606Ye);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, vi);
        } else {
            serializeFields(obj, jsonGenerator, vi);
        }
        if (z) {
            jsonGenerator.DbNXlk();
        }
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        C5606Ye c5606Ye = this._objectIdWriter;
        C5610Yi c5610YiFindObjectId = vi.findObjectId(obj, c5606Ye.AEQbTJ);
        if (c5610YiFindObjectId.copydefault(jsonGenerator, vi, c5606Ye)) {
            return;
        }
        Object objCopydefault = c5610YiFindObjectId.copydefault(obj);
        if (c5606Ye.copydefault) {
            c5606Ye.KWHzl.serialize(objCopydefault, jsonGenerator, vi);
        } else {
            _serializeObjectId(obj, jsonGenerator, vi, abstractC5601Xz, c5610YiFindObjectId);
        }
    }

    public void _serializeObjectId(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz, C5610Yi c5610Yi) throws IOException {
        C5606Ye c5606Ye = this._objectIdWriter;
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(abstractC5601Xz, obj, JsonToken.START_OBJECT);
        abstractC5601Xz.AEQbTJ(jsonGenerator, writableTypeId_typeIdDef);
        jsonGenerator.KWHzl(obj);
        c5610Yi.AEQbTJ(jsonGenerator, vi, c5606Ye);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, vi);
        } else {
            serializeFields(obj, jsonGenerator, vi);
        }
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeId_typeIdDef);
    }

    public final WritableTypeId _typeIdDef(AbstractC5601Xz abstractC5601Xz, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this._typeId;
        if (annotatedMember == null) {
            return abstractC5601Xz.AEQbTJ(obj, jsonToken);
        }
        Object value = annotatedMember.getValue(obj);
        if (value == null) {
            value = "";
        }
        return abstractC5601Xz.OLrzqt(obj, jsonToken, value);
    }

    @Deprecated
    public final String _customTypeId(Object obj) {
        Object value = this._typeId.getValue(obj);
        return value == null ? "" : value instanceof String ? (String) value : value.toString();
    }

    public void serializeFields(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || vi.getActiveView() == null) ? this._props : this._filteredProps;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, vi);
                }
                i++;
            }
            XN xn = this._anyGetterWriter;
            if (xn != null) {
                xn.copydefault(obj, jsonGenerator, vi);
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.prependPath(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]");
            throw jsonMappingException;
        }
    }

    public void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || vi.getActiveView() == null) ? this._props : this._filteredProps;
        XX xxFindPropertyFilter = findPropertyFilter(vi, this._propertyFilterId, obj);
        if (xxFindPropertyFilter == null) {
            serializeFields(obj, jsonGenerator, vi);
            return;
        }
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    xxFindPropertyFilter.serializeAsField(obj, jsonGenerator, vi, beanPropertyWriter);
                }
                i++;
            }
            XN xn = this._anyGetterWriter;
            if (xn != null) {
                xn.copydefault(obj, jsonGenerator, vi, xxFindPropertyFilter);
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.prependPath(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]");
            throw jsonMappingException;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    @Deprecated
    public JsonNode getSchema(VI vi, Type type) throws JsonMappingException {
        String strAEQbTJ;
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode("object", true);
        InterfaceC5596Xu interfaceC5596Xu = (InterfaceC5596Xu) this._handledType.getAnnotation(InterfaceC5596Xu.class);
        if (interfaceC5596Xu != null && (strAEQbTJ = interfaceC5596Xu.AEQbTJ()) != null && !strAEQbTJ.isEmpty()) {
            objectNodeCreateSchemaNode.put("id", strAEQbTJ);
        }
        ObjectNode objectNode = objectNodeCreateSchemaNode.objectNode();
        Object obj = this._propertyFilterId;
        XX xxFindPropertyFilter = obj != null ? findPropertyFilter(vi, obj, null) : null;
        int i = 0;
        while (true) {
            BeanPropertyWriter[] beanPropertyWriterArr = this._props;
            if (i < beanPropertyWriterArr.length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (xxFindPropertyFilter == null) {
                    beanPropertyWriter.depositSchemaProperty(objectNode, vi);
                } else {
                    xxFindPropertyFilter.depositSchemaProperty(beanPropertyWriter, objectNode, vi);
                }
                i++;
            } else {
                objectNodeCreateSchemaNode.set("properties", objectNode);
                return objectNodeCreateSchemaNode;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        InterfaceC5593Xr interfaceC5593XrDjBIcL;
        if (interfaceC5584Xi == null || (interfaceC5593XrDjBIcL = interfaceC5584Xi.djBIcL(javaType)) == null) {
            return;
        }
        VI viAEQbTJ = interfaceC5584Xi.AEQbTJ();
        Class<?> activeView = null;
        int i = 0;
        if (this._propertyFilterId != null) {
            XX xxFindPropertyFilter = findPropertyFilter(interfaceC5584Xi.AEQbTJ(), this._propertyFilterId, null);
            int length = this._props.length;
            while (i < length) {
                xxFindPropertyFilter.depositSchemaProperty(this._props[i], interfaceC5593XrDjBIcL, viAEQbTJ);
                i++;
            }
            return;
        }
        if (this._filteredProps != null && viAEQbTJ != null) {
            activeView = viAEQbTJ.getActiveView();
        }
        BeanPropertyWriter[] beanPropertyWriterArr = activeView != null ? this._filteredProps : this._props;
        int length2 = beanPropertyWriterArr.length;
        while (i < length2) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriter.depositSchemaProperty(interfaceC5593XrDjBIcL, viAEQbTJ);
            }
            i++;
        }
    }
}
