package o;

import com.okinc.components.track.amplitude.AmplitudeName;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32905mmR implements InterfaceC32865mle {
    public static final C32905mmR EZpvd = new C32905mmR();
    public static final java.util.Map<java.lang.String, ConcurrentLinkedQueue<InterfaceC32861mla>> OLrzqt = new ConcurrentHashMap();
    public static final java.util.Map<java.lang.String, java.lang.Boolean> KWHzl = new ConcurrentHashMap();
    public static final ConcurrentHashMap<java.lang.String, LI> copydefault = new ConcurrentHashMap<>();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, LI> OLrzqt() {
        return copydefault;
    }

    private C32905mmR() {
    }

    @Override // o.InterfaceC32865mle
    public java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull AmplitudeName amplitudeName) {
        LP lpCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        LI liKWHzl = KWHzl(str, amplitudeName);
        java.lang.String str2 = (liKWHzl == null || (lpCopydefault = liKWHzl.copydefault(str)) == null) ? null : lpCopydefault.OLrzqt;
        pUU.EZpvd("SkylabABTestProvider", "getValue->key:" + str + " value:" + str2);
        return str2;
    }

    @Override // o.InterfaceC32865mle
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull AmplitudeName amplitudeName) {
        LP lpCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        LI liKWHzl = KWHzl(str, amplitudeName);
        java.lang.Object obj = (liKWHzl == null || (lpCopydefault = liKWHzl.copydefault(str)) == null) ? null : lpCopydefault.AEQbTJ;
        pUU.EZpvd("SkylabABTestProvider", "getPayload->key:" + str + " payload:" + obj);
        return obj;
    }

    @Override // o.InterfaceC32865mle
    public void OLrzqt(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        java.util.Map<java.lang.String, ConcurrentLinkedQueue<InterfaceC32861mla>> map = OLrzqt;
        if (map.get(amplitudeName.name()) == null) {
            map.put(amplitudeName.name(), new ConcurrentLinkedQueue<>());
        }
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = map.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.add(interfaceC32861mla);
        }
        if (Intrinsics.EZpvd(KWHzl.get(amplitudeName.name()), java.lang.Boolean.TRUE)) {
            EZpvd(amplitudeName);
        }
    }

    @Override // o.InterfaceC32865mle
    public void EZpvd(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = OLrzqt.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.remove(interfaceC32861mla);
        }
    }

    public static /* synthetic */ LI getSkylabClientAndAssert$default(C32905mmR c32905mmR, java.lang.String str, AmplitudeName amplitudeName, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = AmplitudeName.CEFI;
        }
        return c32905mmR.KWHzl(str, amplitudeName);
    }

    public final LI KWHzl(java.lang.String str, AmplitudeName amplitudeName) {
        LI liOLrzqt = OLrzqt(amplitudeName);
        yHO<java.lang.String, java.lang.Boolean, java.util.Map<java.lang.String, java.lang.String>, Unit> yhoDbNXlk = C32864mld.OLrzqt.DbNXlk();
        if (yhoDbNXlk != null) {
            yhoDbNXlk.invoke("Null Skylab client", java.lang.Boolean.valueOf(liOLrzqt != null), C56423yEv.EZpvd(C56390yDp.OLrzqt("ab_key", str)));
        }
        return liOLrzqt;
    }

    public static /* synthetic */ LI getSkylabClient$default(C32905mmR c32905mmR, AmplitudeName amplitudeName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amplitudeName = AmplitudeName.CEFI;
        }
        return c32905mmR.OLrzqt(amplitudeName);
    }

    public final LI OLrzqt(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        return copydefault.get(amplitudeName.getSkylab());
    }

    public static /* synthetic */ void notifyDataUpdated$OKAnalytics_track$default(C32905mmR c32905mmR, AmplitudeName amplitudeName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amplitudeName = AmplitudeName.CEFI;
        }
        c32905mmR.AEQbTJ(amplitudeName);
    }

    public final void AEQbTJ(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = OLrzqt.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            java.util.Iterator<T> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((InterfaceC32861mla) it.next()).KWHzl(amplitudeName);
            }
        }
    }

    public static /* synthetic */ void notifyInit$OKAnalytics_track$default(C32905mmR c32905mmR, AmplitudeName amplitudeName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amplitudeName = AmplitudeName.CEFI;
        }
        c32905mmR.EZpvd(amplitudeName);
    }

    public final void EZpvd(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = OLrzqt.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            java.util.Iterator<T> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((InterfaceC32861mla) it.next()).EZpvd(amplitudeName);
            }
        }
        KWHzl.put(amplitudeName.name(), java.lang.Boolean.TRUE);
    }
}
