package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;

/* JADX INFO: renamed from: o.Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5595Xt {
    public AbstractC5595Xt copy() {
        return this;
    }

    public abstract void registerSubtypes(java.util.Collection<java.lang.Class<?>> collection);

    public abstract void registerSubtypes(NamedType... namedTypeArr);

    public abstract void registerSubtypes(java.lang.Class<?>... clsArr);

    public java.util.Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public java.util.Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, WJ wj) {
        return collectAndResolveSubtypes(wj, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    public java.util.Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public java.util.Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, WJ wj) {
        return collectAndResolveSubtypes(wj, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    @java.lang.Deprecated
    public java.util.Collection<NamedType> collectAndResolveSubtypes(AnnotatedMember annotatedMember, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, JavaType javaType) {
        return collectAndResolveSubtypesByClass(mapperConfig, annotatedMember, javaType);
    }

    @java.lang.Deprecated
    public java.util.Collection<NamedType> collectAndResolveSubtypes(WJ wj, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector) {
        return collectAndResolveSubtypesByClass(mapperConfig, wj);
    }
}
