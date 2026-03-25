package o;

/* JADX INFO: renamed from: o.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5431Rl {
    public final java.util.List<Activity<?, ?>> EZpvd = new java.util.ArrayList();

    public <Z, R> void EZpvd(@androidx.annotation.NonNull java.lang.Class<Z> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2, @androidx.annotation.NonNull InterfaceC5429Rj<Z, R> interfaceC5429Rj) {
        synchronized (this) {
            this.EZpvd.add(new Activity<>(cls, cls2, interfaceC5429Rj));
        }
    }

    public <Z, R> InterfaceC5429Rj<Z, R> AEQbTJ(@androidx.annotation.NonNull java.lang.Class<Z> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2) {
        synchronized (this) {
            if (cls2.isAssignableFrom(cls)) {
                return C5433Rn.OLrzqt();
            }
            for (Activity<?, ?> activity : this.EZpvd) {
                if (activity.copydefault(cls, cls2)) {
                    return (InterfaceC5429Rj<Z, R>) activity.EZpvd;
                }
            }
            throw new java.lang.IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
        }
    }

    public <Z, R> java.util.List<java.lang.Class<R>> EZpvd(@androidx.annotation.NonNull java.lang.Class<Z> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2) {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (Activity<?, ?> activity : this.EZpvd) {
                if (activity.copydefault(cls, cls2) && !arrayList.contains(activity.copydefault)) {
                    arrayList.add(activity.copydefault);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: o.Rl$Activity */
    public static final class Activity<Z, R> {
        public final InterfaceC5429Rj<Z, R> EZpvd;
        public final java.lang.Class<Z> KWHzl;
        public final java.lang.Class<R> copydefault;

        public Activity(@androidx.annotation.NonNull java.lang.Class<Z> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2, @androidx.annotation.NonNull InterfaceC5429Rj<Z, R> interfaceC5429Rj) {
            this.KWHzl = cls;
            this.copydefault = cls2;
            this.EZpvd = interfaceC5429Rj;
        }

        public boolean copydefault(@androidx.annotation.NonNull java.lang.Class<?> cls, @androidx.annotation.NonNull java.lang.Class<?> cls2) {
            return this.KWHzl.isAssignableFrom(cls) && cls2.isAssignableFrom(this.copydefault);
        }
    }
}
