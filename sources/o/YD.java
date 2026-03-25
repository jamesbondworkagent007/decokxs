package o;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public class YD {
    public JavaType AEQbTJ;
    public boolean KWHzl;
    public int OLrzqt;
    public java.lang.Class<?> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Class<?> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hashCode() {
        return this.OLrzqt;
    }

    public YD() {
    }

    public YD(java.lang.Class<?> cls, boolean z) {
        this.copydefault = cls;
        this.AEQbTJ = null;
        this.KWHzl = z;
        this.OLrzqt = z ? EZpvd(cls) : copydefault(cls);
    }

    public YD(JavaType javaType, boolean z) {
        this.AEQbTJ = javaType;
        this.copydefault = null;
        this.KWHzl = z;
        this.OLrzqt = z ? OLrzqt(javaType) : copydefault(javaType);
    }

    public static final int copydefault(java.lang.Class<?> cls) {
        return cls.getName().hashCode();
    }

    public static final int EZpvd(java.lang.Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int copydefault(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int OLrzqt(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public final java.lang.String toString() {
        if (this.copydefault != null) {
            return "{class: " + this.copydefault.getName() + ", typed? " + this.KWHzl + "}";
        }
        return "{type: " + this.AEQbTJ + ", typed? " + this.KWHzl + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        YD yd = (YD) obj;
        if (yd.KWHzl != this.KWHzl) {
            return false;
        }
        java.lang.Class<?> cls = this.copydefault;
        if (cls != null) {
            return yd.copydefault == cls;
        }
        return this.AEQbTJ.equals(yd.AEQbTJ);
    }
}
