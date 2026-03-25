package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.PropertyName;

/* JADX INFO: renamed from: o.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5576Xa {
    public static final C5576Xa KWHzl = new C5576Xa(PropertyName.NO_NAME, java.lang.Object.class, null, false, null);
    public final boolean AEQbTJ;
    public final java.lang.Class<? extends InterfaceC5500Ud> EZpvd;
    public final java.lang.Class<? extends ObjectIdGenerator<?>> OLrzqt;
    public final PropertyName copydefault;
    public final java.lang.Class<?> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C5576Xa copydefault() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PropertyName AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Class<?> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Class<? extends ObjectIdGenerator<?>> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Class<? extends InterfaceC5500Ud> OLrzqt() {
        return this.EZpvd;
    }

    public C5576Xa(PropertyName propertyName, java.lang.Class<?> cls, java.lang.Class<? extends ObjectIdGenerator<?>> cls2, java.lang.Class<? extends InterfaceC5500Ud> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends o.Ud>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends o.Ud>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5576Xa(PropertyName propertyName, java.lang.Class<?> cls, java.lang.Class<? extends ObjectIdGenerator<?>> cls2, boolean z, java.lang.Class cls3) {
        this.copydefault = propertyName;
        this.gEmmrt = cls;
        this.OLrzqt = cls2;
        this.AEQbTJ = z;
        this.EZpvd = cls3 == null ? C5499Uc.class : cls3;
    }

    public C5576Xa EZpvd(boolean z) {
        return this.AEQbTJ == z ? this : new C5576Xa(this.copydefault, this.gEmmrt, this.OLrzqt, z, this.EZpvd);
    }

    public java.lang.String toString() {
        return "ObjectIdInfo: propName=" + this.copydefault + ", scope=" + C5619Yr.uzCIH(this.gEmmrt) + ", generatorType=" + C5619Yr.uzCIH(this.OLrzqt) + ", alwaysAsId=" + this.AEQbTJ;
    }
}
