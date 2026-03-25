package o;

import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: o.Vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5538Vo {
    public static final java.lang.ThreadLocal<SoftReference<C5536Vm>> AEQbTJ;
    public static final C5542Vs copydefault;

    static {
        copydefault = "true".equals(java.lang.System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? C5542Vs.KWHzl() : null;
        AEQbTJ = new java.lang.ThreadLocal<>();
    }

    public static C5536Vm copydefault() {
        SoftReference<C5536Vm> softReference;
        java.lang.ThreadLocal<SoftReference<C5536Vm>> threadLocal = AEQbTJ;
        SoftReference<C5536Vm> softReference2 = threadLocal.get();
        C5536Vm c5536Vm = softReference2 == null ? null : softReference2.get();
        if (c5536Vm == null) {
            c5536Vm = new C5536Vm();
            C5542Vs c5542Vs = copydefault;
            if (c5542Vs != null) {
                softReference = c5542Vs.OLrzqt(c5536Vm);
            } else {
                softReference = new SoftReference<>(c5536Vm);
            }
            threadLocal.set(softReference);
        }
        return c5536Vm;
    }
}
