package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.btY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10707btY<T> {
    public abstract java.lang.String OLrzqt();

    public abstract void OLrzqt(T t);

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof AbstractC10707btY) && Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) ((AbstractC10707btY) obj).OLrzqt());
    }

    public int hashCode() {
        return OLrzqt().hashCode();
    }
}
