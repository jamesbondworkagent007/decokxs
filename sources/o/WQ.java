package o;

import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public final class WQ implements InterfaceC5609Yh {
    public java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> copydefault;

    public WQ() {
    }

    public static WQ EZpvd(java.lang.Class<?> cls, java.lang.annotation.Annotation annotation) {
        java.util.HashMap map = new java.util.HashMap(4);
        map.put(cls, annotation);
        return new WQ(map);
    }

    public WQ(java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map) {
        this.copydefault = map;
    }

    @Override // o.InterfaceC5609Yh
    public <A extends java.lang.annotation.Annotation> A get(java.lang.Class<A> cls) {
        java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map = this.copydefault;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // o.InterfaceC5609Yh
    public boolean has(java.lang.Class<?> cls) {
        java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map = this.copydefault;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // o.InterfaceC5609Yh
    public boolean hasOneOf(java.lang.Class<? extends java.lang.annotation.Annotation>[] clsArr) {
        if (this.copydefault != null) {
            for (java.lang.Class<? extends java.lang.annotation.Annotation> cls : clsArr) {
                if (this.copydefault.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public java.lang.Iterable<java.lang.annotation.Annotation> AEQbTJ() {
        java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map = this.copydefault;
        if (map == null || map.size() == 0) {
            return Collections.emptyList();
        }
        return this.copydefault.values();
    }

    public static WQ AEQbTJ(WQ wq, WQ wq2) {
        java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map;
        java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map2;
        if (wq == null || (map = wq.copydefault) == null || map.isEmpty()) {
            return wq2;
        }
        if (wq2 == null || (map2 = wq2.copydefault) == null || map2.isEmpty()) {
            return wq;
        }
        java.util.HashMap map3 = new java.util.HashMap();
        for (java.lang.annotation.Annotation annotation : wq2.copydefault.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (java.lang.annotation.Annotation annotation2 : wq.copydefault.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new WQ(map3);
    }

    @Override // o.InterfaceC5609Yh
    public int size() {
        java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map = this.copydefault;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public boolean AEQbTJ(java.lang.annotation.Annotation annotation) {
        return EZpvd(annotation);
    }

    public java.lang.String toString() {
        java.util.HashMap<java.lang.Class<?>, java.lang.annotation.Annotation> map = this.copydefault;
        return map == null ? "[null]" : map.toString();
    }

    public final boolean EZpvd(java.lang.annotation.Annotation annotation) {
        if (this.copydefault == null) {
            this.copydefault = new java.util.HashMap<>();
        }
        java.lang.annotation.Annotation annotationPut = this.copydefault.put(annotation.annotationType(), annotation);
        return annotationPut == null || !annotationPut.equals(annotation);
    }
}
