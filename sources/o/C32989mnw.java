package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.mnw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32989mnw<T> {
    public final T EZpvd;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mnw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32989mnw copy$default(C32989mnw c32989mnw, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c32989mnw.EZpvd;
        }
        return c32989mnw.copydefault(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        if (this.OLrzqt) {
            return null;
        }
        this.OLrzqt = true;
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32989mnw<T> copydefault(T t) {
        return new C32989mnw<>(t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32989mnw) && Intrinsics.EZpvd(this.EZpvd, ((C32989mnw) obj).EZpvd);
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
        return "Event(data=" + this.EZpvd + ")";
    }

    public C32989mnw(T t) {
        this.EZpvd = t;
    }
}
