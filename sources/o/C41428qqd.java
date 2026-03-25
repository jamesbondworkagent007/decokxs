package o;

import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41428qqd {
    public static final C41428qqd OLrzqt = new C41428qqd();

    private C41428qqd() {
    }

    public final boolean KWHzl(InterfaceC54581xNr interfaceC54581xNr, BizInstrument bizInstrument) {
        java.lang.String instId;
        java.lang.String instType;
        if (interfaceC54581xNr != null) {
            java.lang.String str = "";
            if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
                instId = "";
            }
            if (bizInstrument != null && (instType = bizInstrument.getInstType()) != null) {
                str = instType;
            }
            if (interfaceC54581xNr.OLrzqt(instId, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean AEQbTJ(InterfaceC54581xNr interfaceC54581xNr, BizInstrument bizInstrument) {
        java.lang.String instId;
        java.lang.String instType;
        if (interfaceC54581xNr != null) {
            java.lang.String str = "";
            if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
                instId = "";
            }
            if (bizInstrument != null && (instType = bizInstrument.getInstType()) != null) {
                str = instType;
            }
            if (interfaceC54581xNr.AEQbTJ(instId, str)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ java.util.List filterMarketInstrument$default(C41428qqd c41428qqd, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c41428qqd.OLrzqt(list, z);
    }

    public final <T extends BizInstrument> java.util.List<T> OLrzqt(java.util.List<? extends T> list, boolean z) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            BizInstrument bizInstrument = (BizInstrument) obj;
            C41428qqd c41428qqd = OLrzqt;
            if (z ? c41428qqd.AEQbTJ(interfaceC54581xNrOLrzqt, bizInstrument) : c41428qqd.KWHzl(interfaceC54581xNrOLrzqt, bizInstrument)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List<TradeCoinInfo> KWHzl(java.util.List<TradeCoinInfo> list) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!OLrzqt.copydefault(interfaceC54581xNrOLrzqt, ((TradeCoinInfo) obj).getSymbol())) {
                arrayList2.add(obj);
            }
        }
        arrayList.removeAll(CollectionsKt___CollectionsKt.OqFWZa(arrayList2));
        return arrayList;
    }

    public final java.util.List<BizInstrument> EZpvd(java.util.List<? extends BizInstrument> list) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!AEQbTJ(interfaceC54581xNrOLrzqt, (BizInstrument) obj)) {
                arrayList2.add(obj);
            }
        }
        arrayList.removeAll(CollectionsKt___CollectionsKt.OqFWZa(arrayList2));
        return arrayList;
    }

    public final java.util.List<java.lang.String> OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!OLrzqt.copydefault(interfaceC54581xNrOLrzqt, (java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        arrayList.removeAll(CollectionsKt___CollectionsKt.OqFWZa(arrayList2));
        return arrayList;
    }

    public final boolean copydefault(InterfaceC54581xNr interfaceC54581xNr, java.lang.String str, java.lang.String str2) {
        return interfaceC54581xNr != null && interfaceC54581xNr.OLrzqt(str, str2);
    }

    public final boolean copydefault(InterfaceC54581xNr interfaceC54581xNr, java.lang.String str) {
        return interfaceC54581xNr != null && interfaceC54581xNr.fetchVPNInfo(str);
    }

    public final java.util.List<IndexTickersData> AEQbTJ(java.util.List<IndexTickersData> list) {
        if (list == null) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!OLrzqt.copydefault(interfaceC54581xNrOLrzqt, ((IndexTickersData) obj).getInstId(), "")) {
                arrayList2.add(obj);
            }
        }
        arrayList.removeAll(CollectionsKt___CollectionsKt.OqFWZa(arrayList2));
        return arrayList;
    }
}
