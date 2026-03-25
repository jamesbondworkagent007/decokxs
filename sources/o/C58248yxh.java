package o;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: renamed from: o.yxh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58248yxh<T> {
    public static final C58248yxh<java.lang.Object> AEQbTJ = new C58248yxh<>(null);
    public final java.lang.Object EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> C58248yxh<T> AEQbTJ() {
        return (C58248yxh<T>) AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.EZpvd == null;
    }

    public C58248yxh(java.lang.Object obj) {
        this.EZpvd = obj;
    }

    public boolean EZpvd() {
        return NotificationLite.isError(this.EZpvd);
    }

    public boolean djBIcL() {
        java.lang.Object obj = this.EZpvd;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public T copydefault() {
        java.lang.Object obj = this.EZpvd;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.EZpvd;
    }

    public java.lang.Throwable OLrzqt() {
        java.lang.Object obj = this.EZpvd;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C58248yxh) {
            return C58297yyd.AEQbTJ(this.EZpvd, ((C58248yxh) obj).EZpvd);
        }
        return false;
    }

    public int hashCode() {
        java.lang.Object obj = this.EZpvd;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        java.lang.Object obj = this.EZpvd;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.EZpvd + "]";
    }

    public static <T> C58248yxh<T> AEQbTJ(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "value is null");
        return new C58248yxh<>(t);
    }

    public static <T> C58248yxh<T> OLrzqt(java.lang.Throwable th) {
        C58297yyd.AEQbTJ(th, "error is null");
        return new C58248yxh<>(NotificationLite.error(th));
    }
}
