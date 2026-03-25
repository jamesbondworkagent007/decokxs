package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BQ {
    public static final <I, O> kotlin.Pair<GU, CoroutineContext> OLrzqt(@NotNull BY<I, O> by) {
        Intrinsics.checkNotNullParameter(by, "");
        java.lang.String strKWHzl = C57419yi.KWHzl(by.KWHzl());
        if (strKWHzl == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        java.lang.String strCopydefault = C57419yi.copydefault(by.KWHzl());
        if (strCopydefault == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        java.lang.String strEZpvd = by.AYXKKw().EZpvd();
        if (strEZpvd == null) {
            strEZpvd = strKWHzl;
        }
        GY gyEZpvd = by.AYXKKw().OLrzqt().copydefault().EZpvd(strEZpvd);
        FW fwOLrzqt = by.AYXKKw().OLrzqt().OLrzqt().OLrzqt();
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.service", strKWHzl);
        c58002yt.AEQbTJ("rpc.method", strCopydefault);
        InterfaceC56293yA interfaceC56293yAAEQbTJ = c58002yt.AEQbTJ();
        InterfaceC56293yA interfaceC56293yAOLrzqt = C58108yv.OLrzqt(by.AYXKKw().AEQbTJ());
        C58108yv.KWHzl(interfaceC56293yAOLrzqt, interfaceC56293yAAEQbTJ);
        java.lang.String str = strKWHzl + '.' + strCopydefault;
        java.lang.String strAYXKKw = by.AYXKKw().AYXKKw();
        if (strAYXKKw == null) {
            strAYXKKw = str;
        }
        GU guEZpvd = gyEZpvd.EZpvd(strAYXKKw, interfaceC56293yAOLrzqt, by.AYXKKw().KWHzl(), fwOLrzqt);
        CoroutineContext coroutineContextPlus = new FY(by.AYXKKw().OLrzqt()).plus(new C5145Gl((kotlin.Pair<java.lang.String, ? extends java.lang.Object>[]) new kotlin.Pair[]{C56390yDp.OLrzqt("rpc", str), C56390yDp.OLrzqt("sdkInvocationId", C5030Ca.OLrzqt(by.KWHzl()))}));
        DT dtKWHzl = by.KWHzl();
        BC bc = BC.copydefault;
        dtKWHzl.OLrzqt(bc.djBIcL(), by.AYXKKw().copydefault());
        by.KWHzl().OLrzqt(bc.OLrzqt(), interfaceC56293yAAEQbTJ);
        by.EZpvd().add(new C4841Bt(by.AYXKKw().copydefault(), strKWHzl, strCopydefault, null, 8, null));
        return C56390yDp.OLrzqt(guEZpvd, coroutineContextPlus);
    }
}
