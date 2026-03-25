package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o.AbstractC5548Vy;
import o.C5576Xa;
import o.C5619Yr;
import o.InterfaceC5494Tx;
import o.InterfaceC5599Xx;
import o.InterfaceC5621Yt;
import o.TA;
import o.TB;
import o.TC;
import o.TD;
import o.TE;
import o.TF;
import o.TG;
import o.TH;
import o.TI;
import o.TJ;
import o.TK;
import o.TL;
import o.TM;
import o.TN;
import o.TO;
import o.TP;
import o.TQ;
import o.TR;
import o.TS;
import o.TT;
import o.TU;
import o.TV;
import o.TW;
import o.TX;
import o.TY;
import o.VC;
import o.VD;
import o.VG;
import o.VJ;
import o.VL;
import o.VM;
import o.VN;
import o.VO;
import o.VP;
import o.VQ;
import o.VV;
import o.WD;
import o.WJ;
import o.WM;
import o.XB;
import o.XJ;
import o.YB;

/* JADX INFO: loaded from: classes21.dex */
public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    private static final WD _java7Helper;
    private static final long serialVersionUID = 1;
    protected transient LRUMap<Class<?>, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_SER = {JsonSerialize.class, TW.class, JsonFormat.class, JsonTypeInfo.class, TT.class, TX.class, TA.class, TN.class};
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_DESER = {VJ.class, TW.class, JsonFormat.class, JsonTypeInfo.class, TX.class, TA.class, TN.class, TK.class};

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(WM wm, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(WM wm, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(WM wm, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(WM wm, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(WM wm, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(WM wm) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JacksonAnnotationIntrospector setConstructorPropertiesImpliesCreator(boolean z) {
        this._cfgConstructorPropertiesImpliesCreator = z;
        return this;
    }

    static {
        WD wdKWHzl;
        try {
            wdKWHzl = WD.KWHzl();
        } catch (Throwable unused) {
            wdKWHzl = null;
        }
        _java7Helper = wdKWHzl;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return VV.KWHzl;
    }

    public Object readResolve() {
        if (this._annotationsInside == null) {
            this._annotationsInside = new LRUMap<>(48, 48);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Boolean boolValueOf = this._annotationsInside.get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(InterfaceC5494Tx.class) != null);
            this._annotationsInside.putIfAbsent(clsAnnotationType, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r3) {
        JsonProperty jsonProperty;
        String strValueOf;
        try {
            Field field = r3.getDeclaringClass().getField(r3.name());
            if (field != null && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null && (strValueOf = jsonProperty.valueOf()) != null) {
                if (!strValueOf.isEmpty()) {
                    return strValueOf;
                }
            }
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        return r3.name();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String strValueOf = jsonProperty.valueOf();
                if (!strValueOf.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValueOf);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) map.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        TC tc;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (tc = (TC) field.getAnnotation(TC.class)) != null) {
                String[] strArrCopydefault = tc.copydefault();
                if (strArrCopydefault.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i = 0; i < length; i++) {
                        if (name.equals(enumArr[i].name())) {
                            strArr[i] = strArrCopydefault;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return C5619Yr.EZpvd(cls, TJ.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(WJ wj) {
        TS ts = (TS) _findAnnotation(wj, TS.class);
        if (ts == null) {
            return null;
        }
        String strKWHzl = ts.KWHzl();
        return PropertyName.construct(ts.copydefault(), (strKWHzl == null || !strKWHzl.isEmpty()) ? strKWHzl : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(WJ wj) {
        TM tm = (TM) _findAnnotation(wj, TM.class);
        if (tm == null) {
            return null;
        }
        return Boolean.valueOf(tm.OLrzqt());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, WM wm) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(wm, JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return JsonIgnoreProperties.Value.empty();
        }
        return JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(WM wm) {
        return findPropertyIgnoralByName(null, wm);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, WM wm) {
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) _findAnnotation(wm, JsonIncludeProperties.class);
        if (jsonIncludeProperties == null) {
            return JsonIncludeProperties.Value.all();
        }
        return JsonIncludeProperties.Value.from(jsonIncludeProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(WM wm) {
        TI ti = (TI) _findAnnotation(wm, TI.class);
        if (ti == null) {
            return null;
        }
        String strEZpvd = ti.EZpvd();
        if (strEZpvd.isEmpty()) {
            return null;
        }
        return strEZpvd;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(WJ wj) {
        VN vn = (VN) _findAnnotation(wj, VN.class);
        if (vn == null) {
            return null;
        }
        return vn.copydefault();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(WJ wj) {
        TD td = (TD) _findAnnotation(wj, TD.class);
        if (td == null) {
            return null;
        }
        return td.OLrzqt();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(WJ wj, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(wj, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName propertyName_findConstructorName = _findConstructorName(annotatedMember);
        if (propertyName_findConstructorName == null) {
            return null;
        }
        return propertyName_findConstructorName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> findPropertyAliases(WM wm) {
        TC tc = (TC) _findAnnotation(wm, TC.class);
        if (tc == null) {
            return null;
        }
        String[] strArrCopydefault = tc.copydefault();
        int length = strArrCopydefault.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrCopydefault) {
            arrayList.add(PropertyName.construct(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.copydefault());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(WM wm) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(wm, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.AEQbTJ();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(WM wm) {
        TQ tq = (TQ) _findAnnotation(wm, TQ.class);
        if (tq == null) {
            return null;
        }
        return tq.copydefault();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(WM wm) {
        int iEZpvd;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(wm, JsonProperty.class);
        if (jsonProperty == null || (iEZpvd = jsonProperty.EZpvd()) == -1) {
            return null;
        }
        return Integer.valueOf(iEZpvd);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(WM wm) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(wm, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String strKWHzl = jsonProperty.KWHzl();
        if (strKWHzl.isEmpty()) {
            return null;
        }
        return strKWHzl;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(WM wm) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(wm, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return JsonFormat.Value.from(jsonFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        TN tn = (TN) _findAnnotation(annotatedMember, TN.class);
        if (tn != null) {
            return AnnotationIntrospector.ReferenceProperty.KWHzl(tn.copydefault());
        }
        TA ta = (TA) _findAnnotation(annotatedMember, TA.class);
        if (ta != null) {
            return AnnotationIntrospector.ReferenceProperty.OLrzqt(ta.OLrzqt());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        TX tx = (TX) _findAnnotation(annotatedMember, TX.class);
        if (tx == null || !tx.KWHzl()) {
            return null;
        }
        return NameTransformer.simpleTransformer(tx.OLrzqt(), tx.copydefault());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value valueFrom = JacksonInject.Value.from(jacksonInject);
        if (valueFrom.hasId()) {
            return valueFrom;
        }
        if (!(annotatedMember instanceof AnnotatedMethod)) {
            name = annotatedMember.getRawType().getName();
        } else {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() == 0) {
                name = annotatedMember.getRawType().getName();
            } else {
                name = annotatedMethod.getRawParameterType(0).getName();
            }
        }
        return valueFrom.withId(name);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.Value valueFindInjectableValue = findInjectableValue(annotatedMember);
        if (valueFindInjectableValue == null) {
            return null;
        }
        return valueFindInjectableValue.getId();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(WM wm) {
        TW tw = (TW) _findAnnotation(wm, TW.class);
        if (tw == null) {
            return null;
        }
        return tw.OLrzqt();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<?> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (rawParameterType.isPrimitive()) {
            if (rawParameterType2.isPrimitive()) {
                return null;
            }
            return annotatedMethod;
        }
        if (rawParameterType2.isPrimitive()) {
            return annotatedMethod2;
        }
        if (rawParameterType == String.class) {
            if (rawParameterType2 != String.class) {
                return annotatedMethod;
            }
        } else if (rawParameterType2 == String.class) {
            return annotatedMethod2;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC5599Xx<?> findTypeResolver(MapperConfig<?> mapperConfig, WJ wj, JavaType javaType) {
        return _findTypeResolver(mapperConfig, wj, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC5599Xx<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC5599Xx<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() == null) {
            throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(WM wm) {
        TR tr = (TR) _findAnnotation(wm, TR.class);
        if (tr == null) {
            return null;
        }
        TR.StateListAnimator[] stateListAnimatorArrOLrzqt = tr.OLrzqt();
        if (tr.EZpvd()) {
            return findSubtypesCheckRepeatedNames(wm.getName(), stateListAnimatorArrOLrzqt);
        }
        ArrayList arrayList = new ArrayList(stateListAnimatorArrOLrzqt.length);
        for (TR.StateListAnimator stateListAnimator : stateListAnimatorArrOLrzqt) {
            arrayList.add(new NamedType(stateListAnimator.EZpvd(), stateListAnimator.copydefault()));
            for (String str : stateListAnimator.OLrzqt()) {
                arrayList.add(new NamedType(stateListAnimator.EZpvd(), str));
            }
        }
        return arrayList;
    }

    private List<NamedType> findSubtypesCheckRepeatedNames(String str, TR.StateListAnimator[] stateListAnimatorArr) {
        ArrayList arrayList = new ArrayList(stateListAnimatorArr.length);
        HashSet hashSet = new HashSet();
        for (TR.StateListAnimator stateListAnimator : stateListAnimatorArr) {
            String strCopydefault = stateListAnimator.copydefault();
            if (!strCopydefault.isEmpty() && hashSet.contains(strCopydefault)) {
                throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + strCopydefault + "]");
            }
            hashSet.add(strCopydefault);
            arrayList.add(new NamedType(stateListAnimator.EZpvd(), strCopydefault));
            for (String str2 : stateListAnimator.OLrzqt()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + str2 + "]");
                }
                hashSet.add(str2);
                arrayList.add(new NamedType(stateListAnimator.EZpvd(), str2));
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(WJ wj) {
        TV tv = (TV) _findAnnotation(wj, TV.class);
        if (tv == null) {
            return null;
        }
        return tv.EZpvd();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, TU.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C5576Xa findObjectIdInfo(WM wm) {
        TF tf = (TF) _findAnnotation(wm, TF.class);
        if (tf == null || tf.EZpvd() == ObjectIdGenerators.None.class) {
            return null;
        }
        return new C5576Xa(PropertyName.construct(tf.KWHzl()), tf.AEQbTJ(), tf.EZpvd(), tf.OLrzqt());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C5576Xa findObjectReferenceInfo(WM wm, C5576Xa c5576Xa) {
        TH th = (TH) _findAnnotation(wm, TH.class);
        if (th == null) {
            return c5576Xa;
        }
        if (c5576Xa == null) {
            c5576Xa = C5576Xa.copydefault();
        }
        return c5576Xa.EZpvd(th.OLrzqt());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(WM wm) {
        Class<? extends VD> clsDbNXlk;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        if (jsonSerialize != null && (clsDbNXlk = jsonSerialize.DbNXlk()) != VD.ActionBar.class) {
            return clsDbNXlk;
        }
        TT tt = (TT) _findAnnotation(wm, TT.class);
        if (tt == null || !tt.EZpvd()) {
            return null;
        }
        return new RawSerializer(wm.getRawType());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(WM wm) {
        Class<? extends VD> clsAYXKKw;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        if (jsonSerialize == null || (clsAYXKKw = jsonSerialize.AYXKKw()) == VD.ActionBar.class) {
            return null;
        }
        return clsAYXKKw;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(WM wm) {
        Class<? extends VD> clsCopydefault;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        if (jsonSerialize == null || (clsCopydefault = jsonSerialize.copydefault()) == VD.ActionBar.class) {
            return null;
        }
        return clsCopydefault;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(WM wm) {
        Class<? extends VD> clsGEmmrt;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        if (jsonSerialize == null || (clsGEmmrt = jsonSerialize.gEmmrt()) == VD.ActionBar.class) {
            return null;
        }
        return clsGEmmrt;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(WM wm) {
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(wm, JsonInclude.class);
        JsonInclude.Value valueEmpty = jsonInclude == null ? JsonInclude.Value.empty() : JsonInclude.Value.from(jsonInclude);
        return valueEmpty.getValueInclusion() == JsonInclude.Include.USE_DEFAULTS ? _refinePropertyInclusion(wm, valueEmpty) : valueEmpty;
    }

    private JsonInclude.Value _refinePropertyInclusion(WM wm, JsonInclude.Value value) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i = AnonymousClass4.KWHzl[jsonSerialize.djBIcL().ordinal()];
            if (i == 1) {
                return value.withValueInclusion(JsonInclude.Include.ALWAYS);
            }
            if (i == 2) {
                return value.withValueInclusion(JsonInclude.Include.NON_NULL);
            }
            if (i == 3) {
                return value.withValueInclusion(JsonInclude.Include.NON_DEFAULT);
            }
            if (i == 4) {
                return value.withValueInclusion(JsonInclude.Include.NON_EMPTY);
            }
        }
        return value;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            KWHzl = iArr;
            try {
                iArr[JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(WM wm) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.AhwBna();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(WM wm) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.OLrzqt(), InterfaceC5621Yt.StateListAnimator.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.AEQbTJ(), InterfaceC5621Yt.StateListAnimator.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, WM wm, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeWithStaticTyping;
        JavaType javaTypeWithStaticTyping2;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(wm, JsonSerialize.class);
        Class<?> cls_classIfExplicit = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.EZpvd());
        if (cls_classIfExplicit != null) {
            if (javaType.hasRawClass(cls_classIfExplicit)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class<?> rawClass = javaType.getRawClass();
                try {
                    if (cls_classIfExplicit.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.constructGeneralizedType(javaType, cls_classIfExplicit);
                    } else if (rawClass.isAssignableFrom(cls_classIfExplicit)) {
                        javaType = typeFactory.constructSpecializedType(javaType, cls_classIfExplicit);
                    } else if (_primitiveAndWrapper(rawClass, cls_classIfExplicit)) {
                        javaType = javaType.withStaticTyping();
                    } else {
                        throw _databindException(String.format("Cannot refine serialization type %s into %s; types not related", javaType, cls_classIfExplicit.getName()));
                    }
                } catch (IllegalArgumentException e) {
                    throw _databindException(e, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit.getName(), wm.getName(), e.getMessage()));
                }
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> cls_classIfExplicit2 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.valueOf());
            if (cls_classIfExplicit2 != null) {
                if (keyType.hasRawClass(cls_classIfExplicit2)) {
                    javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (cls_classIfExplicit2.isAssignableFrom(rawClass2)) {
                            javaTypeWithStaticTyping2 = typeFactory.constructGeneralizedType(keyType, cls_classIfExplicit2);
                        } else if (rawClass2.isAssignableFrom(cls_classIfExplicit2)) {
                            javaTypeWithStaticTyping2 = typeFactory.constructSpecializedType(keyType, cls_classIfExplicit2);
                        } else if (_primitiveAndWrapper(rawClass2, cls_classIfExplicit2)) {
                            javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                        } else {
                            throw _databindException(String.format("Cannot refine serialization key type %s into %s; types not related", keyType, cls_classIfExplicit2.getName()));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw _databindException(e2, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit2.getName(), wm.getName(), e2.getMessage()));
                    }
                }
                javaType = ((MapLikeType) javaType).withKeyType(javaTypeWithStaticTyping2);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        Class<?> cls_classIfExplicit3 = jsonSerialize != null ? _classIfExplicit(jsonSerialize.KWHzl()) : null;
        if (cls_classIfExplicit3 == null) {
            return javaType;
        }
        if (contentType.hasRawClass(cls_classIfExplicit3)) {
            javaTypeWithStaticTyping = contentType.withStaticTyping();
        } else {
            Class<?> rawClass3 = contentType.getRawClass();
            try {
                if (cls_classIfExplicit3.isAssignableFrom(rawClass3)) {
                    javaTypeWithStaticTyping = typeFactory.constructGeneralizedType(contentType, cls_classIfExplicit3);
                } else if (rawClass3.isAssignableFrom(cls_classIfExplicit3)) {
                    javaTypeWithStaticTyping = typeFactory.constructSpecializedType(contentType, cls_classIfExplicit3);
                } else if (_primitiveAndWrapper(rawClass3, cls_classIfExplicit3)) {
                    javaTypeWithStaticTyping = contentType.withStaticTyping();
                } else {
                    throw _databindException(String.format("Cannot refine serialization content type %s into %s; types not related", contentType, cls_classIfExplicit3.getName()));
                }
            } catch (IllegalArgumentException e3) {
                throw _databindException(e3, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit3.getName(), wm.getName(), e3.getMessage()));
            }
        }
        return javaType.withContentType(javaTypeWithStaticTyping);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(WJ wj) {
        TP tp = (TP) _findAnnotation(wj, TP.class);
        if (tp == null) {
            return null;
        }
        return tp.OLrzqt();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(WM wm) {
        return _findSortAlpha(wm);
    }

    private final Boolean _findSortAlpha(WM wm) {
        TP tp = (TP) _findAnnotation(wm, TP.class);
        if (tp == null || !tp.KWHzl()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, WJ wj, List<BeanPropertyWriter> list) {
        VG vg = (VG) _findAnnotation(wj, VG.class);
        if (vg == null) {
            return;
        }
        boolean zEZpvd = vg.EZpvd();
        VG.ActionBar[] actionBarArrOLrzqt = vg.OLrzqt();
        int length = actionBarArrOLrzqt.length;
        JavaType javaTypeConstructType = null;
        for (int i = 0; i < length; i++) {
            if (javaTypeConstructType == null) {
                javaTypeConstructType = mapperConfig.constructType(Object.class);
            }
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty = _constructVirtualProperty(actionBarArrOLrzqt[i], mapperConfig, wj, javaTypeConstructType);
            if (zEZpvd) {
                list.add(i, beanPropertyWriter_constructVirtualProperty);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty);
            }
        }
        VG.Activity[] activityArrKWHzl = vg.KWHzl();
        int length2 = activityArrKWHzl.length;
        for (int i2 = 0; i2 < length2; i2++) {
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty2 = _constructVirtualProperty(activityArrKWHzl[i2], mapperConfig, wj);
            if (zEZpvd) {
                list.add(i2, beanPropertyWriter_constructVirtualProperty2);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty2);
            }
        }
    }

    public BeanPropertyWriter _constructVirtualProperty(VG.ActionBar actionBar, MapperConfig<?> mapperConfig, WJ wj, JavaType javaType) {
        PropertyMetadata propertyMetadata = actionBar.OLrzqt() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String strKWHzl = actionBar.KWHzl();
        PropertyName propertyName_propertyName = _propertyName(actionBar.AEQbTJ(), actionBar.copydefault());
        if (!propertyName_propertyName.hasSimpleName()) {
            propertyName_propertyName = PropertyName.construct(strKWHzl);
        }
        return AttributePropertyWriter.construct(strKWHzl, YB.copydefault(mapperConfig, new VirtualAnnotatedMember(wj, wj.getRawType(), strKWHzl, javaType), propertyName_propertyName, propertyMetadata, actionBar.EZpvd()), wj.AhwBna(), javaType);
    }

    public BeanPropertyWriter _constructVirtualProperty(VG.Activity activity, MapperConfig<?> mapperConfig, WJ wj) {
        PropertyMetadata propertyMetadata = activity.KWHzl() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName_propertyName = _propertyName(activity.copydefault(), activity.OLrzqt());
        JavaType javaTypeConstructType = mapperConfig.constructType(activity.AEQbTJ());
        YB ybCopydefault = YB.copydefault(mapperConfig, new VirtualAnnotatedMember(wj, wj.getRawType(), propertyName_propertyName.getSimpleName(), javaTypeConstructType), propertyName_propertyName, propertyMetadata, activity.EZpvd());
        Class<? extends VirtualBeanPropertyWriter> clsGEmmrt = activity.gEmmrt();
        VQ handlerInstantiator = mapperConfig.getHandlerInstantiator();
        VirtualBeanPropertyWriter virtualBeanPropertyWriterCopydefault = handlerInstantiator == null ? null : handlerInstantiator.copydefault(mapperConfig, clsGEmmrt);
        if (virtualBeanPropertyWriterCopydefault == null) {
            virtualBeanPropertyWriterCopydefault = (VirtualBeanPropertyWriter) C5619Yr.EZpvd(clsGEmmrt, mapperConfig.canOverrideAccessModifiers());
        }
        return virtualBeanPropertyWriterCopydefault.withConfig(mapperConfig, wj, ybCopydefault, javaTypeConstructType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(WM wm) {
        boolean z;
        TG tg = (TG) _findAnnotation(wm, TG.class);
        if (tg != null) {
            String strAEQbTJ = tg.AEQbTJ();
            if (!strAEQbTJ.isEmpty()) {
                return PropertyName.construct(strAEQbTJ);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(wm, JsonProperty.class);
        if (jsonProperty != null) {
            String strOLrzqt = jsonProperty.OLrzqt();
            return PropertyName.construct(jsonProperty.valueOf(), (strOLrzqt == null || !strOLrzqt.isEmpty()) ? strOLrzqt : null);
        }
        if (z || _hasOneOf(wm, ANNOTATIONS_TO_INFER_SER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, WM wm) {
        TO to = (TO) _findAnnotation(wm, TO.class);
        if (to == null) {
            return null;
        }
        return Boolean.valueOf(to.copydefault());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(WM wm) {
        TY ty = (TY) _findAnnotation(wm, TY.class);
        if (ty == null) {
            return null;
        }
        return Boolean.valueOf(ty.KWHzl());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(WM wm) {
        TE te = (TE) _findAnnotation(wm, TE.class);
        if (te == null) {
            return null;
        }
        return Boolean.valueOf(te.copydefault());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, TE.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        TY ty = (TY) _findAnnotation(annotatedMethod, TY.class);
        return ty != null && ty.KWHzl();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(WM wm) {
        Class<? extends AbstractC5548Vy> clsAhwBna;
        VJ vj = (VJ) _findAnnotation(wm, VJ.class);
        if (vj == null || (clsAhwBna = vj.AhwBna()) == AbstractC5548Vy.Activity.class) {
            return null;
        }
        return clsAhwBna;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(WM wm) {
        Class<? extends VC> clsValueOf;
        VJ vj = (VJ) _findAnnotation(wm, VJ.class);
        if (vj == null || (clsValueOf = vj.valueOf()) == VC.ActionBar.class) {
            return null;
        }
        return clsValueOf;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(WM wm) {
        Class<? extends AbstractC5548Vy> clsKWHzl;
        VJ vj = (VJ) _findAnnotation(wm, VJ.class);
        if (vj == null || (clsKWHzl = vj.KWHzl()) == AbstractC5548Vy.Activity.class) {
            return null;
        }
        return clsKWHzl;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(WM wm) {
        VJ vj = (VJ) _findAnnotation(wm, VJ.class);
        if (vj == null) {
            return null;
        }
        return _classIfExplicit(vj.gEmmrt(), InterfaceC5621Yt.StateListAnimator.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        VJ vj = (VJ) _findAnnotation(annotatedMember, VJ.class);
        if (vj == null) {
            return null;
        }
        return _classIfExplicit(vj.AEQbTJ(), InterfaceC5621Yt.StateListAnimator.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, WM wm, JavaType javaType) throws JsonMappingException {
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        VJ vj = (VJ) _findAnnotation(wm, VJ.class);
        Class<?> cls_classIfExplicit = vj == null ? null : _classIfExplicit(vj.copydefault());
        if (cls_classIfExplicit != null && !javaType.hasRawClass(cls_classIfExplicit) && !_primitiveAndWrapper(javaType, cls_classIfExplicit)) {
            try {
                javaType = typeFactory.constructSpecializedType(javaType, cls_classIfExplicit);
            } catch (IllegalArgumentException e) {
                throw _databindException(e, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit.getName(), wm.getName(), e.getMessage()));
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> cls_classIfExplicit2 = vj == null ? null : _classIfExplicit(vj.AYXKKw());
            if (cls_classIfExplicit2 != null && !_primitiveAndWrapper(keyType, cls_classIfExplicit2)) {
                try {
                    javaType = ((MapLikeType) javaType).withKeyType(typeFactory.constructSpecializedType(keyType, cls_classIfExplicit2));
                } catch (IllegalArgumentException e2) {
                    throw _databindException(e2, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit2.getName(), wm.getName(), e2.getMessage()));
                }
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        Class<?> cls_classIfExplicit3 = vj != null ? _classIfExplicit(vj.EZpvd()) : null;
        if (cls_classIfExplicit3 == null || _primitiveAndWrapper(contentType, cls_classIfExplicit3)) {
            return javaType;
        }
        try {
            return javaType.withContentType(typeFactory.constructSpecializedType(contentType, cls_classIfExplicit3));
        } catch (IllegalArgumentException e3) {
            throw _databindException(e3, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit3.getName(), wm.getName(), e3.getMessage()));
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(WJ wj) {
        VM vm = (VM) _findAnnotation(wj, VM.class);
        if (vm == null) {
            return null;
        }
        return vm.AEQbTJ();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(WJ wj) {
        VJ vj = (VJ) _findAnnotation(wj, VJ.class);
        if (vj == null) {
            return null;
        }
        return _classIfExplicit(vj.OLrzqt());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VO.StateListAnimator findPOJOBuilderConfig(WJ wj) {
        VO vo = (VO) _findAnnotation(wj, VO.class);
        if (vo == null) {
            return null;
        }
        return new VO.StateListAnimator(vo);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(WM wm) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(wm, JsonSetter.class);
        if (jsonSetter != null) {
            String strAEQbTJ = jsonSetter.AEQbTJ();
            if (!strAEQbTJ.isEmpty()) {
                return PropertyName.construct(strAEQbTJ);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(wm, JsonProperty.class);
        if (jsonProperty != null) {
            String strOLrzqt = jsonProperty.OLrzqt();
            return PropertyName.construct(jsonProperty.valueOf(), (strOLrzqt == null || !strOLrzqt.isEmpty()) ? strOLrzqt : null);
        }
        if (z || _hasOneOf(wm, ANNOTATIONS_TO_INFER_DESER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(WM wm) {
        TB tb = (TB) _findAnnotation(wm, TB.class);
        if (tb == null) {
            return null;
        }
        return Boolean.valueOf(tb.AEQbTJ());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value findSetterInfo(WM wm) {
        return JsonSetter.Value.from((JsonSetter) _findAnnotation(wm, JsonSetter.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(WM wm) {
        TK tk = (TK) _findAnnotation(wm, TK.class);
        if (tk == null) {
            return null;
        }
        return tk.copydefault().asBoolean();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, TB.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(WM wm) {
        WD wd;
        Boolean boolEZpvd;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(wm, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.AEQbTJ() != JsonCreator.Mode.DISABLED;
        }
        if (!this._cfgConstructorPropertiesImpliesCreator || !(wm instanceof AnnotatedConstructor) || (wd = _java7Helper) == null || (boolEZpvd = wd.EZpvd(wm)) == null) {
            return false;
        }
        return boolEZpvd.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(WM wm) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(wm, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.AEQbTJ();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, WM wm) {
        WD wd;
        Boolean boolEZpvd;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(wm, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.AEQbTJ();
        }
        if (this._cfgConstructorPropertiesImpliesCreator && mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (wm instanceof AnnotatedConstructor) && (wd = _java7Helper) != null && (boolEZpvd = wd.EZpvd(wm)) != null && boolEZpvd.booleanValue()) {
            return JsonCreator.Mode.PROPERTIES;
        }
        return null;
    }

    public boolean _isIgnorable(WM wm) {
        Boolean boolKWHzl;
        TL tl = (TL) _findAnnotation(wm, TL.class);
        if (tl != null) {
            return tl.OLrzqt();
        }
        WD wd = _java7Helper;
        if (wd == null || (boolKWHzl = wd.KWHzl(wm)) == null) {
            return false;
        }
        return boolKWHzl.booleanValue();
    }

    public Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || C5619Yr.fetchVPNInfo(cls)) {
            return null;
        }
        return cls;
    }

    public Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> cls_classIfExplicit = _classIfExplicit(cls);
        if (cls_classIfExplicit == null || cls_classIfExplicit == cls2) {
            return null;
        }
        return cls_classIfExplicit;
    }

    public PropertyName _propertyName(String str, String str2) {
        if (str.isEmpty()) {
            return PropertyName.USE_DEFAULT;
        }
        if (str2 == null || str2.isEmpty()) {
            return PropertyName.construct(str);
        }
        return PropertyName.construct(str, str2);
    }

    public PropertyName _findConstructorName(WM wm) {
        WD wd;
        PropertyName propertyNameAEQbTJ;
        if (!(wm instanceof AnnotatedParameter)) {
            return null;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) wm;
        if (annotatedParameter.getOwner() == null || (wd = _java7Helper) == null || (propertyNameAEQbTJ = wd.AEQbTJ(annotatedParameter)) == null) {
            return null;
        }
        return propertyNameAEQbTJ;
    }

    public InterfaceC5599Xx<?> _findTypeResolver(MapperConfig<?> mapperConfig, WM wm, JavaType javaType) {
        InterfaceC5599Xx<?> interfaceC5599Xx_constructStdTypeResolverBuilder;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(wm, JsonTypeInfo.class);
        VP vp = (VP) _findAnnotation(wm, VP.class);
        if (vp != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            interfaceC5599Xx_constructStdTypeResolverBuilder = mapperConfig.typeResolverBuilderInstance(wm, vp.EZpvd());
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            if (jsonTypeInfo.copydefault() == JsonTypeInfo.Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            interfaceC5599Xx_constructStdTypeResolverBuilder = _constructStdTypeResolverBuilder();
        }
        VL vl = (VL) _findAnnotation(wm, VL.class);
        XB xbTypeIdResolverInstance = vl != null ? mapperConfig.typeIdResolverInstance(wm, vl.copydefault()) : null;
        if (xbTypeIdResolverInstance != null) {
            xbTypeIdResolverInstance.AEQbTJ(javaType);
        }
        InterfaceC5599Xx interfaceC5599XxInit = interfaceC5599Xx_constructStdTypeResolverBuilder.init(jsonTypeInfo.copydefault(), xbTypeIdResolverInstance);
        JsonTypeInfo.As asOLrzqt = jsonTypeInfo.OLrzqt();
        if (asOLrzqt == JsonTypeInfo.As.EXTERNAL_PROPERTY && (wm instanceof WJ)) {
            asOLrzqt = JsonTypeInfo.As.PROPERTY;
        }
        InterfaceC5599Xx interfaceC5599XxTypeProperty = interfaceC5599XxInit.inclusion(asOLrzqt).typeProperty(jsonTypeInfo.EZpvd());
        Class<?> clsKWHzl = jsonTypeInfo.KWHzl();
        if (clsKWHzl != JsonTypeInfo.ActionBar.class && !clsKWHzl.isAnnotation()) {
            interfaceC5599XxTypeProperty = interfaceC5599XxTypeProperty.defaultImpl(clsKWHzl);
        }
        return interfaceC5599XxTypeProperty.typeIdVisibility(jsonTypeInfo.AEQbTJ());
    }

    public XJ _constructStdTypeResolverBuilder() {
        return new XJ();
    }

    public XJ _constructNoTypeResolverBuilder() {
        return XJ.noTypeInfoBuilder();
    }

    private boolean _primitiveAndWrapper(Class<?> cls, Class<?> cls2) {
        return cls.isPrimitive() ? cls == C5619Yr.hDKMBd(cls2) : cls2.isPrimitive() && cls2 == C5619Yr.hDKMBd(cls);
    }

    private boolean _primitiveAndWrapper(JavaType javaType, Class<?> cls) {
        if (javaType.isPrimitive()) {
            return javaType.hasRawClass(C5619Yr.hDKMBd(cls));
        }
        return cls.isPrimitive() && cls == C5619Yr.hDKMBd(javaType.getRawClass());
    }

    private JsonMappingException _databindException(String str) {
        return new JsonMappingException((Closeable) null, str);
    }

    private JsonMappingException _databindException(Throwable th, String str) {
        return new JsonMappingException((Closeable) null, str, th);
    }
}
