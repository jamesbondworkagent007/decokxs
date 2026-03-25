package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collections;
import o.WX;

/* JADX INFO: loaded from: classes21.dex */
public class WN {
    public final MapperConfig<?> AYXKKw;
    public final TypeBindings AhwBna;
    public final JavaType AkhnZx;
    public final AnnotationIntrospector djBIcL;
    public final java.lang.Class<?> fetchVPNInfo;
    public final java.lang.Class<?> gEmmrt;
    public final boolean valueOf;
    public final WX.TaskDescription values;
    public static final InterfaceC5609Yh AEQbTJ = AnnotationCollector.AEQbTJ();
    public static final java.lang.Class<?> KWHzl = java.lang.Object.class;
    public static final java.lang.Class<?> EZpvd = java.lang.Enum.class;
    public static final java.lang.Class<?> OLrzqt = java.util.List.class;
    public static final java.lang.Class<?> copydefault = java.util.Map.class;

    public WN(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        this.AYXKKw = mapperConfig;
        this.AkhnZx = javaType;
        java.lang.Class<?> rawClass = javaType.getRawClass();
        this.gEmmrt = rawClass;
        this.values = taskDescription;
        this.AhwBna = javaType.getBindings();
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.djBIcL = annotationIntrospector;
        this.fetchVPNInfo = taskDescription != null ? taskDescription.findMixInClassFor(rawClass) : null;
        this.valueOf = (annotationIntrospector == null || (C5619Yr.fARcdN(rawClass) && javaType.isContainerType())) ? false : true;
    }

