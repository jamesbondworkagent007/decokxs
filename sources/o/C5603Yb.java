package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;

/* JADX INFO: renamed from: o.Yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5603Yb {
    public final Application[] AEQbTJ;
    public final int OLrzqt;
    public final int copydefault;

    public static final int copydefault(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public C5603Yb(LRUMap<YD, VD<java.lang.Object>> lRUMap) {
        int iCopydefault = copydefault(lRUMap.size());
        this.OLrzqt = iCopydefault;
        this.copydefault = iCopydefault - 1;
        final Application[] applicationArr = new Application[iCopydefault];
        lRUMap.contents(new java.util.function.BiConsumer() { // from class: o.Yf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                this.EZpvd.AEQbTJ(applicationArr, (YD) obj, (VD) obj2);
            }
        });
        this.AEQbTJ = applicationArr;
    }

    public final /* synthetic */ void AEQbTJ(Application[] applicationArr, YD yd, VD vd) {
        int iHashCode = yd.hashCode() & this.copydefault;
        applicationArr[iHashCode] = new Application(applicationArr[iHashCode], yd, vd);
    }

    public static C5603Yb OLrzqt(LRUMap<YD, VD<java.lang.Object>> lRUMap) {
        return new C5603Yb(lRUMap);
    }

    public VD<java.lang.Object> copydefault(JavaType javaType) {
        Application application = this.AEQbTJ[YD.OLrzqt(javaType) & this.copydefault];
        if (application == null) {
            return null;
        }
        if (application.AEQbTJ(javaType)) {
            return application.copydefault;
        }
        do {
            application = application.OLrzqt;
            if (application == null) {
                return null;
            }
        } while (!application.AEQbTJ(javaType));
        return application.copydefault;
    }

    public VD<java.lang.Object> KWHzl(java.lang.Class<?> cls) {
        Application application = this.AEQbTJ[YD.EZpvd(cls) & this.copydefault];
        if (application == null) {
            return null;
        }
        if (application.KWHzl(cls)) {
            return application.copydefault;
        }
        do {
            application = application.OLrzqt;
            if (application == null) {
                return null;
            }
        } while (!application.KWHzl(cls));
        return application.copydefault;
    }

    public VD<java.lang.Object> KWHzl(JavaType javaType) {
        Application application = this.AEQbTJ[YD.copydefault(javaType) & this.copydefault];
        if (application == null) {
            return null;
        }
        if (application.KWHzl(javaType)) {
            return application.copydefault;
        }
        do {
            application = application.OLrzqt;
            if (application == null) {
                return null;
            }
        } while (!application.KWHzl(javaType));
        return application.copydefault;
    }

    public VD<java.lang.Object> OLrzqt(java.lang.Class<?> cls) {
        Application application = this.AEQbTJ[YD.copydefault(cls) & this.copydefault];
        if (application == null) {
            return null;
        }
        if (application.AEQbTJ(cls)) {
            return application.copydefault;
        }
        do {
            application = application.OLrzqt;
            if (application == null) {
                return null;
            }
        } while (!application.AEQbTJ(cls));
        return application.copydefault;
    }

    /* JADX INFO: renamed from: o.Yb$Application */
    public static final class Application {
        public final boolean AEQbTJ;
        public final java.lang.Class<?> EZpvd;
        public final JavaType KWHzl;
        public final Application OLrzqt;
        public final VD<java.lang.Object> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AEQbTJ(java.lang.Class<?> cls) {
            return this.EZpvd == cls && !this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean KWHzl(java.lang.Class<?> cls) {
            return this.EZpvd == cls && this.AEQbTJ;
        }

        public Application(Application application, YD yd, VD<java.lang.Object> vd) {
            this.OLrzqt = application;
            this.copydefault = vd;
            this.AEQbTJ = yd.KWHzl();
            this.EZpvd = yd.OLrzqt();
            this.KWHzl = yd.AEQbTJ();
        }

        public boolean AEQbTJ(JavaType javaType) {
            return this.AEQbTJ && javaType.equals(this.KWHzl);
        }

        public boolean KWHzl(JavaType javaType) {
            return !this.AEQbTJ && javaType.equals(this.KWHzl);
        }
    }
}
