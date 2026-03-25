package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes21.dex */
public class WU {
    public final AnnotationIntrospector AhwBna;
    public static final WQ[] valueOf = new WQ[0];
    public static final java.lang.annotation.Annotation[] copydefault = new java.lang.annotation.Annotation[0];

    public WU(AnnotationIntrospector annotationIntrospector) {
        this.AhwBna = annotationIntrospector;
    }

    public final AnnotationCollector copydefault(java.lang.annotation.Annotation[] annotationArr) {
        AnnotationCollector annotationCollectorCopydefault = AnnotationCollector.copydefault();
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            annotationCollectorCopydefault = annotationCollectorCopydefault.copydefault(annotation);
            if (this.AhwBna.isAnnotationBundle(annotation)) {
                annotationCollectorCopydefault = KWHzl(annotationCollectorCopydefault, annotation);
            }
        }
        return annotationCollectorCopydefault;
    }

    public final AnnotationCollector copydefault(AnnotationCollector annotationCollector, java.lang.annotation.Annotation[] annotationArr) {
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.copydefault(annotation);
            if (this.AhwBna.isAnnotationBundle(annotation)) {
                annotationCollector = KWHzl(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector KWHzl(AnnotationCollector annotationCollector, java.lang.annotation.Annotation annotation) {
        for (java.lang.annotation.Annotation annotation2 : C5619Yr.OLrzqt((java.lang.Class<?>) annotation.annotationType())) {
            if (!EZpvd(annotation2)) {
                if (this.AhwBna.isAnnotationBundle(annotation2)) {
                    if (!annotationCollector.OLrzqt(annotation2)) {
                        annotationCollector = KWHzl(annotationCollector.copydefault(annotation2), annotation2);
                    }
                } else {
                    annotationCollector = annotationCollector.copydefault(annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector OLrzqt(AnnotationCollector annotationCollector, java.lang.annotation.Annotation[] annotationArr) {
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (!annotationCollector.OLrzqt(annotation)) {
                annotationCollector = annotationCollector.copydefault(annotation);
                if (this.AhwBna.isAnnotationBundle(annotation)) {
                    annotationCollector = AEQbTJ(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector AEQbTJ(AnnotationCollector annotationCollector, java.lang.annotation.Annotation annotation) {
        for (java.lang.annotation.Annotation annotation2 : C5619Yr.OLrzqt((java.lang.Class<?>) annotation.annotationType())) {
            if (!EZpvd(annotation2) && !annotationCollector.OLrzqt(annotation2)) {
                annotationCollector = annotationCollector.copydefault(annotation2);
                if (this.AhwBna.isAnnotationBundle(annotation2)) {
                    annotationCollector = KWHzl(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public static final boolean EZpvd(java.lang.annotation.Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    public static WQ copydefault() {
        return new WQ();
    }

    public static WQ[] EZpvd(int i) {
        if (i == 0) {
            return valueOf;
        }
        WQ[] wqArr = new WQ[i];
        for (int i2 = 0; i2 < i; i2++) {
            wqArr[i2] = copydefault();
        }
        return wqArr;
    }
}
