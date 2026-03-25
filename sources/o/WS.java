package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.LinkedHashMap;
import o.InterfaceC5580Xe;
import o.WX;

/* JADX INFO: loaded from: classes21.dex */
public class WS extends WU {
    public final boolean AEQbTJ;
    public final TypeFactory EZpvd;
    public final WX.TaskDescription OLrzqt;

    public WS(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, WX.TaskDescription taskDescription, boolean z) {
        super(annotationIntrospector);
        this.EZpvd = typeFactory;
        this.OLrzqt = annotationIntrospector == null ? null : taskDescription;
        this.AEQbTJ = z;
    }

    public static java.util.List<AnnotatedField> KWHzl(AnnotationIntrospector annotationIntrospector, InterfaceC5580Xe interfaceC5580Xe, WX.TaskDescription taskDescription, TypeFactory typeFactory, JavaType javaType, boolean z) {
        return new WS(annotationIntrospector, typeFactory, taskDescription, z).EZpvd(interfaceC5580Xe, javaType);
    }

    public java.util.List<AnnotatedField> EZpvd(InterfaceC5580Xe interfaceC5580Xe, JavaType javaType) {
        java.util.Map<java.lang.String, Activity> mapCopydefault = copydefault(interfaceC5580Xe, javaType, (java.util.Map<java.lang.String, Activity>) null);
        if (mapCopydefault == null) {
            return Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(mapCopydefault.size());
        java.util.Iterator<Activity> it = mapCopydefault.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().copydefault());
        }
        return arrayList;
    }

    public final java.util.Map<java.lang.String, Activity> copydefault(InterfaceC5580Xe interfaceC5580Xe, JavaType javaType, java.util.Map<java.lang.String, Activity> map) {
        WX.TaskDescription taskDescription;
        java.lang.Class<?> clsFindMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        java.lang.Class<?> rawClass = javaType.getRawClass();
        java.util.Map<java.lang.String, Activity> mapCopydefault = copydefault(new InterfaceC5580Xe.Application(this.EZpvd, superClass.getBindings()), superClass, map);
        for (java.lang.reflect.Field field : rawClass.getDeclaredFields()) {
            if (EZpvd(field)) {
                if (mapCopydefault == null) {
                    mapCopydefault = new LinkedHashMap<>();
                }
                Activity activity = new Activity(interfaceC5580Xe, field);
                if (this.AEQbTJ) {
                    activity.AEQbTJ = copydefault(activity.AEQbTJ, field.getDeclaredAnnotations());
                }
                mapCopydefault.put(field.getName(), activity);
            }
        }
        if (mapCopydefault != null && (taskDescription = this.OLrzqt) != null && (clsFindMixInClassFor = taskDescription.findMixInClassFor(rawClass)) != null) {
            copydefault(clsFindMixInClassFor, rawClass, mapCopydefault);
        }
        return mapCopydefault;
    }

    public final void copydefault(java.lang.Class<?> cls, java.lang.Class<?> cls2, java.util.Map<java.lang.String, Activity> map) {
        Activity activity;
        java.util.Iterator<java.lang.Class<?>> it = C5619Yr.AEQbTJ(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (java.lang.reflect.Field field : it.next().getDeclaredFields()) {
                if (EZpvd(field) && (activity = map.get(field.getName())) != null) {
                    activity.AEQbTJ = copydefault(activity.AEQbTJ, field.getDeclaredAnnotations());
                }
            }
        }
    }

    public final boolean EZpvd(java.lang.reflect.Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    public static final class Activity {
        public AnnotationCollector AEQbTJ = AnnotationCollector.copydefault();
        public final java.lang.reflect.Field EZpvd;
        public final InterfaceC5580Xe KWHzl;

        public Activity(InterfaceC5580Xe interfaceC5580Xe, java.lang.reflect.Field field) {
            this.KWHzl = interfaceC5580Xe;
            this.EZpvd = field;
        }

        public AnnotatedField copydefault() {
            return new AnnotatedField(this.KWHzl, this.EZpvd, this.AEQbTJ.EZpvd());
        }
    }
}
