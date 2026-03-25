package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Modifier;
import java.util.Collections;
import o.C5619Yr;
import o.WJ;

/* JADX INFO: loaded from: classes21.dex */
public final class WL extends WU {
    public AnnotatedConstructor EZpvd;
    public final InterfaceC5580Xe KWHzl;
    public final boolean OLrzqt;

    public WL(AnnotationIntrospector annotationIntrospector, InterfaceC5580Xe interfaceC5580Xe, boolean z) {
        super(annotationIntrospector);
        this.KWHzl = interfaceC5580Xe;
        this.OLrzqt = z;
    }

    public static WJ.Application OLrzqt(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, InterfaceC5580Xe interfaceC5580Xe, JavaType javaType, java.lang.Class<?> cls, boolean z) {
        return new WL(annotationIntrospector, interfaceC5580Xe, z | (cls != null)).OLrzqt(typeFactory, javaType, cls);
    }

    public WJ.Application OLrzqt(TypeFactory typeFactory, JavaType javaType, java.lang.Class<?> cls) {
        java.util.List<AnnotatedConstructor> listCopydefault = copydefault(javaType, cls);
        java.util.List<AnnotatedMethod> listCopydefault2 = copydefault(typeFactory, javaType, cls);
        if (this.OLrzqt) {
            AnnotatedConstructor annotatedConstructor = this.EZpvd;
            if (annotatedConstructor != null && this.AhwBna.hasIgnoreMarker(annotatedConstructor)) {
                this.EZpvd = null;
            }
            int size = listCopydefault.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (this.AhwBna.hasIgnoreMarker(listCopydefault.get(size))) {
                    listCopydefault.remove(size);
                }
            }
            int size2 = listCopydefault2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                if (this.AhwBna.hasIgnoreMarker(listCopydefault2.get(size2))) {
                    listCopydefault2.remove(size2);
                }
            }
        }
        return new WJ.Application(this.EZpvd, listCopydefault, listCopydefault2);
    }

    public final java.util.List<AnnotatedConstructor> copydefault(JavaType javaType, java.lang.Class<?> cls) {
        C5619Yr.StateListAnimator stateListAnimator;
        java.util.ArrayList arrayList;
        int size;
        java.util.List<AnnotatedConstructor> arrayList2;
        if (javaType.isEnumType()) {
            stateListAnimator = null;
            arrayList = null;
        } else {
            stateListAnimator = null;
            arrayList = null;
            for (C5619Yr.StateListAnimator stateListAnimator2 : C5619Yr.AhwBna(javaType.getRawClass())) {
                if (EZpvd(stateListAnimator2.AEQbTJ())) {
                    if (stateListAnimator2.OLrzqt() == 0) {
                        stateListAnimator = stateListAnimator2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(stateListAnimator2);
                    }
                }
            }
        }
        if (arrayList == null) {
            java.util.List<AnnotatedConstructor> listEmptyList = Collections.emptyList();
            if (stateListAnimator == null) {
                return listEmptyList;
            }
            arrayList2 = listEmptyList;
            size = 0;
        } else {
            size = arrayList.size();
            arrayList2 = new java.util.ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(null);
            }
        }
        if (cls != null) {
            WV[] wvArr = null;
            for (C5619Yr.StateListAnimator stateListAnimator3 : C5619Yr.AhwBna(cls)) {
                if (stateListAnimator3.OLrzqt() == 0) {
                    if (stateListAnimator != null) {
                        this.EZpvd = AEQbTJ(stateListAnimator, stateListAnimator3);
                        stateListAnimator = null;
                    }
                } else if (arrayList != null) {
                    if (wvArr == null) {
                        wvArr = new WV[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            wvArr[i2] = new WV(((C5619Yr.StateListAnimator) arrayList.get(i2)).AEQbTJ());
                        }
                    }
                    WV wv = new WV(stateListAnimator3.AEQbTJ());
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (wv.equals(wvArr[i3])) {
                            arrayList2.set(i3, copydefault((C5619Yr.StateListAnimator) arrayList.get(i3), stateListAnimator3));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        if (stateListAnimator != null) {
            this.EZpvd = AEQbTJ(stateListAnimator, (C5619Yr.StateListAnimator) null);
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList2.get(i4) == null) {
                arrayList2.set(i4, copydefault((C5619Yr.StateListAnimator) arrayList.get(i4), (C5619Yr.StateListAnimator) null));
            }
        }
        return arrayList2;
    }

    public final java.util.List<AnnotatedMethod> copydefault(TypeFactory typeFactory, JavaType javaType, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList = null;
        for (java.lang.reflect.Method method : C5619Yr.djBIcL(javaType.getRawClass())) {
            if (OLrzqt(method)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        InterfaceC5580Xe interfaceC5580Xe = this.KWHzl;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            WV[] wvArr = null;
            for (java.lang.reflect.Method method2 : cls.getDeclaredMethods()) {
                if (OLrzqt(method2)) {
                    if (wvArr == null) {
                        wvArr = new WV[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            wvArr[i2] = new WV((java.lang.reflect.Method) arrayList.get(i2));
                        }
                    }
                    WV wv = new WV(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (wv.equals(wvArr[i3])) {
                            arrayList2.set(i3, OLrzqt((java.lang.reflect.Method) arrayList.get(i3), interfaceC5580Xe, method2));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList2.get(i4)) == null) {
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) arrayList.get(i4);
                arrayList2.set(i4, OLrzqt(method3, C5578Xc.EZpvd(method3, javaType, typeFactory, interfaceC5580Xe), (java.lang.reflect.Method) null));
            }
        }
        return arrayList2;
    }

    public static boolean OLrzqt(java.lang.reflect.Method method) {
        return Modifier.isStatic(method.getModifiers()) && !method.isSynthetic();
    }

    public AnnotatedConstructor AEQbTJ(C5619Yr.StateListAnimator stateListAnimator, C5619Yr.StateListAnimator stateListAnimator2) {
        return new AnnotatedConstructor(this.KWHzl, stateListAnimator.AEQbTJ(), OLrzqt(stateListAnimator, stateListAnimator2), WU.valueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotatedConstructor copydefault(C5619Yr.StateListAnimator stateListAnimator, C5619Yr.StateListAnimator stateListAnimator2) {
        java.lang.annotation.Annotation[][] annotationArr;
        WQ[] wqArrAEQbTJ;
        int iOLrzqt = stateListAnimator.OLrzqt();
        if (this.AhwBna == null) {
            return new AnnotatedConstructor(this.KWHzl, stateListAnimator.AEQbTJ(), WU.copydefault(), WU.EZpvd(iOLrzqt));
        }
        if (iOLrzqt == 0) {
            return new AnnotatedConstructor(this.KWHzl, stateListAnimator.AEQbTJ(), OLrzqt(stateListAnimator, stateListAnimator2), WU.valueOf);
        }
        java.lang.annotation.Annotation[][] annotationArrEZpvd = stateListAnimator.EZpvd();
        wqArrAEQbTJ = null;
        WQ[] wqArrAEQbTJ2 = null;
        if (iOLrzqt != annotationArrEZpvd.length) {
            java.lang.Class<?> clsCopydefault = stateListAnimator.copydefault();
            if (C5619Yr.AkhnZx(clsCopydefault) && iOLrzqt == annotationArrEZpvd.length + 2) {
                annotationArr = new java.lang.annotation.Annotation[annotationArrEZpvd.length + 2][];
                java.lang.System.arraycopy(annotationArrEZpvd, 0, annotationArr, 2, annotationArrEZpvd.length);
                wqArrAEQbTJ = AEQbTJ(annotationArr, (java.lang.annotation.Annotation[][]) null);
            } else {
                if (clsCopydefault.isMemberClass() && iOLrzqt == annotationArrEZpvd.length + 1) {
                    annotationArr = new java.lang.annotation.Annotation[annotationArrEZpvd.length + 1][];
                    java.lang.System.arraycopy(annotationArrEZpvd, 0, annotationArr, 1, annotationArrEZpvd.length);
                    annotationArr[0] = WU.copydefault;
                    wqArrAEQbTJ = AEQbTJ(annotationArr, (java.lang.annotation.Annotation[][]) null);
                }
                if (wqArrAEQbTJ2 == null) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", stateListAnimator.copydefault().getName(), java.lang.Integer.valueOf(iOLrzqt), java.lang.Integer.valueOf(annotationArrEZpvd.length)));
                }
            }
            wqArrAEQbTJ2 = wqArrAEQbTJ;
            annotationArrEZpvd = annotationArr;
            if (wqArrAEQbTJ2 == null) {
            }
        } else {
            wqArrAEQbTJ2 = AEQbTJ(annotationArrEZpvd, stateListAnimator2 != null ? stateListAnimator2.EZpvd() : null);
        }
        return new AnnotatedConstructor(this.KWHzl, stateListAnimator.AEQbTJ(), OLrzqt(stateListAnimator, stateListAnimator2), wqArrAEQbTJ2);
    }

    public AnnotatedMethod OLrzqt(java.lang.reflect.Method method, InterfaceC5580Xe interfaceC5580Xe, java.lang.reflect.Method method2) {
        int iAEQbTJ = WP.AEQbTJ(method);
        if (this.AhwBna == null) {
            return new AnnotatedMethod(interfaceC5580Xe, method, WU.copydefault(), WU.EZpvd(iAEQbTJ));
        }
        if (iAEQbTJ == 0) {
            return new AnnotatedMethod(interfaceC5580Xe, method, AEQbTJ(method, method2), WU.valueOf);
        }
        return new AnnotatedMethod(interfaceC5580Xe, method, AEQbTJ(method, method2), AEQbTJ(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    public final WQ[] AEQbTJ(java.lang.annotation.Annotation[][] annotationArr, java.lang.annotation.Annotation[][] annotationArr2) {
        if (!this.OLrzqt) {
            return WU.valueOf;
        }
        int length = annotationArr.length;
        WQ[] wqArr = new WQ[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector annotationCollectorCopydefault = copydefault(AnnotationCollector.copydefault(), annotationArr[i]);
            if (annotationArr2 != null) {
                annotationCollectorCopydefault = copydefault(annotationCollectorCopydefault, annotationArr2[i]);
            }
            wqArr[i] = annotationCollectorCopydefault.EZpvd();
        }
        return wqArr;
    }

    public final WQ OLrzqt(C5619Yr.StateListAnimator stateListAnimator, C5619Yr.StateListAnimator stateListAnimator2) {
        if (this.OLrzqt) {
            AnnotationCollector annotationCollectorCopydefault = copydefault(stateListAnimator.KWHzl());
            if (stateListAnimator2 != null) {
                annotationCollectorCopydefault = copydefault(annotationCollectorCopydefault, stateListAnimator2.KWHzl());
            }
            return annotationCollectorCopydefault.EZpvd();
        }
        return WU.copydefault();
    }

    public final WQ AEQbTJ(java.lang.reflect.AnnotatedElement annotatedElement, java.lang.reflect.AnnotatedElement annotatedElement2) {
        AnnotationCollector annotationCollectorCopydefault = copydefault(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            annotationCollectorCopydefault = copydefault(annotationCollectorCopydefault, annotatedElement2.getDeclaredAnnotations());
        }
        return annotationCollectorCopydefault.EZpvd();
    }

    public static boolean EZpvd(java.lang.reflect.Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }
}
