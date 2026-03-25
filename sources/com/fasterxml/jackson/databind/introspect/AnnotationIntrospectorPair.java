package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.AbstractC5548Vy;
import o.C5576Xa;
import o.C5619Yr;
import o.InterfaceC5599Xx;
import o.VC;
import o.VD;
import o.VO;
import o.WJ;
import o.WM;

/* JADX INFO: loaded from: classes21.dex */
public class AnnotationIntrospectorPair extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AnnotationIntrospector _primary;
    protected final AnnotationIntrospector _secondary;

    public AnnotationIntrospectorPair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._primary = annotationIntrospector;
        this._secondary = annotationIntrospector2;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return this._primary.version();
    }

    public static AnnotationIntrospector create(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return annotationIntrospector == null ? annotationIntrospector2 : annotationIntrospector2 == null ? annotationIntrospector : new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        this._primary.allIntrospectors(collection);
        this._secondary.allIntrospectors(collection);
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        return this._primary.isAnnotationBundle(annotation) || this._secondary.isAnnotationBundle(annotation);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(WJ wj) {
        PropertyName propertyNameFindRootName;
        PropertyName propertyNameFindRootName2 = this._primary.findRootName(wj);
        if (propertyNameFindRootName2 == null) {
            return this._secondary.findRootName(wj);
        }
        return (propertyNameFindRootName2.hasSimpleName() || (propertyNameFindRootName = this._secondary.findRootName(wj)) == null) ? propertyNameFindRootName2 : propertyNameFindRootName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, WM wm) {
        JsonIgnoreProperties.Value valueFindPropertyIgnoralByName = this._secondary.findPropertyIgnoralByName(mapperConfig, wm);
        JsonIgnoreProperties.Value valueFindPropertyIgnoralByName2 = this._primary.findPropertyIgnoralByName(mapperConfig, wm);
        return valueFindPropertyIgnoralByName == null ? valueFindPropertyIgnoralByName2 : valueFindPropertyIgnoralByName.withOverrides(valueFindPropertyIgnoralByName2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, WM wm) {
        JsonIncludeProperties.Value valueFindPropertyInclusionByName = this._secondary.findPropertyInclusionByName(mapperConfig, wm);
        JsonIncludeProperties.Value valueFindPropertyInclusionByName2 = this._primary.findPropertyInclusionByName(mapperConfig, wm);
        return valueFindPropertyInclusionByName == null ? valueFindPropertyInclusionByName2 : valueFindPropertyInclusionByName.withOverrides(valueFindPropertyInclusionByName2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(WJ wj) {
        Boolean boolIsIgnorableType = this._primary.isIgnorableType(wj);
        return boolIsIgnorableType == null ? this._secondary.isIgnorableType(wj) : boolIsIgnorableType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(WM wm) {
        Object objFindFilterId = this._primary.findFilterId(wm);
        return objFindFilterId == null ? this._secondary.findFilterId(wm) : objFindFilterId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(WJ wj) {
        Object objFindNamingStrategy = this._primary.findNamingStrategy(wj);
        return objFindNamingStrategy == null ? this._secondary.findNamingStrategy(wj) : objFindNamingStrategy;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(WJ wj) {
        String strFindClassDescription = this._primary.findClassDescription(wj);
        return (strFindClassDescription == null || strFindClassDescription.isEmpty()) ? this._secondary.findClassDescription(wj) : strFindClassDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String[] findPropertiesToIgnore(WM wm, boolean z) {
        String[] strArrFindPropertiesToIgnore = this._primary.findPropertiesToIgnore(wm, z);
        return strArrFindPropertiesToIgnore == null ? this._secondary.findPropertiesToIgnore(wm, z) : strArrFindPropertiesToIgnore;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Boolean findIgnoreUnknownProperties(WJ wj) {
        Boolean boolFindIgnoreUnknownProperties = this._primary.findIgnoreUnknownProperties(wj);
        return boolFindIgnoreUnknownProperties == null ? this._secondary.findIgnoreUnknownProperties(wj) : boolFindIgnoreUnknownProperties;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(WM wm) {
        JsonIgnoreProperties.Value valueFindPropertyIgnorals = this._secondary.findPropertyIgnorals(wm);
        JsonIgnoreProperties.Value valueFindPropertyIgnorals2 = this._primary.findPropertyIgnorals(wm);
        return valueFindPropertyIgnorals == null ? valueFindPropertyIgnorals2 : valueFindPropertyIgnorals.withOverrides(valueFindPropertyIgnorals2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(WJ wj, VisibilityChecker<?> visibilityChecker) {
        return this._primary.findAutoDetectVisibility(wj, this._secondary.findAutoDetectVisibility(wj, visibilityChecker));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC5599Xx<?> findTypeResolver(MapperConfig<?> mapperConfig, WJ wj, JavaType javaType) {
        InterfaceC5599Xx<?> interfaceC5599XxFindTypeResolver = this._primary.findTypeResolver(mapperConfig, wj, javaType);
        return interfaceC5599XxFindTypeResolver == null ? this._secondary.findTypeResolver(mapperConfig, wj, javaType) : interfaceC5599XxFindTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC5599Xx<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        InterfaceC5599Xx<?> interfaceC5599XxFindPropertyTypeResolver = this._primary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        return interfaceC5599XxFindPropertyTypeResolver == null ? this._secondary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType) : interfaceC5599XxFindPropertyTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC5599Xx<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        InterfaceC5599Xx<?> interfaceC5599XxFindPropertyContentTypeResolver = this._primary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        return interfaceC5599XxFindPropertyContentTypeResolver == null ? this._secondary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType) : interfaceC5599XxFindPropertyContentTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(WM wm) {
        List<NamedType> listFindSubtypes = this._primary.findSubtypes(wm);
        List<NamedType> listFindSubtypes2 = this._secondary.findSubtypes(wm);
        if (listFindSubtypes == null || listFindSubtypes.isEmpty()) {
            return listFindSubtypes2;
        }
        if (listFindSubtypes2 == null || listFindSubtypes2.isEmpty()) {
            return listFindSubtypes;
        }
        ArrayList arrayList = new ArrayList(listFindSubtypes.size() + listFindSubtypes2.size());
        arrayList.addAll(listFindSubtypes);
        arrayList.addAll(listFindSubtypes2);
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(WJ wj) {
        String strFindTypeName = this._primary.findTypeName(wj);
        return (strFindTypeName == null || strFindTypeName.isEmpty()) ? this._secondary.findTypeName(wj) : strFindTypeName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = this._primary.findReferenceType(annotatedMember);
        return referencePropertyFindReferenceType == null ? this._secondary.findReferenceType(annotatedMember) : referencePropertyFindReferenceType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer nameTransformerFindUnwrappingNameTransformer = this._primary.findUnwrappingNameTransformer(annotatedMember);
        return nameTransformerFindUnwrappingNameTransformer == null ? this._secondary.findUnwrappingNameTransformer(annotatedMember) : nameTransformerFindUnwrappingNameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        JacksonInject.Value valueFindInjectableValue;
        JacksonInject.Value valueFindInjectableValue2 = this._primary.findInjectableValue(annotatedMember);
        if ((valueFindInjectableValue2 != null && valueFindInjectableValue2.getUseInput() != null) || (valueFindInjectableValue = this._secondary.findInjectableValue(annotatedMember)) == null) {
            return valueFindInjectableValue2;
        }
        if (valueFindInjectableValue2 != null) {
            valueFindInjectableValue = valueFindInjectableValue2.withUseInput(valueFindInjectableValue.getUseInput());
        }
        return valueFindInjectableValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return this._primary.hasIgnoreMarker(annotatedMember) || this._secondary.hasIgnoreMarker(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean boolHasRequiredMarker = this._primary.hasRequiredMarker(annotatedMember);
        return boolHasRequiredMarker == null ? this._secondary.hasRequiredMarker(annotatedMember) : boolHasRequiredMarker;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = this._primary.findInjectableValueId(annotatedMember);
        return objFindInjectableValueId == null ? this._secondary.findInjectableValueId(annotatedMember) : objFindInjectableValueId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(WM wm) {
        Object objFindSerializer = this._primary.findSerializer(wm);
        return _isExplicitClassOrOb(objFindSerializer, VD.ActionBar.class) ? objFindSerializer : _explicitClassOrOb(this._secondary.findSerializer(wm), VD.ActionBar.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(WM wm) {
        Object objFindKeySerializer = this._primary.findKeySerializer(wm);
        return _isExplicitClassOrOb(objFindKeySerializer, VD.ActionBar.class) ? objFindKeySerializer : _explicitClassOrOb(this._secondary.findKeySerializer(wm), VD.ActionBar.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(WM wm) {
        Object objFindContentSerializer = this._primary.findContentSerializer(wm);
        return _isExplicitClassOrOb(objFindContentSerializer, VD.ActionBar.class) ? objFindContentSerializer : _explicitClassOrOb(this._secondary.findContentSerializer(wm), VD.ActionBar.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(WM wm) {
        Object objFindNullSerializer = this._primary.findNullSerializer(wm);
        return _isExplicitClassOrOb(objFindNullSerializer, VD.ActionBar.class) ? objFindNullSerializer : _explicitClassOrOb(this._secondary.findNullSerializer(wm), VD.ActionBar.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusion(WM wm, JsonInclude.Include include) {
        return this._primary.findSerializationInclusion(wm, this._secondary.findSerializationInclusion(wm, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(WM wm, JsonInclude.Include include) {
        return this._primary.findSerializationInclusionForContent(wm, this._secondary.findSerializationInclusionForContent(wm, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(WM wm) {
        JsonInclude.Value valueFindPropertyInclusion = this._secondary.findPropertyInclusion(wm);
        JsonInclude.Value valueFindPropertyInclusion2 = this._primary.findPropertyInclusion(wm);
        return valueFindPropertyInclusion == null ? valueFindPropertyInclusion2 : valueFindPropertyInclusion.withOverrides(valueFindPropertyInclusion2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(WM wm) {
        JsonSerialize.Typing typingFindSerializationTyping = this._primary.findSerializationTyping(wm);
        return typingFindSerializationTyping == null ? this._secondary.findSerializationTyping(wm) : typingFindSerializationTyping;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(WM wm) {
        Object objFindSerializationConverter = this._primary.findSerializationConverter(wm);
        return objFindSerializationConverter == null ? this._secondary.findSerializationConverter(wm) : objFindSerializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindSerializationContentConverter = this._primary.findSerializationContentConverter(annotatedMember);
        return objFindSerializationContentConverter == null ? this._secondary.findSerializationContentConverter(annotatedMember) : objFindSerializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(WM wm) {
        Class<?>[] clsArrFindViews = this._primary.findViews(wm);
        return clsArrFindViews == null ? this._secondary.findViews(wm) : clsArrFindViews;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean boolIsTypeId = this._primary.isTypeId(annotatedMember);
        return boolIsTypeId == null ? this._secondary.isTypeId(annotatedMember) : boolIsTypeId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C5576Xa findObjectIdInfo(WM wm) {
        C5576Xa c5576XaFindObjectIdInfo = this._primary.findObjectIdInfo(wm);
        return c5576XaFindObjectIdInfo == null ? this._secondary.findObjectIdInfo(wm) : c5576XaFindObjectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C5576Xa findObjectReferenceInfo(WM wm, C5576Xa c5576Xa) {
        return this._primary.findObjectReferenceInfo(wm, this._secondary.findObjectReferenceInfo(wm, c5576Xa));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(WM wm) {
        JsonFormat.Value valueFindFormat = this._primary.findFormat(wm);
        JsonFormat.Value valueFindFormat2 = this._secondary.findFormat(wm);
        return valueFindFormat2 == null ? valueFindFormat : valueFindFormat2.withOverrides(valueFindFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findWrapperName(WM wm) {
        PropertyName propertyNameFindWrapperName;
        PropertyName propertyNameFindWrapperName2 = this._primary.findWrapperName(wm);
        if (propertyNameFindWrapperName2 == null) {
            return this._secondary.findWrapperName(wm);
        }
        return (propertyNameFindWrapperName2 != PropertyName.USE_DEFAULT || (propertyNameFindWrapperName = this._secondary.findWrapperName(wm)) == null) ? propertyNameFindWrapperName2 : propertyNameFindWrapperName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(WM wm) {
        String strFindPropertyDefaultValue = this._primary.findPropertyDefaultValue(wm);
        return (strFindPropertyDefaultValue == null || strFindPropertyDefaultValue.isEmpty()) ? this._secondary.findPropertyDefaultValue(wm) : strFindPropertyDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(WM wm) {
        String strFindPropertyDescription = this._primary.findPropertyDescription(wm);
        return strFindPropertyDescription == null ? this._secondary.findPropertyDescription(wm) : strFindPropertyDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(WM wm) {
        Integer numFindPropertyIndex = this._primary.findPropertyIndex(wm);
        return numFindPropertyIndex == null ? this._secondary.findPropertyIndex(wm) : numFindPropertyIndex;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        String strFindImplicitPropertyName = this._primary.findImplicitPropertyName(annotatedMember);
        return strFindImplicitPropertyName == null ? this._secondary.findImplicitPropertyName(annotatedMember) : strFindImplicitPropertyName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> findPropertyAliases(WM wm) {
        List<PropertyName> listFindPropertyAliases = this._primary.findPropertyAliases(wm);
        return listFindPropertyAliases == null ? this._secondary.findPropertyAliases(wm) : listFindPropertyAliases;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(WM wm) {
        JsonProperty.Access accessFindPropertyAccess = this._primary.findPropertyAccess(wm);
        if (accessFindPropertyAccess != null && accessFindPropertyAccess != JsonProperty.Access.AUTO) {
            return accessFindPropertyAccess;
        }
        JsonProperty.Access accessFindPropertyAccess2 = this._secondary.findPropertyAccess(wm);
        return accessFindPropertyAccess2 != null ? accessFindPropertyAccess2 : JsonProperty.Access.AUTO;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        AnnotatedMethod annotatedMethodResolveSetterConflict = this._primary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        return annotatedMethodResolveSetterConflict == null ? this._secondary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2) : annotatedMethodResolveSetterConflict;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        PropertyName propertyNameFindRenameByField = this._secondary.findRenameByField(mapperConfig, annotatedField, propertyName);
        return propertyNameFindRenameByField == null ? this._primary.findRenameByField(mapperConfig, annotatedField, propertyName) : propertyNameFindRenameByField;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, WM wm, JavaType javaType) throws JsonMappingException {
        return this._primary.refineSerializationType(mapperConfig, wm, this._secondary.refineSerializationType(mapperConfig, wm, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(WM wm) {
        Class<?> clsFindSerializationType = this._primary.findSerializationType(wm);
        return clsFindSerializationType == null ? this._secondary.findSerializationType(wm) : clsFindSerializationType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(WM wm, JavaType javaType) {
        Class<?> clsFindSerializationKeyType = this._primary.findSerializationKeyType(wm, javaType);
        return clsFindSerializationKeyType == null ? this._secondary.findSerializationKeyType(wm, javaType) : clsFindSerializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(WM wm, JavaType javaType) {
        Class<?> clsFindSerializationContentType = this._primary.findSerializationContentType(wm, javaType);
        return clsFindSerializationContentType == null ? this._secondary.findSerializationContentType(wm, javaType) : clsFindSerializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(WJ wj) {
        String[] strArrFindSerializationPropertyOrder = this._primary.findSerializationPropertyOrder(wj);
        return strArrFindSerializationPropertyOrder == null ? this._secondary.findSerializationPropertyOrder(wj) : strArrFindSerializationPropertyOrder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(WM wm) {
        Boolean boolFindSerializationSortAlphabetically = this._primary.findSerializationSortAlphabetically(wm);
        return boolFindSerializationSortAlphabetically == null ? this._secondary.findSerializationSortAlphabetically(wm) : boolFindSerializationSortAlphabetically;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, WJ wj, List<BeanPropertyWriter> list) {
        this._primary.findAndAddVirtualProperties(mapperConfig, wj, list);
        this._secondary.findAndAddVirtualProperties(mapperConfig, wj, list);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(WM wm) {
        PropertyName propertyNameFindNameForSerialization;
        PropertyName propertyNameFindNameForSerialization2 = this._primary.findNameForSerialization(wm);
        if (propertyNameFindNameForSerialization2 == null) {
            return this._secondary.findNameForSerialization(wm);
        }
        return (propertyNameFindNameForSerialization2 != PropertyName.USE_DEFAULT || (propertyNameFindNameForSerialization = this._secondary.findNameForSerialization(wm)) == null) ? propertyNameFindNameForSerialization2 : propertyNameFindNameForSerialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, WM wm) {
        Boolean boolHasAsKey = this._primary.hasAsKey(mapperConfig, wm);
        return boolHasAsKey == null ? this._secondary.hasAsKey(mapperConfig, wm) : boolHasAsKey;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(WM wm) {
        Boolean boolHasAsValue = this._primary.hasAsValue(wm);
        return boolHasAsValue == null ? this._secondary.hasAsValue(wm) : boolHasAsValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(WM wm) {
        Boolean boolHasAnyGetter = this._primary.hasAnyGetter(wm);
        return boolHasAnyGetter == null ? this._secondary.hasAnyGetter(wm) : boolHasAnyGetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this._primary.findEnumValues(cls, enumArr, this._secondary.findEnumValues(cls, enumArr, strArr));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this._secondary.findEnumAliases(cls, enumArr, strArr);
        this._primary.findEnumAliases(cls, enumArr, strArr);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> enumFindDefaultEnumValue = this._primary.findDefaultEnumValue(cls);
        return enumFindDefaultEnumValue == null ? this._secondary.findDefaultEnumValue(cls) : enumFindDefaultEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r2) {
        String strFindEnumValue = this._primary.findEnumValue(r2);
        return strFindEnumValue == null ? this._secondary.findEnumValue(r2) : strFindEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAsValueAnnotation(annotatedMethod) || this._secondary.hasAsValueAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnyGetterAnnotation(annotatedMethod) || this._secondary.hasAnyGetterAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(WM wm) {
        Object objFindDeserializer = this._primary.findDeserializer(wm);
        return _isExplicitClassOrOb(objFindDeserializer, AbstractC5548Vy.Activity.class) ? objFindDeserializer : _explicitClassOrOb(this._secondary.findDeserializer(wm), AbstractC5548Vy.Activity.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(WM wm) {
        Object objFindKeyDeserializer = this._primary.findKeyDeserializer(wm);
        return _isExplicitClassOrOb(objFindKeyDeserializer, VC.ActionBar.class) ? objFindKeyDeserializer : _explicitClassOrOb(this._secondary.findKeyDeserializer(wm), VC.ActionBar.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(WM wm) {
        Object objFindContentDeserializer = this._primary.findContentDeserializer(wm);
        return _isExplicitClassOrOb(objFindContentDeserializer, AbstractC5548Vy.Activity.class) ? objFindContentDeserializer : _explicitClassOrOb(this._secondary.findContentDeserializer(wm), AbstractC5548Vy.Activity.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(WM wm) {
        Object objFindDeserializationConverter = this._primary.findDeserializationConverter(wm);
        return objFindDeserializationConverter == null ? this._secondary.findDeserializationConverter(wm) : objFindDeserializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindDeserializationContentConverter = this._primary.findDeserializationContentConverter(annotatedMember);
        return objFindDeserializationContentConverter == null ? this._secondary.findDeserializationContentConverter(annotatedMember) : objFindDeserializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, WM wm, JavaType javaType) throws JsonMappingException {
        return this._primary.refineDeserializationType(mapperConfig, wm, this._secondary.refineDeserializationType(mapperConfig, wm, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(WM wm, JavaType javaType) {
        Class<?> clsFindDeserializationType = this._primary.findDeserializationType(wm, javaType);
        return clsFindDeserializationType != null ? clsFindDeserializationType : this._secondary.findDeserializationType(wm, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(WM wm, JavaType javaType) {
        Class<?> clsFindDeserializationKeyType = this._primary.findDeserializationKeyType(wm, javaType);
        return clsFindDeserializationKeyType == null ? this._secondary.findDeserializationKeyType(wm, javaType) : clsFindDeserializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(WM wm, JavaType javaType) {
        Class<?> clsFindDeserializationContentType = this._primary.findDeserializationContentType(wm, javaType);
        return clsFindDeserializationContentType == null ? this._secondary.findDeserializationContentType(wm, javaType) : clsFindDeserializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(WJ wj) {
        Object objFindValueInstantiator = this._primary.findValueInstantiator(wj);
        return objFindValueInstantiator == null ? this._secondary.findValueInstantiator(wj) : objFindValueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(WJ wj) {
        Class<?> clsFindPOJOBuilder = this._primary.findPOJOBuilder(wj);
        return clsFindPOJOBuilder == null ? this._secondary.findPOJOBuilder(wj) : clsFindPOJOBuilder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VO.StateListAnimator findPOJOBuilderConfig(WJ wj) {
        VO.StateListAnimator stateListAnimatorFindPOJOBuilderConfig = this._primary.findPOJOBuilderConfig(wj);
        return stateListAnimatorFindPOJOBuilderConfig == null ? this._secondary.findPOJOBuilderConfig(wj) : stateListAnimatorFindPOJOBuilderConfig;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(WM wm) {
        PropertyName propertyNameFindNameForDeserialization;
        PropertyName propertyNameFindNameForDeserialization2 = this._primary.findNameForDeserialization(wm);
        if (propertyNameFindNameForDeserialization2 == null) {
            return this._secondary.findNameForDeserialization(wm);
        }
        return (propertyNameFindNameForDeserialization2 != PropertyName.USE_DEFAULT || (propertyNameFindNameForDeserialization = this._secondary.findNameForDeserialization(wm)) == null) ? propertyNameFindNameForDeserialization2 : propertyNameFindNameForDeserialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(WM wm) {
        Boolean boolHasAnySetter = this._primary.hasAnySetter(wm);
        return boolHasAnySetter == null ? this._secondary.hasAnySetter(wm) : boolHasAnySetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value findSetterInfo(WM wm) {
        JsonSetter.Value valueFindSetterInfo = this._secondary.findSetterInfo(wm);
        JsonSetter.Value valueFindSetterInfo2 = this._primary.findSetterInfo(wm);
        return valueFindSetterInfo == null ? valueFindSetterInfo2 : valueFindSetterInfo.withOverrides(valueFindSetterInfo2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(WM wm) {
        Boolean boolFindMergeInfo = this._primary.findMergeInfo(wm);
        return boolFindMergeInfo == null ? this._secondary.findMergeInfo(wm) : boolFindMergeInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(WM wm) {
        return this._primary.hasCreatorAnnotation(wm) || this._secondary.hasCreatorAnnotation(wm);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(WM wm) {
        JsonCreator.Mode modeFindCreatorBinding = this._primary.findCreatorBinding(wm);
        return modeFindCreatorBinding != null ? modeFindCreatorBinding : this._secondary.findCreatorBinding(wm);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, WM wm) {
        JsonCreator.Mode modeFindCreatorAnnotation = this._primary.findCreatorAnnotation(mapperConfig, wm);
        return modeFindCreatorAnnotation == null ? this._secondary.findCreatorAnnotation(mapperConfig, wm) : modeFindCreatorAnnotation;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnySetterAnnotation(annotatedMethod) || this._secondary.hasAnySetterAnnotation(annotatedMethod);
    }

    public boolean _isExplicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !C5619Yr.fetchVPNInfo((Class) obj);
        }
        return true;
    }

    public Object _explicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if ((obj instanceof Class) && C5619Yr.fetchVPNInfo((Class) obj)) {
            return null;
        }
        return obj;
    }
}
