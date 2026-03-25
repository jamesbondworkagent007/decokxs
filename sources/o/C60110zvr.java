package o;

/* JADX INFO: renamed from: o.zvr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60110zvr {
    public static java.lang.Throwable OLrzqt(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        java.lang.Object obj = objArr[objArr.length - 1];
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        return null;
    }

    public static java.lang.Object[] copydefault(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new java.lang.IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        if (length > 0) {
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }
}