    public WN(MapperConfig<?> mapperConfig, java.lang.Class<?> cls, WX.TaskDescription taskDescription) {
        this.AYXKKw = mapperConfig;
        this.AkhnZx = null;
        this.gEmmrt = cls;
        this.values = taskDescription;
        this.AhwBna = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this.djBIcL = null;
            this.fetchVPNInfo = null;
        } else {
            this.djBIcL = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            this.fetchVPNInfo = taskDescription != null ? taskDescription.findMixInClassFor(cls) : null;
        }
        this.valueOf = this.djBIcL != null;
    }

    public static WJ KWHzl(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        if (javaType.isArrayType() && KWHzl(mapperConfig, javaType.getRawClass())) {
            return OLrzqt(mapperConfig, javaType.getRawClass());
        }
        return new WN(mapperConfig, javaType, taskDescription).OLrzqt();
    }

    public static WJ AEQbTJ(MapperConfig<?> mapperConfig, java.lang.Class<?> cls) {
        return KWHzl(mapperConfig, cls, mapperConfig);
    }

    public static WJ OLrzqt(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        if (javaType.isArrayType() && KWHzl(mapperConfig, javaType.getRawClass())) {
            return OLrzqt(mapperConfig, javaType.getRawClass());
        }
        return new WN(mapperConfig, javaType, taskDescription).AEQbTJ();
    }

    public static WJ KWHzl(MapperConfig<?> mapperConfig, java.lang.Class<?> cls, WX.TaskDescription taskDescription) {
        if (cls.isArray() && KWHzl(mapperConfig, cls)) {
            return OLrzqt(mapperConfig, cls);
        }
        return new WN(mapperConfig, cls, taskDescription).AEQbTJ();
    }

    public static boolean KWHzl(MapperConfig<?> mapperConfig, java.lang.Class<?> cls) {
        return mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null;
    }

    public static WJ EZpvd(java.lang.Class<?> cls) {
        return new WJ(cls);
    }

    public static WJ OLrzqt(MapperConfig<?> mapperConfig, java.lang.Class<?> cls) {
        return new WJ(cls);
    }

    public WJ OLrzqt() {
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        if (!this.AkhnZx.hasRawClass(java.lang.Object.class)) {
            if (this.AkhnZx.isInterface()) {
                OLrzqt(this.AkhnZx, (java.util.List<JavaType>) arrayList, false);
            } else {
                copydefault(this.AkhnZx, arrayList, false);
            }
        }
        return new WJ(this.AkhnZx, this.gEmmrt, arrayList, this.fetchVPNInfo, KWHzl(arrayList), this.AhwBna, this.djBIcL, this.values, this.AYXKKw.getTypeFactory(), this.valueOf);
    }

    public WJ AEQbTJ() {
        java.util.List<JavaType> listEmptyList = Collections.emptyList();
        return new WJ(null, this.gEmmrt, listEmptyList, this.fetchVPNInfo, KWHzl(listEmptyList), this.AhwBna, this.djBIcL, this.values, this.AYXKKw.getTypeFactory(), this.valueOf);
    }

    public static void copydefault(JavaType javaType, java.util.List<JavaType> list, boolean z) {
        java.lang.Class<?> rawClass = javaType.getRawClass();
        if (rawClass == KWHzl || rawClass == EZpvd) {
            return;
        }
        if (z) {
            if (KWHzl(list, rawClass)) {
                return;
            } else {
                list.add(javaType);
            }
        }
        java.util.Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            OLrzqt(it.next(), list, true);
        }
        JavaType superClass = javaType.getSuperClass();
        if (superClass != null) {
            copydefault(superClass, list, true);
        }
    }

    public static void OLrzqt(JavaType javaType, java.util.List<JavaType> list, boolean z) {
        java.lang.Class<?> rawClass = javaType.getRawClass();
        if (z) {
            if (KWHzl(list, rawClass)) {
                return;
            }
            list.add(javaType);
            if (rawClass == OLrzqt || rawClass == copydefault) {
                return;
            }
        }
        java.util.Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            OLrzqt(it.next(), list, true);
        }
    }

    public static boolean KWHzl(java.util.List<JavaType> list, java.lang.Class<?> cls) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getRawClass() == cls) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceC5609Yh KWHzl(java.util.List<JavaType> list) {
        if (this.djBIcL == null) {
            return AEQbTJ;
        }
        WX.TaskDescription taskDescription = this.values;
        boolean z = taskDescription != null && (!(taskDescription instanceof SimpleMixInResolver) || ((SimpleMixInResolver) taskDescription).hasMixIns());
        if (!z && !this.valueOf) {
            return AEQbTJ;
        }
        AnnotationCollector annotationCollectorCopydefault = AnnotationCollector.copydefault();
        java.lang.Class<?> cls = this.fetchVPNInfo;
        if (cls != null) {
            annotationCollectorCopydefault = OLrzqt(annotationCollectorCopydefault, this.gEmmrt, cls);
        }
        if (this.valueOf) {
            annotationCollectorCopydefault = AEQbTJ(annotationCollectorCopydefault, C5619Yr.OLrzqt(this.gEmmrt));
        }
        for (JavaType javaType : list) {
            if (z) {
                java.lang.Class<?> rawClass = javaType.getRawClass();
                annotationCollectorCopydefault = OLrzqt(annotationCollectorCopydefault, rawClass, this.values.findMixInClassFor(rawClass));
            }
            if (this.valueOf) {
                annotationCollectorCopydefault = AEQbTJ(annotationCollectorCopydefault, C5619Yr.OLrzqt(javaType.getRawClass()));
            }
        }
        if (z) {
            annotationCollectorCopydefault = OLrzqt(annotationCollectorCopydefault, java.lang.Object.class, this.values.findMixInClassFor(java.lang.Object.class));
        }
        return annotationCollectorCopydefault.KWHzl();
    }

    public final AnnotationCollector OLrzqt(AnnotationCollector annotationCollector, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = AEQbTJ(annotationCollector, C5619Yr.OLrzqt(cls2));
            java.util.Iterator<java.lang.Class<?>> it = C5619Yr.AEQbTJ(cls2, cls, false).iterator();
            while (it.hasNext()) {
                annotationCollector = AEQbTJ(annotationCollector, C5619Yr.OLrzqt(it.next()));
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector AEQbTJ(AnnotationCollector annotationCollector, java.lang.annotation.Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (java.lang.annotation.Annotation annotation : annotationArr) {
                if (!annotationCollector.OLrzqt(annotation)) {
                    annotationCollector = annotationCollector.copydefault(annotation);
                    if (this.djBIcL.isAnnotationBundle(annotation)) {
                        annotationCollector = OLrzqt(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector OLrzqt(AnnotationCollector annotationCollector, java.lang.annotation.Annotation annotation) {
        for (java.lang.annotation.Annotation annotation2 : C5619Yr.OLrzqt((java.lang.Class<?>) annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.OLrzqt(annotation2)) {
                annotationCollector = annotationCollector.copydefault(annotation2);
                if (this.djBIcL.isAnnotationBundle(annotation2)) {
                    annotationCollector = OLrzqt(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
