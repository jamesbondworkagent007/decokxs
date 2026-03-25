package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.CoinRiskLevel;
import uniffi.dex.RiskControlLevel;

/* JADX INFO: loaded from: classes18.dex */
public final class jNK {
    public static final java.util.Map<CoinRiskLevel, kotlin.Pair<java.lang.Integer, java.lang.Integer>> OLrzqt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(CoinRiskLevel.LOW, C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.hQkvHM), java.lang.Integer.valueOf(C52761wXj.ActionBar.DNMMPQ))), C56390yDp.OLrzqt(CoinRiskLevel.MEDIUM, C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZqidTP), java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq))), C56390yDp.OLrzqt(CoinRiskLevel.HIGH, C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.zNQIcI), java.lang.Integer.valueOf(C52761wXj.ActionBar.DsrFlB))));

    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> AEQbTJ(@NotNull CoinRiskLevel coinRiskLevel) {
        Intrinsics.checkNotNullParameter(coinRiskLevel, "");
        java.util.Map<CoinRiskLevel, kotlin.Pair<java.lang.Integer, java.lang.Integer>> map = OLrzqt;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = map.get(coinRiskLevel);
        if (pair != null) {
            return pair;
        }
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair2 = map.get(CoinRiskLevel.LOW);
        Intrinsics.copydefault(pair2);
        return pair2;
    }

    public static final java.lang.String AEQbTJ(C4147AzP c4147AzP) {
        if (c4147AzP == null) {
            return null;
        }
        if (C33129mqd.AhwBna(c4147AzP.AEQbTJ()) <= 0) {
            return C33129mqd.AhwBna(c4147AzP.EZpvd()) > 0 ? "cautions" : "normal";
        }
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c4147AzP.OLrzqt(), (java.lang.Iterable) c4147AzP.AYXKKw());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listDjBIcL) {
            if (((C2296AGh) obj).OLrzqt() == CoinRiskLevel.HIGH) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.jNO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return jNK.KWHzl((C2296AGh) obj2);
            }
        }, 30, null);
    }

    public static final java.lang.CharSequence KWHzl(C2296AGh c2296AGh) {
        Intrinsics.checkNotNullParameter(c2296AGh, "");
        return c2296AGh.EZpvd();
    }

    public static final boolean KWHzl(@NotNull RiskControlLevel riskControlLevel) {
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        return riskControlLevel == RiskControlLevel.HIGH;
    }

    public static final boolean EZpvd(@NotNull RiskControlLevel riskControlLevel) {
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        return riskControlLevel == RiskControlLevel.UNKNOWN;
    }
}
