package o;

/* JADX INFO: loaded from: classes21.dex */
public final class WV {
    public static final java.lang.Class<?>[] EZpvd = new java.lang.Class[0];
    public final java.lang.Class<?>[] OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    public WV(java.lang.reflect.Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public WV(java.lang.reflect.Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public WV(java.lang.String str, java.lang.Class<?>[] clsArr) {
        this.copydefault = str;
        this.OLrzqt = clsArr == null ? EZpvd : clsArr;
    }

    public int AEQbTJ() {
        return this.OLrzqt.length;
    }

    public java.lang.String toString() {
        return this.copydefault + "(" + this.OLrzqt.length + "-args)";
    }

    public int hashCode() {
        return this.copydefault.hashCode() + this.OLrzqt.length;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != WV.class) {
            return false;
        }
        WV wv = (WV) obj;
        if (!this.copydefault.equals(wv.copydefault)) {
            return false;
        }
        java.lang.Class<?>[] clsArr = wv.OLrzqt;
        int length = this.OLrzqt.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.OLrzqt[i]) {
                return false;
            }
        }
        return true;
    }
}
