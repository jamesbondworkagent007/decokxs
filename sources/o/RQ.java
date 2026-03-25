package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class RQ {
    public final AtomicReference<SC> EZpvd = new AtomicReference<>();
    public final androidx.collection.ArrayMap<SC, java.util.List<java.lang.Class<?>>> OLrzqt = new androidx.collection.ArrayMap<>();

    public java.util.List<java.lang.Class<?>> KWHzl(@androidx.annotation.NonNull java.lang.Class<?> cls, @androidx.annotation.NonNull java.lang.Class<?> cls2, @androidx.annotation.NonNull java.lang.Class<?> cls3) {
        java.util.List<java.lang.Class<?>> list;
        SC andSet = this.EZpvd.getAndSet(null);
        if (andSet == null) {
            andSet = new SC(cls, cls2, cls3);
        } else {
            andSet.OLrzqt(cls, cls2, cls3);
        }
        synchronized (this.OLrzqt) {
            list = this.OLrzqt.get(andSet);
        }
        this.EZpvd.set(andSet);
        return list;
    }

    public void copydefault(@androidx.annotation.NonNull java.lang.Class<?> cls, @androidx.annotation.NonNull java.lang.Class<?> cls2, @androidx.annotation.NonNull java.lang.Class<?> cls3, @androidx.annotation.NonNull java.util.List<java.lang.Class<?>> list) {
        synchronized (this.OLrzqt) {
            this.OLrzqt.put(new SC(cls, cls2, cls3), list);
        }
    }
}
