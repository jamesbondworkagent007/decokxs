package o;

import com.okinc.unify_find.data.BaseRank;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.MarketCapRank;
import com.okinc.unify_find.data.NewCoinFuturesRankPo;
import com.okinc.unify_find.data.NewCoinRank;
import com.okinc.unify_find.data.TurnOverRank;
import com.okinc.unify_find.data.UpDownRank;
import com.okinc.unify_find.data.WaitOnlineRank;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xnb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55631xnb {
    public static final C55631xnb AEQbTJ = new C55631xnb();

    private C55631xnb() {
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.ArrayList<com.okinc.unify_find.data.BaseRank>, java.lang.Object, java.util.ArrayList<com.okinc.unify_find.data.HotRankResponse> */
    public final java.util.ArrayList<HotRankResponse> copydefault(java.util.List<HotRankResponse> list) {
        Intrinsics.copydefault(list, "");
        java.util.ArrayList arrayListKWHzl = KWHzl((java.util.ArrayList<BaseRank>) list);
        Intrinsics.copydefault(arrayListKWHzl, "");
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.ArrayList<com.okinc.unify_find.data.BaseRank>, java.lang.Object, java.util.ArrayList<com.okinc.unify_find.data.MarketCapRank> */
    public final java.util.ArrayList<MarketCapRank> OLrzqt(java.util.List<MarketCapRank> list) {
        Intrinsics.copydefault(list, "");
        java.util.ArrayList arrayListKWHzl = KWHzl((java.util.ArrayList<BaseRank>) list);
        Intrinsics.copydefault(arrayListKWHzl, "");
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.ArrayList<com.okinc.unify_find.data.BaseRank>, java.lang.Object, java.util.ArrayList<com.okinc.unify_find.data.WaitOnlineRank> */
    public final java.util.ArrayList<WaitOnlineRank> AYXKKw(java.util.List<WaitOnlineRank> list) {
        Intrinsics.copydefault(list, "");
        java.util.ArrayList arrayListKWHzl = KWHzl((java.util.ArrayList<BaseRank>) list);
        Intrinsics.copydefault(arrayListKWHzl, "");
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.ArrayList<com.okinc.unify_find.data.BaseRank>, java.lang.Object, java.util.ArrayList<com.okinc.unify_find.data.NewCoinRank> */
    public final java.util.ArrayList<NewCoinRank> AEQbTJ(java.util.List<NewCoinRank> list) {
        Intrinsics.copydefault(list, "");
        java.util.ArrayList arrayListKWHzl = KWHzl((java.util.ArrayList<BaseRank>) list);
        Intrinsics.copydefault(arrayListKWHzl, "");
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.util.ArrayList<com.okinc.unify_find.data.BaseRank>, java.lang.Object, java.util.ArrayList<com.okinc.unify_find.data.NewCoinFuturesRankPo> */
    public final java.util.ArrayList<NewCoinFuturesRankPo> KWHzl(java.util.List<NewCoinFuturesRankPo> list) {
        if (list == null) {
            return null;
        }
        if (!C33129mqd.KWHzl((java.util.Collection) list)) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayListKWHzl = AEQbTJ.KWHzl((java.util.ArrayList<BaseRank>) list);
        Intrinsics.copydefault(arrayListKWHzl, "");
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.ArrayList<com.okinc.unify_find.data.BaseRank>, java.lang.Object, java.util.ArrayList<com.okinc.unify_find.data.TurnOverRank> */
    public final java.util.ArrayList<TurnOverRank> EZpvd(java.util.List<TurnOverRank> list) {
        Intrinsics.copydefault(list, "");
        java.util.ArrayList arrayListKWHzl = KWHzl((java.util.ArrayList<BaseRank>) list);
        Intrinsics.copydefault(arrayListKWHzl, "");
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.ArrayList<com.okinc.unify_find.data.BaseRank>, java.lang.Object, java.util.ArrayList<com.okinc.unify_find.data.UpDownRank> */
    public final java.util.ArrayList<UpDownRank> AhwBna(java.util.List<UpDownRank> list) {
        Intrinsics.copydefault(list, "");
        java.util.ArrayList arrayListKWHzl = KWHzl((java.util.ArrayList<BaseRank>) list);
        Intrinsics.copydefault(arrayListKWHzl, "");
        return arrayListKWHzl;
    }

    public final java.util.ArrayList<BaseRank> KWHzl(java.util.ArrayList<BaseRank> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null) {
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                BaseRank baseRank = (BaseRank) obj;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.OLrzqt(baseRank.getInstId(), baseRank.getInstType())) {
                    arrayList2.add(baseRank);
                }
                i++;
            }
        }
        if (arrayList != null) {
            arrayList.removeAll(arrayList2);
        }
        return arrayList;
    }
}
