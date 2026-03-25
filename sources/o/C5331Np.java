package o;

import java.util.Collections;

/* JADX INFO: renamed from: o.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5331Np {
    public final java.util.Map<java.lang.Class<?>, java.lang.Object> EZpvd;

    public C5331Np(Application application) {
        this.EZpvd = Collections.unmodifiableMap(new java.util.HashMap(application.OLrzqt));
    }

    public boolean EZpvd(java.lang.Class<? extends java.lang.Object> cls) {
        return this.EZpvd.containsKey(cls);
    }

    /* JADX INFO: renamed from: o.Np$Application */
    public static final class Application {
        public final java.util.Map<java.lang.Class<?>, java.lang.Object> OLrzqt = new java.util.HashMap();

        public C5331Np EZpvd() {
            return new C5331Np(this);
        }
    }
}
