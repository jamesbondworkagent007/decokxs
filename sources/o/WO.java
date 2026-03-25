package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC5580Xe;
import o.WX;

/* JADX INFO: loaded from: classes21.dex */
public class WO extends WU {
    public final boolean AEQbTJ;
    public final WX.TaskDescription KWHzl;

    public WO(AnnotationIntrospector annotationIntrospector, WX.TaskDescription taskDescription, boolean z) {
        super(annotationIntrospector);
        this.KWHzl = annotationIntrospector == null ? null : taskDescription;
        this.AEQbTJ = z;
    }

    public static WR AEQbTJ(AnnotationIntrospector annotationIntrospector, InterfaceC5580Xe interfaceC5580Xe, WX.TaskDescription taskDescription, TypeFactory typeFactory, JavaType javaType, java.util.List<JavaType> list, java.lang.Class<?> cls, boolean z) {
        return new WO(annotationIntrospector, taskDescription, z).EZpvd(typeFactory, interfaceC5580Xe, javaType, list, cls);
    }

    public WR EZpvd(TypeFactory typeFactory, InterfaceC5580Xe interfaceC5580Xe, JavaType javaType, java.util.List<JavaType> list, java.lang.Class<?> cls) {
        java.lang.Class<?> clsFindMixInClassFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AEQbTJ(interfaceC5580Xe, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType javaType2 : list) {
            WX.TaskDescription taskDescription = this.KWHzl;
            AEQbTJ(new InterfaceC5580Xe.Application(typeFactory, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, taskDescription == null ? null : taskDescription.findMixInClassFor(javaType2.getRawClass()));
        }
        WX.TaskDescription taskDescription2 = this.KWHzl;
        if (taskDescription2 != null && (clsFindMixInClassFor = taskDescription2.findMixInClassFor(java.lang.Object.class)) != null) {
            KWHzl(interfaceC5580Xe, javaType.getRawClass(), linkedHashMap, clsFindMixInClassFor);
            if (this.AhwBna != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry<WV, TaskDescription> entry : linkedHashMap.entrySet()) {
                    WV key = entry.getKey();
                    if ("hashCode".equals(key.copydefault()) && key.AEQbTJ() == 0) {
                        try {
                            java.lang.reflect.Method declaredMethod = java.lang.Object.class.getDeclaredMethod(key.copydefault(), new java.lang.Class[0]);
                            if (declaredMethod != null) {
                                TaskDescription value = entry.getValue();
                                value.OLrzqt = OLrzqt(value.OLrzqt, declaredMethod.getDeclaredAnnotations());
                                value.AEQbTJ = declaredMethod;
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new WR();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<WV, TaskDescription> entry2 : linkedHashMap.entrySet()) {
            AnnotatedMethod annotatedMethodAEQbTJ = entry2.getValue().AEQbTJ();
            if (annotatedMethodAEQbTJ != null) {
                linkedHashMap2.put(entry2.getKey(), annotatedMethodAEQbTJ);
            }
        }
        return new WR(linkedHashMap2);
    }

    public final void AEQbTJ(InterfaceC5580Xe interfaceC5580Xe, java.lang.Class<?> cls, java.util.Map<WV, TaskDescription> map, java.lang.Class<?> cls2) {
        AnnotationCollector annotationCollectorCopydefault;
        if (cls2 != null) {
            KWHzl(interfaceC5580Xe, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (java.lang.reflect.Method method : C5619Yr.djBIcL(cls)) {
            if (copydefault(method)) {
                WV wv = new WV(method);
                TaskDescription taskDescription = map.get(wv);
                if (taskDescription == null) {
                    if (this.AhwBna == null) {
                        annotationCollectorCopydefault = AnnotationCollector.copydefault();
                    } else {
                        annotationCollectorCopydefault = copydefault(method.getDeclaredAnnotations());
                    }
                    map.put(wv, new TaskDescription(interfaceC5580Xe, method, annotationCollectorCopydefault));
                } else {
                    if (this.AEQbTJ) {
                        taskDescription.OLrzqt = OLrzqt(taskDescription.OLrzqt, method.getDeclaredAnnotations());
                    }
                    java.lang.reflect.Method method2 = taskDescription.AEQbTJ;
                    if (method2 == null) {
                        taskDescription.AEQbTJ = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        taskDescription.AEQbTJ = method;
                        taskDescription.KWHzl = interfaceC5580Xe;
                    }
                }
            }
        }
    }

    public void KWHzl(InterfaceC5580Xe interfaceC5580Xe, java.lang.Class<?> cls, java.util.Map<WV, TaskDescription> map, java.lang.Class<?> cls2) {
        if (this.AhwBna == null) {
            return;
        }
        java.util.Iterator<java.lang.Class<?>> it = C5619Yr.OLrzqt(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (java.lang.reflect.Method method : it.next().getDeclaredMethods()) {
                if (copydefault(method)) {
                    WV wv = new WV(method);
                    TaskDescription taskDescription = map.get(wv);
                    java.lang.annotation.Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (taskDescription == null) {
                        map.put(wv, new TaskDescription(interfaceC5580Xe, null, copydefault(declaredAnnotations)));
                    } else {
                        taskDescription.OLrzqt = OLrzqt(taskDescription.OLrzqt, declaredAnnotations);
                    }
                }
            }
        }
    }

    public static boolean copydefault(java.lang.reflect.Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || WP.AEQbTJ(method) > 2) ? false : true;
    }

    public static final class TaskDescription {
        public java.lang.reflect.Method AEQbTJ;
        public InterfaceC5580Xe KWHzl;
        public AnnotationCollector OLrzqt;

        public TaskDescription(InterfaceC5580Xe interfaceC5580Xe, java.lang.reflect.Method method, AnnotationCollector annotationCollector) {
            this.KWHzl = interfaceC5580Xe;
            this.AEQbTJ = method;
            this.OLrzqt = annotationCollector;
        }

        public AnnotatedMethod AEQbTJ() {
            java.lang.reflect.Method method = this.AEQbTJ;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.KWHzl, method, this.OLrzqt.EZpvd(), null);
        }
    }
}
