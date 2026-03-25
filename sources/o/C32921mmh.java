package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.mmh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32921mmh<T> {
    public final T EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mmh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32921mmh copy$default(C32921mmh c32921mmh, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c32921mmh.EZpvd;
        }
        return c32921mmh.EZpvd(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32921mmh<T> EZpvd(T t) {
        return new C32921mmh<>(t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32921mmh) && Intrinsics.EZpvd(this.EZpvd, ((C32921mmh) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.EZpvd;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CacheEntry(value=" + this.EZpvd + ")";
    }

    public C32921mmh(T t) {
        this.EZpvd = t;
    }
}
