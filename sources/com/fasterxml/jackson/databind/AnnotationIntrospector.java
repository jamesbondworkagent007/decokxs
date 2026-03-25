package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o.C5576Xa;
import o.InterfaceC5599Xx;
import o.VO;
import o.WJ;
import o.WM;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotationIntrospector implements Serializable {
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, WJ wj, List<BeanPropertyWriter> list) {
    }

    public VisibilityChecker<?> findAutoDetectVisibility(WJ wj, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public String findClassDescription(WJ wj) {
        return null;
    }

    public Object findContentDeserializer(WM wm) {
        return null;
    }

    public Object findContentSerializer(WM wm) {
        return null;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(WM wm) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(WM wm, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(WM wm) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(WM wm, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(WM wm, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(WM wm) {
        return null;
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public Object findFilterId(WM wm) {
        return null;
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(WJ wj) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(WM wm) {
        return null;
    }

    public Object findKeySerializer(WM wm) {
        return null;
    }

    public Boolean findMergeInfo(WM wm) {
        return null;
    }

    public PropertyName findNameForDeserialization(WM wm) {
        return null;
    }

    public PropertyName findNameForSerialization(WM wm) {
        return null;
    }

    public Object findNamingStrategy(WJ wj) {
        return null;
    }

    public Object findNullSerializer(WM wm) {
        return null;
    }

    public C5576Xa findObjectIdInfo(WM wm) {
        return null;
    }

    public C5576Xa findObjectReferenceInfo(WM wm, C5576Xa c5576Xa) {
        return c5576Xa;
    }

    public Class<?> findPOJOBuilder(WJ wj) {
        return null;
    }

    public VO.StateListAnimator findPOJOBuilderConfig(WJ wj) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(WM wm, boolean z) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(WM wm) {
        return null;
    }

    public List<PropertyName> findPropertyAliases(WM wm) {
        return null;
    }

    public InterfaceC5599Xx<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(WM wm) {
        return null;
    }

    public String findPropertyDescription(WM wm) {
        return null;
    }

    public Integer findPropertyIndex(WM wm) {
        return null;
    }

    public InterfaceC5599Xx<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    public PropertyName findRootName(WJ wj) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(WM wm, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(WM wm) {
        return null;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(WM wm, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(WM wm, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(WM wm, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(WJ wj) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(WM wm) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(WM wm) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(WM wm) {
        return null;
    }

    public Object findSerializer(WM wm) {
        return null;
    }

    public List<NamedType> findSubtypes(WM wm) {
        return null;
    }

    public String findTypeName(WJ wj) {
        return null;
    }

    public InterfaceC5599Xx<?> findTypeResolver(MapperConfig<?> mapperConfig, WJ wj, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(WJ wj) {
        return null;
    }

    public Class<?>[] findViews(WM wm) {
        return null;
    }

    public PropertyName findWrapperName(WM wm) {
        return null;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAnySetter(WM wm) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, WM wm) {
        return null;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(WM wm) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(WJ wj) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, WM wm, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, WM wm, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public abstract Version version();

    public static class ReferenceProperty {
        public final String KWHzl;
        public final Type copydefault;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String KWHzl() {
            return this.KWHzl;
        }

        public ReferenceProperty(Type type, String str) {
            this.copydefault = type;
            this.KWHzl = str;
        }

        public static ReferenceProperty KWHzl(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public static ReferenceProperty OLrzqt(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public boolean AEQbTJ() {
            return this.copydefault == Type.MANAGED_REFERENCE;
        }

        public boolean copydefault() {
            return this.copydefault == Type.BACK_REFERENCE;
        }
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, WM wm) {
        return findPropertyIgnorals(wm);
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, WM wm) {
        return JsonIncludeProperties.Value.all();
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(WM wm) {
        return JsonIgnoreProperties.Value.empty();
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = findInjectableValueId(annotatedMember);
        if (objFindInjectableValueId != null) {
            return JacksonInject.Value.forId(objFindInjectableValueId);
        }
        return null;
    }

    public JsonFormat.Value findFormat(WM wm) {
        return JsonFormat.Value.empty();
    }

    public JsonInclude.Value findPropertyInclusion(WM wm) {
        return JsonInclude.Value.empty();
    }

    public Boolean hasAsValue(WM wm) {
        if ((wm instanceof AnnotatedMethod) && hasAsValueAnnotation((AnnotatedMethod) wm)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Boolean hasAnyGetter(WM wm) {
        if ((wm instanceof AnnotatedMethod) && hasAnyGetterAnnotation((AnnotatedMethod) wm)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> r1) {
        return r1.name();
    }

    public JsonSetter.Value findSetterInfo(WM wm) {
        return JsonSetter.Value.empty();
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, WM wm) {
        if (!hasCreatorAnnotation(wm)) {
            return null;
        }
        JsonCreator.Mode modeFindCreatorBinding = findCreatorBinding(wm);
        return modeFindCreatorBinding == null ? JsonCreator.Mode.DEFAULT : modeFindCreatorBinding;
    }

    public <A extends Annotation> A _findAnnotation(WM wm, Class<A> cls) {
        return (A) wm.getAnnotation(cls);
    }

    public boolean _hasAnnotation(WM wm, Class<? extends Annotation> cls) {
        return wm.hasAnnotation(cls);
    }

    public boolean _hasOneOf(WM wm, Class<? extends Annotation>[] clsArr) {
        return wm.hasOneOf(clsArr);
    }
}
